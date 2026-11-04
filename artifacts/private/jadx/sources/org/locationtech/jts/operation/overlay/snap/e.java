package org.locationtech.jts.operation.overlay.snap;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.j;

/* JADX INFO: loaded from: classes14.dex */
class e extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f338842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f338844i;

    e(double d10, org.locationtech.jts.geom.a[] aVarArr) {
        this.f338844i = false;
        this.f338842g = d10;
        this.f338843h = aVarArr;
    }

    private org.locationtech.jts.geom.a[] n(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        b bVar = new b(aVarArr, this.f338842g);
        bVar.d(this.f338844i);
        return bVar.f(aVarArr2);
    }

    @Override // org.locationtech.jts.geom.util.j
    protected org.locationtech.jts.geom.e e(org.locationtech.jts.geom.e eVar, n nVar) {
        return this.f338241b.D().a(n(eVar.Uf(), this.f338843h));
    }

    e(double d10, org.locationtech.jts.geom.a[] aVarArr, boolean z10) {
        this.f338842g = d10;
        this.f338843h = aVarArr;
        this.f338844i = z10;
    }
}
