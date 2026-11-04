package org.locationtech.jts.operation.predicate;

import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f338894a;

    public c(e0 e0Var) {
        this.f338894a = e0Var.f0();
    }

    public static boolean b(e0 e0Var, n nVar) {
        return new c(e0Var).a(nVar);
    }

    private boolean c(n nVar) {
        if (nVar instanceof e0) {
            return false;
        }
        if (nVar instanceof d0) {
            return g((d0) nVar);
        }
        if (nVar instanceof v) {
            return e((v) nVar);
        }
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            if (!c(nVar.h0(i10))) {
                return false;
            }
        }
        return true;
    }

    private boolean d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (aVar.equals(aVar2)) {
            return f(aVar);
        }
        double d10 = aVar.f338092a;
        if (d10 != aVar2.f338092a) {
            double d11 = aVar.f338093b;
            if (d11 == aVar2.f338093b && (d11 == this.f338894a.M() || aVar.f338093b == this.f338894a.I())) {
                return true;
            }
        } else if (d10 == this.f338894a.L() || aVar.f338092a == this.f338894a.H()) {
            return true;
        }
        return false;
    }

    private boolean e(v vVar) {
        org.locationtech.jts.geom.e eVarS0 = vVar.S0();
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar2 = new org.locationtech.jts.geom.a();
        int i10 = 0;
        while (i10 < eVarS0.size() - 1) {
            eVarS0.Ob(i10, aVar);
            i10++;
            eVarS0.Ob(i10, aVar2);
            if (!d(aVar, aVar2)) {
                return false;
            }
        }
        return true;
    }

    private boolean f(org.locationtech.jts.geom.a aVar) {
        return aVar.f338092a == this.f338894a.L() || aVar.f338092a == this.f338894a.H() || aVar.f338093b == this.f338894a.M() || aVar.f338093b == this.f338894a.I();
    }

    private boolean g(d0 d0Var) {
        return f(d0Var.c0());
    }

    public boolean a(n nVar) {
        return this.f338894a.o(nVar.f0()) && !c(nVar);
    }
}
