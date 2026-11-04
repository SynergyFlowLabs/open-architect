package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
public class l implements org.locationtech.jts.geom.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f338247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338248b;

    public l(Collection collection) {
        this.f338248b = false;
        this.f338247a = collection;
    }

    public static org.locationtech.jts.geom.n b(org.locationtech.jts.geom.n nVar) {
        return nVar.g0().b(h(nVar));
    }

    public static org.locationtech.jts.geom.n c(org.locationtech.jts.geom.n nVar, boolean z10) {
        return nVar.g0().b(i(nVar, z10));
    }

    public static Collection d(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f((org.locationtech.jts.geom.n) it.next(), collection2);
        }
        return collection2;
    }

    public static Collection e(Collection collection, Collection collection2, boolean z10) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g((org.locationtech.jts.geom.n) it.next(), collection2, z10);
        }
        return collection2;
    }

    public static Collection f(org.locationtech.jts.geom.n nVar, Collection collection) {
        if (nVar instanceof v) {
            collection.add(nVar);
            return collection;
        }
        nVar.d(new l(collection));
        return collection;
    }

    public static Collection g(org.locationtech.jts.geom.n nVar, Collection collection, boolean z10) {
        nVar.d(new l(collection, z10));
        return collection;
    }

    public static List h(org.locationtech.jts.geom.n nVar) {
        return i(nVar, false);
    }

    public static List i(org.locationtech.jts.geom.n nVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        nVar.d(new l(arrayList, z10));
        return arrayList;
    }

    @Override // org.locationtech.jts.geom.q
    public void a(org.locationtech.jts.geom.n nVar) {
        if (this.f338248b && (nVar instanceof x)) {
            this.f338247a.add(nVar.g0().g(((x) nVar).S0()));
        } else if (nVar instanceof v) {
            this.f338247a.add(nVar);
        }
    }

    public void j(boolean z10) {
        this.f338248b = z10;
    }

    public l(Collection collection, boolean z10) {
        this.f338247a = collection;
        this.f338248b = z10;
    }
}
