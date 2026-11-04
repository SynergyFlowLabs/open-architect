package org.locationtech.jts.geomgraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.noding.b f338338a;

    public j(Collection collection) {
        this.f338338a = new org.locationtech.jts.noding.b(c(collection));
    }

    public static void b(Collection collection) {
        new j(collection).a();
    }

    public static Collection c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            arrayList.add(new org.locationtech.jts.noding.a(dVar.r(), dVar));
        }
        return arrayList;
    }

    public void a() {
        this.f338338a.b();
    }
}
