package vm;

import org.locationtech.jts.algorithm.d;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.operation.distance.f;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n[] f385774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f385775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f[] f385776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f385777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f385778e;

    public b(n nVar, n nVar2) {
        this(nVar, nVar2, 0.0d);
    }

    private void a() {
        if (this.f385776c != null) {
            return;
        }
        this.f385776c = new f[2];
        int iQ = q();
        boolean z10 = iQ == 0;
        n[] nVarArr = this.f385774a;
        e(nVarArr[iQ], nVarArr[1 - iQ], z10);
    }

    private void b(n nVar, n nVar2, boolean z10) {
        if (nVar instanceof d0) {
            if (nVar2 instanceof d0) {
                h((d0) nVar, (d0) nVar2, z10);
                return;
            } else if (nVar2 instanceof v) {
                d((v) nVar2, (d0) nVar, !z10);
                return;
            } else if (nVar2 instanceof e0) {
                j(u(nVar2), (d0) nVar, !z10);
                return;
            }
        }
        if (nVar instanceof v) {
            if (nVar2 instanceof d0) {
                d((v) nVar, (d0) nVar2, z10);
                return;
            } else if (nVar2 instanceof v) {
                c((v) nVar, (v) nVar2, z10);
                return;
            } else if (nVar2 instanceof e0) {
                i(u(nVar2), (v) nVar, !z10);
                return;
            }
        }
        if (nVar instanceof e0) {
            if (nVar2 instanceof d0) {
                j(u(nVar), (d0) nVar2, z10);
            } else if (nVar2 instanceof v) {
                i(u(nVar), (v) nVar2, z10);
            } else if (nVar2 instanceof e0) {
                k(u(nVar), (e0) nVar2, z10);
            }
        }
    }

    private void c(v vVar, v vVar2, boolean z10) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        org.locationtech.jts.geom.a[] aVarArrD1 = vVar2.d0();
        for (int i10 = 0; i10 < aVarArrD0.length - 1; i10++) {
            int i11 = 0;
            while (i11 < aVarArrD1.length - 1) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                double dC = d.c(aVarArrD0[i10], aVarArrD0[i12], aVarArrD1[i11], aVarArrD1[i13]);
                if (dC < this.f385777d) {
                    this.f385777d = dC;
                    org.locationtech.jts.geom.a[] aVarArrN = new u(aVarArrD0[i10], aVarArrD0[i12]).n(new u(aVarArrD1[i11], aVarArrD1[i13]));
                    w(dC, new f(vVar, i10, aVarArrN[0]), new f(vVar2, i11, aVarArrN[1]), z10);
                }
                if (this.f385778e) {
                    return;
                } else {
                    i11 = i13;
                }
            }
        }
    }

    private void d(v vVar, d0 d0Var, boolean z10) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        org.locationtech.jts.geom.a aVarC0 = d0Var.c0();
        int i10 = 0;
        while (i10 < aVarArrD0.length - 1) {
            int i11 = i10 + 1;
            double dB = d.b(aVarC0, aVarArrD0[i10], aVarArrD0[i11]);
            if (dB < this.f385777d) {
                w(dB, new f(vVar, i10, new u(aVarArrD0[i10], aVarArrD0[i11]).l(aVarC0)), new f(d0Var, 0, aVarC0), z10);
            }
            if (this.f385778e) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    private void e(n nVar, n nVar2, boolean z10) {
        if (!(nVar instanceof o)) {
            if (nVar.v0()) {
                return;
            }
            if (nVar instanceof e0) {
                g(u(nVar), nVar2, z10);
                return;
            } else {
                f(nVar, nVar2, z10);
                return;
            }
        }
        int iL0 = nVar.l0();
        for (int i10 = 0; i10 < iL0; i10++) {
            e(nVar.h0(i10), nVar2, z10);
            if (this.f385778e) {
                return;
            }
        }
    }

    private void f(n nVar, n nVar2, boolean z10) {
        if (!(nVar2 instanceof o)) {
            b(nVar, nVar2, z10);
            return;
        }
        int iL0 = nVar2.l0();
        for (int i10 = 0; i10 < iL0; i10++) {
            f(nVar, nVar2.h0(i10), z10);
            if (this.f385778e) {
                return;
            }
        }
    }

    private void g(c cVar, n nVar, boolean z10) {
        if (nVar instanceof o) {
            int iL0 = nVar.l0();
            for (int i10 = 0; i10 < iL0; i10++) {
                g(cVar, nVar.h0(i10), z10);
                if (this.f385778e) {
                    return;
                }
            }
            return;
        }
        if (nVar instanceof d0) {
            j(cVar, (d0) nVar, z10);
        } else if (nVar instanceof v) {
            i(cVar, (v) nVar, z10);
        } else if (nVar instanceof e0) {
            k(cVar, (e0) nVar, z10);
        }
    }

    private void h(d0 d0Var, d0 d0Var2, boolean z10) {
        double dA = d.a(d0Var.c0(), d0Var2.c0());
        if (dA < this.f385777d) {
            w(dA, new f(d0Var, 0, d0Var.c0()), new f(d0Var2, 0, d0Var2.c0()), z10);
        }
    }

    private void i(c cVar, v vVar, boolean z10) {
        org.locationtech.jts.geom.a aVarO = o(cVar, vVar);
        if (aVarO != null) {
            w(0.0d, new f(cVar.e(), 0, aVarO), new f(vVar, 0, aVarO), z10);
            return;
        }
        c(cVar.e().R0(), vVar, z10);
        if (this.f385778e) {
            return;
        }
        int iT0 = cVar.e().T0();
        for (int i10 = 0; i10 < iT0; i10++) {
            c(cVar.e().S0(i10), vVar, z10);
            if (this.f385778e) {
                return;
            }
        }
    }

    private void j(c cVar, d0 d0Var, boolean z10) {
        b bVar;
        boolean z11;
        org.locationtech.jts.geom.a aVarC0 = d0Var.c0();
        v vVarR0 = cVar.e().R0();
        if (cVar.g(aVarC0, vVarR0)) {
            int iT0 = cVar.e().T0();
            for (int i10 = 0; i10 < iT0; i10++) {
                v vVarS0 = cVar.e().S0(i10);
                if (cVar.g(aVarC0, vVarS0)) {
                    d(vVarS0, d0Var, z10);
                    return;
                }
            }
            bVar = this;
            z11 = z10;
            bVar.w(Math.abs(cVar.d().b(aVarC0)), new f(cVar.e(), 0, aVarC0), new f(d0Var, 0, aVarC0), z11);
        } else {
            bVar = this;
            z11 = z10;
        }
        bVar.d(vVarR0, d0Var, z11);
    }

    private void k(c cVar, e0 e0Var, boolean z10) {
        l(cVar, e0Var, z10);
        if (this.f385778e) {
            return;
        }
        l(new c(e0Var), cVar.e(), z10);
    }

    private void l(c cVar, e0 e0Var, boolean z10) {
        i(cVar, e0Var.R0(), z10);
        if (this.f385778e) {
            return;
        }
        int iT0 = e0Var.T0();
        for (int i10 = 0; i10 < iT0; i10++) {
            i(cVar, e0Var.S0(i10), z10);
            if (this.f385778e) {
                return;
            }
        }
    }

    public static double n(n nVar, n nVar2) {
        return new b(nVar, nVar2).m();
    }

    private org.locationtech.jts.geom.a o(c cVar, v vVar) {
        e eVarS0 = vVar.S0();
        if (eVarS0.size() == 0) {
            return null;
        }
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        int i10 = 0;
        eVarS0.Ob(0, aVar);
        double dB = cVar.d().b(aVar);
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        while (i10 < eVarS0.size() - 1) {
            eVarS0.Ob(i10, aVar);
            i10++;
            eVarS0.Ob(i10, aVar2);
            double dB2 = cVar.d().b(aVar2);
            if (dB * dB2 <= 0.0d) {
                org.locationtech.jts.geom.a aVarV = v(aVar, aVar2, dB, dB2);
                if (cVar.f(aVarV)) {
                    return aVarV;
                }
                dB = dB2;
            }
        }
        return null;
    }

    public static boolean p(n nVar, n nVar2, double d10) {
        return new b(nVar, nVar2, d10).m() <= d10;
    }

    private int q() {
        int iRg = this.f385774a[0].Rg();
        int iRg2 = this.f385774a[1].Rg();
        if (iRg < 2 || iRg2 < 2) {
            return (iRg < 2 && iRg2 >= 2) ? 1 : 0;
        }
        return this.f385774a[0].m0() > this.f385774a[1].m0() ? 0 : 1;
    }

    public static org.locationtech.jts.geom.a[] t(n nVar, n nVar2) {
        return new b(nVar, nVar2).s();
    }

    private static c u(n nVar) {
        return new c((e0) nVar);
    }

    private static org.locationtech.jts.geom.a v(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10, double d11) {
        if (d10 <= 0.0d) {
            return new org.locationtech.jts.geom.a(aVar);
        }
        if (d11 <= 0.0d) {
            return new org.locationtech.jts.geom.a(aVar2);
        }
        double dAbs = Math.abs(d10) / (Math.abs(d10) + Math.abs(d11));
        double d12 = aVar.f338092a;
        double d13 = d12 + ((aVar2.f338092a - d12) * dAbs);
        double d14 = aVar.f338093b;
        double d15 = d14 + ((aVar2.f338093b - d14) * dAbs);
        double d16 = aVar.f338094c;
        return new org.locationtech.jts.geom.a(d13, d15, d16 + (dAbs * (aVar2.f338094c - d16)));
    }

    private void w(double d10, f fVar, f fVar2, boolean z10) {
        this.f385777d = d10;
        f[] fVarArr = this.f385776c;
        fVarArr[z10 ? 1 : 0] = fVar;
        fVarArr[1 - (z10 ? 1 : 0)] = fVar2;
        if (d10 < this.f385775b) {
            this.f385778e = true;
        }
    }

    public double m() {
        n[] nVarArr = this.f385774a;
        n nVar = nVarArr[0];
        if (nVar == null || nVarArr[1] == null) {
            throw new IllegalArgumentException("null geometries are not supported");
        }
        if (!nVar.v0() && !this.f385774a[1].v0()) {
            a();
            return this.f385777d;
        }
        return 0.0d;
    }

    public f[] r() {
        a();
        return this.f385776c;
    }

    public org.locationtech.jts.geom.a[] s() {
        a();
        return new org.locationtech.jts.geom.a[]{this.f385776c[0].a(), this.f385776c[1].a()};
    }

    public b(n nVar, n nVar2, double d10) {
        this.f385777d = Double.MAX_VALUE;
        this.f385778e = false;
        this.f385774a = new n[]{nVar, nVar2};
        this.f385775b = d10;
    }
}
