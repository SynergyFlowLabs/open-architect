package com.devtodev.core.data.metrics.aggregated.a;

import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AggregatedMetric<b> {
    private static final long serialVersionUID = -4869811977748671496L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f98090c;

    public b(HashMap<String, Object> map) {
        super("People", "pl");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f98090c = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new a(map));
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean addEntry(b bVar) {
        if (bVar == null) {
            return false;
        }
        for (a aVar : bVar.f98090c) {
            CopyOnWriteArrayList<a> copyOnWriteArrayList = this.f98090c;
            a aVar2 = copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1);
            if (aVar.a() == null) {
                Iterator<a> it = this.f98090c.iterator();
                a aVarC = null;
                while (it.hasNext()) {
                    aVarC = it.next().c();
                }
                this.f98090c.clear();
                this.f98090c.add(aVar);
                if (aVarC != null) {
                    this.f98090c.add(aVarC);
                }
            } else if (aVar2.a() == null) {
                this.f98090c.add(aVar);
            } else {
                aVar2.a(aVar.a());
            }
        }
        return true;
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public void addRecordParameter(String str, Object obj) {
        Iterator<a> it = this.f98090c.iterator();
        while (it.hasNext()) {
            it.next().a(str, obj);
        }
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public int size() {
        return this.f98090c.size();
    }

    @Override // com.devtodev.core.data.metrics.Metric, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (a aVar : this.f98090c) {
                JSONObject jSONObject2 = new JSONObject();
                if (aVar.a() == null) {
                    jSONObject2.put("data", JSONObject.NULL);
                } else {
                    HashMap<String, Object> mapA = aVar.a();
                    HashMap map = new HashMap();
                    for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                        String strA = com.devtodev.core.utils.k.a.a(entry.getKey(), "UTF-8");
                        if (entry.getValue().equals("[devtodev_null]")) {
                            map.put(strA, JSONObject.NULL);
                        } else {
                            Object value = entry.getValue();
                            if (value instanceof String) {
                                map.put(strA, com.devtodev.core.utils.k.a.a((String) value, "UTF-8"));
                            } else if (value instanceof Collection) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : (Collection) value) {
                                    if (obj instanceof String) {
                                        arrayList.add(com.devtodev.core.utils.k.a.a((String) obj, "UTF-8"));
                                    } else {
                                        arrayList.add(obj);
                                    }
                                }
                                map.put(strA, arrayList);
                            } else {
                                map.put(strA, value);
                            }
                        }
                    }
                    jSONObject2.put("data", new JSONObject(map));
                }
                jSONObject2.put("timestamp", aVar.d());
                putDataProperties(jSONObject2, aVar.b());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("entries", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }
}
