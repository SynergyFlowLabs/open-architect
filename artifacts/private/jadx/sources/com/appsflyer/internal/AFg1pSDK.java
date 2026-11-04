package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1pSDK extends AFe1dSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");

    @androidx.annotation.p0
    private String AFInAppEventParameterName;

    @androidx.annotation.p0
    private Map<String, Object> copy;
    private final AFh1vSDK copydefault;
    private final AFc1pSDK equals;
    private final AFd1oSDK hashCode;
    private final AFc1qSDK toString;

    public AFg1pSDK(@NonNull AFc1dSDK aFc1dSDK) {
        super(AFe1mSDK.GCDSDK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1dSDK, "GCD-FETCH");
        this.hashCode = aFc1dSDK.getCurrencyIso4217Code();
        this.toString = aFc1dSDK.component2();
        this.copydefault = aFc1dSDK.areAllFieldsValid();
        this.equals = aFc1dSDK.getRevenue();
        this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
        this.AFAdRevenueData.add(AFe1mSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @androidx.annotation.p0
    public final AppsFlyerRequestListener component3() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1rSDK getCurrencyIso4217Code() throws Exception {
        AFe1rSDK currencyIso4217Code;
        AFe1rSDK aFe1rSDK;
        if (((AFe1dSDK) this).component3.AFAdRevenueData()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFInAppEventParameterName = "'isStopTracking' enabled";
            throw new AFe1oSDK();
        }
        AFe1rSDK aFe1rSDK2 = AFe1rSDK.FAILURE;
        int i10 = 0;
        while (i10 <= 2) {
            boolean z10 = true;
            boolean z11 = i10 >= 2;
            this.copydefault.equals = System.currentTimeMillis();
            try {
                try {
                    try {
                        currencyIso4217Code = super.getCurrencyIso4217Code();
                        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
                        if (responseNetwork != null) {
                            int statusCode = responseNetwork.getStatusCode();
                            if (statusCode != 403 && statusCode < 500) {
                                z10 = false;
                            }
                            if (responseNetwork.isSuccessful() || statusCode == 404) {
                                Map<String, Object> map = (Map) responseNetwork.getBody();
                                int statusCode2 = responseNetwork.getStatusCode();
                                Boolean bool = (Boolean) map.get("iscache");
                                if (statusCode2 == 404) {
                                    map.remove("error_reason");
                                    map.remove(io.sentry.protocol.n.b.f306414c);
                                    map.put("af_status", "Organic");
                                    map.put("af_message", "organic install");
                                }
                                if (bool != null && !bool.booleanValue()) {
                                    this.toString.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                }
                                if (map.containsKey("af_siteid")) {
                                    if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                        StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                        sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                        AFLogger.afDebugLog(sb2.toString());
                                    } else {
                                        AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                    }
                                }
                                map.put("is_first_launch", Boolean.FALSE);
                                this.toString.getMediationNetwork("attributionId", new JSONObject(map).toString());
                                if (!this.toString.getMediationNetwork("sixtyDayConversionData", false)) {
                                    map.put("is_first_launch", Boolean.TRUE);
                                }
                                this.copy = map;
                                aFe1rSDK = AFe1rSDK.SUCCESS;
                            } else {
                                if (!z11) {
                                    if (!z10) {
                                    }
                                }
                                this.AFInAppEventParameterName = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFe1rSDK = AFe1rSDK.FAILURE;
                            }
                            this.copydefault.AFAdRevenueData(i10);
                            AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                            return aFe1rSDK;
                        }
                    } catch (Exception e10) {
                        StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                        sb3.append(e10.getMessage());
                        AFLogger.afErrorLog(sb3.toString(), e10, false, false);
                        currencyIso4217Code = AFe1rSDK.FAILURE;
                        if (z11) {
                            this.AFInAppEventParameterName = e10.getMessage();
                            throw e10;
                        }
                    }
                    this.copydefault.AFAdRevenueData(i10);
                    AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                    aFe1rSDK2 = currencyIso4217Code;
                    i10++;
                } catch (AFe1nSDK e11) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFInAppEventParameterName = "AppsFlyer dev key is missing";
                    throw e11;
                }
            } catch (Throwable th2) {
                this.copydefault.AFAdRevenueData(i10);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th2;
            }
        }
        return aFe1rSDK2;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        Map<String, Object> map = this.copy;
        String str = this.AFInAppEventParameterName;
        if (map != null) {
            AFg1nSDK.getMonetizationNetwork(map);
        } else if (str == null || str.isEmpty()) {
            AFg1nSDK.getMediationNetwork("Unknown error");
        } else {
            AFg1nSDK.getMediationNetwork(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFd1nSDK<Map<String, Object>> getRevenue(@NonNull String str) {
        String strConcat;
        String monetizationNetwork = AFa1tSDK.getMonetizationNetwork(this.toString, this.equals.component2());
        if (monetizationNetwork == null || monetizationNetwork.trim().isEmpty()) {
            strConcat = "";
        } else if (component2.contains(monetizationNetwork.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", monetizationNetwork));
            strConcat = "";
        } else {
            strConcat = "-".concat(monetizationNetwork);
        }
        AFd1nSDK<Map<String, Object>> revenue = this.hashCode.getRevenue(strConcat, str);
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(revenue.getRevenue.getMonetizationNetwork);
        AFLogger.afInfoLog(sb2.toString());
        return revenue;
    }
}
