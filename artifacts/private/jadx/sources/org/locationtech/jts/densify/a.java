package org.locationtech.jts.densify;

import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.util.j;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338070b;

    /* JADX INFO: renamed from: org.locationtech.jts.densify.a$a, reason: collision with other inner class name */
    static class C2422a extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f338071g;

        C2422a(double d10) {
            this.f338071g = d10;
        }

        private n n(n nVar) {
            return nVar.f(0.0d);
        }

        @Override // org.locationtech.jts.geom.util.j
        protected e e(e eVar, n nVar) {
            org.locationtech.jts.geom.a[] aVarArrC = a.c(eVar.Uf(), this.f338071g, nVar.n0());
            if ((nVar instanceof v) && aVarArrC.length == 1) {
                aVarArrC = new org.locationtech.jts.geom.a[0];
            }
            return this.f338241b.D().a(aVarArrC);
        }

        @Override // org.locationtech.jts.geom.util.j
        protected n k(b0 b0Var, n nVar) {
            return n(super.k(b0Var, nVar));
        }

        @Override // org.locationtech.jts.geom.util.j
        protected n m(e0 e0Var, n nVar) {
            n nVarM = super.m(e0Var, nVar);
            return nVar instanceof b0 ? nVarM : n(nVarM);
        }
    }

    public a(n nVar) {
        this.f338069a = nVar;
    }

    public static n b(n nVar, double d10) {
        a aVar = new a(nVar);
        aVar.e(d10);
        return aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.locationtech.jts.geom.a[] c(org.locationtech.jts.geom.a[] aVarArr, double d10, g0 g0Var) {
        u uVar = new u();
        d dVar = new d();
        int i10 = 0;
        while (true) {
            if (i10 >= aVarArr.length - 1) {
                dVar.i(aVarArr[aVarArr.length - 1], false);
                return dVar.Uf();
            }
            org.locationtech.jts.geom.a aVar = aVarArr[i10];
            uVar.f338211a = aVar;
            i10++;
            uVar.f338212b = aVarArr[i10];
            dVar.i(aVar, false);
            double dT = uVar.t();
            int i11 = ((int) (dT / d10)) + 1;
            if (i11 > 1) {
                double d11 = dT / ((double) i11);
                for (int i12 = 1; i12 < i11; i12++) {
                    org.locationtech.jts.geom.a aVarS = uVar.S((((double) i12) * d11) / dT);
                    g0Var.s(aVarS);
                    dVar.i(aVarS, false);
                }
            }
        }
    }

    public n d() {
        return new C2422a(this.f338070b).d(this.f338069a);
    }

    public void e(double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be positive");
        }
        this.f338070b = d10;
    }
}
