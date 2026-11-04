package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AFf1uSDK extends AFf1rSDK {

    @NonNull
    private final AFa1gSDK AFInAppEventParameterName;

    @NonNull
    private final AFh1vSDK AFInAppEventType;

    @androidx.annotation.p0
    private final AFh1uSDK AFKeystoreWrapper;

    @NonNull
    private final AppsFlyerProperties AFLogger;
    public Map<String, Object> copydefault;

    @NonNull
    private final AFj1sSDK equals;

    @NonNull
    private final AFc1qSDK hashCode;

    @NonNull
    private final AFf1oSDK registerClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1uSDK$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFj1qSDK.AFa1ySDK.values().length];
            AFAdRevenueData = iArr;
            try {
                iArr[AFj1qSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFAdRevenueData[AFj1qSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1uSDK(@NonNull AFh1rSDK aFh1rSDK, @NonNull AFc1dSDK aFc1dSDK) {
        super(aFh1rSDK, aFc1dSDK);
        this.equals = aFc1dSDK.AFLogger();
        this.hashCode = aFc1dSDK.component2();
        this.AFInAppEventType = aFc1dSDK.areAllFieldsValid();
        this.registerClient = aFc1dSDK.component1();
        this.AFLogger = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFc1dSDK.afVerboseLog();
        this.AFKeystoreWrapper = aFc1dSDK.afErrorLogForExcManagerOnly();
        this.AFAdRevenueData.add(AFe1mSDK.RESOLVE_ESP);
        this.AFAdRevenueData.add(AFe1mSDK.DLSDK);
    }

    @l1
    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        boolean z10 = this.getMediationNetwork == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1mSDK aFe1mSDK = this.getMonetizationNetwork;
        return z10 && (aFe1mSDK == AFe1mSDK.CONVERSION || aFe1mSDK == AFe1mSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        AFh1uSDK aFh1uSDK;
        AFh1uSDK aFh1uSDK2;
        super.AFAdRevenueData(aFh1rSDK);
        int i10 = aFh1rSDK.component2;
        AFAdRevenueData(i10);
        Map map = (Map) aFh1rSDK.AFAdRevenueData.get(io.sentry.protocol.j.b.f306355e);
        if (map == null) {
            map = new HashMap();
            aFh1rSDK.AFAdRevenueData.put(io.sentry.protocol.j.b.f306355e, map);
        }
        if (!aFh1rSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1rSDK.getMediationNetwork(this.AFInAppEventParameterName.getCurrencyIso4217Code());
        }
        AFi1vSDK aFi1vSDKAFAdRevenueData = this.registerClient.AFAdRevenueData();
        if (aFi1vSDKAFAdRevenueData != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFi1vSDKAFAdRevenueData.AFAdRevenueData);
            String str = aFi1vSDKAFAdRevenueData.getCurrencyIso4217Code;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j10 = aFi1vSDKAFAdRevenueData.getRevenue;
            if (j10 > 0) {
                map2.put("latency", Long.valueOf(j10));
            }
            long j11 = aFi1vSDKAFAdRevenueData.getMediationNetwork;
            if (j11 > 0) {
                map2.put("delay", Long.valueOf(j11));
            }
            int i11 = aFi1vSDKAFAdRevenueData.getMonetizationNetwork;
            if (i11 > 0) {
                map2.put("res_code", Integer.valueOf(i11));
            }
            if (aFi1vSDKAFAdRevenueData.component1 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFi1vSDKAFAdRevenueData.component1.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(aFi1vSDKAFAdRevenueData.component1.getMessage());
                map2.put("error", sb2.toString());
            }
            AFi1ySDK aFi1ySDK = aFi1vSDKAFAdRevenueData.component4;
            if (aFi1ySDK != null) {
                map2.put("sig", aFi1ySDK.toString());
            }
            String str2 = aFi1vSDKAFAdRevenueData.component3;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        this.toString.getCurrencyIso4217Code(aFh1rSDK.AFAdRevenueData);
        if (i10 == 1) {
            if (this.AFLogger.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1rSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            HashMap map3 = new HashMap(this.AFInAppEventType.getMonetizationNetwork);
            this.AFInAppEventType.getCurrencyIso4217Code.getMonetizationNetwork("ddl");
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.AFInAppEventType.AFAdRevenueData);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1uSDK aFh1uSDK3 = this.AFKeystoreWrapper;
            if (aFh1uSDK3 != null) {
                aFh1uSDK3.getCurrencyIso4217Code(aFh1rSDK);
            }
        } else if (i10 == 2) {
            HashMap map5 = new HashMap(this.AFInAppEventType.AFAdRevenueData);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            this.AFInAppEventType.getCurrencyIso4217Code.getMonetizationNetwork("first_launch");
            if ((aFh1rSDK instanceof AFh1kSDK) && (aFh1uSDK2 = this.AFKeystoreWrapper) != null && !aFh1uSDK2.getMonetizationNetwork()) {
                this.AFKeystoreWrapper.getMediationNetwork(aFh1rSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1rSDK.AFAdRevenueData.remove(io.sentry.protocol.j.b.f306355e);
        }
        if (i10 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1qSDK aFj1qSDK : this.equals.getRevenue()) {
                boolean z10 = aFj1qSDK instanceof AFi1aSDK;
                int i12 = AnonymousClass1.AFAdRevenueData[aFj1qSDK.component4.ordinal()];
                if (i12 == 1) {
                    if (z10) {
                        aFh1rSDK.getMediationNetwork("rfr", ((AFi1aSDK) aFj1qSDK).getCurrencyIso4217Code);
                        this.hashCode.getCurrencyIso4217Code(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1qSDK.AFAdRevenueData);
                } else if (i12 == 2 && i10 == 2 && !z10) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1qSDK.component2);
                    map6.put(io.sentry.protocol.n.f306405g, "TIMEOUT");
                    map6.put("type", aFj1qSDK.areAllFieldsValid);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1rSDK.getMediationNetwork("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFh1rSDK.getMediationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1rSDK.getCurrencyIso4217Code() == AFe1mSDK.LAUNCH && (aFh1uSDK = this.AFKeystoreWrapper) != null && aFh1uSDK.getRevenue()) {
            this.AFKeystoreWrapper.getMonetizationNetwork(aFh1rSDK);
        }
        this.toString.getCurrencyIso4217Code(aFh1rSDK);
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public boolean getMediationNetwork() {
        if (!super.getMediationNetwork() && !equals()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        AFh1vSDK aFh1vSDK = this.AFInAppEventType;
        int i10 = ((AFf1rSDK) this).component2.component2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 == 1) {
            long j10 = aFh1vSDK.areAllFieldsValid;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1vSDK.AFAdRevenueData.put("net", Long.valueOf(jCurrentTimeMillis - j10));
            aFh1vSDK.getCurrencyIso4217Code.getMediationNetwork("first_launch", new JSONObject(aFh1vSDK.AFAdRevenueData).toString());
        }
    }

    protected void AFAdRevenueData(int i10) {
        this.AFInAppEventType.getCurrencyIso4217Code(i10);
    }
}
