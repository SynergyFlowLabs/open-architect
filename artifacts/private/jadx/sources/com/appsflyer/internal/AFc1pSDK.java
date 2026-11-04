package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1pSDK {
    private static String AFAdRevenueData = "348";
    private final Executor component3;
    public final AFc1kSDK getCurrencyIso4217Code;
    public final AFc1qSDK getMonetizationNetwork;
    public final AFc1iSDK getRevenue;
    private Bundle component1 = null;
    public String getMediationNetwork = "";

    public AFc1pSDK(AFc1iSDK aFc1iSDK, AFc1qSDK aFc1qSDK, AFc1kSDK aFc1kSDK, Executor executor) {
        this.getRevenue = aFc1iSDK;
        this.getMonetizationNetwork = aFc1qSDK;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.component3 = executor;
    }

    public static boolean AFAdRevenueData(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Could not check if app is pre installed", e10);
        }
        return false;
    }

    public static String component1() {
        StringBuilder sb2 = new StringBuilder("version: 6.17.0 (build ");
        sb2.append(AFAdRevenueData);
        sb2.append(")");
        return sb2.toString();
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String getMediationNetwork() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @NonNull
    public static String getMonetizationNetwork() {
        return "6.17.0";
    }

    @NonNull
    public static String getRevenue() {
        return UUID.randomUUID().toString();
    }

    @androidx.annotation.p0
    public final String component2() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getCurrencyIso4217Code("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean component4() {
        return !this.getCurrencyIso4217Code.getMonetizationNetwork();
    }

    @androidx.annotation.p0
    public final String getCurrencyIso4217Code(String str) {
        Object obj;
        try {
            if (this.component1 == null) {
                this.component1 = ((PackageItemInfo) this.getRevenue.getMonetizationNetwork.getPackageManager().getApplicationInfo(this.getRevenue.getMonetizationNetwork.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.component1;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    public final boolean getMonetizationNetwork(String str, boolean z10) {
        String currencyIso4217Code = getCurrencyIso4217Code(str);
        return currencyIso4217Code != null ? Boolean.parseBoolean(currencyIso4217Code) : z10;
    }

    @e.a({"DiscouragedApi"})
    @androidx.annotation.p0
    public final String getRevenue(String str) {
        try {
            int identifier = this.getRevenue.getMonetizationNetwork.getResources().getIdentifier(str, androidx.constraintlayout.core.motion.utils.v.b.f43988e, this.getRevenue.getMonetizationNetwork.getPackageName());
            if (identifier != 0) {
                return this.getRevenue.getMonetizationNetwork.getString(identifier);
            }
        } catch (Resources.NotFoundException e10) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
        }
        return null;
    }

    @androidx.annotation.p0
    public final String AFAdRevenueData() {
        AFh1oSDK aFh1oSDK = this.getCurrencyIso4217Code.component3;
        AFb1mSDK aFb1mSDK = aFh1oSDK != null ? new AFb1mSDK(aFh1oSDK.AFAdRevenueData, aFh1oSDK.getRevenue) : null;
        if (aFb1mSDK != null) {
            return aFb1mSDK.getMonetizationNetwork;
        }
        return null;
    }

    public final String getCurrencyIso4217Code(Context context) {
        try {
            return new AFb1kSDK(context, this.component3).getRevenue();
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th2, true, false, false);
            return null;
        }
    }
}
