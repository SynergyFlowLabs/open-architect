package org.locationtech.jts.algorithm;

import org.locationtech.jts.geom.d0;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f338024b = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338025c = null;

    public m(org.locationtech.jts.geom.n nVar) {
        this.f338023a = nVar.a0().c0();
        b(nVar);
    }

    private void a(org.locationtech.jts.geom.a aVar) {
        double dL = aVar.l(this.f338023a);
        if (dL < this.f338024b) {
            this.f338025c = new org.locationtech.jts.geom.a(aVar);
            this.f338024b = dL;
        }
    }

    private void b(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof d0) {
            a(nVar.c0());
            return;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            org.locationtech.jts.geom.o oVar = (org.locationtech.jts.geom.o) nVar;
            for (int i10 = 0; i10 < oVar.l0(); i10++) {
                b(oVar.h0(i10));
            }
        }
    }

    public org.locationtech.jts.geom.a c() {
        return this.f338025c;
    }
}
