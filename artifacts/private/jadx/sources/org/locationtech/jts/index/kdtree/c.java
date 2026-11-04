package org.locationtech.jts.index.kdtree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.d;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.index.kdtree.a f338415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f338416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338417c;

    class a implements org.locationtech.jts.index.kdtree.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f338418a;

        a(List list) {
            this.f338418a = list;
        }

        @Override // org.locationtech.jts.index.kdtree.b
        public void a(org.locationtech.jts.index.kdtree.a aVar) {
            this.f338418a.add(aVar);
        }
    }

    private static class b implements org.locationtech.jts.index.kdtree.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f338420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private org.locationtech.jts.index.kdtree.a f338421b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f338422c = 0.0d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private org.locationtech.jts.geom.a f338423d;

        public b(org.locationtech.jts.geom.a aVar, double d10) {
            this.f338423d = aVar;
            this.f338420a = d10;
        }

        @Override // org.locationtech.jts.index.kdtree.b
        public void a(org.locationtech.jts.index.kdtree.a aVar) {
            double dL = this.f338423d.l(aVar.a());
            if (dL <= this.f338420a) {
                org.locationtech.jts.index.kdtree.a aVar2 = this.f338421b;
                if (aVar2 != null) {
                    double d10 = this.f338422c;
                    if (dL >= d10 && (aVar2 == null || dL != d10 || aVar.a().compareTo(this.f338421b.a()) >= 1)) {
                        return;
                    }
                }
                this.f338421b = aVar;
                this.f338422c = dL;
            }
        }

        public org.locationtech.jts.index.kdtree.a b() {
            return this.f338421b;
        }

        public m c() {
            m mVar = new m(this.f338423d);
            mVar.t(this.f338420a);
            return mVar;
        }
    }

    public c() {
        this(0.0d);
    }

    private org.locationtech.jts.index.kdtree.a a(org.locationtech.jts.geom.a aVar) {
        b bVar = new b(aVar, this.f338417c);
        h(bVar.c(), bVar);
        return bVar.b();
    }

    private org.locationtech.jts.index.kdtree.a d(org.locationtech.jts.geom.a aVar, Object obj) {
        org.locationtech.jts.index.kdtree.a aVarD = this.f338415a;
        org.locationtech.jts.index.kdtree.a aVar2 = aVarD;
        boolean z10 = true;
        boolean z11 = true;
        while (aVarD != null) {
            if (aVar.l(aVarD.a()) <= this.f338417c) {
                aVarD.h();
                return aVarD;
            }
            boolean z12 = false;
            if (!z11 ? aVar.f338093b < aVarD.g() : aVar.f338092a < aVarD.f()) {
                z12 = true;
            }
            z10 = z12;
            z11 = !z11;
            aVar2 = aVarD;
            aVarD = z10 ? aVarD.d() : aVarD.e();
        }
        this.f338416b++;
        org.locationtech.jts.index.kdtree.a aVar3 = new org.locationtech.jts.index.kdtree.a(aVar, obj);
        if (z10) {
            aVar2.j(aVar3);
            return aVar3;
        }
        aVar2.k(aVar3);
        return aVar3;
    }

    private void i(org.locationtech.jts.index.kdtree.a aVar, m mVar, boolean z10, org.locationtech.jts.index.kdtree.b bVar) {
        double dM;
        double dI;
        double dG;
        if (aVar != null) {
            if (z10) {
                dM = mVar.L();
                dI = mVar.H();
                dG = aVar.f();
            } else {
                dM = mVar.M();
                dI = mVar.I();
                dG = aVar.g();
            }
            boolean z11 = dM < dG;
            boolean z12 = dG <= dI;
            if (z11) {
                i(aVar.d(), mVar, !z10, bVar);
            }
            if (mVar.n(aVar.a())) {
                bVar.a(aVar);
            }
            if (z12) {
                i(aVar.e(), mVar, !z10, bVar);
            }
        }
    }

    public static org.locationtech.jts.geom.a[] j(Collection collection) {
        return k(collection, false);
    }

    public static org.locationtech.jts.geom.a[] k(Collection collection, boolean z10) {
        d dVar = new d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.index.kdtree.a aVar = (org.locationtech.jts.index.kdtree.a) it.next();
            int iB = z10 ? aVar.b() : 1;
            for (int i10 = 0; i10 < iB; i10++) {
                dVar.i(aVar.a(), true);
            }
        }
        return dVar.Uf();
    }

    public org.locationtech.jts.index.kdtree.a b(org.locationtech.jts.geom.a aVar) {
        return c(aVar, null);
    }

    public org.locationtech.jts.index.kdtree.a c(org.locationtech.jts.geom.a aVar, Object obj) {
        org.locationtech.jts.index.kdtree.a aVarA;
        if (this.f338415a == null) {
            org.locationtech.jts.index.kdtree.a aVar2 = new org.locationtech.jts.index.kdtree.a(aVar, obj);
            this.f338415a = aVar2;
            return aVar2;
        }
        if (this.f338417c <= 0.0d || (aVarA = a(aVar)) == null) {
            return d(aVar, obj);
        }
        aVarA.h();
        return aVarA;
    }

    public boolean e() {
        return this.f338415a == null;
    }

    public List f(m mVar) {
        ArrayList arrayList = new ArrayList();
        g(mVar, arrayList);
        return arrayList;
    }

    public void g(m mVar, List list) {
        i(this.f338415a, mVar, true, new a(list));
    }

    public void h(m mVar, org.locationtech.jts.index.kdtree.b bVar) {
        i(this.f338415a, mVar, true, bVar);
    }

    public c(double d10) {
        this.f338415a = null;
        this.f338417c = d10;
    }
}
