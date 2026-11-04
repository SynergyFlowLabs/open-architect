package org.locationtech.jts.operation.valid;

import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338927a;

    private boolean c(o oVar) {
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            if (b(oVar.h0(i10))) {
                return true;
            }
        }
        return false;
    }

    private boolean d(e0 e0Var) {
        if (e(e0Var.R0().d0())) {
            return true;
        }
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            if (e(e0Var.S0(i10).d0())) {
                return true;
            }
        }
        return false;
    }

    public org.locationtech.jts.geom.a a() {
        return this.f338927a;
    }

    public boolean b(n nVar) {
        if (nVar.v0() || (nVar instanceof d0) || (nVar instanceof a0)) {
            return false;
        }
        if (nVar instanceof v) {
            return e(((v) nVar).d0());
        }
        if (nVar instanceof e0) {
            return d((e0) nVar);
        }
        if (nVar instanceof o) {
            return c((o) nVar);
        }
        throw new UnsupportedOperationException(nVar.getClass().getName());
    }

    public boolean e(org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10 - 1].equals(aVarArr[i10])) {
                this.f338927a = aVarArr[i10];
                return true;
            }
        }
        return false;
    }
}
