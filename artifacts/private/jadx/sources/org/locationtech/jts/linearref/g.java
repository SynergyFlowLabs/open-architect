package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f338542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338544c;

    public g() {
        this.f338542a = 0;
        this.f338543b = 0;
        this.f338544c = 0.0d;
    }

    public static org.locationtech.jts.geom.a D(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10) {
        if (d10 <= 0.0d) {
            return aVar;
        }
        if (d10 >= 1.0d) {
            return aVar2;
        }
        double d11 = aVar2.f338092a;
        double d12 = aVar.f338092a;
        double d13 = ((d11 - d12) * d10) + d12;
        double d14 = aVar2.f338093b;
        double d15 = aVar.f338093b;
        double d16 = ((d14 - d15) * d10) + d15;
        double d17 = aVar2.f338094c;
        double d18 = aVar.f338094c;
        return new org.locationtech.jts.geom.a(d13, d16, ((d17 - d18) * d10) + d18);
    }

    public static int d(int i10, int i11, double d10, int i12, int i13, double d11) {
        if (i10 < i12) {
            return -1;
        }
        if (i10 > i12) {
            return 1;
        }
        if (i11 < i13) {
            return -1;
        }
        if (i11 > i13) {
            return 1;
        }
        if (d10 < d11) {
            return -1;
        }
        return d10 > d11 ? 1 : 0;
    }

    public static g o(n nVar) {
        g gVar = new g();
        gVar.E(nVar);
        return gVar;
    }

    private void z() {
        if (this.f338544c < 0.0d) {
            this.f338544c = 0.0d;
        }
        if (this.f338544c > 1.0d) {
            this.f338544c = 1.0d;
        }
        if (this.f338542a < 0) {
            this.f338542a = 0;
            this.f338543b = 0;
            this.f338544c = 0.0d;
        }
        if (this.f338543b < 0) {
            this.f338543b = 0;
            this.f338544c = 0.0d;
        }
        if (this.f338544c == 1.0d) {
            this.f338544c = 0.0d;
            this.f338543b++;
        }
    }

    public void E(n nVar) {
        int iL0 = nVar.l0() - 1;
        this.f338542a = iL0;
        this.f338543b = ((v) nVar.h0(iL0)).m0() - 1;
        this.f338544c = 1.0d;
    }

    public void H(n nVar, double d10) {
        double d11 = this.f338544c;
        if (d11 <= 0.0d || d11 >= 1.0d) {
            return;
        }
        double dS = s(nVar);
        double d12 = this.f338544c * dS;
        double d13 = dS - d12;
        if (d12 <= d13 && d12 < d10) {
            this.f338544c = 0.0d;
        } else {
            if (d13 > d12 || d13 >= d10) {
                return;
            }
            this.f338544c = 1.0d;
        }
    }

    public g I(n nVar) {
        int iM0 = ((v) nVar.h0(this.f338542a)).m0() - 1;
        return this.f338543b < iM0 ? this : new g(this.f338542a, iM0, 1.0d, false);
    }

    public void b(n nVar) {
        if (this.f338542a >= nVar.l0()) {
            E(nVar);
        } else if (this.f338543b >= nVar.m0()) {
            this.f338543b = ((v) nVar.h0(this.f338542a)).m0() - 1;
            this.f338544c = 1.0d;
        }
    }

    public int c(int i10, int i11, double d10) {
        int i12 = this.f338542a;
        if (i12 < i10) {
            return -1;
        }
        if (i12 > i10) {
            return 1;
        }
        int i13 = this.f338543b;
        if (i13 < i11) {
            return -1;
        }
        if (i13 > i11) {
            return 1;
        }
        double d11 = this.f338544c;
        if (d11 < d10) {
            return -1;
        }
        return d11 > d10 ? 1 : 0;
    }

    public Object clone() {
        return k();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        g gVar = (g) obj;
        int i10 = this.f338542a;
        int i11 = gVar.f338542a;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = this.f338543b;
        int i13 = gVar.f338543b;
        if (i12 < i13) {
            return -1;
        }
        if (i12 > i13) {
            return 1;
        }
        double d10 = this.f338544c;
        double d11 = gVar.f338544c;
        if (d10 < d11) {
            return -1;
        }
        return d10 > d11 ? 1 : 0;
    }

    public g k() {
        return new g(this.f338542a, this.f338543b, this.f338544c);
    }

    public int l() {
        return this.f338542a;
    }

    public org.locationtech.jts.geom.a n(n nVar) {
        v vVar = (v) nVar.h0(this.f338542a);
        org.locationtech.jts.geom.a aVarR0 = vVar.R0(this.f338543b);
        return this.f338543b >= vVar.m0() + (-1) ? aVarR0 : D(aVarR0, vVar.R0(this.f338543b + 1), this.f338544c);
    }

    public u p(n nVar) {
        v vVar = (v) nVar.h0(this.f338542a);
        org.locationtech.jts.geom.a aVarR0 = vVar.R0(this.f338543b);
        return this.f338543b >= vVar.m0() + (-1) ? new u(vVar.R0(vVar.m0() - 2), aVarR0) : new u(aVarR0, vVar.R0(this.f338543b + 1));
    }

    public double q() {
        return this.f338544c;
    }

    public int r() {
        return this.f338543b;
    }

    public double s(n nVar) {
        v vVar = (v) nVar.h0(this.f338542a);
        int iM0 = this.f338543b;
        if (iM0 >= vVar.m0() - 1) {
            iM0 = vVar.m0() - 2;
        }
        return vVar.R0(iM0).l(vVar.R0(iM0 + 1));
    }

    public boolean t(n nVar) {
        int iM0 = ((v) nVar.h0(this.f338542a)).m0() - 1;
        int i10 = this.f338543b;
        return i10 >= iM0 || (i10 == iM0 && this.f338544c >= 1.0d);
    }

    public String toString() {
        return "LinearLoc[" + this.f338542a + ", " + this.f338543b + ", " + this.f338544c + "]";
    }

    public boolean v(g gVar) {
        if (this.f338542a != gVar.f338542a) {
            return false;
        }
        int i10 = this.f338543b;
        int i11 = gVar.f338543b;
        if (i10 == i11) {
            return true;
        }
        if (i11 - i10 == 1 && gVar.f338544c == 0.0d) {
            return true;
        }
        return i10 - i11 == 1 && this.f338544c == 0.0d;
    }

    public boolean w(n nVar) {
        int i10 = this.f338542a;
        if (i10 >= 0 && i10 < nVar.l0()) {
            v vVar = (v) nVar.h0(this.f338542a);
            int i11 = this.f338543b;
            if (i11 < 0 || i11 > vVar.m0() || (this.f338543b == vVar.m0() && this.f338544c != 0.0d)) {
                return false;
            }
            double d10 = this.f338544c;
            if (d10 >= 0.0d && d10 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    public boolean x() {
        double d10 = this.f338544c;
        return d10 <= 0.0d || d10 >= 1.0d;
    }

    public g(int i10, double d10) {
        this(0, i10, d10);
    }

    public g(int i10, int i11, double d10) {
        this.f338542a = i10;
        this.f338543b = i11;
        this.f338544c = d10;
        z();
    }

    private g(int i10, int i11, double d10, boolean z10) {
        this.f338542a = i10;
        this.f338543b = i11;
        this.f338544c = d10;
        if (z10) {
            z();
        }
    }

    public g(g gVar) {
        this.f338542a = 0;
        this.f338543b = 0;
        this.f338544c = 0.0d;
        this.f338542a = gVar.f338542a;
        this.f338543b = gVar.f338543b;
        this.f338544c = gVar.f338544c;
    }
}
