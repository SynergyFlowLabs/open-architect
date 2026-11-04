package com.superwall.sdk.paywall.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LoadingViewKt {
    public static final <T extends View & PaywallPurchaseLoadingView> void setupFor(@NotNull T t10, @NotNull PaywallView paywallView, @NotNull PaywallLoadingState loadingState) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        Intrinsics.checkNotNullParameter(paywallView, "paywallView");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        ViewParent parent = t10.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(t10);
        }
        paywallView.addView(t10);
        t10.setVisibility(((loadingState instanceof PaywallLoadingState.LoadingPurchase) || (loadingState instanceof PaywallLoadingState.ManualLoading)) ? 0 : 8);
    }
}
