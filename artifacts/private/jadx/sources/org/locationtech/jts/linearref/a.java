package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338527a;

    public a(n nVar) {
        this.f338527a = nVar;
    }

    private v a(g gVar, g gVar2) {
        org.locationtech.jts.geom.a[] aVarArrD0 = this.f338527a.d0();
        org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
        int iR = gVar.r();
        if (gVar.q() > 0.0d) {
            iR++;
        }
        int iR2 = gVar2.r();
        if (gVar2.q() == 1.0d) {
            iR2++;
        }
        if (iR2 >= aVarArrD0.length) {
            iR2 = aVarArrD0.length - 1;
        }
        if (!gVar.x()) {
            dVar.d(gVar.n(this.f338527a));
        }
        while (iR <= iR2) {
            dVar.d(aVarArrD0[iR]);
            iR++;
        }
        if (!gVar2.x()) {
            dVar.d(gVar2.n(this.f338527a));
        }
        if (dVar.size() <= 0) {
            dVar.d(gVar.n(this.f338527a));
        }
        org.locationtech.jts.geom.a[] aVarArrUf = dVar.Uf();
        if (aVarArrUf.length <= 1) {
            aVarArrUf = new org.locationtech.jts.geom.a[]{aVarArrUf[0], aVarArrUf[0]};
        }
        return this.f338527a.g0().h(aVarArrUf);
    }

    private n b(g gVar, g gVar2) {
        e eVar = new e(this.f338527a.g0());
        eVar.f(true);
        if (!gVar.x()) {
            eVar.a(gVar.n(this.f338527a));
        }
        f fVar = new f(this.f338527a, gVar);
        while (fVar.f() && gVar2.c(fVar.a(), fVar.e(), 0.0d) >= 0) {
            eVar.a(fVar.d());
            if (fVar.g()) {
                eVar.c();
            }
            fVar.i();
        }
        if (!gVar2.x()) {
            eVar.a(gVar2.n(this.f338527a));
        }
        return eVar.d();
    }

    public static n c(n nVar, g gVar, g gVar2) {
        return new a(nVar).d(gVar, gVar2);
    }

    private n e(n nVar) {
        if (nVar instanceof v) {
            return ((v) nVar).H0();
        }
        if (nVar instanceof z) {
            return ((z) nVar).H0();
        }
        org.locationtech.jts.util.a.f("non-linear geometry encountered");
        return null;
    }

    public n d(g gVar, g gVar2) {
        return gVar2.compareTo(gVar) < 0 ? e(b(gVar2, gVar)) : b(gVar, gVar2);
    }
}
