package com.superwall.sdk.config.options;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallOptionsKt {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull PaywallOptions paywallOptions) {
        Intrinsics.checkNotNullParameter(paywallOptions, "<this>");
        Pair pair = TuplesKt.to("is_haptic_feedback_enabled", Boolean.valueOf(paywallOptions.isHapticFeedbackEnabled()));
        Pair pair2 = TuplesKt.to("restore_failed", MapsKt.mapOf(TuplesKt.to("title", paywallOptions.getRestoreFailed().getTitle()), TuplesKt.to("message", paywallOptions.getRestoreFailed().getMessage()), TuplesKt.to("close_button_title", paywallOptions.getRestoreFailed().getCloseButtonTitle())));
        Pair pair3 = TuplesKt.to("should_show_purchase_failure_alert", Boolean.valueOf(paywallOptions.getShouldShowPurchaseFailureAlert()));
        Pair pair4 = TuplesKt.to("should_preload", Boolean.valueOf(paywallOptions.getShouldPreload()));
        Pair pair5 = TuplesKt.to("use_cached_templates", Boolean.valueOf(paywallOptions.getUseCachedTemplates()));
        Pair pair6 = TuplesKt.to("automatically_dismiss", Boolean.valueOf(paywallOptions.getAutomaticallyDismiss()));
        PaywallOptions.TransactionBackgroundView transactionBackgroundView = paywallOptions.getTransactionBackgroundView();
        return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to("transaction_background_view", transactionBackgroundView != null ? transactionBackgroundView.name() : null));
    }
}
