package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1sSDK {
    public final List<AFj1qSDK> getCurrencyIso4217Code = new ArrayList();
    public final AFc1dSDK getMediationNetwork;

    public AFj1sSDK(AFc1dSDK aFc1dSDK) {
        this.getMediationNetwork = aFc1dSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2(final Runnable runnable) {
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89714a.getMonetizationNetwork(runnable);
            }
        });
        getMediationNetwork(aFj1zSDK);
        aFj1zSDK.getRevenue(this.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1qSDK aFc1qSDKComponent2 = this.getMediationNetwork.component2();
        int iAFAdRevenueData = this.getMediationNetwork.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
        boolean mediationNetwork = aFc1qSDKComponent2.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z10 = aFi1aSDK.component4 == AFj1qSDK.AFa1ySDK.NOT_STARTED;
        if (iAFAdRevenueData == 1) {
            if (z10 || mediationNetwork) {
                runnable.run();
            }
        }
    }

    public final AFi1aSDK AFAdRevenueData(final Runnable runnable) {
        return new AFi1aSDK(new Runnable() { // from class: com.appsflyer.internal.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89704a.getCurrencyIso4217Code(runnable);
            }
        }, this.getMediationNetwork.getMonetizationNetwork(), this.getMediationNetwork.getRevenue());
    }

    public final synchronized void getMediationNetwork(AFj1qSDK aFj1qSDK) {
        try {
            this.getCurrencyIso4217Code.add(aFj1qSDK);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public final synchronized AFj1qSDK[] getRevenue() {
        return (AFj1qSDK[]) this.getCurrencyIso4217Code.toArray(new AFj1qSDK[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(final Runnable runnable) {
        AFj1dSDK.getMediationNetwork(this.getMediationNetwork.AFAdRevenueData(), new Runnable() { // from class: com.appsflyer.internal.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89707a.getRevenue(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        try {
            if (getCurrencyIso4217Code(new AFh1kSDK())) {
                runnable.run();
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    @l1
    public final void getMediationNetwork(final Runnable runnable) {
        getMediationNetwork(new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89711a.component2(runnable);
            }
        }));
    }

    public final Runnable AFAdRevenueData(final AFi1aSDK aFi1aSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89718a.getMonetizationNetwork(aFi1aSDK, runnable);
            }
        };
    }

    public final boolean getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        boolean z10 = true & false;
        int iAFAdRevenueData = this.getMediationNetwork.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
        boolean z11 = iAFAdRevenueData == 1 && !(aFh1rSDK instanceof AFh1kSDK);
        if ((this.getMediationNetwork.component2().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) || iAFAdRevenueData != 1) && !z11) {
            return false;
        }
        return true;
    }

    public final boolean AFAdRevenueData() {
        Iterator<AFj1qSDK> it = this.getCurrencyIso4217Code.iterator();
        while (it.hasNext()) {
            if (it.next().component4 == AFj1qSDK.AFa1ySDK.STARTED) {
                return false;
            }
        }
        return true;
    }

    @l1
    public final boolean getMonetizationNetwork() {
        return this.getMediationNetwork.getRevenue().getMonetizationNetwork("AF_PREINSTALL_DISABLED", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        AFj1zSDK aFj1zSDK = new AFj1zSDK(this.getMediationNetwork.getRevenue(), this.getMediationNetwork.getMonetizationNetwork(), AFj1ySDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.i0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.getCurrencyIso4217Code();
            }
        });
        getMediationNetwork(aFj1zSDK);
        aFj1zSDK.getRevenue(this.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
    }
}
