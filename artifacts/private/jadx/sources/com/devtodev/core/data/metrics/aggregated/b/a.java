package com.devtodev.core.data.metrics.aggregated.b;

import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.aggregated.AggregatedMetric;
import com.devtodev.core.data.metrics.aggregated.progression.params.ProgressionEventParams;
import com.devtodev.core.logic.SDKClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AggregatedMetric<a> {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<c>> f98091c;

    public a() {
        this(null, null, null);
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean addEntry(a aVar) {
        this.f98091c = new b(this.f98091c, aVar.f98091c).b();
        return true;
    }

    public a b() {
        a aVar = new a();
        try {
            Iterator<Map.Entry<String, CopyOnWriteArrayList<c>>> it = this.f98091c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, CopyOnWriteArrayList<c>> next = it.next();
                CopyOnWriteArrayList<c> value = next.getValue();
                String key = next.getKey();
                ArrayList arrayList = new ArrayList();
                for (c cVar : value) {
                    if (cVar.d()) {
                        if (aVar.f98091c.get(key) == null) {
                            aVar.f98091c.put(key, new CopyOnWriteArrayList<>());
                        }
                        aVar.f98091c.get(key).add(cVar);
                        arrayList.add(cVar);
                    }
                }
                value.removeAll(arrayList);
                if (value.size() == 0) {
                    it.remove();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (aVar.f98091c.size() > 0) {
            return aVar;
        }
        return null;
    }

    public ArrayList<String> c() {
        if (this.f98091c == null) {
            this.f98091c = new ConcurrentHashMap<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, CopyOnWriteArrayList<c>> entry : this.f98091c.entrySet()) {
            Iterator<c> it = entry.getValue().iterator();
            while (it.hasNext()) {
                if (it.next().b() == d.Opened) {
                    arrayList.add(entry.getKey());
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // com.devtodev.core.data.metrics.aggregated.AggregatedMetric
    public int size() {
        Iterator<CopyOnWriteArrayList<c>> it = this.f98091c.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Iterator<c> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().d()) {
                    i10++;
                }
            }
        }
        return i10;
    }

    @Override // com.devtodev.core.data.metrics.Metric, com.devtodev.core.data.metrics.JSONable
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<Map.Entry<String, CopyOnWriteArrayList<c>>> it = this.f98091c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, CopyOnWriteArrayList<c>> next = it.next();
                CopyOnWriteArrayList<c> value = next.getValue();
                a(jSONArray, next.getKey(), value);
                if (value.size() == 0) {
                    it.remove();
                }
            }
            jSONObject.put("entries", jSONArray);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public a(String str, ProgressionEventParams progressionEventParams, d dVar) {
        super("Progression Event", "pe");
        this.f98091c = new ConcurrentHashMap<>();
        if (progressionEventParams != null) {
            c cVar = new c(progressionEventParams, dVar);
            cVar.a(UserEntry.sessionId, Long.valueOf(SDKClient.getInstance().getUsersStorages().getDataStorage().getSessionId()));
            CopyOnWriteArrayList<c> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(cVar);
            this.f98091c.put(str, copyOnWriteArrayList);
        }
    }

    private void a(JSONArray jSONArray, String str, CopyOnWriteArrayList<c> copyOnWriteArrayList) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (c cVar : copyOnWriteArrayList) {
            if (cVar.d()) {
                JSONObject jSONObjectE = cVar.e();
                jSONObjectE.put("id", com.devtodev.core.utils.k.a.a(str, "UTF-8"));
                jSONObjectE.put("timestamp", cVar.c());
                putDataProperties(jSONObjectE, cVar.a());
                jSONArray.put(jSONObjectE);
                arrayList.add(cVar);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public void a() {
        Iterator<Map.Entry<String, CopyOnWriteArrayList<c>>> it = this.f98091c.entrySet().iterator();
        while (it.hasNext()) {
            CopyOnWriteArrayList<c> value = it.next().getValue();
            ArrayList arrayList = new ArrayList();
            for (c cVar : value) {
                if (cVar.b() == d.Opened) {
                    arrayList.add(cVar);
                }
            }
            value.removeAll(arrayList);
            if (value.size() == 0) {
                it.remove();
            }
        }
    }
}
