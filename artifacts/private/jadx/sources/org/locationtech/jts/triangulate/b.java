package org.locationtech.jts.triangulate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f339051m = 99;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f339052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f339053b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f339056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.n f339057f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.index.kdtree.c f339059h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.locationtech.jts.geom.m f339061j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f339063l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f339054c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.f f339055d = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f339058g = new j();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f339060i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.locationtech.jts.geom.a f339062k = null;

    public b(Collection collection, double d10) {
        this.f339059h = null;
        this.f339052a = new ArrayList(collection);
        this.f339063l = d10;
        this.f339059h = new org.locationtech.jts.index.kdtree.c(d10);
    }

    private void a() {
        c();
        u(this.f339053b);
    }

    private void b() {
        org.locationtech.jts.geom.m mVarD = d(this.f339052a);
        org.locationtech.jts.geom.m mVarD2 = d(this.f339053b);
        org.locationtech.jts.geom.m mVar = new org.locationtech.jts.geom.m(mVarD);
        mVar.z(mVarD2);
        double dMax = Math.max(mVar.N() * 0.2d, mVar.E() * 0.2d);
        org.locationtech.jts.geom.m mVar2 = new org.locationtech.jts.geom.m(mVar);
        this.f339061j = mVar2;
        mVar2.t(dMax);
    }

    private void c() {
        this.f339057f = new org.locationtech.jts.algorithm.h(o(), new r()).e();
    }

    private static org.locationtech.jts.geom.m d(Collection collection) {
        org.locationtech.jts.geom.m mVar = new org.locationtech.jts.geom.m();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mVar.x(((org.locationtech.jts.triangulate.quadedge.m) it.next()).k());
        }
        return mVar;
    }

    private e e(org.locationtech.jts.geom.a aVar) {
        f fVar = this.f339060i;
        return fVar != null ? fVar.a(aVar, null) : new e(aVar);
    }

    private e f(org.locationtech.jts.geom.a aVar, k kVar) {
        f fVar = this.f339060i;
        e eVarA = fVar != null ? fVar.a(aVar, kVar) : new e(aVar);
        eVarA.F(true);
        return eVarA;
    }

    private int h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            org.locationtech.jts.geom.a aVarI = i(kVar);
            if (aVarI != null) {
                org.locationtech.jts.geom.a aVarA = this.f339058g.a(kVar, aVarI);
                this.f339062k = aVarA;
                e eVarF = f(aVarA, kVar);
                e eVarS = s(eVarF);
                if (!eVarS.k().p(this.f339062k)) {
                    org.locationtech.jts.util.f.y("Split pt snapped to: " + eVarS);
                }
                k kVar2 = new k(kVar.i(), kVar.j(), kVar.k(), eVarF.l(), eVarF.m(), eVarF.n(), kVar.b());
                k kVar3 = new k(eVarF.l(), eVarF.m(), eVarF.n(), kVar.d(), kVar.e(), kVar.f(), kVar.b());
                arrayList.add(kVar2);
                arrayList.add(kVar3);
                arrayList2.add(kVar);
                i10++;
            }
        }
        collection.removeAll(arrayList2);
        collection.addAll(arrayList);
        return i10;
    }

    private org.locationtech.jts.geom.a i(k kVar) {
        org.locationtech.jts.geom.a aVarH = kVar.h();
        org.locationtech.jts.geom.a aVarC = kVar.c();
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a((aVarH.f338092a + aVarC.f338092a) / 2.0d, (aVarH.f338093b + aVarC.f338093b) / 2.0d);
        double dL = aVarH.l(aVar);
        org.locationtech.jts.geom.m mVar = new org.locationtech.jts.geom.m(aVar);
        mVar.t(dL);
        Iterator it = this.f339059h.f(mVar).iterator();
        org.locationtech.jts.geom.a aVar2 = null;
        double d10 = Double.MAX_VALUE;
        while (it.hasNext()) {
            org.locationtech.jts.geom.a aVarA = ((org.locationtech.jts.index.kdtree.a) it.next()).a();
            if (!aVarA.p(aVarH) && !aVarA.p(aVarC)) {
                double dL2 = aVar.l(aVarA);
                if (dL2 < dL && (aVar2 == null || dL2 < d10)) {
                    aVar2 = aVarA;
                    d10 = dL2;
                }
            }
        }
        return aVar2;
    }

    private org.locationtech.jts.geom.a[] o() {
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[this.f339052a.size() + this.f339053b.size()];
        Iterator it = this.f339052a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            aVarArr[i10] = ((org.locationtech.jts.triangulate.quadedge.m) it.next()).k();
            i10++;
        }
        Iterator it2 = this.f339053b.iterator();
        while (it2.hasNext()) {
            aVarArr[i10] = ((org.locationtech.jts.triangulate.quadedge.m) it2.next()).k();
            i10++;
        }
        return aVarArr;
    }

    private e s(e eVar) {
        org.locationtech.jts.index.kdtree.a aVarC = this.f339059h.c(eVar.k(), eVar);
        if (!aVarC.i()) {
            this.f339056e.a(eVar);
            return eVar;
        }
        e eVar2 = (e) aVarC.c();
        eVar2.D(eVar);
        return eVar2;
    }

    private void u(Collection collection) {
        org.locationtech.jts.util.f.y("Adding sites: " + collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            s((e) it.next());
        }
    }

    public void g() {
        a();
        int i10 = 0;
        do {
            int iH = h(this.f339054c);
            i10++;
            org.locationtech.jts.util.f.y("Iter: " + i10 + "   Splits: " + iH + "   Current # segments = " + this.f339054c.size());
            if (iH <= 0) {
                break;
            }
        } while (i10 < 99);
        if (i10 == 99) {
            org.locationtech.jts.util.f.y("ABORTED! Too many iterations while enforcing constraints");
            if (!org.locationtech.jts.util.f.p()) {
                throw new c("Too many splitting iterations while enforcing constraints.  Last split point was at: ", this.f339062k);
            }
        }
    }

    public void j() {
        b();
        org.locationtech.jts.triangulate.quadedge.f fVar = new org.locationtech.jts.triangulate.quadedge.f(this.f339061j, this.f339063l);
        this.f339055d = fVar;
        fVar.F(new org.locationtech.jts.triangulate.quadedge.b(fVar));
        this.f339056e = new h(this.f339055d);
        u(this.f339052a);
    }

    public Collection k() {
        return this.f339054c;
    }

    public org.locationtech.jts.geom.n l() {
        return this.f339057f;
    }

    public List m() {
        return this.f339052a;
    }

    public org.locationtech.jts.index.kdtree.c n() {
        return this.f339059h;
    }

    public org.locationtech.jts.triangulate.quadedge.f p() {
        return this.f339055d;
    }

    public double q() {
        return this.f339063l;
    }

    public f r() {
        return this.f339060i;
    }

    public void t(org.locationtech.jts.geom.a aVar) {
        s(e(aVar));
    }

    public void v(List list, List list2) {
        this.f339054c = list;
        this.f339053b = list2;
    }

    public void w(d dVar) {
        this.f339058g = dVar;
    }

    public void x(f fVar) {
        this.f339060i = fVar;
    }
}
