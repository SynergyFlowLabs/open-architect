package org.locationtech.jts.operation.overlay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.o;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f338807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338808b = new ArrayList();

    public b(o oVar) {
        this.f338807a = oVar;
    }

    public void a(List list) {
        this.f338808b.addAll(list);
    }

    public List b() {
        new org.locationtech.jts.geomgraph.index.g().b(this.f338808b, new org.locationtech.jts.geomgraph.index.e(this.f338807a, true, false), true);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f338808b.iterator();
        while (it.hasNext()) {
            ((org.locationtech.jts.geomgraph.d) it.next()).u().c(arrayList);
        }
        return arrayList;
    }
}
