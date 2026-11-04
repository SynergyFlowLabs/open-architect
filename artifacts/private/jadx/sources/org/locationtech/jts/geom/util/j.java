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
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.n f338240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected r f338241b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338242c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f338243d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338244e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f338245f = false;

    protected final org.locationtech.jts.geom.e a(org.locationtech.jts.geom.e eVar) {
        return eVar.copy();
    }

    protected final org.locationtech.jts.geom.e b(org.locationtech.jts.geom.a[] aVarArr) {
        return this.f338241b.D().a(aVarArr);
    }

    public org.locationtech.jts.geom.n c() {
        return this.f338240a;
    }

    public final org.locationtech.jts.geom.n d(org.locationtech.jts.geom.n nVar) {
        this.f338240a = nVar;
        this.f338241b = nVar.g0();
        if (nVar instanceof d0) {
            return l((d0) nVar, null);
        }
        if (nVar instanceof a0) {
            return j((a0) nVar, null);
        }
        if (nVar instanceof x) {
            return h((x) nVar, null);
        }
        if (nVar instanceof v) {
            return g((v) nVar, null);
        }
        if (nVar instanceof z) {
            return i((z) nVar, null);
        }
        if (nVar instanceof e0) {
            return m((e0) nVar, null);
        }
        if (nVar instanceof b0) {
            return k((b0) nVar, null);
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            return f((org.locationtech.jts.geom.o) nVar, null);
        }
        throw new IllegalArgumentException("Unknown Geometry subtype: " + nVar.getClass().getName());
    }

    protected org.locationtech.jts.geom.e e(org.locationtech.jts.geom.e eVar, org.locationtech.jts.geom.n nVar) {
        return a(eVar);
    }

    protected org.locationtech.jts.geom.n f(org.locationtech.jts.geom.o oVar, org.locationtech.jts.geom.n nVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarD = d(oVar.h0(i10));
            if (nVarD != null && (!this.f338242c || !nVarD.v0())) {
                arrayList.add(nVarD);
            }
        }
        return this.f338243d ? this.f338241b.e(r.I(arrayList)) : this.f338241b.b(arrayList);
    }

    protected org.locationtech.jts.geom.n g(v vVar, org.locationtech.jts.geom.n nVar) {
        return this.f338241b.g(e(vVar.S0(), vVar));
    }

    protected org.locationtech.jts.geom.n h(x xVar, org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.geom.e eVarE = e(xVar.S0(), xVar);
        if (eVarE == null) {
            return this.f338241b.j(null);
        }
        int size = eVarE.size();
        return (size <= 0 || size >= 4 || this.f338245f) ? this.f338241b.j(eVarE) : this.f338241b.g(eVarE);
    }

    protected org.locationtech.jts.geom.n i(z zVar, org.locationtech.jts.geom.n nVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < zVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarG = g((v) zVar.h0(i10), zVar);
            if (nVarG != null && !nVarG.v0()) {
                arrayList.add(nVarG);
            }
        }
        return this.f338241b.b(arrayList);
    }

    protected org.locationtech.jts.geom.n j(a0 a0Var, org.locationtech.jts.geom.n nVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < a0Var.l0(); i10++) {
            org.locationtech.jts.geom.n nVarL = l((d0) a0Var.h0(i10), a0Var);
            if (nVarL != null && !nVarL.v0()) {
                arrayList.add(nVarL);
            }
        }
        return this.f338241b.b(arrayList);
    }

    protected org.locationtech.jts.geom.n k(b0 b0Var, org.locationtech.jts.geom.n nVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b0Var.l0(); i10++) {
            org.locationtech.jts.geom.n nVarM = m((e0) b0Var.h0(i10), b0Var);
            if (nVarM != null && !nVarM.v0()) {
                arrayList.add(nVarM);
            }
        }
        return this.f338241b.b(arrayList);
    }

    protected org.locationtech.jts.geom.n l(d0 d0Var, org.locationtech.jts.geom.n nVar) {
        return this.f338241b.w(e(d0Var.R0(), d0Var));
    }

    protected org.locationtech.jts.geom.n m(e0 e0Var, org.locationtech.jts.geom.n nVar) {
        org.locationtech.jts.geom.n nVarH = h((x) e0Var.R0(), e0Var);
        boolean z10 = (nVarH == null || !(nVarH instanceof x) || nVarH.v0()) ? false : true;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            org.locationtech.jts.geom.n nVarH2 = h((x) e0Var.S0(i10), e0Var);
            if (nVarH2 != null && !nVarH2.v0()) {
                if (!(nVarH2 instanceof x)) {
                    z10 = false;
                }
                arrayList.add(nVarH2);
            }
        }
        if (z10) {
            return this.f338241b.B((x) nVarH, (x[]) arrayList.toArray(new x[0]));
        }
        ArrayList arrayList2 = new ArrayList();
        if (nVarH != null) {
            arrayList2.add(nVarH);
        }
        arrayList2.addAll(arrayList);
        return this.f338241b.b(arrayList2);
    }
}
