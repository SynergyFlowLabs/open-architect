package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1aSDK implements AFg1bSDK {

    @Nullable
    private AFh1zSDK AFAdRevenueData;

    @Nullable
    private AFh1wSDK getCurrencyIso4217Code;

    @Nullable
    private AFg1fSDK getMediationNetwork;

    @NotNull
    private final AFc1dSDK getRevenue;

    public AFg1aSDK(@NotNull AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getRevenue = aFc1dSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void AFAdRevenueData() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFh1wSDK(this.getRevenue);
        }
        AFh1wSDK aFh1wSDK = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNull(aFh1wSDK);
        aFLogger.registerClient(aFh1wSDK);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void component4() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFg1fSDK();
        }
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFg1fSDK);
        int i10 = 4 ^ 1;
        aFLogger.registerClient(aFg1fSDK);
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getCurrencyIso4217Code() {
        AFh1zSDK aFh1zSDK = this.AFAdRevenueData;
        if (aFh1zSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1zSDK);
            int i10 = 6 & 0;
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMediationNetwork() {
        AFh1wSDK aFh1wSDK = this.getCurrencyIso4217Code;
        if (aFh1wSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            int i10 = 5 ^ 0;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1wSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getMonetizationNetwork() {
        AFg1fSDK aFg1fSDK = this.getMediationNetwork;
        if (aFg1fSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1fSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFAdRevenueData == null) {
            this.AFAdRevenueData = new AFh1zSDK(this.getRevenue);
        }
        AFh1zSDK aFh1zSDK = this.AFAdRevenueData;
        Intrinsics.checkNotNull(aFh1zSDK);
        aFLogger.registerClient(aFh1zSDK);
    }
}
