package com.devtodev.core.logic;

import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import com.devtodev.core.data.metrics.aggregated.a.b;
import com.devtodev.core.data.metrics.aggregated.events.CustomEvent;
import com.devtodev.core.utils.log.CoreLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MetricsStorage implements Serializable {
    public static final String NAME = "MetricsStorage";
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, UserMetrics> f98169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f98170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98172d;

    public MetricsStorage() {
        this.f98169a = new HashMap<>();
        this.f98172d = 0;
        boolean z10 = false | true;
        setLevel(1, null, false);
    }

    synchronized boolean a(int i10, Metric metric) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return a(i10, metric, (ArrayList<String>) null);
    }

    public void absorbPeopleData(MetricsStorage metricsStorage) {
        if (metricsStorage.a("pl")) {
            for (Map.Entry<String, UserMetrics> entry : metricsStorage.f98169a.entrySet()) {
                String key = entry.getKey();
                UserMetrics value = entry.getValue();
                b bVar = (b) value.c().get("pl");
                if (bVar != null) {
                    value.c().remove("pl");
                    UserMetrics userMetrics = this.f98169a.get(key);
                    if (userMetrics == null) {
                        userMetrics = new UserMetrics(value.d().getLevel(), false, null);
                        this.f98169a.put(key, userMetrics);
                    }
                    if (userMetrics.c().containsKey("pl")) {
                        ((b) userMetrics.c().get("pl")).addEntry(bVar);
                    } else {
                        userMetrics.a(bVar);
                    }
                }
            }
        }
    }

    void b(int i10, int i11, String str) {
        this.f98169a.get(String.valueOf(i10 + 1)).b(str, i11);
    }

    void c(int i10, int i11, String str) {
        this.f98169a.get(String.valueOf(i10 + 1)).c(str, i11);
    }

    public String getPrevUserId() {
        return this.f98171c;
    }

    public String getUserId() {
        return this.f98170b;
    }

    public void setLevel(int i10, HashMap<String, Integer> map, boolean z10) {
        String strValueOf = String.valueOf(i10);
        int i11 = i10 + 1;
        String strValueOf2 = String.valueOf(i11);
        if (this.f98169a.containsKey(strValueOf)) {
            this.f98169a.get(strValueOf).d().setNew(z10);
            this.f98169a.get(strValueOf).d().a(map);
        } else {
            this.f98169a.put(strValueOf, new UserMetrics(i10, z10, map));
        }
        if (!this.f98169a.containsKey(strValueOf2)) {
            this.f98169a.put(strValueOf2, new UserMetrics(i11, false, null));
        }
        if (z10) {
            this.f98172d++;
        }
    }

    public void setPrevUserId(String str) {
        this.f98171c = str;
    }

    public void setUserId(String str) {
        this.f98170b = str;
    }

    public synchronized int size() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f98172d;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, UserMetrics> entry : this.f98169a.entrySet()) {
                LevelData levelDataD = entry.getValue().d();
                ArrayList<Metric> arrayListF = entry.getValue().f();
                HashMap<String, AggregatedMetric> mapC = entry.getValue().c();
                if (entry.getValue().e() != 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    a(jSONObject2, levelDataD);
                    JSONObject jSONObject3 = new JSONObject();
                    if (arrayListF.size() > 0) {
                        for (Metric metric : arrayListF) {
                            if (!jSONObject3.has(metric.getMetricCode())) {
                                jSONObject3.put(metric.getMetricCode(), new JSONArray());
                            }
                            jSONObject3.getJSONArray(metric.getMetricCode()).put(metric.toJSON());
                        }
                    }
                    if (mapC.size() > 0) {
                        Iterator<Map.Entry<String, AggregatedMetric>> it = mapC.entrySet().iterator();
                        while (it.hasNext()) {
                            AggregatedMetric value = it.next().getValue();
                            if (!jSONObject3.has(value.getMetricCode())) {
                                jSONObject3.put(value.getMetricCode(), value.toJSON().get("entries"));
                            }
                        }
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject2.put(EventEntry.tableName, jSONObject3);
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put(String.valueOf(entry.getKey()), jSONObject2);
                    }
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            CoreLog.e(NAME, "", e10);
            return jSONObject;
        }
    }

    public String toString() {
        return "MetricsStorage{userMetrics=" + this.f98169a + AbstractJsonLexerKt.END_OBJ;
    }

    synchronized boolean a(int i10, Metric metric, ArrayList<String> arrayList) {
        String str;
        if (metric != null) {
            try {
                if (this.f98169a != null) {
                    if (arrayList != null && arrayList.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.devtodev.core.utils.k.a.a(it.next(), "UTF-8"));
                        }
                        if (metric instanceof AggregatedMetric) {
                            ((AggregatedMetric) metric).addRecordParameter(Metric.IN_PROGRESS_KEY, arrayList2);
                        } else {
                            metric.addParameter(Metric.IN_PROGRESS_KEY, arrayList2);
                        }
                    }
                    NetworkStorage networkStorage = SDKClient.getInstance().getNetworkStorage();
                    if (networkStorage == null || !networkStorage.a(metric)) {
                        return false;
                    }
                    String strValueOf = String.valueOf(i10);
                    if (this.f98169a.get(strValueOf) == null) {
                        this.f98169a.put(String.valueOf(i10), new UserMetrics(i10, false, null));
                    }
                    boolean zA = this.f98169a.get(strValueOf).a(metric);
                    boolean z10 = metric instanceof CustomEvent;
                    if (zA) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Event Add: ");
                        sb2.append(metric.getMetricName());
                        if (z10) {
                            str = " '" + ((CustomEvent) metric).getEventName() + "'";
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        CoreLog.i("DevToDev", sb2.toString());
                    } else {
                        CoreLog.i("DevToDev", "Failed add " + metric.getMetricName() + " event");
                    }
                    if (zA) {
                        this.f98172d++;
                    }
                    return zA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return false;
    }

    public MetricsStorage(int i10) {
        this();
        setLevel(i10, null, false);
    }

    boolean a(String str) {
        Iterator<Map.Entry<String, UserMetrics>> it = this.f98169a.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().a(str)) {
                return true;
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject, LevelData levelData) throws Exception {
        if (levelData.getTimestamp() != 0) {
            jSONObject.put("timestamp", levelData.getTimestamp());
            if (levelData.f() != 0) {
                jSONObject.put(UserEntry.sessionId, levelData.f());
            }
            if (levelData.c().size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Integer> entry : levelData.c().entrySet()) {
                    jSONObject2.put(com.devtodev.core.utils.k.a.a(entry.getKey(), "UTF-8"), entry.getValue());
                }
                jSONObject.put("balance", jSONObject2);
            }
            if (levelData.e().size() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Integer> entry2 : levelData.e().entrySet()) {
                    jSONObject3.put(com.devtodev.core.utils.k.a.a(entry2.getKey(), "UTF-8"), entry2.getValue());
                }
                jSONObject.put("earned", jSONObject3);
            }
            if (levelData.g().size() > 0) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Integer> entry3 : levelData.g().entrySet()) {
                    jSONObject4.put(com.devtodev.core.utils.k.a.a(entry3.getKey(), "UTF-8"), entry3.getValue());
                }
                jSONObject.put("spent", jSONObject4);
            }
            if (levelData.d().size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                for (Map.Entry<String, Integer> entry4 : levelData.d().entrySet()) {
                    jSONObject5.put(com.devtodev.core.utils.k.a.a(entry4.getKey(), "UTF-8"), entry4.getValue());
                }
                jSONObject.put("bought", jSONObject5);
            }
        }
    }

    void a(int i10, int i11, String str) {
        this.f98169a.get(String.valueOf(i10 + 1)).a(str, i11);
    }

    void a(int i10, MetricsStorage metricsStorage) {
        for (Map.Entry<String, UserMetrics> entry : metricsStorage.f98169a.entrySet()) {
            if (entry.getValue().d().getLevel() > i10) {
                this.f98169a.put(entry.getKey(), entry.getValue().b());
            }
        }
    }

    void a() {
        Iterator<UserMetrics> it = this.f98169a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
