package com.devtodev.core.data.metrics.aggregated.realpayment;

import com.appsflyer.AppsFlyerProperties;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.k.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RealPaymentMetric extends AggregatedMetric<RealPaymentMetric> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, CopyOnWriteArrayList<RealPaymentData>> f98139c;

    public RealPaymentMetric(String str, String str2, float f10, String str3) {
        super("Real payment", "rp");
        RealPaymentData realPaymentData = new RealPaymentData(str2, f10, str3);
        realPaymentData.addRecordParameter(UserEntry.sessionId, Long.valueOf(SDKClient.getInstance().getUsersStorages().getDataStorage().getSessionId()));
        HashMap<String, CopyOnWriteArrayList<RealPaymentData>> map = new HashMap<>();
        this.f98139c = map;
        map.put(str, new CopyOnWriteArrayList<>());
        this.f98139c.get(str).add(realPaymentData);
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public void addRecordParameter(String str, Object obj) {
        Iterator<Map.Entry<String, CopyOnWriteArrayList<RealPaymentData>>> it = this.f98139c.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<RealPaymentData> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                it2.next().addRecordParameter(str, obj);
            }
        }
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public int size() {
        Iterator<CopyOnWriteArrayList<RealPaymentData>> it = this.f98139c.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.devtodev.core.data.metrics.Metric, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, CopyOnWriteArrayList<RealPaymentData>> entry : this.f98139c.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", a.a(entry.getKey(), "UTF-8"));
                JSONArray jSONArray2 = new JSONArray();
                for (RealPaymentData realPaymentData : entry.getValue()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("orderId", realPaymentData.getPaymentId());
                    jSONObject3.put("price", realPaymentData.getInAppPrice());
                    jSONObject3.put(AppsFlyerProperties.CURRENCY_CODE, realPaymentData.getInAppCurrencyISOCode());
                    jSONObject3.put("timestamp", realPaymentData.getTimestamp());
                    putDataProperties(jSONObject3, realPaymentData.getRecordParameters());
                    jSONArray2.put(jSONObject3);
                }
                jSONObject2.put("entries", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("entries", jSONArray);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public boolean addEntry(RealPaymentMetric realPaymentMetric) {
        if (realPaymentMetric != null) {
            for (Map.Entry<String, CopyOnWriteArrayList<RealPaymentData>> entry : realPaymentMetric.f98139c.entrySet()) {
                String key = entry.getKey();
                if (this.f98139c.get(key) == null) {
                    this.f98139c.put(key, new CopyOnWriteArrayList<>());
                }
                this.f98139c.get(key).addAll(entry.getValue());
            }
        }
        return false;
    }
}
