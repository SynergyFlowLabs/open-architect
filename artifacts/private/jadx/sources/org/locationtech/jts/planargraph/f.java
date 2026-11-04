package org.locationtech.jts.planargraph;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f338960a = new TreeMap();

    public e a(e eVar) {
        this.f338960a.put(eVar.z(), eVar);
        return eVar;
    }

    public e b(org.locationtech.jts.geom.a aVar) {
        return (e) this.f338960a.get(aVar);
    }

    public Iterator c() {
        return this.f338960a.values().iterator();
    }

    public e d(org.locationtech.jts.geom.a aVar) {
        return (e) this.f338960a.remove(aVar);
    }

    public Collection e() {
        return this.f338960a.values();
    }
}
