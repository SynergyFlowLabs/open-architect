package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.d;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ColorUtils;

/* JADX INFO: loaded from: classes13.dex */
public class IntercomToolbar extends Toolbar implements View.OnTouchListener, View.OnClickListener {
    private static final int TITLE_FADE_DURATION_MS = 150;
    private final View activeStateView;
    private final ImageView avatar;
    private final ImageButton backButton;
    private final BackButtonCountDrawable backButtonCountDrawable;
    private final ImageButton close;

    @p0
    private Listener listener;
    private final TextView subtitle;
    final TextView title;

    public interface Listener {
        void onCloseClicked();

        void onInboxClicked();

        void onToolbarClicked();
    }

    public IntercomToolbar(Context context) {
        this(context, null);
    }

    public void fadeOutTitle(int i10) {
        this.title.animate().alpha(0.0f).setDuration(i10).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.views.IntercomToolbar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntercomToolbar.this.title.setText((CharSequence) null);
            }
        }).start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.listener == null) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.intercom_toolbar_close) {
            this.listener.onCloseClicked();
        } else if (id2 == R.id.intercom_toolbar_inbox) {
            this.listener.onInboxClicked();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.listener != null && motionEvent.getAction() == 1 && view.getId() == R.id.intercom_toolbar) {
            this.listener.onToolbarClicked();
        }
        return false;
    }

    public void setCloseButtonVisibility(int i10) {
        this.close.setVisibility(i10);
    }

    public void setLeftNavigationIcon(@p0 Drawable drawable) {
        this.backButton.setImageDrawable(drawable);
    }

    public void setLeftNavigationItemVisibility(int i10) {
        this.backButton.setVisibility(i10);
    }

    public void setListener(@p0 Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(@p0 CharSequence charSequence) {
        this.subtitle.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.subtitle.setAlpha(1.0f);
    }

    public void setSubtitleVisibility(int i10) {
        this.subtitle.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            fadeOutTitle(150);
        } else {
            this.title.setAlpha(1.0f);
            this.title.setText(charSequence);
        }
    }

    public void setUpNoteToolbar(Participant participant, boolean z10, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        this.title.setTextColor(d.g(getContext(), R.color.intercom_accessibility_black));
        this.subtitle.setTextColor(d.g(getContext(), R.color.intercom_accessibility_grey));
        this.close.setColorFilter(d.g(getContext(), R.color.intercom_accessibility_grey));
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        this.subtitle.setAlpha(1.0f);
        View viewFindViewById = findViewById(R.id.intercom_toolbar_divider);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setBackgroundColor(-16777216);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig);
        activeStatePresenter.presentStateDot(z10, this.activeStateView, appConfig);
    }

    public void setUpPostToolbar(Participant participant, boolean z10, ActiveStatePresenter activeStatePresenter, AppConfig appConfig) {
        setBackgroundColor(0);
        this.subtitle.setTextColor(-1);
        this.title.setTextColor(-1);
        this.close.setColorFilter(-1);
        this.backButton.setVisibility(8);
        this.avatar.setVisibility(0);
        this.activeStateView.setVisibility(0);
        this.title.setTextSize(14.0f);
        findViewById(R.id.intercom_toolbar_divider).setVisibility(0);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), this.avatar, appConfig);
        activeStatePresenter.presentStateDot(z10, this.activeStateView, appConfig);
    }

    public void updateToolbarColors(AppConfig appConfig) {
        boolean zIsSecondaryColorRenderDarkText = appConfig.isSecondaryColorRenderDarkText();
        ColorUtils.setTextColorWhiteOrBlack(this.title, zIsSecondaryColorRenderDarkText);
        ColorUtils.setTextColorWhiteOrBlack(this.subtitle, zIsSecondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.close, zIsSecondaryColorRenderDarkText);
        ColorUtils.setImageColorWhiteOrBlack(this.backButton, zIsSecondaryColorRenderDarkText);
    }

    public IntercomToolbar(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = View.inflate(context, R.layout.intercom_toolbar, this);
        viewInflate.setOnTouchListener(this);
        this.title = (TextView) viewInflate.findViewById(R.id.intercom_toolbar_title);
        this.subtitle = (TextView) viewInflate.findViewById(R.id.intercom_toolbar_subtitle);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.intercom_toolbar_close);
        this.close = imageButton;
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(R.id.intercom_toolbar_inbox);
        this.backButton = imageButton2;
        this.avatar = (ImageView) viewInflate.findViewById(R.id.intercom_toolbar_avatar);
        this.activeStateView = viewInflate.findViewById(R.id.intercom_toolbar_avatar_active_state);
        BackButtonCountDrawable backButtonCountDrawable = new BackButtonCountDrawable(getContext(), null);
        this.backButtonCountDrawable = backButtonCountDrawable;
        imageButton2.setImageDrawable(backButtonCountDrawable);
        imageButton2.setOnClickListener(this);
        imageButton.setOnClickListener(this);
    }
}
