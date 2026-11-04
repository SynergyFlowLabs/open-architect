package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f338057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338059c;

    public u() {
        this.f338057a = c.f337987e;
    }

    private void a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof d0) {
            h(g(aVar, (d0) nVar));
        }
        if (nVar instanceof org.locationtech.jts.geom.v) {
            h(f(aVar, (org.locationtech.jts.geom.v) nVar));
            return;
        }
        if (nVar instanceof e0) {
            h(d(aVar, (e0) nVar));
            return;
        }
        int i10 = 0;
        if (nVar instanceof z) {
            z zVar = (z) nVar;
            while (i10 < zVar.l0()) {
                h(f(aVar, (org.locationtech.jts.geom.v) zVar.h0(i10)));
                i10++;
            }
            return;
        }
        if (nVar instanceof b0) {
            b0 b0Var = (b0) nVar;
            while (i10 < b0Var.l0()) {
                h(d(aVar, (e0) b0Var.h0(i10)));
                i10++;
            }
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            org.locationtech.jts.geom.p pVar = new org.locationtech.jts.geom.p((org.locationtech.jts.geom.o) nVar);
            while (pVar.hasNext()) {
                org.locationtech.jts.geom.n nVar2 = (org.locationtech.jts.geom.n) pVar.next();
                if (nVar2 != nVar) {
                    a(aVar, nVar2);
                }
            }
        }
    }

    private int d(org.locationtech.jts.geom.a aVar, e0 e0Var) {
        int iE;
        if (e0Var.v0() || (iE = e(aVar, (org.locationtech.jts.geom.x) e0Var.R0())) == 2) {
            return 2;
        }
        if (iE == 1) {
            return 1;
        }
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            int iE2 = e(aVar, (org.locationtech.jts.geom.x) e0Var.S0(i10));
            if (iE2 == 0) {
                return 2;
            }
            if (iE2 == 1) {
                return 1;
            }
        }
        return 0;
    }

    private int e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.x xVar) {
        if (xVar.f0().X(aVar)) {
            return t.d(aVar, xVar.d0());
        }
        return 2;
    }

    private int f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.v vVar) {
        if (!vVar.f0().X(aVar)) {
            return 2;
        }
        org.locationtech.jts.geom.e eVarS0 = vVar.S0();
        if (vVar.X0() || !(aVar.equals(eVarS0.w4(0)) || aVar.equals(eVarS0.w4(eVarS0.size() - 1)))) {
            return t.b(aVar, eVarS0) ? 0 : 2;
        }
        return 1;
    }

    private int g(org.locationtech.jts.geom.a aVar, d0 d0Var) {
        return d0Var.c0().p(aVar) ? 0 : 2;
    }

    private void h(int i10) {
        if (i10 == 0) {
            this.f338058b = true;
        }
        if (i10 == 1) {
            this.f338059c++;
        }
    }

    public boolean b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.n nVar) {
        return c(aVar, nVar) != 2;
    }

    public int c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.n nVar) {
        if (nVar.v0()) {
            return 2;
        }
        if (nVar instanceof org.locationtech.jts.geom.v) {
            return f(aVar, (org.locationtech.jts.geom.v) nVar);
        }
        if (nVar instanceof e0) {
            return d(aVar, (e0) nVar);
        }
        this.f338058b = false;
        this.f338059c = 0;
        a(aVar, nVar);
        if (this.f338057a.a(this.f338059c)) {
            return 1;
        }
        return (this.f338059c > 0 || this.f338058b) ? 0 : 2;
    }

    public u(c cVar) {
        this.f338057a = c.f337987e;
        if (cVar != null) {
            this.f338057a = cVar;
            return;
        }
        throw new IllegalArgumentException("Rule must be non-null");
    }
}
