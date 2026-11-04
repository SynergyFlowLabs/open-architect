package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class AFb1lSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final Executor AFAdRevenueData;
    private boolean component1;
    private boolean component3;

    @NotNull
    final AFb1bSDK.AFa1zSDK getCurrencyIso4217Code;

    @NotNull
    private final AFi1kSDK getMediationNetwork;

    @NotNull
    private final ScheduledExecutorService getMonetizationNetwork;

    @NotNull
    private final AFa1oSDK getRevenue;

    public AFb1lSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1oSDK aFa1oSDK, @NotNull AFi1kSDK aFi1kSDK, @NotNull AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.AFAdRevenueData = executor;
        this.getMonetizationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getMediationNetwork = aFi1kSDK;
        this.getCurrencyIso4217Code = aFa1zSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1lSDK aFb1lSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        if (aFb1lSDK.component1 && aFb1lSDK.component3) {
            aFb1lSDK.component1 = false;
            try {
                aFb1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code();
            } catch (Exception e10) {
                AFLogger.afErrorLog("Listener threw exception! ", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK, AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        if (!aFb1lSDK.component1) {
            try {
                aFb1lSDK.getCurrencyIso4217Code.getRevenue(aFh1qSDK);
            } catch (Exception e10) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e10, true);
            }
        }
        aFb1lSDK.component3 = false;
        aFb1lSDK.component1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(final AFb1lSDK aFb1lSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        aFb1lSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFb1lSDK.getMonetizationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1lSDK.AFAdRevenueData(this.f89713a);
                }
            };
            AFb1bSDK.AFa1vSDK aFa1vSDK = AFb1bSDK.AFa1vSDK;
            scheduledExecutorService.schedule(runnable, AFb1bSDK.AFa1vSDK.getRevenue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.AFAdRevenueData) {
            aFa1oSDK.AFAdRevenueData = intent;
        }
        this.getMediationNetwork.getMediationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getRevenue(this.f89710a);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1qSDK aFh1qSDK = new AFh1qSDK(activity, this.getMediationNetwork);
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getCurrencyIso4217Code(this.f89716a, aFh1qSDK);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
