package tm;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f381099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f381100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f381101c;

    public f(org.locationtech.jts.geom.a aVar) {
        this.f381099a = aVar.f338092a;
        this.f381100b = aVar.f338093b;
        this.f381101c = aVar.f338094c;
    }

    public static f a(double d10, double d11, double d12) {
        return new f(d10, d11, d12);
    }

    public static f b(org.locationtech.jts.geom.a aVar) {
        return new f(aVar);
    }

    private f c(double d10) {
        return a(this.f381099a / d10, this.f381100b / d10, this.f381101c / d10);
    }

    public static double d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return (aVar.f338092a * aVar2.f338092a) + (aVar.f338093b * aVar2.f338093b) + (aVar.f338094c * aVar2.f338094c);
    }

    public static double e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, org.locationtech.jts.geom.a aVar3, org.locationtech.jts.geom.a aVar4) {
        double d10 = aVar2.f338092a - aVar.f338092a;
        double d11 = aVar2.f338093b - aVar.f338093b;
        double d12 = aVar2.f338094c - aVar.f338094c;
        return (d10 * (aVar4.f338092a - aVar3.f338092a)) + (d11 * (aVar4.f338093b - aVar3.f338093b)) + (d12 * (aVar4.f338094c - aVar3.f338094c));
    }

    public static double k(org.locationtech.jts.geom.a aVar) {
        double d10 = aVar.f338092a;
        double d11 = aVar.f338093b;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = aVar.f338094c;
        return Math.sqrt(d12 + (d13 * d13));
    }

    public static org.locationtech.jts.geom.a l(org.locationtech.jts.geom.a aVar) {
        double dK = k(aVar);
        return new org.locationtech.jts.geom.a(aVar.f338092a / dK, aVar.f338093b / dK, aVar.f338094c / dK);
    }

    public double f(f fVar) {
        return (this.f381099a * fVar.f381099a) + (this.f381100b * fVar.f381100b) + (this.f381101c * fVar.f381101c);
    }

    public double g() {
        return this.f381099a;
    }

    public double h() {
        return this.f381100b;
    }

    public double i() {
        return this.f381101c;
    }

    public double j() {
        double d10 = this.f381099a;
        double d11 = this.f381100b;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = this.f381101c;
        return Math.sqrt(d12 + (d13 * d13));
    }

    public f m() {
        return j() > 0.0d ? c(j()) : a(0.0d, 0.0d, 0.0d);
    }

    public String toString() {
        return "[" + this.f381099a + ", " + this.f381100b + ", " + this.f381101c + "]";
    }

    public f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this.f381099a = aVar2.f338092a - aVar.f338092a;
        this.f381100b = aVar2.f338093b - aVar.f338093b;
        this.f381101c = aVar2.f338094c - aVar.f338094c;
    }

    public f(double d10, double d11, double d12) {
        this.f381099a = d10;
        this.f381100b = d11;
        this.f381101c = d12;
    }
}
