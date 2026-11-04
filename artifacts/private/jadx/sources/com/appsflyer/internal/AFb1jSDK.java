package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1jSDK {
    public static String getMonetizationNetwork;

    @androidx.annotation.p0
    public static Boolean getRevenue;

    private static boolean getCurrencyIso4217Code() {
        Boolean bool = getRevenue;
        return bool == null || bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    @androidx.annotation.p0
    public static AFb1mSDK getMediationNetwork(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getMonetizationNetwork;
        int i10 = 2 >> 1;
        boolean z10 = str != null;
        if (z10) {
            lat = null;
        } else {
            Boolean bool = getRevenue;
            if ((bool == null || !bool.booleanValue()) && !(getRevenue == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id2 = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id2;
                        } catch (Throwable unused) {
                            str = id2;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFb1mSDK aFb1mSDK = new AFb1mSDK(str, lat);
        aFb1mSDK.AFAdRevenueData = Boolean.valueOf(z10);
        return aFb1mSDK;
    }

    @androidx.annotation.p0
    public static AFb1mSDK k_(ContentResolver contentResolver) {
        String string;
        if (!getCurrencyIso4217Code() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i10 == 0) {
            return new AFb1mSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i10 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th2);
            string = "";
        }
        return new AFb1mSDK(string, Boolean.TRUE);
    }
}
