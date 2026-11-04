package com.superwall.sdk.utilities;

import android.app.Application;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.config.options.PaywallOptions;
import com.superwall.sdk.config.options.SuperwallOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallDSLKt {
    @SuperwallDSL
    @NotNull
    public static final Superwall configureSuperwall(@NotNull Application application, @NotNull String apiKey, @NotNull Function1<? super SuperwallBuilder, Unit> configure) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(configure, "configure");
        SuperwallBuilder superwallBuilder = new SuperwallBuilder();
        configure.invoke(superwallBuilder);
        Superwall.Companion companion = Superwall.Companion;
        companion.configure(application, apiKey, superwallBuilder.getPurchaseController(), superwallBuilder.getOptions(), superwallBuilder.getActivityProvider(), superwallBuilder.getCompletion());
        return companion.getInstance();
    }

    @SuperwallDSL
    public static final void logging(@NotNull SuperwallOptions superwallOptions, @NotNull Function1<? super SuperwallOptions.Logging, Unit> action) {
        Intrinsics.checkNotNullParameter(superwallOptions, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        SuperwallOptions.Logging logging = superwallOptions.getLogging();
        action.invoke(logging);
        superwallOptions.setLogging(logging);
    }

    @SuperwallDSL
    public static final void paywalls(@NotNull SuperwallOptions superwallOptions, @NotNull Function1<? super PaywallOptions, Unit> action) {
        Intrinsics.checkNotNullParameter(superwallOptions, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        PaywallOptions paywalls = superwallOptions.getPaywalls();
        action.invoke(paywalls);
        superwallOptions.setPaywalls(paywalls);
    }
}
