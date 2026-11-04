package tk;

/* JADX INFO: loaded from: classes14.dex */
public class d extends Number implements Comparable<d>, a<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381065b = 1587163916;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f381066a;

    public d() {
    }

    public void D(double d10) {
        this.f381066a -= d10;
    }

    public void E(Number number) {
        this.f381066a -= number.doubleValue();
    }

    public Double H() {
        return Double.valueOf(doubleValue());
    }

    public void b(double d10) {
        this.f381066a += d10;
    }

    public void c(Number number) {
        this.f381066a += number.doubleValue();
    }

    public double d(double d10) {
        double d11 = this.f381066a + d10;
        this.f381066a = d11;
        return d11;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f381066a;
    }

    public double e(Number number) {
        double dDoubleValue = this.f381066a + number.doubleValue();
        this.f381066a = dDoubleValue;
        return dDoubleValue;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && Double.doubleToLongBits(((d) obj).f381066a) == Double.doubleToLongBits(this.f381066a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Double.compare(this.f381066a, dVar.f381066a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.f381066a;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f381066a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f381066a;
    }

    public void k() {
        this.f381066a -= 1.0d;
    }

    public double l() {
        double d10 = this.f381066a - 1.0d;
        this.f381066a = d10;
        return d10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.f381066a;
    }

    public double n(double d10) {
        double d11 = this.f381066a;
        this.f381066a = d10 + d11;
        return d11;
    }

    public double o(Number number) {
        double d10 = this.f381066a;
        this.f381066a = number.doubleValue() + d10;
        return d10;
    }

    public double p() {
        double d10 = this.f381066a;
        this.f381066a = d10 - 1.0d;
        return d10;
    }

    public double q() {
        double d10 = this.f381066a;
        this.f381066a = 1.0d + d10;
        return d10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double getValue() {
        return Double.valueOf(this.f381066a);
    }

    public void s() {
        this.f381066a += 1.0d;
    }

    public double t() {
        double d10 = this.f381066a + 1.0d;
        this.f381066a = d10;
        return d10;
    }

    public String toString() {
        return String.valueOf(this.f381066a);
    }

    public boolean v() {
        return Double.isInfinite(this.f381066a);
    }

    public boolean w() {
        return Double.isNaN(this.f381066a);
    }

    public void x(double d10) {
        this.f381066a = d10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f381066a = number.doubleValue();
    }

    public d(double d10) {
        this.f381066a = d10;
    }

    public d(Number number) {
        this.f381066a = number.doubleValue();
    }

    public d(String str) throws NumberFormatException {
        this.f381066a = Double.parseDouble(str);
    }
}
