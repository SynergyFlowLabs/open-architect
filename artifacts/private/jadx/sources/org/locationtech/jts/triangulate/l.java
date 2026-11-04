package org.locationtech.jts.triangulate;

import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f339075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f339076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f339077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f339078d = 0.0d;

    public l(u uVar) {
        this.f339075a = uVar;
        this.f339076b = uVar.t();
    }

    private double a(double d10) {
        double d11 = this.f339078d;
        return d10 < d11 ? d11 : d10;
    }

    private static org.locationtech.jts.geom.a c(u uVar, double d10) {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        org.locationtech.jts.geom.a aVar2 = uVar.f338212b;
        double d11 = aVar2.f338092a;
        org.locationtech.jts.geom.a aVar3 = uVar.f338211a;
        aVar.f338092a = d11 - ((d11 - aVar3.f338092a) * d10);
        double d12 = aVar2.f338093b;
        aVar.f338093b = d12 - (d10 * (d12 - aVar3.f338093b));
        return aVar;
    }

    public org.locationtech.jts.geom.a b() {
        return this.f339077c;
    }

    public void d(double d10) {
        this.f339078d = d10;
    }

    public void e(double d10, org.locationtech.jts.geom.a aVar) {
        double dA = a(d10) / this.f339076b;
        if (aVar.p(this.f339075a.f338211a)) {
            this.f339077c = this.f339075a.S(dA);
        } else {
            this.f339077c = c(this.f339075a, dA);
        }
    }

    public void f(org.locationtech.jts.geom.a aVar) {
        double d10 = this.f339078d / this.f339076b;
        if (aVar.l(this.f339075a.f338211a) < this.f339078d) {
            this.f339077c = this.f339075a.S(d10);
        } else if (aVar.l(this.f339075a.f338212b) < this.f339078d) {
            this.f339077c = c(this.f339075a, d10);
        } else {
            this.f339077c = aVar;
        }
    }
}
