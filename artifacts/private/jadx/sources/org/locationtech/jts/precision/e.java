package org.locationtech.jts.precision;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    public static n a(n nVar, double d10) {
        try {
            return nVar.f(d10);
        } catch (RuntimeException e10) {
            try {
                n nVarA = new b(true).a(nVar, d10);
                if (nVarA.A0()) {
                    return nVarA;
                }
                throw e10;
            } catch (RuntimeException unused) {
                throw e10;
            }
        }
    }

    public static n b(n nVar, n nVar2) {
        try {
            return nVar.H(nVar2);
        } catch (RuntimeException e10) {
            try {
                n nVarC = new b(true).c(nVar, nVar2);
                if (nVarC.A0()) {
                    return nVarC;
                }
                throw e10;
            } catch (RuntimeException unused) {
                throw e10;
            }
        }
    }

    public static n c(n nVar, n nVar2) {
        try {
            return nVar.t0(nVar2);
        } catch (RuntimeException e10) {
            try {
                n nVarD = new b(true).d(nVar, nVar2);
                if (nVarD.A0()) {
                    return nVarD;
                }
                throw e10;
            } catch (RuntimeException unused) {
                throw e10;
            }
        }
    }

    public static n d(n nVar, n nVar2) {
        try {
            return nVar.K0(nVar2);
        } catch (RuntimeException e10) {
            try {
                n nVarG = new b(true).g(nVar, nVar2);
                if (nVarG.A0()) {
                    return nVarG;
                }
                throw e10;
            } catch (RuntimeException unused) {
                throw e10;
            }
        }
    }

    public static n e(n nVar, n nVar2) {
        try {
            return nVar.O0(nVar2);
        } catch (RuntimeException e10) {
            try {
                n nVarH = new b(true).h(nVar, nVar2);
                if (nVarH.A0()) {
                    return nVarH;
                }
                throw e10;
            } catch (RuntimeException unused) {
                throw e10;
            }
        }
    }
}
