package org.locationtech.jts.noding.snapround;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.util.l;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.noding.m;
import org.locationtech.jts.noding.o;
import org.locationtech.jts.noding.y;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g0 f338623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338624c = false;

    public a(g0 g0Var) {
        this.f338623b = g0Var;
    }

    private List a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        l lVar = new l(arrayList);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d(lVar);
        }
        return arrayList;
    }

    private List d(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.size() >= 2) {
                arrayList.add(this.f338622a.h(yVar.n()));
            }
        }
        return arrayList;
    }

    private List e(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new m(((v) it.next()).d0(), null));
        }
        return arrayList;
    }

    public List b(Collection collection) {
        this.f338622a = ((n) collection.iterator().next()).g0();
        List listE = e(a(collection));
        d dVar = new d(this.f338623b);
        dVar.a(listE);
        Collection collectionB = dVar.b();
        if (this.f338624c) {
            new o(collectionB).i();
        }
        return d(collectionB);
    }

    public void c(boolean z10) {
        this.f338624c = z10;
    }
}
