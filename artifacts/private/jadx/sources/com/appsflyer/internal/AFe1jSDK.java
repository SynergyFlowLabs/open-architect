package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1jSDK extends AFe1dSDK<String> {

    @NonNull
    private final String component2;
    private final AFc1pSDK copy;

    @androidx.annotation.p0
    private final AFk1rSDK toString;

    public AFe1jSDK(@NonNull AFc1dSDK aFc1dSDK, @NonNull String str, @androidx.annotation.p0 AFk1rSDK aFk1rSDK) {
        super(AFe1mSDK.IMPRESSIONS, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, str);
        this.component2 = str;
        this.toString = aFk1rSDK;
        this.copy = aFc1dSDK.getRevenue();
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @androidx.annotation.p0
    protected final AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AFd1nSDK<String> getRevenue(@NonNull String str) {
        AFd1oSDK aFd1oSDK = this.component4;
        String strAFAdRevenueData = this.copy.AFAdRevenueData();
        return aFd1oSDK.getRevenue(AFk1ySDK.getMediationNetwork(strAFAdRevenueData) ? this.component2 : Uri.parse(this.component2).buildUpon().appendQueryParameter("advertising_id", strAFAdRevenueData).build().toString());
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFd1aSDK<Result> aFd1aSDK = ((AFe1dSDK) this).component1;
        if (aFd1aSDK != 0) {
            int statusCode = aFd1aSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                sb2.append(this.component2);
                AFLogger.afInfoLog(sb2.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.component2);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
            sb4.append(this.component2);
            AFLogger.afInfoLog(sb4.toString(), false);
            String currencyIso4217Code = aFd1aSDK.getCurrencyIso4217Code(com.google.common.net.d.f119539t0);
            AFk1rSDK aFk1rSDK = this.toString;
            if (aFk1rSDK == null || currencyIso4217Code == null) {
                return;
            }
            aFk1rSDK.getMonetizationNetwork = currencyIso4217Code;
            Context context = aFk1rSDK.AFAdRevenueData.get();
            if (context != null) {
                try {
                    if (aFk1rSDK.getMonetizationNetwork != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1rSDK.getMonetizationNetwork)).setFlags(268435456));
                    }
                } catch (Exception e10) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e10)), e10);
                }
            }
        }
    }
}
