package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f338063a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.m f338064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338068f;

    public w(org.locationtech.jts.geom.m mVar) {
        this.f338064b = mVar;
        this.f338065c = new org.locationtech.jts.geom.a(mVar.L(), mVar.M());
        this.f338066d = new org.locationtech.jts.geom.a(mVar.H(), mVar.I());
        this.f338067e = new org.locationtech.jts.geom.a(mVar.L(), mVar.I());
        this.f338068f = new org.locationtech.jts.geom.a(mVar.H(), mVar.M());
    }

    public boolean a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (!this.f338064b.c0(new org.locationtech.jts.geom.m(aVar, aVar2))) {
            return false;
        }
        if (this.f338064b.X(aVar) || this.f338064b.X(aVar2)) {
            return true;
        }
        if (aVar.compareTo(aVar2) <= 0) {
            aVar2 = aVar;
            aVar = aVar2;
        }
        if (aVar.f338093b > aVar2.f338093b) {
            this.f338063a.f(aVar2, aVar, this.f338067e, this.f338068f);
        } else {
            this.f338063a.f(aVar2, aVar, this.f338065c, this.f338066d);
        }
        return this.f338063a.n();
    }
}
