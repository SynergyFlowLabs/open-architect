package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1cSDK implements AFb1hSDK {

    @NotNull
    private final AFf1gSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1kSDK getMediationNetwork;

    @NotNull
    private final AFc1iSDK getMonetizationNetwork;

    public AFb1cSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFf1gSDK aFf1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        this.getMediationNetwork = aFc1kSDK;
        this.getMonetizationNetwork = aFc1iSDK;
        this.getCurrencyIso4217Code = aFf1gSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1kSDK aFc1kSDK = aFb1cSDK.getMediationNetwork;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "");
        aFc1kSDK.toString = new AFb1gSDK(scope, id2);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getCurrencyIso4217Code.AFAdRevenueData() && !this.getMediationNetwork.AFAdRevenueData() && AFj1iSDK.AFAdRevenueData(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1iSDK.getCurrencyIso4217Code(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMediationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().j(new com.google.android.gms.tasks.g() { // from class: com.appsflyer.internal.i
                    @Override // com.google.android.gms.tasks.g
                    public final void b(Object obj) {
                        AFb1cSDK.AFAdRevenueData(this.f89709a, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th2) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f312394a;
            }
        }
    }
}
