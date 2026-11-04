package org.locationtech.jts.triangulate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f339046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.n f339047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f339048c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.f f339049d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f339050e = new TreeMap();

    private void a() {
        if (this.f339049d != null) {
            return;
        }
        org.locationtech.jts.geom.m mVarB = g.b(this.f339046a);
        List arrayList = new ArrayList();
        org.locationtech.jts.geom.n nVar = this.f339047b;
        if (nVar != null) {
            mVarB.z(nVar.f0());
            e(this.f339047b);
            arrayList = b(this.f339047b);
        }
        b bVar = new b(d(this.f339046a), this.f339048c);
        bVar.v(arrayList, new ArrayList(this.f339050e.values()));
        bVar.j();
        bVar.g();
        this.f339049d = bVar.p();
    }

    private static List b(org.locationtech.jts.geom.n nVar) {
        List listH = org.locationtech.jts.geom.util.l.h(nVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            c((v) it.next(), arrayList);
        }
        return arrayList;
    }

    private static void c(v vVar, List list) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        for (int i10 = 1; i10 < aVarArrD0.length; i10++) {
            list.add(new k(aVarArrD0[i10 - 1], aVarArrD0[i10]));
        }
    }

    private List d(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geom.a aVar = (org.locationtech.jts.geom.a) it.next();
            if (!this.f339050e.containsKey(aVar)) {
                arrayList.add(new e(aVar));
            }
        }
        return arrayList;
    }

    private void e(org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.geom.a[] aVarArrD0 = nVar.d0();
        for (int i10 = 0; i10 < aVarArrD0.length; i10++) {
            this.f339050e.put(aVarArrD0[i10], new e(aVarArrD0[i10]));
        }
    }

    public org.locationtech.jts.geom.n f(r rVar) {
        a();
        return this.f339049d.f(rVar);
    }

    public org.locationtech.jts.triangulate.quadedge.f g() {
        a();
        return this.f339049d;
    }

    public org.locationtech.jts.geom.n h(r rVar) {
        a();
        return this.f339049d.n(rVar);
    }

    public void i(org.locationtech.jts.geom.n nVar) {
        this.f339047b = nVar;
    }

    public void j(org.locationtech.jts.geom.n nVar) {
        this.f339046a = g.c(nVar);
    }

    public void k(double d10) {
        this.f339048c = d10;
    }
}
