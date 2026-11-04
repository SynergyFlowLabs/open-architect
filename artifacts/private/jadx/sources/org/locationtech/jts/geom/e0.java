package org.locationtech.jts.geom;

import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class e0 extends n implements f0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f338112t = -3494792200821764533L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected x f338113o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected x[] f338114s;

    public e0(x xVar, g0 g0Var, int i10) {
        this(xVar, new x[0], new r(g0Var, i10));
    }

    private void U0(x xVar, boolean z10) {
        if (xVar.v0()) {
            return;
        }
        int length = xVar.d0().length - 1;
        a[] aVarArr = new a[length];
        System.arraycopy(xVar.d0(), 0, aVarArr, 0, length);
        b.u(aVarArr, b.p(xVar.d0()));
        System.arraycopy(aVarArr, 0, xVar.d0(), 0, length);
        xVar.d0()[length] = aVarArr[0];
        if (org.locationtech.jts.algorithm.s.b(xVar.d0()) == z10) {
            b.t(xVar.d0());
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void D0() {
        U0(this.f338113o, true);
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                Arrays.sort(xVarArr);
                return;
            } else {
                U0(xVarArr[i10], false);
                i10++;
            }
        }
    }

    @Override // org.locationtech.jts.geom.n
    public n H0() {
        e0 e0VarW = w();
        e0VarW.f338113o = (x) this.f338113o.w().H0();
        e0VarW.f338114s = new x[this.f338114s.length];
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return e0VarW;
            }
            e0VarW.f338114s[i10] = (x) xVarArr[i10].w().H0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public e0 w() {
        x xVarA1 = this.f338113o.w();
        x[] xVarArr = new x[this.f338114s.length];
        int i10 = 0;
        while (true) {
            x[] xVarArr2 = this.f338114s;
            if (i10 >= xVarArr2.length) {
                return new e0(xVarA1, xVarArr, this.f338179b);
            }
            xVarArr[i10] = xVarArr2[i10].w();
            i10++;
        }
    }

    public v R0() {
        return this.f338113o;
    }

    @Override // org.locationtech.jts.geom.n
    public int Rg() {
        return 2;
    }

    @Override // org.locationtech.jts.geom.n
    public boolean S(n nVar, double d10) {
        if (!w0(nVar)) {
            return false;
        }
        e0 e0Var = (e0) nVar;
        if (!this.f338113o.S(e0Var.f338113o, d10) || this.f338114s.length != e0Var.f338114s.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return true;
            }
            if (!xVarArr[i10].S(e0Var.f338114s[i10], d10)) {
                return false;
            }
            i10++;
        }
    }

    public v S0(int i10) {
        return this.f338114s[i10];
    }

    public int T0() {
        return this.f338114s.length;
    }

    @Override // org.locationtech.jts.geom.n
    public double X() {
        double dA = org.locationtech.jts.algorithm.b.a(this.f338113o.S0()) + 0.0d;
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return dA;
            }
            dA -= org.locationtech.jts.algorithm.b.a(xVarArr[i10].S0());
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public n Y() {
        if (v0()) {
            return g0().l();
        }
        int length = this.f338114s.length + 1;
        x[] xVarArr = new x[length];
        xVarArr[0] = this.f338113o;
        int i10 = 0;
        while (true) {
            x[] xVarArr2 = this.f338114s;
            if (i10 >= xVarArr2.length) {
                break;
            }
            int i11 = i10 + 1;
            xVarArr[i11] = xVarArr2[i10];
            i10 = i11;
        }
        return length <= 1 ? g0().j(xVarArr[0].S0()) : g0().m(xVarArr);
    }

    @Override // org.locationtech.jts.geom.n
    public int Z() {
        return 1;
    }

    @Override // org.locationtech.jts.geom.n
    public void b(c cVar) {
        this.f338113o.b(cVar);
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return;
            }
            xVarArr[i10].b(cVar);
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void c(h hVar) {
        this.f338113o.c(hVar);
        if (!hVar.isDone()) {
            int i10 = 0;
            while (true) {
                x[] xVarArr = this.f338114s;
                if (i10 >= xVarArr.length) {
                    break;
                }
                xVarArr[i10].c(hVar);
                if (hVar.isDone()) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (hVar.b()) {
            V();
        }
    }

    @Override // org.locationtech.jts.geom.n
    public a c0() {
        return this.f338113o.c0();
    }

    @Override // org.locationtech.jts.geom.n
    public Object clone() {
        return w();
    }

    @Override // org.locationtech.jts.geom.n
    public void d(q qVar) {
        qVar.a(this);
        this.f338113o.d(qVar);
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return;
            }
            xVarArr[i10].d(qVar);
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public a[] d0() {
        if (v0()) {
            return new a[0];
        }
        a[] aVarArr = new a[m0()];
        int i10 = -1;
        for (a aVar : this.f338113o.d0()) {
            i10++;
            aVarArr[i10] = aVar;
        }
        int i11 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i11 >= xVarArr.length) {
                return aVarArr;
            }
            for (a aVar2 : xVarArr[i11].d0()) {
                i10++;
                aVarArr[i10] = aVar2;
            }
            i11++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void e(s sVar) {
        sVar.a(this);
    }

    @Override // org.locationtech.jts.geom.n
    public String i0() {
        return org.locationtech.jts.io.gml2.a.f338495m;
    }

    @Override // org.locationtech.jts.geom.n
    public double k0() {
        double dK0 = this.f338113o.k0() + 0.0d;
        int i10 = 0;
        int i11 = 5 & 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return dK0;
            }
            dK0 += xVarArr[i10].k0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public int m0() {
        int iM0 = this.f338113o.m0();
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f338114s;
            if (i10 >= xVarArr.length) {
                return iM0;
            }
            iM0 += xVarArr[i10].m0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    protected int p0() {
        return 5;
    }

    @Override // org.locationtech.jts.geom.n
    protected int q(Object obj) {
        return this.f338113o.q(((e0) obj).f338113o);
    }

    @Override // org.locationtech.jts.geom.n
    protected int r(Object obj, f fVar) {
        e0 e0Var = (e0) obj;
        int iR = this.f338113o.r(e0Var.f338113o, fVar);
        if (iR != 0) {
            return iR;
        }
        int iT0 = T0();
        int iT1 = e0Var.T0();
        int i10 = 0;
        while (i10 < iT0 && i10 < iT1) {
            int iR2 = ((x) S0(i10)).r((x) e0Var.S0(i10), fVar);
            if (iR2 != 0) {
                return iR2;
            }
            i10++;
        }
        if (i10 < iT0) {
            return 1;
        }
        return i10 < iT1 ? -1 : 0;
    }

    @Override // org.locationtech.jts.geom.n
    protected m s() {
        return this.f338113o.f0();
    }

    @Override // org.locationtech.jts.geom.n
    public n v() {
        return R0().v();
    }

    @Override // org.locationtech.jts.geom.n
    public boolean v0() {
        return this.f338113o.v0();
    }

    @Override // org.locationtech.jts.geom.n
    public boolean y0() {
        x xVar;
        if (T0() != 0 || (xVar = this.f338113o) == null || xVar.m0() != 5) {
            return false;
        }
        e eVarS0 = this.f338113o.S0();
        m mVarF0 = f0();
        for (int i10 = 0; i10 < 5; i10++) {
            double dN5 = eVarS0.N5(i10);
            if (dN5 != mVarF0.L() && dN5 != mVarF0.H()) {
                return false;
            }
            double dI3 = eVarS0.I3(i10);
            if (dI3 != mVarF0.M() && dI3 != mVarF0.I()) {
                return false;
            }
        }
        double dN6 = eVarS0.N5(0);
        double dI4 = eVarS0.I3(0);
        int i11 = 1;
        while (i11 <= 4) {
            double dN7 = eVarS0.N5(i11);
            double dI5 = eVarS0.I3(i11);
            if ((dN7 != dN6) == (dI5 != dI4)) {
                return false;
            }
            i11++;
            dN6 = dN7;
            dI4 = dI5;
        }
        return true;
    }

    public e0(x xVar, x[] xVarArr, g0 g0Var, int i10) {
        this(xVar, xVarArr, new r(g0Var, i10));
    }

    public e0(x xVar, x[] xVarArr, r rVar) {
        super(rVar);
        this.f338113o = null;
        xVar = xVar == null ? g0().i() : xVar;
        xVarArr = xVarArr == null ? new x[0] : xVarArr;
        if (!n.s0(xVarArr)) {
            if (xVar.v0() && n.r0(xVarArr)) {
                throw new IllegalArgumentException("shell is empty but holes are not");
            }
            this.f338113o = xVar;
            this.f338114s = xVarArr;
            return;
        }
        throw new IllegalArgumentException("holes must not contain null elements");
    }
}
