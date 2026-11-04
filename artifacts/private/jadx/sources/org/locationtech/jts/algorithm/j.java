package org.locationtech.jts.algorithm;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f338006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f338007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f338008c;

    public j() {
        this.f338006a = 0.0d;
        this.f338007b = 0.0d;
        this.f338008c = 1.0d;
    }

    public static org.locationtech.jts.geom.a d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) throws r {
        double d10 = aVar.f338093b;
        double d11 = aVar2.f338093b;
        double d12 = d10 - d11;
        double d13 = aVar2.f338092a;
        double d14 = aVar.f338092a;
        double d15 = d13 - d14;
        double d16 = (d14 * d11) - (d13 * d10);
        double d17 = aVar3.f338093b;
        double d18 = aVar4.f338093b;
        double d19 = d17 - d18;
        double d20 = aVar4.f338092a;
        double d21 = aVar3.f338092a;
        double d22 = d20 - d21;
        double d23 = (d21 * d18) - (d20 * d17);
        double d24 = (d15 * d23) - (d22 * d16);
        double d25 = (d16 * d19) - (d23 * d12);
        double d26 = (d12 * d22) - (d19 * d15);
        double d27 = d24 / d26;
        double d28 = d25 / d26;
        if (Double.isNaN(d27) || Double.isInfinite(d27) || Double.isNaN(d28) || Double.isInfinite(d28)) {
            throw new r();
        }
        return new org.locationtech.jts.geom.a(d27, d28);
    }

    public org.locationtech.jts.geom.a a() throws r {
        org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a();
        aVar.f338092a = b();
        aVar.f338093b = c();
        return aVar;
    }

    public double b() throws r {
        double d10 = this.f338006a / this.f338008c;
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new r();
        }
        return d10;
    }

    public double c() throws r {
        double d10 = this.f338007b / this.f338008c;
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new r();
        }
        return d10;
    }

    public j(double d10, double d11, double d12) {
        this.f338006a = d10;
        this.f338007b = d11;
        this.f338008c = d12;
    }

    public j(double d10, double d11) {
        this.f338006a = d10;
        this.f338007b = d11;
        this.f338008c = 1.0d;
    }

    public j(org.locationtech.jts.geom.a aVar) {
        this.f338006a = aVar.f338092a;
        this.f338007b = aVar.f338093b;
        this.f338008c = 1.0d;
    }

    public j(j jVar, j jVar2) {
        double d10 = jVar.f338007b;
        double d11 = jVar2.f338008c;
        double d12 = jVar2.f338007b;
        double d13 = jVar.f338008c;
        this.f338006a = (d10 * d11) - (d12 * d13);
        double d14 = jVar2.f338006a;
        double d15 = jVar.f338006a;
        this.f338007b = (d13 * d14) - (d11 * d15);
        this.f338008c = (d15 * jVar2.f338007b) - (d14 * jVar.f338007b);
    }

    public j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        double d10 = aVar.f338093b;
        double d11 = aVar2.f338093b;
        this.f338006a = d10 - d11;
        double d12 = aVar2.f338092a;
        double d13 = aVar.f338092a;
        this.f338007b = d12 - d13;
        this.f338008c = (d13 * d11) - (d12 * d10);
    }

    public j(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = aVar.f338093b;
        double d11 = aVar2.f338093b;
        double d12 = d10 - d11;
        double d13 = aVar2.f338092a;
        double d14 = aVar.f338092a;
        double d15 = d13 - d14;
        double d16 = (d14 * d11) - (d13 * d10);
        double d17 = aVar3.f338093b;
        double d18 = aVar4.f338093b;
        double d19 = d17 - d18;
        double d20 = aVar4.f338092a;
        double d21 = aVar3.f338092a;
        double d22 = d20 - d21;
        double d23 = (d21 * d18) - (d20 * d17);
        this.f338006a = (d15 * d23) - (d22 * d16);
        this.f338007b = (d19 * d16) - (d23 * d12);
        this.f338008c = (d12 * d22) - (d19 * d15);
    }
}
