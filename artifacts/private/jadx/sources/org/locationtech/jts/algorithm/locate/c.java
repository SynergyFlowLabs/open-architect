package org.locationtech.jts.algorithm.locate;

import org.locationtech.jts.algorithm.t;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.p;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338022a;

    public c(n nVar) {
        this.f338022a = nVar;
    }

    public static boolean b(org.locationtech.jts.geom.a aVar, e0 e0Var) {
        return 2 != e(aVar, e0Var);
    }

    public static int c(org.locationtech.jts.geom.a aVar, n nVar) {
        if (nVar.v0()) {
            return 2;
        }
        return d(aVar, nVar);
    }

    private static int d(org.locationtech.jts.geom.a aVar, n nVar) {
        int iD;
        if (nVar instanceof e0) {
            return e(aVar, (e0) nVar);
        }
        if (nVar instanceof o) {
            p pVar = new p((o) nVar);
            while (pVar.hasNext()) {
                n nVar2 = (n) pVar.next();
                if (nVar2 != nVar && (iD = d(aVar, nVar2)) != 2) {
                    return iD;
                }
            }
        }
        return 2;
    }

    public static int e(org.locationtech.jts.geom.a aVar, e0 e0Var) {
        if (e0Var.v0()) {
            return 2;
        }
        int iF = f(aVar, (x) e0Var.R0());
        if (iF != 0) {
            return iF;
        }
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            int iF2 = f(aVar, (x) e0Var.S0(i10));
            int i11 = 4 & 1;
            if (iF2 == 1) {
                return 1;
            }
            if (iF2 == 0) {
                return 2;
            }
        }
        return 0;
    }

    private static int f(org.locationtech.jts.geom.a aVar, x xVar) {
        if (xVar.f0().X(aVar)) {
            return t.d(aVar, xVar.d0());
        }
        return 2;
    }

    @Override // org.locationtech.jts.algorithm.locate.b
    public int a(org.locationtech.jts.geom.a aVar) {
        return c(aVar, this.f338022a);
    }
}
