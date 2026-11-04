package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.share.LinkGenerator;
import com.facebook.login.v;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    private void AFAdRevenueData(String str, String str2) {
        byte b10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", v.L);
            jSONObject.put("data", str2);
            int iHashCode = str.hashCode();
            if (iHashCode != -1390007222) {
                if (iHashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("onAttributionFailure")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                onInstallConversionFailureNative(jSONObject);
            } else {
                if (b10 != 1) {
                    return;
                }
                onAttributionFailureNative(jSONObject);
            }
        } catch (JSONException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "2dx error", e10, false, false);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFAdRevenueData("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFAdRevenueData("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
