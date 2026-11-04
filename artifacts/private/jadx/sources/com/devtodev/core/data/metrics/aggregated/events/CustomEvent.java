package com.devtodev.core.data.metrics.aggregated.events;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import com.devtodev.core.logic.SDKClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomEvent extends AggregatedMetric<CustomEvent> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap<String, ArrayList<a>> f98108d;

    public CustomEvent(String str, CustomEventParams customEventParams) {
        this(str, customEventParams, false);
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public void addRecordParameter(String str, Object obj) {
        Iterator<ArrayList<a>> it = this.f98108d.values().iterator();
        while (it.hasNext()) {
            Iterator<a> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().a(str, obj);
            }
        }
    }

    public String getEventName() {
        return this.f98107c;
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public int size() {
        Iterator<ArrayList<a>> it = this.f98108d.values().iterator();
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
            for (Map.Entry<String, ArrayList<a>> entry : this.f98108d.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", com.devtodev.core.utils.k.a.a(entry.getKey(), "UTF-8"));
                JSONArray jSONArray2 = new JSONArray();
                for (a aVar : entry.getValue()) {
                    JSONObject jSONObjectB = aVar.b();
                    putDataProperties(jSONObjectB, aVar.a());
                    jSONArray2.put(jSONObjectB);
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

    private CustomEvent(String str, CustomEventParams customEventParams, boolean z10) {
        super("Custom Event", "ce");
        this.f98107c = str;
        a aVar = new a(customEventParams, z10);
        aVar.a(UserEntry.sessionId, Long.valueOf(SDKClient.getInstance().getUsersStorages().getDataStorage().getSessionId()));
        HashMap<String, ArrayList<a>> map = new HashMap<>();
        this.f98108d = map;
        map.put(str, new ArrayList<>());
        this.f98108d.get(str).add(aVar);
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public boolean addEntry(CustomEvent customEvent) {
        if (customEvent == null) {
            return false;
        }
        for (Map.Entry<String, ArrayList<a>> entry : customEvent.f98108d.entrySet()) {
            if (this.f98108d.get(entry.getKey()) == null) {
                this.f98108d.put(entry.getKey(), entry.getValue());
            } else {
                this.f98108d.get(entry.getKey()).addAll(entry.getValue());
            }
        }
        return true;
    }
}
