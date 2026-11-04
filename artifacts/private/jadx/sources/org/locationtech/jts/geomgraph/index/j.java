package org.locationtech.jts.geomgraph.index;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    org.locationtech.jts.geomgraph.d f338335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    org.locationtech.jts.geom.a[] f338336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f338337c;

    public j(org.locationtech.jts.geomgraph.d dVar, int i10) {
        this.f338335a = dVar;
        this.f338337c = i10;
        this.f338336b = dVar.r();
    }

    public void a(j jVar, e eVar) {
        eVar.a(this.f338335a, this.f338337c, jVar.f338335a, jVar.f338337c);
    }

    public double b() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338336b;
        int i10 = this.f338337c;
        double d10 = aVarArr[i10].f338092a;
        double d11 = aVarArr[i10 + 1].f338092a;
        return d10 > d11 ? d10 : d11;
    }

    public double c() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338336b;
        int i10 = this.f338337c;
        double d10 = aVarArr[i10].f338092a;
        double d11 = aVarArr[i10 + 1].f338092a;
        return d10 < d11 ? d10 : d11;
    }
}
