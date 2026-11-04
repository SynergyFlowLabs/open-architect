package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
abstract class InAppNotification implements View.OnTouchListener {
    private static final int ANIMATE_OFFSCREEN_OFFSET = 200;
    private static final int BASE_MARGIN_DP = 16;
    private static final int DISMISS_DISTANCE_DP = 80;
    protected static final int MARGIN_OFFSET_DP = 8;
    protected static final int NEW_MESSENGER_CORNER_RADIUS = 20;
    private static final float RESISTANCE = 2.0f;
    protected static final float SCALE_OFFSET = 0.05f;
    protected final Provider<AppConfig> appConfigProvider;
    protected int bottomPadding = 0;
    protected Conversation conversation;
    private float initialTouchX;
    private float initialViewX;
    final Listener listener;
    protected final Context localisedContext;
    protected ViewGroup overlayRoot;
    protected int position;
    protected final int screenHeight;

    interface Listener {
        void onInAppNotificationDismiss(InAppNotification inAppNotification);

        void onInAppNotificationTap(Conversation conversation);
    }

    protected InAppNotification(Context context, Conversation conversation, int i10, int i11, Listener listener, Provider<AppConfig> provider) {
        this.conversation = conversation;
        this.listener = listener;
        this.position = i10;
        this.screenHeight = i11;
        this.localisedContext = context;
        this.appConfigProvider = provider;
    }

