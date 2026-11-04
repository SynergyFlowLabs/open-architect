package org.locationtech.jts.operation.distance;

import java.util.List;
import org.locationtech.jts.algorithm.i;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.l;
import org.locationtech.jts.geom.util.o;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n[] f338766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f338768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f[] f338769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f338770e;

    public c(n nVar, n nVar2) {
        this(nVar, nVar2, 0.0d);
    }

    public static org.locationtech.jts.geom.a[] c(n nVar, n nVar2) {
        return new c(nVar, nVar2).s();
    }

    private void d() {
        f[] fVarArr = new f[2];
        e(0, fVarArr);
        if (this.f338770e <= this.f338767b) {
            return;
        }
        e(1, fVarArr);
    }

    private void e(int i10, f[] fVarArr) {
        n nVar = this.f338766a[i10];
        if (nVar.Rg() < 2) {
            return;
        }
        int i11 = 1 - i10;
        List listB = o.b(nVar);
        if (listB.size() > 0) {
            f(a.b(this.f338766a[i11]), listB, fVarArr);
            if (this.f338770e <= this.f338767b) {
                f[] fVarArr2 = this.f338769d;
                fVarArr2[i11] = fVarArr[0];
                fVarArr2[i10] = fVarArr[1];
            }
        }
    }

    private void f(List list, List list2, f[] fVarArr) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            f fVar = (f) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                g(fVar, (e0) list2.get(i11), fVarArr);
                if (this.f338770e <= this.f338767b) {
                    return;
                }
            }
        }
    }

    private void g(f fVar, e0 e0Var, f[] fVarArr) {
        org.locationtech.jts.geom.a aVarA = fVar.a();
        if (2 != this.f338768c.c(aVarA, e0Var)) {
            this.f338770e = 0.0d;
            fVarArr[0] = fVar;
            fVarArr[1] = new f(e0Var, aVarA);
        }
    }

    private void h() {
        f[] fVarArr = new f[2];
        List listH = l.h(this.f338766a[0]);
        List listH2 = l.h(this.f338766a[1]);
        List listB = org.locationtech.jts.geom.util.n.b(this.f338766a[0]);
        List listB2 = org.locationtech.jts.geom.util.n.b(this.f338766a[1]);
        l(listH, listH2, fVarArr);
        u(fVarArr, false);
        if (this.f338770e <= this.f338767b) {
            return;
        }
        fVarArr[0] = null;
        fVarArr[1] = null;
        m(listH, listB2, fVarArr);
        u(fVarArr, false);
        if (this.f338770e <= this.f338767b) {
            return;
        }
        fVarArr[0] = null;
        fVarArr[1] = null;
        m(listH2, listB, fVarArr);
        u(fVarArr, true);
        if (this.f338770e <= this.f338767b) {
            return;
        }
        fVarArr[0] = null;
        fVarArr[1] = null;
        n(listB, listB2, fVarArr);
        u(fVarArr, false);
    }

    private void i() {
        if (this.f338769d == null) {
            this.f338769d = new f[2];
            d();
            if (this.f338770e > this.f338767b) {
                h();
            }
        }
    }

    private void j(v vVar, v vVar2, f[] fVarArr) {
        if (vVar.f0().s(vVar2.f0()) > this.f338770e) {
            return;
        }
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        org.locationtech.jts.geom.a[] aVarArrD1 = vVar2.d0();
        for (int i10 = 0; i10 < aVarArrD0.length - 1; i10++) {
            int i11 = 0;
            while (i11 < aVarArrD1.length - 1) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                double d10 = i.d(aVarArrD0[i10], aVarArrD0[i12], aVarArrD1[i11], aVarArrD1[i13]);
                if (d10 < this.f338770e) {
                    this.f338770e = d10;
                    org.locationtech.jts.geom.a[] aVarArrN = new org.locationtech.jts.geom.u(aVarArrD0[i10], aVarArrD0[i12]).n(new org.locationtech.jts.geom.u(aVarArrD1[i11], aVarArrD1[i13]));
                    fVarArr[0] = new f(vVar, i10, aVarArrN[0]);
                    fVarArr[1] = new f(vVar2, i11, aVarArrN[1]);
                }
                if (this.f338770e <= this.f338767b) {
                    return;
                } else {
                    i11 = i13;
                }
            }
        }
    }

    private void k(v vVar, d0 d0Var, f[] fVarArr) {
        if (vVar.f0().s(d0Var.f0()) <= this.f338770e) {
            org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
            org.locationtech.jts.geom.a aVarC0 = d0Var.c0();
            int i10 = 0;
            while (i10 < aVarArrD0.length - 1) {
                int i11 = i10 + 1;
                double dB = i.b(aVarC0, aVarArrD0[i10], aVarArrD0[i11]);
                if (dB < this.f338770e) {
                    this.f338770e = dB;
                    fVarArr[0] = new f(vVar, i10, new org.locationtech.jts.geom.u(aVarArrD0[i10], aVarArrD0[i11]).l(aVarC0));
                    fVarArr[1] = new f(d0Var, 0, aVarC0);
                }
                if (this.f338770e <= this.f338767b) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
    }

    private void l(List list, List list2, f[] fVarArr) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            v vVar = (v) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                j(vVar, (v) list2.get(i11), fVarArr);
                if (this.f338770e <= this.f338767b) {
                    return;
                }
            }
        }
    }

    private void m(List list, List list2, f[] fVarArr) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            v vVar = (v) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                k(vVar, (d0) list2.get(i11), fVarArr);
                if (this.f338770e <= this.f338767b) {
                    return;
                }
            }
        }
    }

    private void n(List list, List list2, f[] fVarArr) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d0 d0Var = (d0) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                d0 d0Var2 = (d0) list2.get(i11);
                double dL = d0Var.c0().l(d0Var2.c0());
                if (dL < this.f338770e) {
                    this.f338770e = dL;
                    fVarArr[0] = new f(d0Var, 0, d0Var.c0());
                    fVarArr[1] = new f(d0Var2, 0, d0Var2.c0());
                }
                if (this.f338770e <= this.f338767b) {
                    return;
                }
            }
        }
    }

    public static double p(n nVar, n nVar2) {
        return new c(nVar, nVar2).o();
    }

    public static boolean q(n nVar, n nVar2, double d10) {
        return new c(nVar, nVar2, d10).o() <= d10;
    }

    public static org.locationtech.jts.geom.a[] t(n nVar, n nVar2) {
        return new c(nVar, nVar2).s();
    }

    private void u(f[] fVarArr, boolean z10) {
        f fVar = fVarArr[0];
        if (fVar == null) {
            return;
        }
        if (z10) {
            f[] fVarArr2 = this.f338769d;
            fVarArr2[0] = fVarArr[1];
            fVarArr2[1] = fVarArr[0];
        } else {
            f[] fVarArr3 = this.f338769d;
            fVarArr3[0] = fVar;
            fVarArr3[1] = fVarArr[1];
        }
    }

    public f[] a() {
        return r();
    }

    public org.locationtech.jts.geom.a[] b() {
        return s();
    }

    public double o() {
        n[] nVarArr = this.f338766a;
        n nVar = nVarArr[0];
        if (nVar == null || nVarArr[1] == null) {
            throw new IllegalArgumentException("null geometries are not supported");
        }
        if (nVar.v0() || this.f338766a[1].v0()) {
            return 0.0d;
        }
        i();
        return this.f338770e;
    }

    public f[] r() {
        i();
        return this.f338769d;
    }

    public org.locationtech.jts.geom.a[] s() {
        i();
        return new org.locationtech.jts.geom.a[]{this.f338769d[0].a(), this.f338769d[1].a()};
    }

    public c(n nVar, n nVar2, double d10) {
        this.f338767b = 0.0d;
        this.f338768c = new u();
        this.f338770e = Double.MAX_VALUE;
        this.f338766a = new n[]{nVar, nVar2};
        this.f338767b = d10;
    }
}
