package org.locationtech.jts.triangulate.quadedge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.locationtech.jts.algorithm.t;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d[] f339108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f339109b;

    private static class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f339110a = new ArrayList();

        @Override // org.locationtech.jts.triangulate.quadedge.l
        public void a(d[] dVarArr) {
            this.f339110a.add(new h(dVarArr));
        }

        public List b() {
            return this.f339110a;
        }
    }

    public h(d[] dVarArr) {
        this.f339108a = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        for (int i10 = 0; i10 < 3; i10++) {
            dVarArr[i10].v(this);
        }
    }

    public static n A(m[] mVarArr) {
        org.locationtech.jts.geom.a[] aVarArr = {mVarArr[0].k(), mVarArr[1].k(), mVarArr[2].k(), mVarArr[0].k()};
        r rVar = new r();
        return rVar.A(rVar.k(aVarArr));
    }

    public static boolean b(d[] dVarArr, org.locationtech.jts.geom.a aVar) {
        return t.a(aVar, new org.locationtech.jts.geom.a[]{dVarArr[0].r().k(), dVarArr[1].r().k(), dVarArr[2].r().k(), dVarArr[0].r().k()});
    }

    public static boolean c(m[] mVarArr, org.locationtech.jts.geom.a aVar) {
        return t.a(aVar, new org.locationtech.jts.geom.a[]{mVarArr[0].k(), mVarArr[1].k(), mVarArr[2].k(), mVarArr[0].k()});
    }

    public static List d(f fVar) {
        a aVar = new a();
        fVar.G(aVar, false);
        return aVar.b();
    }

    public static int x(int i10) {
        return (i10 + 1) % 3;
    }

    public static n z(d[] dVarArr) {
        org.locationtech.jts.geom.a[] aVarArr = {dVarArr[0].r().k(), dVarArr[1].r().k(), dVarArr[2].r().k(), dVarArr[0].r().k()};
        r rVar = new r();
        return rVar.A(rVar.k(aVarArr));
    }

    public boolean a(org.locationtech.jts.geom.a aVar) {
        return t.a(aVar, h());
    }

    public h e(int i10) {
        return (h) j(i10).B().h();
    }

    public int f(int i10) {
        return e(i10).k(j(i10).B());
    }

    public org.locationtech.jts.geom.a g(int i10) {
        return this.f339108a[i10].r().k();
    }

    public org.locationtech.jts.geom.a[] h() {
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[4];
        for (int i10 = 0; i10 < 3; i10++) {
            aVarArr[i10] = this.f339108a[i10].r().k();
        }
        aVarArr[3] = new org.locationtech.jts.geom.a(aVarArr[0]);
        return aVarArr;
    }

    public Object i() {
        return this.f339109b;
    }

    public d j(int i10) {
        return this.f339108a[i10];
    }

    public int k(d dVar) {
        for (int i10 = 0; i10 < 3; i10++) {
            if (this.f339108a[i10] == dVar) {
                return i10;
            }
        }
        return -1;
    }

    public int l(m mVar) {
        for (int i10 = 0; i10 < 3; i10++) {
            if (this.f339108a[i10].r() == mVar) {
                return i10;
            }
        }
        return -1;
    }

    public void m(int i10, u uVar) {
        uVar.f338211a = this.f339108a[i10].r().k();
        uVar.f338212b = this.f339108a[(i10 + 1) % 3].r().k();
    }

    public d[] n() {
        return this.f339108a;
    }

    public e0 o(r rVar) {
        return rVar.A(rVar.k(h()));
    }

    public h[] p() {
        h[] hVarArr = new h[3];
        for (int i10 = 0; i10 < 3; i10++) {
            hVarArr[i10] = (h) j(i10).B().h();
        }
        return hVarArr;
    }

    public List q(int i10) {
        ArrayList arrayList = new ArrayList();
        d dVarJ = j(i10);
        d dVarP = dVarJ;
        do {
            h hVar = (h) dVarP.h();
            if (hVar != null) {
                arrayList.add(hVar);
            }
            dVarP = dVarP.p();
        } while (dVarP != dVarJ);
        return arrayList;
    }

    public m r(int i10) {
        return this.f339108a[i10].r();
    }

    public m[] s() {
        m[] mVarArr = new m[3];
        for (int i10 = 0; i10 < 3; i10++) {
            mVarArr[i10] = r(i10);
        }
        return mVarArr;
    }

    public boolean t() {
        for (int i10 = 0; i10 < 3; i10++) {
            if (e(i10) == null) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return o(new r()).toString();
    }

    public boolean u(int i10) {
        return e(i10) == null;
    }

    public boolean v() {
        return this.f339108a != null;
    }

    public void w() {
        this.f339108a = null;
    }

    public void y(Object obj) {
        this.f339109b = obj;
    }
}
