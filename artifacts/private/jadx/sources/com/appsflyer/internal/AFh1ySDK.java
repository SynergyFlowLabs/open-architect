package com.appsflyer.internal;

import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1ySDK {
    public static void getCurrencyIso4217Code(String str, @androidx.annotation.p0 JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getMediationNetwork(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    jSONObject.put("pia_token", "pia_token");
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb2.toString());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e10);
            }
        }
    }

    @l1
    private static String getMediationNetwork(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 == 0 || i10 == str.length() - 1) {
                sb2.append(str.charAt(i10));
            } else {
                sb2.append("*");
            }
        }
        return sb2.toString();
    }
}
