package com.superwall.sdk.paywall.presentation;

import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallPresentationHandler {

    @Nullable
    private Function2<? super PaywallInfo, ? super PaywallResult, Unit> onDismissHandler;

    @Nullable
    private Function1<? super Throwable, Unit> onErrorHandler;

    @Nullable
    private Function1<? super PaywallInfo, Unit> onPresentHandler;

    @Nullable
    private Function1<? super PaywallSkippedReason, Unit> onSkipHandler;

    @Nullable
    public final Function2<PaywallInfo, PaywallResult, Unit> getOnDismissHandler$superwall_release() {
        return this.onDismissHandler;
    }

    @Nullable
    public final Function1<Throwable, Unit> getOnErrorHandler$superwall_release() {
        return this.onErrorHandler;
    }

    @Nullable
    public final Function1<PaywallInfo, Unit> getOnPresentHandler$superwall_release() {
        return this.onPresentHandler;
    }

    @Nullable
    public final Function1<PaywallSkippedReason, Unit> getOnSkipHandler$superwall_release() {
        return this.onSkipHandler;
    }

    public final void onDismiss(@NotNull Function2<? super PaywallInfo, ? super PaywallResult, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.onDismissHandler = handler;
    }

    public final void onError(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.onErrorHandler = handler;
    }

    public final void onPresent(@NotNull Function1<? super PaywallInfo, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.onPresentHandler = handler;
    }

    public final void onSkip(@NotNull Function1<? super PaywallSkippedReason, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.onSkipHandler = handler;
    }

    public final void setOnDismissHandler$superwall_release(@Nullable Function2<? super PaywallInfo, ? super PaywallResult, Unit> function2) {
        this.onDismissHandler = function2;
    }

    public final void setOnErrorHandler$superwall_release(@Nullable Function1<? super Throwable, Unit> function1) {
        this.onErrorHandler = function1;
    }

    public final void setOnPresentHandler$superwall_release(@Nullable Function1<? super PaywallInfo, Unit> function1) {
        this.onPresentHandler = function1;
    }

    public final void setOnSkipHandler$superwall_release(@Nullable Function1<? super PaywallSkippedReason, Unit> function1) {
        this.onSkipHandler = function1;
    }
}
