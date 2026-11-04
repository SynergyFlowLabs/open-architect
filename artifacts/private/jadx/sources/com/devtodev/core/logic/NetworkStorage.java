package com.devtodev.core.logic;

import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.aggregated.events.CustomEvent;
import com.devtodev.core.data.metrics.aggregated.ingamepurchase.InGamePurchaseMetric;
import com.devtodev.core.data.metrics.simple.SocialConnectMetric;
import com.devtodev.core.data.metrics.simple.SocialPostMetric;
import com.devtodev.core.data.metrics.simple.TutorialMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkStorage implements Serializable {
    public static final int DEFAULT_COUNT = 10;
    public static final int MAX_ATTEMPTS = 1;
    public static final String NAME = "NetworkStorage";
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f98173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f98176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<String, ArrayList<Object>> f98177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f98179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f98181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f98182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f98183k;

    public NetworkStorage() {
        this.f98173a = 120L;
        this.f98174b = 10;
        this.f98175c = 20;
        this.f98176d = "";
        this.f98181i = 10L;
        this.f98182j = 600L;
        this.f98183k = 300L;
        this.f98177e = new HashMap<>();
    }

    boolean a(Metric metric) {
        String networkName;
        if (!this.f98178f && this.f98177e != null) {
            try {
                ArrayList<Object> arrayList = this.f98177e.get(metric.getMetricCode());
                if (arrayList == null) {
                    return true;
                }
                if (arrayList.size() == 0) {
                    return false;
                }
                try {
                    if (metric instanceof CustomEvent) {
                        String eventName = ((CustomEvent) metric).getEventName();
                        Iterator<Object> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(eventName)) {
                                return false;
                            }
                        }
                    } else if (metric instanceof TutorialMetric) {
                        int step = ((TutorialMetric) metric).getStep();
                        Iterator<Object> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((Integer) it2.next()).intValue() == step) {
                                return false;
                            }
                        }
                    } else if (metric instanceof InGamePurchaseMetric) {
                        String purchaseId = ((InGamePurchaseMetric) metric).getPurchaseId();
                        Iterator<Object> it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().equals(purchaseId)) {
                                return false;
                            }
                        }
                    } else if (metric instanceof SocialConnectMetric) {
                        String networkName2 = ((SocialConnectMetric) metric).getNetworkName();
                        if (networkName2 != null) {
                            Iterator<Object> it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                if (it4.next().equals(networkName2)) {
                                    return false;
                                }
                            }
                        }
                    } else if ((metric instanceof SocialPostMetric) && (networkName = ((SocialPostMetric) metric).getNetworkName()) != null) {
                        Iterator<Object> it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            if (it5.next().equals(networkName)) {
                                return false;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
        this.f98177e = new HashMap<>();
        return false;
    }

    void b() {
        HashMap<String, ArrayList<Object>> map = this.f98177e;
        if (map != null) {
            map.clear();
        }
    }

    String c() {
        return this.f98176d;
    }

    String d() {
        return this.f98179g;
    }

    long e() {
        return this.f98173a * 1000;
    }

    long f() {
        return this.f98182j;
    }

    boolean g() {
        return this.f98180h;
    }

    public long getAliveTimeout() {
        return this.f98183k * 1000;
    }

    public int getCustomEventParamsCount() {
        return this.f98175c;
    }

    public int getSendCount() {
        return this.f98174b;
    }

    public long getSessionDelay() {
        return this.f98181i;
    }

    public boolean isProfileKeyExcluded(String str) {
        HashMap<String, ArrayList<Object>> map = this.f98177e;
        if (map != null) {
            ArrayList<Object> arrayList = map.get("pl");
            return arrayList != null && arrayList.contains(str);
        }
        this.f98177e = new HashMap<>();
        return false;
    }

    public String toString() {
        return "\nNetworkStorage:\nWorker: " + this.f98176d;
    }

    void c(int i10) {
        this.f98173a = i10;
    }

    void b(int i10) {
        this.f98174b = i10;
    }

    public NetworkStorage(JSONObject jSONObject) {
        this.f98173a = 120L;
        this.f98174b = 10;
        this.f98175c = 20;
        this.f98176d = "";
        this.f98181i = 10L;
        this.f98182j = 600L;
        this.f98183k = 300L;
        if (jSONObject == null) {
            if (this.f98177e == null) {
                this.f98177e = new HashMap<>();
                return;
            }
            return;
        }
        this.f98176d = jSONObject.optString("worker");
        this.f98174b = jSONObject.optInt("countForRequest");
        this.f98173a = jSONObject.optLong("timeForRequest");
        this.f98175c = jSONObject.optInt("eventParamsCount");
        this.f98181i = jSONObject.optLong("sessionDelay");
        jSONObject.optLong("serverTime");
        Object objOpt = jSONObject.opt("exclude");
        if (objOpt != null) {
            if ((objOpt instanceof String) && objOpt.equals("all")) {
                this.f98178f = true;
            } else if (objOpt instanceof JSONObject) {
                this.f98177e = new HashMap<>();
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                    ArrayList<Object> arrayList = new ArrayList<>();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        arrayList.add(jSONArrayOptJSONArray.opt(i10));
                    }
                    this.f98177e.put(next, arrayList);
                }
            }
        } else {
            this.f98177e = new HashMap<>();
        }
        this.f98179g = jSONObject.optString("configVersion");
        this.f98180h = jSONObject.optBoolean("useCustomUDID");
        this.f98182j = jSONObject.optLong("sessionTimeout", 600L);
        this.f98183k = jSONObject.optLong("aliveTimeout", 300L);
    }

    void a(String str) {
        this.f98176d = str;
    }

    void a(int i10) {
        this.f98175c = i10;
    }

    void a() {
        if (this.f98179g != null) {
            this.f98179g = "";
        }
    }

    void a(boolean z10) {
        this.f98180h = z10;
    }
}
