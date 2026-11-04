package org.locationtech.jts.geom;

import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes14.dex */
public class o extends n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f338184s = -5694727726395021467L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected n[] f338185o;

    public o(n[] nVarArr, g0 g0Var, int i10) {
        this(nVarArr, new r(g0Var, i10));
    }

    @Override // org.locationtech.jts.geom.n
    public void D0() {
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                Arrays.sort(nVarArr);
                return;
            } else {
                nVarArr[i10].D0();
                i10++;
            }
        }
    }

    @Override // org.locationtech.jts.geom.n
    public n H0() {
        n[] nVarArr = new n[this.f338185o.length];
        int i10 = 0;
        while (true) {
            n[] nVarArr2 = this.f338185o;
            if (i10 >= nVarArr2.length) {
                return g0().e(nVarArr);
            }
            nVarArr[i10] = nVarArr2[i10].H0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    /* JADX INFO: renamed from: Q0 */
    public o w() {
        int length = this.f338185o.length;
        n[] nVarArr = new n[length];
        for (int i10 = 0; i10 < length; i10++) {
            nVarArr[i10] = this.f338185o[i10].w();
        }
        return new o(nVarArr, this.f338179b);
    }

    @Override // org.locationtech.jts.geom.n
    public int Rg() {
        int iMax = -1;
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return iMax;
            }
            iMax = Math.max(iMax, nVarArr[i10].Rg());
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public boolean S(n nVar, double d10) {
        if (!w0(nVar)) {
            return false;
        }
        o oVar = (o) nVar;
        if (this.f338185o.length != oVar.f338185o.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return true;
            }
            if (!nVarArr[i10].S(oVar.f338185o[i10], d10)) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public double X() {
        double dX = 0.0d;
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return dX;
            }
            dX += nVarArr[i10].X();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public n Y() {
        n(this);
        org.locationtech.jts.util.a.e();
        return null;
    }

    @Override // org.locationtech.jts.geom.n
    public int Z() {
        int iMax = -1;
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return iMax;
            }
            iMax = Math.max(iMax, nVarArr[i10].Z());
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void b(c cVar) {
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return;
            }
            nVarArr[i10].b(cVar);
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void c(h hVar) {
        if (this.f338185o.length != 0) {
            int i10 = 0;
            while (true) {
                n[] nVarArr = this.f338185o;
                if (i10 >= nVarArr.length) {
                    break;
                }
                nVarArr[i10].c(hVar);
                if (hVar.isDone()) {
                    break;
                } else {
                    i10++;
                }
            }
            if (hVar.b()) {
                V();
            }
        }
    }

    @Override // org.locationtech.jts.geom.n
    public a c0() {
        if (v0()) {
            return null;
        }
        return this.f338185o[0].c0();
    }

    @Override // org.locationtech.jts.geom.n
    public Object clone() {
        return w();
    }

    @Override // org.locationtech.jts.geom.n
    public void d(q qVar) {
        qVar.a(this);
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return;
            }
            nVarArr[i10].d(qVar);
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public a[] d0() {
        a[] aVarArr = new a[m0()];
        int i10 = -1;
        int i11 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i11 >= nVarArr.length) {
                return aVarArr;
            }
            for (a aVar : nVarArr[i11].d0()) {
                i10++;
                aVarArr[i10] = aVar;
            }
            i11++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public void e(s sVar) {
        sVar.a(this);
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return;
            }
            nVarArr[i10].e(sVar);
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public n h0(int i10) {
        return this.f338185o[i10];
    }

    @Override // org.locationtech.jts.geom.n
    public String i0() {
        return "GeometryCollection";
    }

    @Override // org.locationtech.jts.geom.n
    public double k0() {
        double dK0 = 0.0d;
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return dK0;
            }
            dK0 += nVarArr[i10].k0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public int l0() {
        return this.f338185o.length;
    }

    @Override // org.locationtech.jts.geom.n
    public int m0() {
        int i10 = 0;
        int iM0 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return iM0;
            }
            iM0 += nVarArr[i10].m0();
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    protected int p0() {
        return 7;
    }

    @Override // org.locationtech.jts.geom.n
    protected int q(Object obj) {
        return o(new TreeSet(Arrays.asList(this.f338185o)), new TreeSet(Arrays.asList(((o) obj).f338185o)));
    }

    @Override // org.locationtech.jts.geom.n
    protected int r(Object obj, f fVar) {
        o oVar = (o) obj;
        int iL0 = l0();
        int iL1 = oVar.l0();
        int i10 = 0;
        while (i10 < iL0 && i10 < iL1) {
            int iR = h0(i10).r(oVar.h0(i10), fVar);
            if (iR != 0) {
                return iR;
            }
            i10++;
        }
        if (i10 < iL0) {
            return 1;
        }
        return i10 < iL1 ? -1 : 0;
    }

    @Override // org.locationtech.jts.geom.n
    protected m s() {
        m mVar = new m();
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return mVar;
            }
            mVar.z(nVarArr[i10].f0());
            i10++;
        }
    }

    @Override // org.locationtech.jts.geom.n
    public boolean v0() {
        int i10 = 0;
        while (true) {
            n[] nVarArr = this.f338185o;
            if (i10 >= nVarArr.length) {
                return true;
            }
            if (!nVarArr[i10].v0()) {
                return false;
            }
            i10++;
        }
    }

    public o(n[] nVarArr, r rVar) {
        super(rVar);
        nVarArr = nVarArr == null ? new n[0] : nVarArr;
        if (n.s0(nVarArr)) {
            throw new IllegalArgumentException("geometries must not contain null elements");
        }
        this.f338185o = nVarArr;
    }
}
