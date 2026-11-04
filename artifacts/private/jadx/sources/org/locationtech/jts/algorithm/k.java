package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.e0;

/* JADX INFO: loaded from: classes14.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.r f338009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338010b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338011c = 0.0d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e0 f338012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f338013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f338014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private double f338015d;

        public a(e0 e0Var) {
            this.f338014c = Double.MAX_VALUE;
            this.f338015d = -1.7976931348623157E308d;
            this.f338012a = e0Var;
            this.f338014c = e0Var.f0().I();
            double dM = e0Var.f0().M();
            this.f338015d = dM;
            this.f338013b = k.d(dM, this.f338014c);
        }

        public static double b(e0 e0Var) {
            return new a(e0Var).a();
        }

        private void c(org.locationtech.jts.geom.v vVar) {
            org.locationtech.jts.geom.e eVarS0 = vVar.S0();
            for (int i10 = 0; i10 < eVarS0.size(); i10++) {
                d(eVarS0.I3(i10));
            }
        }

        private void d(double d10) {
            double d11 = this.f338013b;
            if (d10 <= d11) {
                if (d10 > this.f338015d) {
                    this.f338015d = d10;
                }
            } else if (d10 > d11 && d10 < this.f338014c) {
                this.f338014c = d10;
            }
        }

        public double a() {
            c(this.f338012a.R0());
            for (int i10 = 0; i10 < this.f338012a.T0(); i10++) {
                c(this.f338012a.S0(i10));
            }
            return k.d(this.f338014c, this.f338015d);
        }
    }

    public k(org.locationtech.jts.geom.n nVar) {
        this.f338009a = nVar.g0();
        b(nVar);
    }

    private void b(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof e0) {
            c(nVar);
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            org.locationtech.jts.geom.o oVar = (org.locationtech.jts.geom.o) nVar;
            for (int i10 = 0; i10 < oVar.l0(); i10++) {
                b(oVar.h0(i10));
            }
        }
    }

    private void c(org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.geom.a aVarE;
        if (nVar.v0()) {
            return;
        }
        org.locationtech.jts.geom.v vVarG = g(nVar);
        double dN = 0.0d;
        if (vVarG.k0() == 0.0d) {
            aVarE = vVarG.c0();
        } else {
            org.locationtech.jts.geom.n nVarH = h(vVarG.t0(nVar));
            dN = nVarH.f0().N();
            aVarE = e(nVarH.f0());
        }
        if (this.f338010b == null || dN > this.f338011c) {
            this.f338010b = aVarE;
            this.f338011c = dN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double d(double d10, double d11) {
        return (d10 + d11) / 2.0d;
    }

    public static org.locationtech.jts.geom.a e(org.locationtech.jts.geom.m mVar) {
        return new org.locationtech.jts.geom.a(d(mVar.L(), mVar.H()), d(mVar.M(), mVar.I()));
    }

    private org.locationtech.jts.geom.n h(org.locationtech.jts.geom.n nVar) {
        return !(nVar instanceof org.locationtech.jts.geom.o) ? nVar : i((org.locationtech.jts.geom.o) nVar);
    }

    private org.locationtech.jts.geom.n i(org.locationtech.jts.geom.o oVar) {
        if (oVar.v0()) {
            return oVar;
        }
        org.locationtech.jts.geom.n nVarH0 = oVar.h0(0);
        for (int i10 = 1; i10 < oVar.l0(); i10++) {
            if (oVar.h0(i10).f0().N() > nVarH0.f0().N()) {
                nVarH0 = oVar.h0(i10);
            }
        }
        return nVarH0;
    }

    public org.locationtech.jts.geom.a f() {
        return this.f338010b;
    }

    protected org.locationtech.jts.geom.v g(org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.geom.m mVarF0 = nVar.f0();
        double dB = a.b((e0) nVar);
        return this.f338009a.h(new org.locationtech.jts.geom.a[]{new org.locationtech.jts.geom.a(mVarF0.L(), dB), new org.locationtech.jts.geom.a(mVarF0.H(), dB)});
    }
}
