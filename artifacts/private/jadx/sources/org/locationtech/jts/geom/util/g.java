package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338237b;

    public static abstract class a implements c {
        @Override // org.locationtech.jts.geom.util.g.c
        public final org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, r rVar) {
            if (nVar instanceof x) {
                return rVar.k(b(nVar.d0(), nVar));
            }
            if (nVar instanceof v) {
                return rVar.h(b(nVar.d0(), nVar));
            }
            if (!(nVar instanceof d0)) {
                return nVar;
            }
            org.locationtech.jts.geom.a[] aVarArrB = b(nVar.d0(), nVar);
            return rVar.v(aVarArrB.length > 0 ? aVarArrB[0] : null);
        }

        public abstract org.locationtech.jts.geom.a[] b(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.n nVar);
    }

    public static abstract class b implements c {
        @Override // org.locationtech.jts.geom.util.g.c
        public final org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, r rVar) {
            if (nVar instanceof x) {
                return rVar.j(b(((x) nVar).S0(), nVar));
            }
            if (nVar instanceof v) {
                return rVar.g(b(((v) nVar).S0(), nVar));
            }
            return nVar instanceof d0 ? rVar.w(b(((d0) nVar).R0(), nVar)) : nVar;
        }

        public abstract org.locationtech.jts.geom.e b(org.locationtech.jts.geom.e eVar, org.locationtech.jts.geom.n nVar);
    }

    public interface c {
        org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, r rVar);
    }

    public static class d implements c {
        @Override // org.locationtech.jts.geom.util.g.c
        public org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, r rVar) {
            return nVar;
        }
    }

    public g() {
        this.f338236a = null;
        this.f338237b = false;
    }

    private org.locationtech.jts.geom.o b(org.locationtech.jts.geom.o oVar, c cVar) {
        org.locationtech.jts.geom.o oVar2 = (org.locationtech.jts.geom.o) cVar.a(oVar, this.f338236a);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < oVar2.l0(); i10++) {
            org.locationtech.jts.geom.n nVarA = a(oVar2.h0(i10), cVar);
            if (nVarA != null && !nVarA.v0()) {
                arrayList.add(nVarA);
            }
        }
        if (oVar2.getClass() == a0.class) {
            return this.f338236a.q((d0[]) arrayList.toArray(new d0[0]));
        }
        if (oVar2.getClass() == z.class) {
            return this.f338236a.m((v[]) arrayList.toArray(new v[0]));
        }
        return oVar2.getClass() == b0.class ? this.f338236a.t((e0[]) arrayList.toArray(new e0[0])) : this.f338236a.e((org.locationtech.jts.geom.n[]) arrayList.toArray(new org.locationtech.jts.geom.n[0]));
    }

    private org.locationtech.jts.geom.n c(org.locationtech.jts.geom.n nVar, c cVar) {
        if (this.f338236a == null) {
            this.f338236a = nVar.g0();
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            return b((org.locationtech.jts.geom.o) nVar, cVar);
        }
        if (nVar instanceof e0) {
            return d((e0) nVar, cVar);
        }
        if (!(nVar instanceof d0) && !(nVar instanceof v)) {
            org.locationtech.jts.util.a.f("Unsupported Geometry class: " + nVar.getClass().getName());
            return null;
        }
        return cVar.a(nVar, this.f338236a);
    }

    private e0 d(e0 e0Var, c cVar) {
        e0 e0VarY = (e0) cVar.a(e0Var, this.f338236a);
        if (e0VarY == null) {
            e0VarY = this.f338236a.y();
        }
        if (e0VarY.v0()) {
            return e0VarY;
        }
        x xVar = (x) a(e0VarY.R0(), cVar);
        if (xVar == null || xVar.v0()) {
            return this.f338236a.y();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < e0VarY.T0(); i10++) {
            x xVar2 = (x) a(e0VarY.S0(i10), cVar);
            if (xVar2 != null && !xVar2.v0()) {
                arrayList.add(xVar2);
            }
        }
        return this.f338236a.B(xVar, (x[]) arrayList.toArray(new x[0]));
    }

    public org.locationtech.jts.geom.n a(org.locationtech.jts.geom.n nVar, c cVar) {
        if (nVar == null) {
            return null;
        }
        org.locationtech.jts.geom.n nVarC = c(nVar, cVar);
        if (this.f338237b) {
            nVarC.J0(nVar.q0());
        }
        return nVarC;
    }

    public void e(boolean z10) {
        this.f338237b = z10;
    }

    public g(r rVar) {
        this.f338237b = false;
        this.f338236a = rVar;
    }
}
