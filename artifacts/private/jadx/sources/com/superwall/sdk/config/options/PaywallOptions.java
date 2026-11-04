package com.superwall.sdk.config.options;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallOptions {
    private boolean optimisticLoading;
    private boolean useCachedTemplates;
    private boolean isHapticFeedbackEnabled = true;

    @NotNull
    private RestoreFailed restoreFailed = new RestoreFailed();
    private boolean shouldShowPurchaseFailureAlert = true;
    private boolean shouldPreload = true;
    private boolean automaticallyDismiss = true;

    @NotNull
    private Map<String, String> overrideProductsByName = MapsKt.emptyMap();

    @Nullable
    private TransactionBackgroundView transactionBackgroundView = TransactionBackgroundView.SPINNER;

    public static final class RestoreFailed {

        @NotNull
        private String title = "No Subscription Found";

        @NotNull
        private String message = "We couldn't find an active subscription for your account.";

        @NotNull
        private String closeButtonTitle = "Okay";

        @NotNull
        public final String getCloseButtonTitle() {
            return this.closeButtonTitle;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final void setCloseButtonTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.closeButtonTitle = str;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.title = str;
        }
    }

    public enum TransactionBackgroundView {
        SPINNER;

        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        public static a<TransactionBackgroundView> getEntries() {
            return $ENTRIES;
        }
    }

    public final boolean getAutomaticallyDismiss() {
        return this.automaticallyDismiss;
    }

    public final boolean getOptimisticLoading() {
        return this.optimisticLoading;
    }

    @NotNull
    public final Map<String, String> getOverrideProductsByName() {
        return this.overrideProductsByName;
    }

    @NotNull
    public final RestoreFailed getRestoreFailed() {
        return this.restoreFailed;
    }

    public final boolean getShouldPreload() {
        return this.shouldPreload;
    }

    public final boolean getShouldShowPurchaseFailureAlert() {
        return this.shouldShowPurchaseFailureAlert;
    }

    @Nullable
    public final TransactionBackgroundView getTransactionBackgroundView() {
        return this.transactionBackgroundView;
    }

    public final boolean getUseCachedTemplates() {
        return this.useCachedTemplates;
    }

    public final boolean isHapticFeedbackEnabled() {
        return this.isHapticFeedbackEnabled;
    }

    public final void setAutomaticallyDismiss(boolean z10) {
        this.automaticallyDismiss = z10;
    }

    public final void setHapticFeedbackEnabled(boolean z10) {
        this.isHapticFeedbackEnabled = z10;
    }

    public final void setOptimisticLoading(boolean z10) {
        this.optimisticLoading = z10;
    }

    public final void setOverrideProductsByName(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.overrideProductsByName = map;
    }

    public final void setRestoreFailed(@NotNull RestoreFailed restoreFailed) {
        Intrinsics.checkNotNullParameter(restoreFailed, "<set-?>");
        this.restoreFailed = restoreFailed;
    }

    public final void setShouldPreload(boolean z10) {
        this.shouldPreload = z10;
    }

    public final void setShouldShowPurchaseFailureAlert(boolean z10) {
        this.shouldShowPurchaseFailureAlert = z10;
    }

    public final void setTransactionBackgroundView(@Nullable TransactionBackgroundView transactionBackgroundView) {
        this.transactionBackgroundView = transactionBackgroundView;
    }

    public final void setUseCachedTemplates(boolean z10) {
        this.useCachedTemplates = z10;
    }
}
