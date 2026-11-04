package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.p0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: loaded from: classes13.dex */
class DefaultLauncher implements View.OnTouchListener {
    private static final int ANIMATION_DURATION_MS = 300;
    private static final int CUSTOM_LAUNCHER_SIZE_DP = 34;
    private final ImageButton badge;
    private final TextView badgeCount;
    final View launcherRoot;
    final Listener listener;

    public interface Listener {
        void onLauncherClicked(Context context);
    }

    public DefaultLauncher(ViewGroup viewGroup, LayoutInflater layoutInflater, Listener listener, int i10) {
        this.listener = listener;
        layoutInflater.inflate(R.layout.intercom_default_launcher, viewGroup, true);
        View viewFindViewById = viewGroup.findViewById(R.id.launcher_root);
        this.launcherRoot = viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i10);
        viewFindViewById.setLayoutParams(marginLayoutParams);
        this.badge = (ImageButton) viewFindViewById.findViewById(R.id.launcher_icon);
        this.badgeCount = (TextView) viewFindViewById.findViewById(R.id.launcher_badge_count);
        viewFindViewById.setOnTouchListener(this);
    }

    private void callListenerWithFadeOut() {
        this.launcherRoot.setAlpha(1.0f);
        this.launcherRoot.animate().alpha(0.0f).setDuration(50L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.DefaultLauncher.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DefaultLauncher defaultLauncher = DefaultLauncher.this;
                defaultLauncher.listener.onLauncherClicked(defaultLauncher.launcherRoot.getContext());
            }
        }).start();
    }

    public void fadeOffScreen(@p0 Animator.AnimatorListener animatorListener) {
        this.launcherRoot.animate().alpha(0.0f).setDuration(100L).setListener(animatorListener).start();
    }

    public void fadeOnScreen() {
        this.launcherRoot.setAlpha(0.0f);
        this.launcherRoot.animate().alpha(1.0f).setDuration(100L).start();
    }

    public void hideBadgeCount() {
        this.badgeCount.setVisibility(8);
    }

    public boolean isAttachedToRoot(ViewGroup viewGroup) {
        return this.launcherRoot.getParent() == viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (action == 1) {
            callListenerWithFadeOut();
        }
        return true;
    }

    public void pulseForTransformation(final Animator.AnimatorListener animatorListener) {
        this.launcherRoot.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.DefaultLauncher.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animatorListener.onAnimationEnd(animator);
                DefaultLauncher.this.launcherRoot.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        }).start();
    }

    public void removeView() {
        if (this.launcherRoot.getParent() != null) {
            ((ViewGroup) this.launcherRoot.getParent()).removeView(this.launcherRoot);
        }
    }

    public void setBadgeCount(String str) {
        this.badgeCount.setVisibility(0);
        this.badgeCount.setText(str);
    }

    public void setDefaultLogo() {
        this.badge.setImageResource(R.drawable.intercom_launcher_icon);
    }

    public void setLauncherColor(@l int i10, @l int i11) {
        Context context = this.badge.getContext();
        Drawable drawableL = androidx.core.content.d.l(context, R.drawable.intercom_solid_circle);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableL.setColorFilter(i11, mode);
        Drawable drawableNewDrawable = drawableL.getConstantState().newDrawable();
        drawableNewDrawable.setColorFilter(androidx.core.content.d.g(context, R.color.intercom_inbox_count_background), mode);
        BackgroundUtils.setBackground(this.badgeCount, drawableNewDrawable);
        BackgroundUtils.setBackground(this.badge, drawableL);
        Drawable drawable = this.badge.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        }
    }

    public void setLauncherLogo(AppConfig appConfig) {
        Context context = this.badge.getContext();
        int iDpToPx = ScreenUtils.dpToPx(34.0f, context);
        IntercomCoilKt.loadIntercomImage(context, new coil.request.i.a(context).j(ThemeUtils.selectLauncherLogoUrl(context, appConfig.getConfigModules() != null ? appConfig.getConfigModules().getCustomization().getLauncherLogoUrl() : null, appConfig.getConfigModules() != null ? appConfig.getConfigModules().getCustomization().getLauncherLogoDarkUrl() : null, appConfig.getLauncherLogoUrl())).r(R.drawable.intercom_launcher_icon).l0(this.badge).e0(iDpToPx, iDpToPx).f());
    }

    public void updateBottomPadding(int i10) {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.launcherRoot.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginLayoutParams.bottomMargin, i10);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: io.intercom.android.sdk.overlay.DefaultLauncher.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                DefaultLauncher.this.launcherRoot.setLayoutParams(marginLayoutParams);
            }
        });
        valueAnimatorOfInt.start();
    }
}
