package um;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f381311a = {new org.locationtech.jts.geom.a(), new org.locationtech.jts.geom.a()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f381312b = Double.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f381313c = true;

    private void f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10) {
        this.f381311a[0].v(aVar);
        this.f381311a[1].v(aVar2);
        this.f381312b = d10;
        this.f381313c = false;
    }

    public org.locationtech.jts.geom.a a(int i10) {
        return this.f381311a[i10];
    }

    public org.locationtech.jts.geom.a[] b() {
        return this.f381311a;
    }

    public double c() {
        return this.f381312b;
    }

    public void d() {
        this.f381313c = true;
    }

    public void e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this.f381311a[0].v(aVar);
        this.f381311a[1].v(aVar2);
        this.f381312b = aVar.l(aVar2);
        this.f381313c = false;
    }

    public void g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (this.f381313c) {
            e(aVar, aVar2);
            return;
        }
        double dL = aVar.l(aVar2);
        if (dL > this.f381312b) {
            f(aVar, aVar2, dL);
        }
    }

    public void h(e eVar) {
        org.locationtech.jts.geom.a[] aVarArr = eVar.f381311a;
        g(aVarArr[0], aVarArr[1]);
    }

    public void i(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (this.f381313c) {
            e(aVar, aVar2);
            return;
        }
        double dL = aVar.l(aVar2);
        if (dL < this.f381312b) {
            f(aVar, aVar2, dL);
        }
    }

    public void j(e eVar) {
        org.locationtech.jts.geom.a[] aVarArr = eVar.f381311a;
        i(aVarArr[0], aVarArr[1]);
    }
}
