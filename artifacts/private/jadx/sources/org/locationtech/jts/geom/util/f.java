package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338234b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f338235c;

    public f(Collection collection) {
        this.f338233a = h(collection);
        this.f338235c = collection;
    }

    public static org.locationtech.jts.geom.n b(Collection collection) {
        return new f(collection).a();
    }

    public static org.locationtech.jts.geom.n c(org.locationtech.jts.geom.n nVar, org.locationtech.jts.geom.n nVar2) {
        return new f(e(nVar, nVar2)).a();
    }

    public static org.locationtech.jts.geom.n d(org.locationtech.jts.geom.n nVar, org.locationtech.jts.geom.n nVar2, org.locationtech.jts.geom.n nVar3) {
        return new f(f(nVar, nVar2, nVar3)).a();
    }

    private static List e(Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    private static List f(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        arrayList.add(obj3);
        return arrayList;
    }

    private void g(org.locationtech.jts.geom.n nVar, List list) {
        if (nVar != null) {
            for (int i10 = 0; i10 < nVar.l0(); i10++) {
                org.locationtech.jts.geom.n nVarH0 = nVar.h0(i10);
                if (!this.f338234b || !nVarH0.v0()) {
                    list.add(nVarH0);
                }
            }
        }
    }

    public static r h(Collection collection) {
        if (collection.isEmpty()) {
            return null;
        }
        return ((org.locationtech.jts.geom.n) collection.iterator().next()).g0();
    }

    public org.locationtech.jts.geom.n a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f338235c.iterator();
        while (it.hasNext()) {
            g((org.locationtech.jts.geom.n) it.next(), arrayList);
        }
        if (arrayList.size() != 0) {
            return this.f338233a.b(arrayList);
        }
        r rVar = this.f338233a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }
}
