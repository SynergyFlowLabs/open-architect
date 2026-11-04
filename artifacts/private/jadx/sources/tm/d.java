package tm;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f381092c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f381093d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f381094e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f381095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.geom.a f381096b;

    public d(f fVar, org.locationtech.jts.geom.a aVar) {
        this.f381095a = fVar;
        this.f381096b = aVar;
    }

    public int a() {
        double dAbs = Math.abs(this.f381095a.g());
        double dAbs2 = Math.abs(this.f381095a.h());
        double dAbs3 = Math.abs(this.f381095a.i());
        if (dAbs > dAbs2) {
            return dAbs > dAbs3 ? 2 : 1;
        }
        return dAbs3 > dAbs2 ? 1 : 3;
    }

    public double b(org.locationtech.jts.geom.a aVar) {
        double dF = new f(aVar, this.f381096b).f(this.f381095a);
        if (Double.isNaN(dF)) {
            throw new IllegalArgumentException("3D Coordinate has NaN ordinate");
        }
        return dF / this.f381095a.j();
    }
}
