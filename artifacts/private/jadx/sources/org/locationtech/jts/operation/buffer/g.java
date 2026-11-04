package org.locationtech.jts.operation.buffer;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.b0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.j0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;
import org.locationtech.jts.geom.z;
import org.locationtech.jts.geomgraph.s;
import org.locationtech.jts.noding.m;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f338720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f338721d = new ArrayList();

    public g(n nVar, double d10, f fVar) {
        this.f338718a = nVar;
        this.f338719b = d10;
        this.f338720c = fVar;
    }

    private void a(n nVar) {
        if (nVar.v0()) {
            return;
        }
        if (nVar instanceof e0) {
            f((e0) nVar);
            return;
        }
        if (nVar instanceof v) {
            d((v) nVar);
            return;
        }
        if (nVar instanceof d0) {
            e((d0) nVar);
            return;
        }
        if (nVar instanceof a0) {
            b((a0) nVar);
            return;
        }
        if (nVar instanceof z) {
            b((z) nVar);
        } else if (nVar instanceof b0) {
            b((b0) nVar);
        } else {
            if (!(nVar instanceof o)) {
                throw new UnsupportedOperationException(nVar.getClass().getName());
            }
            b((o) nVar);
        }
    }

    private void b(o oVar) {
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            a(oVar.h0(i10));
        }
    }

    private void c(org.locationtech.jts.geom.a[] aVarArr, int i10, int i11) {
        if (aVarArr == null || aVarArr.length < 2) {
            return;
        }
        int i12 = 4 >> 1;
        this.f338721d.add(new m(aVarArr, new org.locationtech.jts.geomgraph.n(0, 1, i10, i11)));
    }

    private void d(v vVar) {
        if (this.f338719b > 0.0d || this.f338720c.g().g()) {
            c(this.f338720c.h(org.locationtech.jts.geom.b.s(vVar.d0()), this.f338719b), 2, 0);
        }
    }

    private void e(d0 d0Var) {
        if (this.f338719b <= 0.0d) {
            return;
        }
        c(this.f338720c.h(d0Var.d0(), this.f338719b), 2, 0);
    }

    private void f(e0 e0Var) {
        int i10;
        double d10 = this.f338719b;
        if (d10 < 0.0d) {
            d10 = -d10;
            i10 = 2;
        } else {
            i10 = 1;
        }
        double d11 = d10;
        int i11 = i10;
        x xVar = (x) e0Var.R0();
        org.locationtech.jts.geom.a[] aVarArrS = org.locationtech.jts.geom.b.s(xVar.d0());
        double d12 = this.f338719b;
        if (d12 >= 0.0d || !i(xVar, d12)) {
            if (this.f338719b > 0.0d || aVarArrS.length >= 3) {
                g(aVarArrS, d11, i11, 2, 0);
                for (int i12 = 0; i12 < e0Var.T0(); i12++) {
                    x xVar2 = (x) e0Var.S0(i12);
                    org.locationtech.jts.geom.a[] aVarArrS2 = org.locationtech.jts.geom.b.s(xVar2.d0());
                    double d13 = this.f338719b;
                    if (d13 <= 0.0d || !i(xVar2, -d13)) {
                        g(aVarArrS2, d11, s.a(i11), 0, 2);
                    }
                }
            }
        }
    }

    private void g(org.locationtech.jts.geom.a[] aVarArr, double d10, int i10, int i11, int i12) {
        if (d10 != 0.0d || aVarArr.length >= 4) {
            if (aVarArr.length >= 4 && org.locationtech.jts.algorithm.s.b(aVarArr)) {
                i10 = s.a(i10);
                i12 = i11;
                i11 = i12;
            }
            c(this.f338720c.j(aVarArr, i10, d10), i11, i12);
        }
    }

    private boolean i(x xVar, double d10) {
        org.locationtech.jts.geom.a[] aVarArrD0 = xVar.d0();
        if (aVarArrD0.length < 4) {
            return d10 < 0.0d;
        }
        if (aVarArrD0.length == 4) {
            return j(aVarArrD0, d10);
        }
        org.locationtech.jts.geom.m mVarF0 = xVar.f0();
        return d10 < 0.0d && Math.abs(d10) * 2.0d > Math.min(mVarF0.E(), mVarF0.N());
    }

    private boolean j(org.locationtech.jts.geom.a[] aVarArr, double d10) {
        int i10 = 3 >> 2;
        j0 j0Var = new j0(aVarArr[0], aVarArr[1], aVarArr[2]);
        return org.locationtech.jts.algorithm.i.b(j0Var.k(), j0Var.f338146a, j0Var.f338147b) < Math.abs(d10);
    }

    public List h() {
        a(this.f338718a);
        return this.f338721d;
    }
}
