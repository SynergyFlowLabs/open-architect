package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338017b = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338018c = null;

    public l(org.locationtech.jts.geom.n nVar) {
        this.f338016a = nVar.a0().c0();
        d(nVar);
        if (this.f338018c == null) {
            b(nVar);
        }
    }

    private void a(org.locationtech.jts.geom.a aVar) {
        double dL = aVar.l(this.f338016a);
        if (dL < this.f338017b) {
            this.f338018c = new org.locationtech.jts.geom.a(aVar);
            this.f338017b = dL;
        }
    }

    private void b(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof org.locationtech.jts.geom.v) {
            c(nVar.d0());
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            org.locationtech.jts.geom.o oVar = (org.locationtech.jts.geom.o) nVar;
            for (int i10 = 0; i10 < oVar.l0(); i10++) {
                b(oVar.h0(i10));
            }
        }
    }

    private void c(org.locationtech.jts.geom.a[] aVarArr) {
        a(aVarArr[0]);
        a(aVarArr[aVarArr.length - 1]);
    }

    private void d(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof org.locationtech.jts.geom.v) {
            e(nVar.d0());
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            org.locationtech.jts.geom.o oVar = (org.locationtech.jts.geom.o) nVar;
            for (int i10 = 0; i10 < oVar.l0(); i10++) {
                d(oVar.h0(i10));
            }
        }
    }

    private void e(org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 1; i10 < aVarArr.length - 1; i10++) {
            a(aVarArr[i10]);
        }
    }

    public org.locationtech.jts.geom.a f() {
        return this.f338018c;
    }
}
