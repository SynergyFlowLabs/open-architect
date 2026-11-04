package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.blocks.views.AttachmentView;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.post.PostActivityV2;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import io.intercom.android.sdk.views.ActiveStatePresenter;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: loaded from: classes13.dex */
public class IntercomPostActivity extends IntercomBaseActivity implements View.OnClickListener {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    View composerLayout;
    String conversationId;
    private LastParticipatingAdmin lastParticipatingAdmin;
    MetricTracker metricTracker;
    Part part;
    private FrameLayout postContainer;
    ContentAwareScrollView postView;
    ReactionInputView reactionComposer;
    private EditText textComposer;
    private final FullScreenInAppPresenter presenter = new FullScreenInAppPresenter();
    private boolean composerIsVisible = true;
    private boolean isPreview = false;

    private void applyAccessibilityFullScreenPostStyling(EditText editText) {
        int color = getResources().getColor(R.color.intercom_white);
        editText.setHintTextColor(color);
        editText.setTextColor(color);
    }

    public static Intent buildPostIntent(Context context, Part part, String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z10, boolean z11) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ((Injector.isNotInitialised() || !Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.POST_V2_RENDERING_ENABLED)) ? IntercomPostActivity.class : PostActivityV2.class)).putExtra(PARCEL_PART, part).putExtra(LAST_PARTICIPANT, lastParticipatingAdmin).putExtra(COMPOSER_IS_VISIBLE, z10).putExtra(POST_PREVIEW, z11);
        if (!TextUtils.isEmpty(str)) {
            intentPutExtra.putExtra(PARCEL_CONVERSATION_ID, str);
        }
        intentPutExtra.setExtrasClassLoader(Part.class.getClassLoader());
        return intentPutExtra;
    }

    private void ensureButtonCorrectness(Button button, Provider<AppConfig> provider) {
        if (ColorUtils.isColorLight(provider.get().getPrimaryColor())) {
            button.setTextColor(d.g(getApplicationContext(), R.color.intercom_accessibility_black));
        } else {
            button.setTextColor(d.g(getApplicationContext(), R.color.intercom_white));
        }
    }

    private void ensureColorConformanceForViews(LinearLayout linearLayout) {
        Provider<AppConfig> appConfigProvider = Injector.get().getAppConfigProvider();
        for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof Button) {
                ensureButtonCorrectness((Button) childAt, appConfigProvider);
            } else if (childAt instanceof ParagraphView) {
                ensureTextViewCorrectness((TextView) childAt);
            } else if (childAt instanceof TextView) {
                ensureTextViewCorrectness((TextView) childAt);
            } else if (childAt instanceof AttachmentView) {
                ensureWhiteAttachmentView((AttachmentView) childAt);
            } else if (childAt instanceof LinearLayout) {
                ensureColorConformanceForViews((LinearLayout) childAt);
            }
        }
    }

    private void ensureTextViewCorrectness(TextView textView) {
        textView.setTextColor(d.g(getApplicationContext(), R.color.intercom_white));
        textView.setLinkTextColor(getResources().getColor(R.color.intercom_white));
    }

    private void ensureWhiteAttachmentView(AttachmentView attachmentView) {
        for (int i10 = 0; i10 < attachmentView.getChildCount(); i10++) {
            View childAt = attachmentView.getChildAt(i10);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(d.g(getApplicationContext(), R.color.intercom_white));
            } else if (childAt instanceof ImageView) {
                ((ImageView) childAt).setColorFilter(d.g(getApplicationContext(), R.color.intercom_white));
            }
        }
    }

    void animateComposer() {
        View view = this.composerLayout;
        view.setY(view.getY() + ScreenUtils.dpToPx(156.0f, this));
        this.composerLayout.setVisibility(0);
        this.textComposer.setVisibility(0);
        this.composerLayout.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
    }

    void animateContent() {
        FrameLayout frameLayout = this.postContainer;
        frameLayout.setY(frameLayout.getY() + ScreenUtils.dpToPx(400.0f, this));
        this.postContainer.setVisibility(0);
        this.postContainer.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
    }

    void animateToolbar(IntercomToolbar intercomToolbar) {
        intercomToolbar.setY(intercomToolbar.getY() + ScreenUtils.dpToPx(200.0f, this));
        intercomToolbar.setVisibility(0);
        intercomToolbar.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.closeWindow(this);
        if (this.isPreview) {
            this.metricTracker.closedInAppFromFull(this.conversationId, this.part.getId());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.post_touch_target) {
            this.presenter.closeWindow(this);
            if (this.isPreview) {
                this.metricTracker.openedConversationFromFull(this.conversationId, this.part.getId());
                startActivity(ConversationScreenOpenerKt.getConversationIntent(this, this.conversationId));
            }
        }
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_post);
        Injector injector = Injector.get();
        Api api = injector.getApi();
        this.metricTracker = injector.getMetricTracker();
        Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
        final IntercomToolbar intercomToolbar = (IntercomToolbar) findViewById(R.id.intercom_toolbar);
        intercomToolbar.setListener(new InAppToolbarListener(this));
        this.part = new Part();
        this.lastParticipatingAdmin = LastParticipatingAdmin.NULL;
        TimeFormatter timeFormatter = new TimeFormatter(this, injector.getTimeProvider());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.setClassLoader(Part.class.getClassLoader());
            if (extras.containsKey(PARCEL_PART)) {
                Part part = (Part) androidx.core.os.d.b(extras, PARCEL_PART, Part.class);
                this.part = part;
                intercomToolbar.setTitle(Phrase.from(this, R.string.intercom_teammate_from_company).put("name", (part == null || part.getParticipant() == null) ? "" : this.part.getParticipant().getForename()).put("company", appConfigProvider.get().getName()).format());
            }
            if (extras.containsKey(PARCEL_CONVERSATION_ID)) {
                this.conversationId = extras.getString(PARCEL_CONVERSATION_ID, "");
                injector.getDataLayer().markConversationAsRead(this.conversationId);
                api.markConversationAsRead(this.conversationId);
            }
            if (extras.containsKey(COMPOSER_IS_VISIBLE)) {
                this.composerIsVisible = extras.getBoolean(COMPOSER_IS_VISIBLE, true);
            }
            if (extras.containsKey(POST_PREVIEW)) {
                this.isPreview = extras.getBoolean(POST_PREVIEW, false);
            }
            if (extras.containsKey(LAST_PARTICIPANT)) {
                LastParticipatingAdmin lastParticipatingAdmin = (LastParticipatingAdmin) androidx.core.os.d.b(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class);
                this.lastParticipatingAdmin = lastParticipatingAdmin;
                if (!LastParticipatingAdmin.isNull(lastParticipatingAdmin)) {
                    intercomToolbar.setSubtitle(timeFormatter.getAdminActiveStatus(this.lastParticipatingAdmin, appConfigProvider));
                }
            }
        }
        intercomToolbar.setVisibility(8);
        intercomToolbar.setUpPostToolbar(this.part.getParticipant(), this.lastParticipatingAdmin.isActive(), new ActiveStatePresenter(), appConfigProvider.get());
        int primaryColor = appConfigProvider.get().getPrimaryColor();
        View decorView = getWindow().getDecorView();
        decorView.setBackgroundColor(Color.argb(153, Color.red(primaryColor), Color.green(primaryColor), Color.blue(primaryColor)));
        BlocksViewHolder postHolder = new ViewHolderGenerator(new UploadingImageCache(), api, appConfigProvider, this.conversationId, new LightboxOpeningImageClickListener(api), new LinkOpeningButtonClickListener(api), injector.getGson(), this.metricTracker).getPostHolder();
        this.postContainer = (FrameLayout) findViewById(R.id.post_container);
        this.composerLayout = findViewById(R.id.conversation_coordinator);
        EditText editText = (EditText) findViewById(R.id.composer_input_view);
        this.textComposer = editText;
        applyAccessibilityFullScreenPostStyling(editText);
        this.reactionComposer = (ReactionInputView) findViewById(R.id.reaction_input_view);
        this.postView = (ContentAwareScrollView) findViewById(R.id.post_view);
        LinearLayout linearLayoutCreatePartsLayout = ViewHolderGenerator.createPartsLayout(postHolder, this.part, this);
        ensureColorConformanceForViews(linearLayoutCreatePartsLayout);
        ContentAwareScrollView contentAwareScrollView = this.postView;
        contentAwareScrollView.addView(BlockUtils.getBlockView(contentAwareScrollView, linearLayoutCreatePartsLayout, this));
        if (this.isPreview && !ReactionReply.isNull(this.part.getReactionReply())) {
            final ConversationReactionListener conversationReactionListener = new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, this.part.getId(), this.conversationId, Injector.get().getApi(), this.metricTracker);
            this.postView.setListener(new ContentAwareScrollView.Listener() { // from class: io.intercom.android.sdk.activities.IntercomPostActivity.1
                @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                public void onBottomReached() {
                    IntercomPostActivity.this.postView.setListener(null);
                    if (IntercomPostActivity.this.composerLayout.getVisibility() != 0) {
                        IntercomPostActivity.this.composerLayout.setVisibility(0);
                        IntercomPostActivity intercomPostActivity = IntercomPostActivity.this;
                        intercomPostActivity.reactionComposer.setUpReactions(intercomPostActivity.part.getReactionReply(), true, conversationReactionListener);
                    }
                }

                @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                public void onScrollChanged(int i10) {
                }
            });
            this.reactionComposer.preloadReactionImages(this.part.getReactionReply());
        }
        if (openedFromConversation()) {
            this.metricTracker.viewedInAppFromMessenger(this.conversationId, this.part.getId(), this.part.getMessageStyle());
        }
        decorView.setAlpha(0.0f);
        decorView.animate().alpha(1.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomPostActivity.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomPostActivity.this.animateToolbar(intercomToolbar);
                IntercomPostActivity.this.animateContent();
                if (IntercomPostActivity.this.openedFromConversation()) {
                    IntercomPostActivity.this.composerLayout.setVisibility(8);
                } else if (IntercomPostActivity.this.composerIsVisible && ReactionReply.isNull(IntercomPostActivity.this.part.getReactionReply())) {
                    IntercomPostActivity.this.findViewById(R.id.post_touch_target).setOnClickListener(IntercomPostActivity.this);
                    IntercomPostActivity.this.animateComposer();
                }
            }
        }).start();
    }

    boolean openedFromConversation() {
        return !this.isPreview;
    }
}
