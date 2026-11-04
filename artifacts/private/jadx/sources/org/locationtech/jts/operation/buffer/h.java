package org.locationtech.jts.operation.buffer;

import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.algorithm.r;
import org.locationtech.jts.algorithm.s;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double f338722r = 0.001d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final double f338723s = 0.001d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f338724t = 1.0E-6d;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f338725u = 80;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f338729d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g0 f338731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f338732g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338736k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338726a = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f338730e = 0.0d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private u f338737l = new u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u f338738m = new u();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f338739n = new u();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private u f338740o = new u();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f338741p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f338742q = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o f338733h = new y();

    public h(g0 g0Var, d dVar, double d10) {
        this.f338728c = 1;
        int i10 = 4 | 0;
        this.f338731f = g0Var;
        this.f338732g = dVar;
        this.f338727b = 1.5707963267948966d / ((double) dVar.e());
        if (dVar.e() >= 8 && dVar.c() == 1) {
            this.f338728c = 80;
        }
        t(d10);
    }

    private void a(u uVar, u uVar2) {
        this.f338729d.a(uVar.f338212b);
        this.f338729d.a(uVar2.f338211a);
    }

    private void b(boolean z10) {
        o oVar = this.f338733h;
        org.locationtech.jts.geom.a aVar = this.f338734i;
        org.locationtech.jts.geom.a aVar2 = this.f338735j;
        oVar.f(aVar, aVar2, aVar2, this.f338736k);
        if (this.f338733h.l() >= 2) {
            if (this.f338732g.c() != 3 && this.f338732g.c() != 2) {
                c(this.f338735j, this.f338739n.f338212b, this.f338740o.f338211a, -1, this.f338730e);
                return;
            }
            if (z10) {
                this.f338729d.a(this.f338739n.f338212b);
            }
            this.f338729d.a(this.f338740o.f338211a);
        }
    }

    private void c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, int i10, double d10) {
        double dAtan2 = Math.atan2(aVar2.f338093b - aVar.f338093b, aVar2.f338092a - aVar.f338092a);
        double dAtan3 = Math.atan2(aVar3.f338093b - aVar.f338093b, aVar3.f338092a - aVar.f338092a);
        if (i10 == -1) {
            if (dAtan2 <= dAtan3) {
                dAtan2 += 6.283185307179586d;
            }
        } else if (dAtan2 >= dAtan3) {
            dAtan2 -= 6.283185307179586d;
        }
        this.f338729d.a(aVar2);
        d(aVar, dAtan2, dAtan3, i10, d10);
        this.f338729d.a(aVar3);
    }

    private void d(org.locationtech.jts.geom.a aVar, double d10, double d11, int i10, double d12) {
        int i11 = i10 != -1 ? 1 : -1;
        double dAbs = Math.abs(d10 - d11);
        int i12 = (int) ((dAbs / this.f338727b) + 0.5d);
        if (i12 < 1) {
            return;
        }
        double d13 = dAbs / ((double) i12);
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        for (double d14 = 0.0d; d14 < dAbs; d14 += d13) {
            double d15 = d10 + (((double) i11) * d14);
            aVar2.f338092a = aVar.f338092a + (Math.cos(d15) * d12);
            aVar2.f338093b = aVar.f338093b + (Math.sin(d15) * d12);
            this.f338729d.a(aVar2);
        }
    }

    private void f(int i10, boolean z10) {
        o oVar = this.f338733h;
        u uVar = this.f338739n;
        org.locationtech.jts.geom.a aVar = uVar.f338211a;
        org.locationtech.jts.geom.a aVar2 = uVar.f338212b;
        u uVar2 = this.f338740o;
        oVar.f(aVar, aVar2, uVar2.f338211a, uVar2.f338212b);
        if (this.f338733h.n()) {
            this.f338729d.a(this.f338733h.j(0));
            return;
        }
        this.f338742q = true;
        if (this.f338739n.f338212b.l(this.f338740o.f338211a) < this.f338730e * 0.001d) {
            this.f338729d.a(this.f338739n.f338212b);
            return;
        }
        this.f338729d.a(this.f338739n.f338212b);
        int i11 = this.f338728c;
        if (i11 > 0) {
            org.locationtech.jts.geom.a aVar3 = this.f338739n.f338212b;
            double d10 = ((double) i11) * aVar3.f338092a;
            org.locationtech.jts.geom.a aVar4 = this.f338735j;
            this.f338729d.a(new org.locationtech.jts.geom.a((d10 + aVar4.f338092a) / ((double) (i11 + 1)), ((((double) i11) * aVar3.f338093b) + aVar4.f338093b) / ((double) (i11 + 1))));
            int i12 = this.f338728c;
            org.locationtech.jts.geom.a aVar5 = this.f338740o.f338211a;
            double d11 = ((double) i12) * aVar5.f338092a;
            org.locationtech.jts.geom.a aVar6 = this.f338735j;
            this.f338729d.a(new org.locationtech.jts.geom.a((d11 + aVar6.f338092a) / ((double) (i12 + 1)), ((((double) i12) * aVar5.f338093b) + aVar6.f338093b) / ((double) (i12 + 1))));
        } else {
            this.f338729d.a(this.f338735j);
        }
        this.f338729d.a(this.f338740o.f338211a);
    }

    private void h(u uVar, u uVar2, double d10, double d11) {
        u uVar3 = this.f338737l;
        org.locationtech.jts.geom.a aVar = uVar3.f338212b;
        double dB = org.locationtech.jts.algorithm.a.b(aVar, uVar3.f338211a);
        org.locationtech.jts.algorithm.a.b(aVar, this.f338738m.f338212b);
        double d12 = org.locationtech.jts.algorithm.a.d(this.f338737l.f338211a, aVar, this.f338738m.f338212b) / 2.0d;
        double dJ = org.locationtech.jts.algorithm.a.j(org.locationtech.jts.algorithm.a.j(dB + d12) + 3.141592653589793d);
        double d13 = d11 * d10;
        double dAbs = d10 - (Math.abs(Math.sin(d12)) * d13);
        u uVar4 = new u(aVar, new org.locationtech.jts.geom.a(aVar.f338092a + (Math.cos(dJ) * d13), aVar.f338093b + (d13 * Math.sin(dJ))));
        org.locationtech.jts.geom.a aVarT = uVar4.T(1.0d, dAbs);
        org.locationtech.jts.geom.a aVarT2 = uVar4.T(1.0d, -dAbs);
        if (this.f338741p == 1) {
            this.f338729d.a(aVarT);
            this.f338729d.a(aVarT2);
        } else {
            this.f338729d.a(aVarT2);
            this.f338729d.a(aVarT);
        }
    }

    private void j(org.locationtech.jts.geom.a aVar, u uVar, u uVar2, double d10) {
        org.locationtech.jts.geom.a aVar2;
        boolean z10 = false;
        try {
            aVar2 = org.locationtech.jts.algorithm.j.d(uVar.f338211a, uVar.f338212b, uVar2.f338211a, uVar2.f338212b);
            if ((d10 <= 0.0d ? 1.0d : aVar2.l(aVar) / Math.abs(d10)) <= this.f338732g.d()) {
                z10 = true;
            }
        } catch (r unused) {
            aVar2 = new org.locationtech.jts.geom.a(0.0d, 0.0d);
        }
        if (z10) {
            this.f338729d.a(aVar2);
        } else {
            h(uVar, uVar2, d10, this.f338732g.d());
        }
    }

    private void l(int i10, boolean z10) {
        if (this.f338739n.f338212b.l(this.f338740o.f338211a) < this.f338730e * 0.001d) {
            this.f338729d.a(this.f338739n.f338212b);
            return;
        }
        if (this.f338732g.c() == 2) {
            j(this.f338735j, this.f338739n, this.f338740o, this.f338730e);
            return;
        }
        if (this.f338732g.c() == 3) {
            a(this.f338739n, this.f338740o);
            return;
        }
        if (z10) {
            this.f338729d.a(this.f338739n.f338212b);
        }
        c(this.f338735j, this.f338739n.f338212b, this.f338740o.f338211a, i10, this.f338730e);
        this.f338729d.a(this.f338740o.f338211a);
    }

    private void o(u uVar, int i10, double d10, u uVar2) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = -1;
        }
        org.locationtech.jts.geom.a aVar = uVar.f338212b;
        double d11 = aVar.f338092a;
        org.locationtech.jts.geom.a aVar2 = uVar.f338211a;
        double d12 = d11 - aVar2.f338092a;
        double d13 = aVar.f338093b - aVar2.f338093b;
        double dSqrt = Math.sqrt((d12 * d12) + (d13 * d13));
        double d14 = ((double) i11) * d10;
        double d15 = (d12 * d14) / dSqrt;
        double d16 = (d14 * d13) / dSqrt;
        org.locationtech.jts.geom.a aVar3 = uVar2.f338211a;
        org.locationtech.jts.geom.a aVar4 = uVar.f338211a;
        aVar3.f338092a = aVar4.f338092a - d16;
        aVar3.f338093b = aVar4.f338093b + d15;
        org.locationtech.jts.geom.a aVar5 = uVar2.f338212b;
        org.locationtech.jts.geom.a aVar6 = uVar.f338212b;
        aVar5.f338092a = aVar6.f338092a - d16;
        aVar5.f338093b = aVar6.f338093b + d15;
    }

    private void t(double d10) {
        this.f338730e = d10;
        this.f338726a = (1.0d - Math.cos(this.f338727b / 2.0d)) * d10;
        i iVar = new i();
        this.f338729d = iVar;
        iVar.h(this.f338731f);
        this.f338729d.g(d10 * f338724t);
    }

    public void e() {
        this.f338729d.a(this.f338740o.f338211a);
    }

    public void g() {
        this.f338729d.a(this.f338740o.f338212b);
    }

    public void i(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        u uVar = new u(aVar, aVar2);
        u uVar2 = new u();
        o(uVar, 1, this.f338730e, uVar2);
        u uVar3 = new u();
        o(uVar, 2, this.f338730e, uVar3);
        double dAtan2 = Math.atan2(aVar2.f338093b - aVar.f338093b, aVar2.f338092a - aVar.f338092a);
        int iB = this.f338732g.b();
        if (iB == 1) {
            this.f338729d.a(uVar2.f338212b);
            d(aVar2, dAtan2 + 1.5707963267948966d, dAtan2 - 1.5707963267948966d, -1, this.f338730e);
            this.f338729d.a(uVar3.f338212b);
            return;
        }
        if (iB == 2) {
            this.f338729d.a(uVar2.f338212b);
            this.f338729d.a(uVar3.f338212b);
            return;
        }
        if (iB != 3) {
            return;
        }
        org.locationtech.jts.geom.a aVar3 = new org.locationtech.jts.geom.a();
        aVar3.f338092a = Math.abs(this.f338730e) * Math.cos(dAtan2);
        double dAbs = Math.abs(this.f338730e) * Math.sin(dAtan2);
        aVar3.f338093b = dAbs;
        org.locationtech.jts.geom.a aVar4 = uVar2.f338212b;
        org.locationtech.jts.geom.a aVar5 = new org.locationtech.jts.geom.a(aVar4.f338092a + aVar3.f338092a, aVar4.f338093b + dAbs);
        org.locationtech.jts.geom.a aVar6 = uVar3.f338212b;
        org.locationtech.jts.geom.a aVar7 = new org.locationtech.jts.geom.a(aVar6.f338092a + aVar3.f338092a, aVar6.f338093b + aVar3.f338093b);
        this.f338729d.a(aVar5);
        this.f338729d.a(aVar7);
    }

    public void k(org.locationtech.jts.geom.a aVar, boolean z10) {
        org.locationtech.jts.geom.a aVar2 = this.f338735j;
        this.f338734i = aVar2;
        org.locationtech.jts.geom.a aVar3 = this.f338736k;
        this.f338735j = aVar3;
        this.f338736k = aVar;
        this.f338737l.Z(aVar2, aVar3);
        o(this.f338737l, this.f338741p, this.f338730e, this.f338739n);
        this.f338738m.Z(this.f338735j, this.f338736k);
        o(this.f338738m, this.f338741p, this.f338730e, this.f338740o);
        if (this.f338735j.equals(this.f338736k)) {
            return;
        }
        int iA = s.a(this.f338734i, this.f338735j, this.f338736k);
        boolean z11 = true;
        if ((iA != -1 || this.f338741p != 1) && (iA != 1 || this.f338741p != 2)) {
            z11 = false;
        }
        if (iA == 0) {
            b(z10);
        } else if (z11) {
            l(iA, z10);
        } else {
            f(iA, z10);
        }
    }

    public void m(org.locationtech.jts.geom.a[] aVarArr, boolean z10) {
        this.f338729d.b(aVarArr, z10);
    }

    public void n() {
        this.f338729d.c();
    }

    public void p(org.locationtech.jts.geom.a aVar) {
        this.f338729d.a(new org.locationtech.jts.geom.a(aVar.f338092a + this.f338730e, aVar.f338093b));
        d(aVar, 0.0d, 6.283185307179586d, -1, this.f338730e);
        this.f338729d.c();
    }

    public void q(org.locationtech.jts.geom.a aVar) {
        i iVar = this.f338729d;
        double d10 = aVar.f338092a;
        double d11 = this.f338730e;
        iVar.a(new org.locationtech.jts.geom.a(d10 + d11, aVar.f338093b + d11));
        i iVar2 = this.f338729d;
        double d12 = aVar.f338092a;
        double d13 = this.f338730e;
        iVar2.a(new org.locationtech.jts.geom.a(d12 + d13, aVar.f338093b - d13));
        i iVar3 = this.f338729d;
        double d14 = aVar.f338092a;
        double d15 = this.f338730e;
        iVar3.a(new org.locationtech.jts.geom.a(d14 - d15, aVar.f338093b - d15));
        i iVar4 = this.f338729d;
        double d16 = aVar.f338092a;
        double d17 = this.f338730e;
        iVar4.a(new org.locationtech.jts.geom.a(d16 - d17, aVar.f338093b + d17));
        this.f338729d.c();
    }

    public org.locationtech.jts.geom.a[] r() {
        return this.f338729d.d();
    }

    public boolean s() {
        return this.f338742q;
    }

    public void u(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, int i10) {
        this.f338735j = aVar;
        this.f338736k = aVar2;
        this.f338741p = i10;
        this.f338738m.Z(aVar, aVar2);
        o(this.f338738m, i10, this.f338730e, this.f338740o);
    }
}
