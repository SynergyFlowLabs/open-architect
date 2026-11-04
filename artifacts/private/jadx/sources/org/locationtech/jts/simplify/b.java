package org.locationtech.jts.simplify;

import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f339005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f339006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f339007c = true;

    static class a extends org.locationtech.jts.geom.util.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f339008g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private double f339009h;

        public a(boolean z10, double d10) {
            this.f339008g = z10;
            this.f339009h = d10;
        }

        private n n(n nVar) {
            return this.f339008g ? nVar.f(0.0d) : nVar;
        }

        @Override // org.locationtech.jts.geom.util.j
        protected org.locationtech.jts.geom.e e(org.locationtech.jts.geom.e eVar, n nVar) {
            org.locationtech.jts.geom.a[] aVarArrUf = eVar.Uf();
            return this.f338241b.D().a(aVarArrUf.length == 0 ? new org.locationtech.jts.geom.a[0] : org.locationtech.jts.simplify.a.c(aVarArrUf, this.f339009h));
        }

        @Override // org.locationtech.jts.geom.util.j
        protected n h(x xVar, n nVar) {
            boolean z10 = nVar instanceof e0;
            n nVarH = super.h(xVar, nVar);
            if (z10 && !(nVarH instanceof x)) {
                nVarH = null;
            }
            return nVarH;
        }

        @Override // org.locationtech.jts.geom.util.j
        protected n k(b0 b0Var, n nVar) {
            return n(super.k(b0Var, nVar));
        }

        @Override // org.locationtech.jts.geom.util.j
        protected n m(e0 e0Var, n nVar) {
            if (e0Var.v0()) {
                return null;
            }
            n nVarM = super.m(e0Var, nVar);
            return nVar instanceof b0 ? nVarM : n(nVarM);
        }
    }

    public b(n nVar) {
        this.f339005a = nVar;
    }

    public static n d(n nVar, double d10) {
        b bVar = new b(nVar);
        bVar.b(d10);
        return bVar.a();
    }

    public n a() {
        return this.f339005a.v0() ? this.f339005a.w() : new a(this.f339007c, this.f339006b).d(this.f339005a);
    }

    public void b(double d10) {
        if (d10 < 0.0d) {
            throw new IllegalArgumentException("Tolerance must be non-negative");
        }
        this.f339006b = d10;
    }

    public void c(boolean z10) {
        this.f339007c = z10;
    }
}
