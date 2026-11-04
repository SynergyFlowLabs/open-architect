package io.intercom.android.sdk.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.os.d;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.LightboxOpeningImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlocksViewHolder;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.ActiveStatePresenter;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: loaded from: classes13.dex */
public class IntercomNoteActivity extends IntercomBaseActivity implements View.OnClickListener {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    View composerLayout;
    String conversationId;
    private LastParticipatingAdmin lastParticipatingAdmin;
    MetricTracker metricTracker;
    private LinearLayout noteLayout;
    Part part;
    ReactionInputView reactionComposer;
    private final FullScreenInAppPresenter presenter = new FullScreenInAppPresenter();
    private boolean composerIsVisible = true;

    /* JADX INFO: Access modifiers changed from: private */
    public void applyAccessibilityStyling(EditText editText) {
        int color = getResources().getColor(R.color.intercom_accessibility_grey);
        editText.setTextColor(color);
        editText.setHintTextColor(color);
    }

    public static Intent buildNoteIntent(Context context, Part part, String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z10) {
        Intent intentPutExtra = new Intent(context, (Class<?>) IntercomNoteActivity.class).putExtra(PARCEL_PART, part).putExtra(LAST_PARTICIPANT, lastParticipatingAdmin).putExtra(COMPOSER_IS_VISIBLE, z10);
        if (!TextUtils.isEmpty(str)) {
            intentPutExtra.putExtra(PARCEL_CONVERSATION_ID, str);
        }
        intentPutExtra.setExtrasClassLoader(Part.class.getClassLoader());
        return intentPutExtra;
    }

    void animateContent() {
        this.noteLayout.setScaleX(0.9f);
        this.noteLayout.setScaleY(0.9f);
        this.noteLayout.setAlpha(0.0f);
        this.noteLayout.setVisibility(0);
        this.noteLayout.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).start();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.closeWindow(this);
        this.metricTracker.closedInAppFromFull(this.conversationId, this.part.getId());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.note_touch_target) {
            this.presenter.closeWindow(this);
            this.metricTracker.closedInAppFromFull(this.conversationId, this.part.getId());
            startActivity(ConversationScreenOpenerKt.getConversationIntent(this, this.conversationId));
        }
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_note);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.note_layout);
        this.noteLayout = linearLayout;
        linearLayout.setVisibility(4);
        this.reactionComposer = (ReactionInputView) findViewById(R.id.reaction_input_view);
        IntercomToolbar intercomToolbar = (IntercomToolbar) findViewById(R.id.intercom_toolbar);
        intercomToolbar.setListener(new InAppToolbarListener(this));
        this.part = new Part();
        this.lastParticipatingAdmin = LastParticipatingAdmin.NULL;
        Injector injector = Injector.get();
        Api api = injector.getApi();
        this.metricTracker = injector.getMetricTracker();
        Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
        TimeFormatter timeFormatter = new TimeFormatter(this, injector.getTimeProvider());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.setClassLoader(Part.class.getClassLoader());
            if (extras.containsKey(PARCEL_PART)) {
                Part part = (Part) d.b(extras, PARCEL_PART, Part.class);
                this.part = part;
                intercomToolbar.setTitle(Phrase.from(this, R.string.intercom_teammate_from_company).put("name", (part == null || part.getParticipant() == null) ? "" : this.part.getParticipant().getForename()).put("company", appConfigProvider.get().getName()).format());
            }
            if (extras.containsKey(PARCEL_CONVERSATION_ID)) {
                this.conversationId = extras.getString(PARCEL_CONVERSATION_ID);
                injector.getDataLayer().markConversationAsRead(this.conversationId);
                api.markConversationAsRead(this.conversationId);
            }
            if (extras.containsKey(LAST_PARTICIPANT)) {
                LastParticipatingAdmin lastParticipatingAdmin = (LastParticipatingAdmin) d.b(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class);
                this.lastParticipatingAdmin = lastParticipatingAdmin;
                if (!LastParticipatingAdmin.isNull(lastParticipatingAdmin)) {
                    intercomToolbar.setSubtitle(timeFormatter.getAdminActiveStatus(this.lastParticipatingAdmin, appConfigProvider));
                }
            }
            if (extras.containsKey(COMPOSER_IS_VISIBLE)) {
                this.composerIsVisible = extras.getBoolean(COMPOSER_IS_VISIBLE, true);
            }
        }
        intercomToolbar.setUpNoteToolbar(this.part.getParticipant(), this.lastParticipatingAdmin.isActive(), new ActiveStatePresenter(), appConfigProvider.get());
        BlocksViewHolder noteHolder = new ViewHolderGenerator(new UploadingImageCache(), api, appConfigProvider, this.conversationId, new LightboxOpeningImageClickListener(api), new LinkOpeningButtonClickListener(api), injector.getGson(), this.metricTracker).getNoteHolder();
        this.composerLayout = findViewById(R.id.note_composer_container);
        final ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) findViewById(R.id.note_view);
        contentAwareScrollView.addView(BlockUtils.getBlockView(contentAwareScrollView, ViewHolderGenerator.createPartsLayout(noteHolder, this.part, this), this));
        if (!ReactionReply.isNull(this.part.getReactionReply())) {
            final ConversationReactionListener conversationReactionListener = new ConversationReactionListener(MetricTracker.ReactionLocation.IN_APP, this.part.getId(), this.conversationId, Injector.get().getApi(), this.metricTracker);
            contentAwareScrollView.setListener(new ContentAwareScrollView.Listener() { // from class: io.intercom.android.sdk.activities.IntercomNoteActivity.1
                @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                public void onBottomReached() {
                    contentAwareScrollView.setListener(null);
                    IntercomNoteActivity.this.composerLayout.setVisibility(0);
                    IntercomNoteActivity intercomNoteActivity = IntercomNoteActivity.this;
                    intercomNoteActivity.reactionComposer.setUpReactions(intercomNoteActivity.part.getReactionReply(), true, conversationReactionListener);
                }

                @Override // io.intercom.android.sdk.views.ContentAwareScrollView.Listener
                public void onScrollChanged(int i10) {
                }
            });
            this.reactionComposer.preloadReactionImages(this.part.getReactionReply());
        }
        View decorView = getWindow().getDecorView();
        decorView.setAlpha(0.0f);
        decorView.animate().alpha(1.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.activities.IntercomNoteActivity.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomNoteActivity.this.animateContent();
                if (IntercomNoteActivity.this.composerIsVisible && ReactionReply.isNull(IntercomNoteActivity.this.part.getReactionReply())) {
                    IntercomNoteActivity.this.composerLayout.setVisibility(0);
                    EditText editText = (EditText) IntercomNoteActivity.this.findViewById(R.id.composer_input_view);
                    IntercomNoteActivity.this.findViewById(R.id.note_touch_target).setOnClickListener(IntercomNoteActivity.this);
                    IntercomNoteActivity.this.applyAccessibilityStyling(editText);
                    editText.setVisibility(0);
                }
            }
        }).start();
    }
}
