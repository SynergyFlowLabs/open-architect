package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338546a;

    public i(n nVar) {
        this.f338546a = nVar;
    }

    public static g b(n nVar, org.locationtech.jts.geom.a aVar) {
        return new i(nVar).a(aVar);
    }

    public static g d(n nVar, org.locationtech.jts.geom.a aVar, g gVar) {
        return new i(nVar).c(aVar, gVar);
    }

    private g e(org.locationtech.jts.geom.a aVar, g gVar) {
        u uVar = new u();
        f fVar = new f(this.f338546a);
        int i10 = 0;
        double d10 = -1.0d;
        double d11 = Double.MAX_VALUE;
        int i11 = 0;
        while (fVar.f()) {
            if (!fVar.g()) {
                uVar.f338211a = fVar.d();
                uVar.f338212b = fVar.c();
                double dO = uVar.o(aVar);
                double dY = uVar.Y(aVar);
                int iA = fVar.a();
                int iE = fVar.e();
                if (dO < d11 && (gVar == null || gVar.c(iA, iE, dY) < 0)) {
                    i10 = iA;
                    i11 = iE;
                    d11 = dO;
                    d10 = dY;
                }
            }
            fVar.i();
        }
        return d11 == Double.MAX_VALUE ? new g(gVar) : new g(i10, i11, d10);
    }

    public g a(org.locationtech.jts.geom.a aVar) {
        return e(aVar, null);
    }

    public g c(org.locationtech.jts.geom.a aVar, g gVar) {
        if (gVar == null) {
            return a(aVar);
        }
        g gVarO = g.o(this.f338546a);
        if (gVarO.compareTo(gVar) <= 0) {
            return gVarO;
        }
        g gVarE = e(aVar, gVar);
        org.locationtech.jts.util.a.d(gVarE.compareTo(gVar) >= 0, "computed location is before specified minimum location");
        return gVarE;
    }
}
