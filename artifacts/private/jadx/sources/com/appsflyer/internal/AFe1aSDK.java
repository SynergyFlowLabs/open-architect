package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1aSDK extends AFe1sSDK<Map<String, Object>> {
    private static final int areAllFieldsValid = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFa1oSDK component1;
    private final AFa1jSDK component2;
    private Map<String, Object> component3;
    private final Uri component4;
    private final List<String> hashCode;

    public AFe1aSDK(AFa1oSDK aFa1oSDK, @NonNull AFa1jSDK aFa1jSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1mSDK.RESOLVE_ESP, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1oSDK;
        this.component2 = aFa1jSDK;
        this.component4 = uri;
        this.hashCode = list;
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i10 = areAllFieldsValid;
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.17.0");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField(com.google.common.net.d.f119539t0));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th2) {
            map.put("error", th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    @NonNull
    public final AFe1rSDK getCurrencyIso4217Code() throws Exception {
        Integer num = null;
        if (!getMediationNetwork(this.component4.toString())) {
            this.component1.i_(this.component2, this.component4, null);
            return AFe1rSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        String str = null;
        while (i10 < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get("status");
            String str3 = (String) mapR_.get("error");
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i10 < 4) {
                arrayList.add(str2);
            }
            i10++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component2) {
            this.component2.getCurrencyIso4217Code("af_deeplink_r", map);
            this.component2.getCurrencyIso4217Code("af_deeplink", this.component4.toString());
        }
        this.component1.i_(this.component2, string != null ? Uri.parse(string) : this.component4, this.component4);
        this.component3 = map;
        return AFe1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        return 60000L;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Validate if link ");
        sb2.append(str);
        sb2.append(" belongs to ESP domains: ");
        sb2.append(this.hashCode);
        AFLogger.afRDLog(sb2.toString());
        try {
            return this.hashCode.contains(new URL(str).getHost());
        } catch (MalformedURLException e10) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e10);
            return false;
        }
    }
}
