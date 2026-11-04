package com.devtodev.core.data.metrics.aggregated;

import com.devtodev.core.data.metrics.Metric;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AggregatedMetric<T extends Metric> extends Metric {
    public static final String ENTRIES_KEY = "entries";
    private static final long serialVersionUID = -594426177493053664L;

    protected AggregatedMetric(String str, String str2) {
        super(str, str2);
    }

    public boolean addEntry(T t10) {
        return false;
    }

    public void addRecordParameter(String str, Object obj) {
    }

    public void putDataProperties(JSONObject jSONObject, HashMap<String, Object> map) {
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof Collection) {
                    jSONObject.put(entry.getKey(), new JSONArray((Collection) entry.getValue()));
                } else {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public int size() {
        return 0;
    }
}
