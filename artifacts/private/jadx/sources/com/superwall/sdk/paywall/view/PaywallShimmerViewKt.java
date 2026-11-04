package com.superwall.sdk.paywall.view;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.superwall.sdk.misc.Color_HelpersKt;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallShimmerViewKt {
    public static final <T extends View & PaywallShimmerView> void setupFor(@NotNull T t10, @NotNull PaywallView paywallView, @NotNull PaywallLoadingState loadingState) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(paywallView, "paywallView");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        ViewParent parent = t10.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(t10);
        }
        if (t10 instanceof ShimmerView) {
            ShimmerView shimmerView = (ShimmerView) t10;
            if (shimmerView.getBackground() != paywallView.getBackgroundColor()) {
                shimmerView.setBackground(paywallView.getBackgroundColor());
                t10.setBackgroundColor(shimmerView.getBackground());
                shimmerView.setLightBackground(!Color_HelpersKt.isDarkColor(shimmerView.getBackground()));
                shimmerView.setTintColor(Color_HelpersKt.readableOverlayColor(shimmerView.getBackground()));
                shimmerView.setTintColorFilter(androidx.core.graphics.c.a(Color.argb(64, Color.red(shimmerView.getTintColor()), Color.green(shimmerView.getTintColor()), Color.blue(shimmerView.getTintColor())), androidx.core.graphics.d.SRC_IN));
            }
        }
        t10.setVisibility(loadingState instanceof PaywallLoadingState.LoadingURL ? 0 : 8);
        paywallView.addView(t10);
        t10.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        t10.checkForOrientationChanges();
    }
}
