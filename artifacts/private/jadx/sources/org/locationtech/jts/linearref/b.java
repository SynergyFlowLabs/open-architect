package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338528a;

    public b(n nVar) {
        this.f338528a = nVar;
    }

    public static double b(n nVar, org.locationtech.jts.geom.a aVar) {
        return new b(nVar).a(aVar);
    }

    public static double d(n nVar, org.locationtech.jts.geom.a aVar, double d10) {
        return new b(nVar).c(aVar, d10);
    }

    private double e(org.locationtech.jts.geom.a aVar, double d10) {
        u uVar = new u();
        f fVar = new f(this.f338528a);
        double d11 = Double.MAX_VALUE;
        double dT = 0.0d;
        double d12 = d10;
        while (fVar.f()) {
            if (!fVar.g()) {
                uVar.f338211a = fVar.d();
                uVar.f338212b = fVar.c();
                double dO = uVar.o(aVar);
                double dF = f(uVar, aVar, dT);
                if (dO < d11 && dF > d10) {
                    d11 = dO;
                    d12 = dF;
                }
                dT += uVar.t();
            }
            fVar.i();
        }
        return d12;
    }

    private double f(u uVar, org.locationtech.jts.geom.a aVar, double d10) {
        double dW = uVar.W(aVar);
        if (dW <= 0.0d) {
            return d10;
        }
        return dW <= 1.0d ? d10 + (dW * uVar.t()) : d10 + uVar.t();
    }

    public double a(org.locationtech.jts.geom.a aVar) {
        return e(aVar, -1.0d);
    }

    public double c(org.locationtech.jts.geom.a aVar, double d10) {
        if (d10 < 0.0d) {
            return a(aVar);
        }
        double dK0 = this.f338528a.k0();
        if (dK0 < d10) {
            return dK0;
        }
        double dE = e(aVar, d10);
        org.locationtech.jts.util.a.d(dE >= d10, "computed index is before specified minimum index");
        return dE;
    }
}