    private void animateOffScreen(View view) {
        int iDpToPx = ScreenUtils.dpToPx(200.0f, view.getContext());
        view.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationX(view.getX() > this.initialViewX ? getParentOrScreenWidth(view) + iDpToPx : (view.getWidth() * (-1)) - iDpToPx).setDuration(300L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                InAppNotification inAppNotification = InAppNotification.this;
                inAppNotification.listener.onInAppNotificationDismiss(inAppNotification);
            }
        }).start();
    }

    private void animateToOriginalPosition(View view) {
        view.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationX(0.0f).setDuration(300L).start();
    }

    private int getParentOrScreenWidth(View view) {
        Object parent = view.getParent();
        return parent instanceof View ? ((View) parent).getWidth() : view.getResources().getDisplayMetrics().widthPixels;
    }

    protected void animateToBackOfStack(Context context) {
        Resources resources = context.getResources();
        int dimension = this.screenHeight - (((((int) resources.getDimension(R.dimen.intercom_notification_preview_height)) + ScreenUtils.dpToPx((this.position * 8) + 16, context)) + resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) + this.bottomPadding);
        ObjectAnimator.ofPropertyValuesHolder(this.overlayRoot, PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, ScreenUtils.dpToPx(8.0f, context) + dimension, dimension), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, this.overlayRoot.getAlpha(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.85f, 1.0f - (this.position * SCALE_OFFSET))).setDuration(200L).start();
    }

    protected void animateToPosition(Context context) {
        Resources resources = context.getResources();
        ObjectAnimator.ofPropertyValuesHolder(this.overlayRoot, PropertyValuesHolder.ofFloat("y", this.overlayRoot.getY(), this.screenHeight - (((((int) resources.getDimension(R.dimen.intercom_notification_preview_height)) + ScreenUtils.dpToPx((this.position * 8) + 16, context)) + resources.getDimensionPixelSize(R.dimen.intercom_bottom_padding)) + this.bottomPadding)), PropertyValuesHolder.ofFloat("scaleX", this.overlayRoot.getScaleX(), 1.0f - (this.position * SCALE_OFFSET))).setDuration(200L).start();
    }

    protected void beginListeningForTouchEvents() {
        this.overlayRoot.setOnTouchListener(this);
    }

    public abstract void display(ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z10, int i10);

    public void display(ViewGroup viewGroup, Conversation conversation, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.conversation = conversation;
        display(viewGroup, layoutInflater, z10, i10);
    }

    public Conversation getConversation() {
        return this.conversation;
    }

    protected CharSequence getHeaderText() {
        Part partLastPart = this.conversation.lastPart();
        if (this.conversation.getParticipants().size() > 1) {
            return Phrase.from(this.localisedContext, R.string.intercom_reply_from_admin).putOptional("name", this.conversation.lastAdmin().getForename()).format();
        }
        if (this.conversation.parts().isEmpty()) {
            return this.conversation.lastAdmin().getForename();
        }
        return this.conversation.lastAdmin().getForename() + " • " + TimeFormatterExtKt.formattedDateFromLong(partLastPart.getCreatedAt(), this.localisedContext);
    }

    public int getPosition() {
        return this.position;
    }

    protected View getRootView() {
        return this.overlayRoot;
    }

    public boolean isAttached() {
        return this.overlayRoot.getParent() != null;
    }

    public void moveBackward(ViewGroup viewGroup) {
        moveBackward(viewGroup, new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.4
        });
    }

    public abstract void moveBackward(ViewGroup viewGroup, AnimatorListenerAdapter animatorListenerAdapter);

    public void moveForward(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i10 = this.position - 1;
        this.position = i10;
        if (i10 <= 0) {
            animateToPosition(viewGroup.getContext());
            beginListeningForTouchEvents();
        } else if (i10 == 1) {
            animateToPosition(viewGroup.getContext());
        } else if (i10 == 2) {
            display(viewGroup, layoutInflater, false, this.bottomPadding);
            animateToBackOfStack(viewGroup.getContext());
        }
    }

    protected abstract void onNotificationPressed(View view);

    protected abstract void onNotificationReleased(View view);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX = (motionEvent.getRawX() - this.initialTouchX) / 2.0f;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.initialViewX = view.getX();
            this.initialTouchX = motionEvent.getRawX();
            onNotificationPressed(getRootView());
        } else if (action == 1) {
            float fAbs = Math.abs(rawX);
            if (fAbs < 5.0f) {
                this.listener.onInAppNotificationTap(this.conversation);
            } else if (fAbs > ScreenUtils.dpToPx(80.0f, this.localisedContext)) {
                stopListeningForTouchEvents();
                animateOffScreen(view);
            } else {
                onNotificationReleased(getRootView());
                animateToOriginalPosition(view);
            }
        } else if (action == 2) {
            view.setX(rawX + this.initialViewX);
        }
        return true;
    }

    protected void performReplyPulse(View view, final View view2, final Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 1.05f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 1.05f)).setDuration(150L);
        duration.setRepeatCount(1);
        duration.setRepeatMode(2);
        duration.start();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(200L);
        duration2.addListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                InAppNotification inAppNotification = InAppNotification.this;
                inAppNotification.updateViewDataDuringReplyPulse(inAppNotification.bottomPadding);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L);
                duration3.setStartDelay(100L);
                duration3.start();
                duration3.addListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.InAppNotification.3.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        runnable.run();
                    }
                });
            }
        });
        duration2.start();
    }

    public void removeView() {
        View rootView = getRootView();
        if (rootView == null || rootView.getParent() == null) {
            return;
        }
        ((ViewGroup) rootView.getParent()).removeView(rootView);
    }

    public void setPosition(int i10) {
        this.position = i10;
    }

    protected void stopListeningForTouchEvents() {
        this.overlayRoot.setOnTouchListener(null);
    }

    public abstract void update(Conversation conversation, Runnable runnable);

    public void updateBottomPadding(Context context, int i10) {
        if (this.bottomPadding == i10 || this.overlayRoot == null) {
            return;
        }
        this.bottomPadding = i10;
        int iDpToPx = ScreenUtils.dpToPx((this.position * 8) + 16, context) + context.getResources().getDimensionPixelSize(R.dimen.intercom_bottom_padding) + i10;
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.overlayRoot.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.bottomMargin, iDpToPx);
        valueAnimatorOfInt.setDuration(300);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.InAppNotification.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams2 = layoutParams;
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                InAppNotification.this.overlayRoot.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.start();
    }

    protected abstract void updateViewDataDuringReplyPulse(int i10);
}
