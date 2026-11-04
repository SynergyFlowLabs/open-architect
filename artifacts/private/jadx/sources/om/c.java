package om;

import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f335156a = {new org.locationtech.jts.geom.a(), new org.locationtech.jts.geom.a()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f335157b = Double.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335158c = true;

    private void f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10) {
        this.f335156a[0].v(aVar);
        this.f335156a[1].v(aVar2);
        this.f335157b = d10;
        this.f335158c = false;
    }

    public org.locationtech.jts.geom.a a(int i10) {
        return this.f335156a[i10];
    }

    public org.locationtech.jts.geom.a[] b() {
        return this.f335156a;
    }

    public double c() {
        return this.f335157b;
    }

    public void d() {
        this.f335158c = true;
    }

    public void e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this.f335156a[0].v(aVar);
        this.f335156a[1].v(aVar2);
        this.f335157b = aVar.l(aVar2);
        this.f335158c = false;
    }

    public void g(c cVar) {
        org.locationtech.jts.geom.a[] aVarArr = cVar.f335156a;
        h(aVarArr[0], aVarArr[1]);
    }

    public void h(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (this.f335158c) {
            e(aVar, aVar2);
            return;
        }
        double dL = aVar.l(aVar2);
        if (dL > this.f335157b) {
            f(aVar, aVar2, dL);
        }
    }

    public void i(c cVar) {
        org.locationtech.jts.geom.a[] aVarArr = cVar.f335156a;
        j(aVarArr[0], aVarArr[1]);
    }

    public void j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (this.f335158c) {
            e(aVar, aVar2);
            return;
        }
        double dL = aVar.l(aVar2);
        if (dL < this.f335157b) {
            f(aVar, aVar2, dL);
        }
    }

    public String toString() {
        org.locationtech.jts.geom.a[] aVarArr = this.f335156a;
        return o.A(aVarArr[0], aVarArr[1]);
    }
}
