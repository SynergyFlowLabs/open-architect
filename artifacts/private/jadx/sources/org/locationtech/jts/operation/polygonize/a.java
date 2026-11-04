package org.locationtech.jts.operation.polygonize;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.s;
import org.locationtech.jts.algorithm.t;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338861a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f338866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f338867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f338868h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338862b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.planargraph.a f338863c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f338864d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338865e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f338869i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f338870j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f338871k = false;

    /* JADX INFO: renamed from: org.locationtech.jts.operation.polygonize.a$a, reason: collision with other inner class name */
    static class C2426a implements Comparator {
        C2426a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((a) obj).m().e0().compareTo(((a) obj2).m().e0());
        }
    }

    public a(r rVar) {
        this.f338861a = rVar;
    }

    private void a(org.locationtech.jts.planargraph.a aVar) {
        this.f338862b.add(aVar);
    }

    private static void b(org.locationtech.jts.geom.a[] aVarArr, boolean z10, org.locationtech.jts.geom.d dVar) {
        if (z10) {
            for (org.locationtech.jts.geom.a aVar : aVarArr) {
                dVar.i(aVar, false);
            }
            return;
        }
        for (int length = aVarArr.length - 1; length >= 0; length--) {
            dVar.i(aVarArr[length], false);
        }
    }

    public static List g(b bVar) {
        ArrayList arrayList = new ArrayList();
        b bVarX = bVar;
        do {
            arrayList.add(bVarX);
            bVarX = bVarX.X();
            org.locationtech.jts.util.a.d(bVarX != null, "found null DE in ring");
            org.locationtech.jts.util.a.d(bVarX == bVar || !bVarX.Z(), "found DE already in ring");
        } while (bVarX != bVar);
        return arrayList;
    }

    public static a h(a aVar, List list) {
        x xVarM = aVar.m();
        m mVarF0 = xVarM.f0();
        xVarM.R0(0);
        Iterator it = list.iterator();
        a aVar2 = null;
        m mVarF1 = null;
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            x xVarM2 = aVar3.m();
            m mVarF2 = xVarM2.f0();
            if (!mVarF2.equals(mVarF0) && mVarF2.o(mVarF0) && t.a(org.locationtech.jts.geom.b.q(xVarM.d0(), xVarM2.d0()), xVarM2.d0()) && (aVar2 == null || mVarF1.o(mVarF2))) {
                mVarF1 = aVar3.m().f0();
                aVar2 = aVar3;
            }
        }
        return aVar2;
    }

    private org.locationtech.jts.geom.a[] i() {
        if (this.f338865e == null) {
            org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
            for (org.locationtech.jts.planargraph.a aVar : this.f338862b) {
                b(((c) aVar.H()).I().d0(), aVar.I(), dVar);
            }
            this.f338865e = dVar.Uf();
        }
        return this.f338865e;
    }

    public static boolean q(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        for (org.locationtech.jts.geom.a aVar2 : aVarArr) {
            if (aVar.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public static org.locationtech.jts.geom.a x(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            if (!q(aVar, aVarArr2)) {
                return aVar;
            }
        }
        return null;
    }

    public void A(a aVar) {
        this.f338867g = aVar;
    }

    public void B() {
        if (!p()) {
            for (int i10 = 0; i10 < this.f338862b.size(); i10++) {
                a aVarN = ((b) ((b) this.f338862b.get(i10)).N()).Y().n();
                if (aVarN != null && aVarN.s()) {
                    y(!aVarN.r());
                    return;
                }
            }
        }
    }

    public void c(x xVar) {
        if (this.f338866f == null) {
            this.f338866f = new ArrayList();
        }
        this.f338866f.add(xVar);
    }

    public void d(a aVar) {
        aVar.A(this);
        x xVarM = aVar.m();
        if (this.f338866f == null) {
            this.f338866f = new ArrayList();
        }
        this.f338866f.add(xVarM);
    }

    public void e(b bVar) {
        b bVarX = bVar;
        do {
            a(bVarX);
            bVarX.d0(this);
            bVarX = bVarX.X();
            org.locationtech.jts.util.a.d(bVarX != null, "found null DE in ring");
            org.locationtech.jts.util.a.d(bVarX == bVar || !bVarX.Z(), "found DE already in ring");
        } while (bVarX != bVar);
    }

    public void f() {
        this.f338868h = s.b(m().d0());
    }

    public v j() {
        i();
        return this.f338861a.h(this.f338865e);
    }

    public a k() {
        if (p()) {
            return null;
        }
        for (int i10 = 0; i10 < this.f338862b.size(); i10++) {
            a aVarY = ((b) ((b) this.f338862b.get(i10)).N()).Y();
            if (aVarY.t()) {
                return aVarY;
            }
        }
        return null;
    }

    public e0 l() {
        x[] xVarArr;
        List list = this.f338866f;
        if (list != null) {
            xVarArr = new x[list.size()];
            for (int i10 = 0; i10 < this.f338866f.size(); i10++) {
                xVarArr[i10] = (x) this.f338866f.get(i10);
            }
        } else {
            xVarArr = null;
        }
        return this.f338861a.B(this.f338864d, xVarArr);
    }

    public x m() {
        x xVar = this.f338864d;
        if (xVar != null) {
            return xVar;
        }
        i();
        org.locationtech.jts.geom.a[] aVarArr = this.f338865e;
        if (aVarArr.length < 3) {
            System.out.println(aVarArr);
        }
        try {
            this.f338864d = this.f338861a.k(this.f338865e);
        } catch (Exception unused) {
            System.out.println(this.f338865e);
        }
        return this.f338864d;
    }

    public a n() {
        return p() ? this.f338867g : this;
    }

    public boolean o() {
        return this.f338867g != null;
    }

    public boolean p() {
        return this.f338868h;
    }

    public boolean r() {
        return this.f338871k;
    }

    public boolean s() {
        return this.f338870j;
    }

    public boolean t() {
        if (this.f338868h) {
            return !o();
        }
        return false;
    }

    public String toString() {
        return o.B(new org.locationtech.jts.geom.impl.a(i()));
    }

    public boolean u() {
        return k() != null;
    }

    public boolean v() {
        return this.f338869i;
    }

    public boolean w() {
        i();
        if (this.f338865e.length <= 3) {
            return false;
        }
        m();
        return this.f338864d.A0();
    }

    public void y(boolean z10) {
        this.f338871k = z10;
        this.f338870j = true;
    }

    public void z(boolean z10) {
        this.f338869i = z10;
    }
}
