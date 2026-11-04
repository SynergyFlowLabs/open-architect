package com.superwall.sdk.utilities;

import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.misc.ActivityProvider;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallBuilder {

    @Nullable
    private ActivityProvider activityProvider;

    @Nullable
    private Function1<? super Result<Unit>, Unit> completion;

    @Nullable
    private SuperwallOptions options;

    @Nullable
    private PurchaseController purchaseController;

    @Nullable
    public final ActivityProvider getActivityProvider() {
        return this.activityProvider;
    }

    @Nullable
    public final Function1<Result<Unit>, Unit> getCompletion() {
        return this.completion;
    }

    @Nullable
    public final SuperwallOptions getOptions() {
        return this.options;
    }

    @Nullable
    public final PurchaseController getPurchaseController() {
        return this.purchaseController;
    }

    @SuperwallDSL
    public final void options(@NotNull Function1<? super SuperwallOptions, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        SuperwallOptions superwallOptions = new SuperwallOptions();
        action.invoke(superwallOptions);
        this.options = superwallOptions;
    }

    public final void setActivityProvider(@Nullable ActivityProvider activityProvider) {
        this.activityProvider = activityProvider;
    }

    public final void setCompletion(@Nullable Function1<? super Result<Unit>, Unit> function1) {
        this.completion = function1;
    }

    public final void setPurchaseController(@Nullable PurchaseController purchaseController) {
        this.purchaseController = purchaseController;
    }
}
