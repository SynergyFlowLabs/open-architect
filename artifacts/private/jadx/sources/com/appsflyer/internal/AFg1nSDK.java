package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1nSDK {
    static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }

    static void getMonetizationNetwork(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb2.append(map.toString());
            AFLogger.afDebugLog(sb2.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }
}
