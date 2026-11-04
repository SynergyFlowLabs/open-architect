package com.devtodev.core.data.metrics.aggregated.b;

import com.devtodev.core.utils.log.CoreLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<c>> f98092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<c>> f98093b;

    public b(ConcurrentHashMap<String, CopyOnWriteArrayList<c>> concurrentHashMap, ConcurrentHashMap<String, CopyOnWriteArrayList<c>> concurrentHashMap2) {
        this.f98092a = concurrentHashMap;
        this.f98093b = concurrentHashMap2;
    }

    private void a() {
        Iterator<Map.Entry<String, CopyOnWriteArrayList<c>>> it = this.f98093b.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<c> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                if (it2.next().b() == d.Opened) {
                    Iterator<Map.Entry<String, CopyOnWriteArrayList<c>>> it3 = this.f98092a.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry<String, CopyOnWriteArrayList<c>> next = it3.next();
                        ArrayList arrayList = new ArrayList();
                        for (c cVar : next.getValue()) {
                            if (cVar.b() == d.Opened) {
                                arrayList.add(cVar);
                            }
                        }
                        next.getValue().removeAll(arrayList);
                        if (next.getValue().size() == 0) {
                            it3.remove();
                        }
                    }
                }
            }
        }
    }

    public ConcurrentHashMap<String, CopyOnWriteArrayList<c>> b() {
        a();
        for (Map.Entry<String, CopyOnWriteArrayList<c>> entry : this.f98093b.entrySet()) {
            String key = entry.getKey();
            CopyOnWriteArrayList<c> value = entry.getValue();
            CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f98092a.get(key);
            if (copyOnWriteArrayList != null) {
                this.f98092a.put(key, a(key, copyOnWriteArrayList, value));
            } else if (value.size() > 0) {
                if (value.get(0).b() != d.Closing) {
                    this.f98092a.put(key, value);
                } else {
                    CoreLog.d("DevToDev", "Progression event '" + key + "' could not be finished. There is no active progression event '" + key + "'");
                }
            }
        }
        return this.f98092a;
    }

    private CopyOnWriteArrayList<c> a(String str, CopyOnWriteArrayList<c> copyOnWriteArrayList, CopyOnWriteArrayList<c> copyOnWriteArrayList2) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
        for (c cVar : copyOnWriteArrayList) {
            if (cVar.b() == d.Closed) {
                copyOnWriteArrayList3.add(cVar);
            } else if (cVar.b() == d.Opened) {
                ArrayList arrayList = new ArrayList();
                for (c cVar2 : copyOnWriteArrayList2) {
                    if (cVar2.b() == d.Opened) {
                        cVar.b(cVar2);
                    } else if (cVar2.b() == d.Closing) {
                        cVar.a(cVar2);
                        CoreLog.i("DevToDev", "Progression event '" + str + "' is Finished");
                    }
                    copyOnWriteArrayList3.add(cVar);
                    arrayList.add(cVar2);
                }
                copyOnWriteArrayList2.removeAll(arrayList);
            }
        }
        for (c cVar3 : copyOnWriteArrayList2) {
            if (cVar3.b() != d.Closing) {
                copyOnWriteArrayList3.add(cVar3);
            } else {
                CoreLog.i("DevToDev", "Progression event '" + str + "' could not be finished. There is no active progression event '" + str + "'");
            }
        }
        return copyOnWriteArrayList3;
    }
}
