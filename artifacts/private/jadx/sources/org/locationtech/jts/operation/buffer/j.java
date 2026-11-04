package org.locationtech.jts.operation.buffer;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.s;

/* JADX INFO: loaded from: classes14.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f338747a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338748b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.b f338749c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geomgraph.b f338750d = null;

    private void a(org.locationtech.jts.geomgraph.b bVar) {
        org.locationtech.jts.geom.a[] aVarArrR = bVar.p().r();
        for (int i10 = 0; i10 < aVarArrR.length - 1; i10++) {
            org.locationtech.jts.geom.a aVar = this.f338748b;
            if (aVar == null || aVarArrR[i10].f338092a > aVar.f338092a) {
                this.f338749c = bVar;
                this.f338747a = i10;
                this.f338748b = aVarArrR[i10];
            }
        }
    }

    private void c() {
        org.locationtech.jts.geomgraph.b bVarW = ((org.locationtech.jts.geomgraph.c) this.f338749c.r().p()).w();
        this.f338749c = bVarW;
        if (!bVarW.O()) {
            org.locationtech.jts.geomgraph.b bVarN = this.f338749c.N();
            this.f338749c = bVarN;
            this.f338747a = bVarN.p().r().length - 1;
        }
    }

    private void d() {
        org.locationtech.jts.geom.a[] aVarArrR = this.f338749c.p().r();
        int i10 = this.f338747a;
        org.locationtech.jts.util.a.d(i10 > 0 && i10 < aVarArrR.length, "rightmost point expected to be interior vertex of edge");
        int i11 = this.f338747a;
        org.locationtech.jts.geom.a aVar = aVarArrR[i11 - 1];
        org.locationtech.jts.geom.a aVar2 = aVarArrR[i11 + 1];
        int iA = s.a(this.f338748b, aVar2, aVar);
        double d10 = aVar.f338093b;
        double d11 = this.f338748b.f338093b;
        if ((d10 >= d11 || aVar2.f338093b >= d11 || iA != 1) && (d10 <= d11 || aVar2.f338093b <= d11 || iA != -1)) {
            return;
        }
        this.f338747a--;
    }

    private int g(org.locationtech.jts.geomgraph.b bVar, int i10) {
        int iH = h(bVar, i10);
        if (iH < 0) {
            iH = h(bVar, i10 - 1);
        }
        if (iH < 0) {
            this.f338748b = null;
            a(bVar);
        }
        return iH;
    }

    private int h(org.locationtech.jts.geomgraph.b bVar, int i10) {
        int i11;
        org.locationtech.jts.geom.a[] aVarArrR = bVar.p().r();
        if (i10 >= 0 && (i11 = i10 + 1) < aVarArrR.length) {
            double d10 = aVarArrR[i10].f338093b;
            double d11 = aVarArrR[i11].f338093b;
            if (d10 == d11) {
                return -1;
            }
            return d10 < d11 ? 2 : 1;
        }
        return -1;
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) it.next();
            if (bVar.O()) {
                a(bVar);
            }
        }
        org.locationtech.jts.util.a.d(this.f338747a != 0 || this.f338748b.equals(this.f338749c.k()), "inconsistency in rightmost processing");
        if (this.f338747a == 0) {
            c();
        } else {
            d();
        }
        org.locationtech.jts.geomgraph.b bVar2 = this.f338749c;
        this.f338750d = bVar2;
        if (g(bVar2, this.f338747a) == 1) {
            this.f338750d = this.f338749c.N();
        }
    }

    public org.locationtech.jts.geom.a e() {
        return this.f338748b;
    }

    public org.locationtech.jts.geomgraph.b f() {
        return this.f338750d;
    }
}
