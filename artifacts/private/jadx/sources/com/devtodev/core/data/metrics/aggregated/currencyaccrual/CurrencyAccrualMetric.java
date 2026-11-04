package com.devtodev.core.data.metrics.aggregated.currencyaccrual;

import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import com.devtodev.core.utils.k.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CurrencyAccrualMetric extends AggregatedMetric<CurrencyAccrualMetric> {
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, CopyOnWriteArrayList<CurrencyAccrualData>> f98106c;

    public CurrencyAccrualMetric() {
        super("Currency Accrual", "ca");
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public int size() {
        Iterator<Map.Entry<String, CopyOnWriteArrayList<CurrencyAccrualData>>> it = this.f98106c.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getValue().size();
        }
        return size;
    }

    @Override // com.devtodev.core.data.metrics.Metric, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, CopyOnWriteArrayList<CurrencyAccrualData>> entry : this.f98106c.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                jSONObject2.put("name", a.a(entry.getKey(), "UTF-8"));
                for (CurrencyAccrualData currencyAccrualData : entry.getValue()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("amount", currencyAccrualData.getAmount() * currencyAccrualData.getCount());
                    jSONObject3.put("timestamp", currencyAccrualData.getTimestamp());
                    jSONObject3.put("count", currencyAccrualData.getCount());
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

    public CurrencyAccrualMetric(float f10, String str) {
        super("Currency Accrual", "ca");
        HashMap<String, CopyOnWriteArrayList<CurrencyAccrualData>> map = new HashMap<>();
        this.f98106c = map;
        map.put(str, new CopyOnWriteArrayList<>());
        this.f98106c.get(str).add(new CurrencyAccrualData(f10));
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public boolean addEntry(CurrencyAccrualMetric currencyAccrualMetric) {
        if (currencyAccrualMetric == null) {
            return false;
        }
        for (Map.Entry<String, CopyOnWriteArrayList<CurrencyAccrualData>> entry : currencyAccrualMetric.f98106c.entrySet()) {
            String key = entry.getKey();
            if (this.f98106c.get(key) != null) {
                for (CurrencyAccrualData currencyAccrualData : entry.getValue()) {
                    Iterator<CurrencyAccrualData> it = this.f98106c.get(key).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.f98106c.get(key).add(currencyAccrualData);
                            break;
                        }
                        CurrencyAccrualData next = it.next();
                        if (next.getAmount() == currencyAccrualData.getAmount() && next.getTimestamp() == currencyAccrualData.getTimestamp()) {
                            next.increment();
                            break;
                        }
                    }
                }
            } else {
                this.f98106c.put(key, new CopyOnWriteArrayList<>());
                this.f98106c.get(key).addAll(entry.getValue());
            }
        }
        return false;
    }
}
