package com.superwall.sdk.utilities;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.billing.BillingError;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.paywall.presentation.internal.PaywallPresentationRequestStatusReason;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason;
import com.superwall.sdk.store.transactions.TransactionError;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ErrorTrackingKt {
    public static final boolean isFatal(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (!(th2 instanceof RuntimeException) && !(th2 instanceof StackOverflowError) && !(th2 instanceof OutOfMemoryError) && !(th2 instanceof ClassNotFoundException) && !(th2 instanceof NoClassDefFoundError)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldLog(Throwable th2) {
        return (((th2 instanceof CancellationException) || (th2 instanceof InterruptedException) || (th2 instanceof PaywallPresentationRequestStatusReason) || (th2 instanceof TransactionError) || (th2 instanceof PaywallSkippedReason) || ((!(th2 instanceof NetworkError.Decoding) && (th2 instanceof NetworkError)) || (th2 instanceof BillingError))) && (th2 instanceof PaywallPresentationRequestStatusReason)) ? false : true;
    }

    public static final void trackError(@NotNull Superwall superwall, @NotNull Throwable e10) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(e10, "e");
        try {
            superwall.getDependencyContainer$superwall_release().getErrorTracker$superwall_release().trackError(e10);
        } catch (Exception e11) {
            e10.printStackTrace();
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.all, "Error tracking failed for " + e10.getMessage() + ". Cause " + e11.getMessage() + "} ", null, null, 24, null);
        }
    }

    @NotNull
    public static final <T> Either<T, Throwable> withErrorTracking(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new Either.Success(block.invoke());
        } catch (Throwable th2) {
            if (shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    trackError(companion.getInstance(), th2);
                }
            }
            return new Either.Failure(th2);
        }
    }
}
