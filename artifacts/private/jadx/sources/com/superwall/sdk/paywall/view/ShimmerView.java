package com.superwall.sdk.paywall.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.superwall.sdk.R;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ShimmerView extends AppCompatImageView implements PaywallShimmerView {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "ShimmerView";

    @Nullable
    private ValueAnimator animator;
    private int background;
    private int currentOrientation;
    private boolean isLightBackground;

    @NotNull
    private final f0 landscapeDrawable$delegate;

    @NotNull
    private final f0 portraitDrawable$delegate;
    private int tintColor;

    @Nullable
    private ColorFilter tintColorFilter;

    @Nullable
    private VectorDrawable vectorDrawable;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShimmerView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final VectorDrawable getLandscapeDrawable() {
        return (VectorDrawable) this.landscapeDrawable$delegate.getValue();
    }

    private final VectorDrawable getPortraitDrawable() {
        return (VectorDrawable) this.portraitDrawable$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VectorDrawable landscapeDrawable_delegate$lambda$1(Context context) {
        Drawable drawableL = androidx.core.content.d.l(context.getApplicationContext(), R.drawable.landscape_shimmer_skeleton);
        if (drawableL instanceof VectorDrawable) {
            return (VectorDrawable) drawableL;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VectorDrawable portraitDrawable_delegate$lambda$0(Context context) {
        Drawable drawableL = androidx.core.content.d.l(context.getApplicationContext(), R.drawable.portrait_shimmer_skeleton);
        if (drawableL instanceof VectorDrawable) {
            return (VectorDrawable) drawableL;
        }
        return null;
    }

    private final void setDrawableBasedOnOrientation(Configuration configuration) {
        VectorDrawable landscapeDrawable = configuration.orientation == 2 ? getLandscapeDrawable() : getPortraitDrawable();
        this.vectorDrawable = landscapeDrawable;
        if (!Intrinsics.areEqual(landscapeDrawable, getDrawable())) {
            setImageDrawable(this.vectorDrawable);
        }
        setColorFilter(this.tintColorFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startShimmer$lambda$3$lambda$2(ShimmerView shimmerView, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Drawable drawable = shimmerView.getDrawable();
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        drawable.setAlpha((int) (((Float) animatedValue).floatValue() * 255));
    }

    @Override // com.superwall.sdk.paywall.view.PaywallShimmerView
    public void checkForOrientationChanges() {
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNull(configuration);
        setDrawableBasedOnOrientation(configuration);
    }

    @Override // android.view.View
    public final int getBackground() {
        return this.background;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    @Nullable
    public final ColorFilter getTintColorFilter() {
        return this.tintColorFilter;
    }

    @Override // com.superwall.sdk.paywall.view.PaywallShimmerView
    public void hideShimmer() {
        setVisibility(8);
        stopShimmer();
    }

    public final boolean isLightBackground() {
        return this.isLightBackground;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.superwall.sdk.paywall.view.ShimmerView.onAttachedToWindow.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ShimmerView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ShimmerView.this.startShimmer();
            }
        });
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i10 = this.currentOrientation;
        int i11 = newConfig.orientation;
        if (i10 == i11) {
            return;
        }
        this.currentOrientation = i11;
        setDrawableBasedOnOrientation(newConfig);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    public final void setBackground(int i10) {
        this.background = i10;
    }

    public final void setLightBackground(boolean z10) {
        this.isLightBackground = z10;
    }

    public final void setTintColor(int i10) {
        this.tintColor = i10;
    }

    public final void setTintColorFilter(@Nullable ColorFilter colorFilter) {
        this.tintColorFilter = colorFilter;
    }

    @Override // com.superwall.sdk.paywall.view.PaywallShimmerView
    public void showShimmer() {
        setVisibility(0);
        startShimmer();
    }

    public final void startShimmer() {
        stopShimmer();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f);
        valueAnimatorOfFloat.setDuration(androidx.media3.common.j.f60679f2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.6f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.superwall.sdk.paywall.view.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShimmerView.startShimmer$lambda$3$lambda$2(this.f267476a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    public final void stopShimmer() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.portraitDrawable$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.paywall.view.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShimmerView.portraitDrawable_delegate$lambda$0(context);
            }
        });
        this.landscapeDrawable$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.paywall.view.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShimmerView.landscapeDrawable_delegate$lambda$1(context);
            }
        });
        setLayerType(1, null);
        setTag(TAG);
        checkForOrientationChanges();
    }
}
