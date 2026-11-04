package tk;

/* JADX INFO: loaded from: classes14.dex */
public class g extends Number implements Comparable<g>, a<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381071b = 62986528375L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f381072a;

    public g() {
    }

    public Long D() {
        return Long.valueOf(longValue());
    }

    public void b(long j10) {
        this.f381072a += j10;
    }

    public void c(Number number) {
        this.f381072a += number.longValue();
    }

    public long d(long j10) {
        long j11 = this.f381072a + j10;
        this.f381072a = j11;
        return j11;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f381072a;
    }

    public long e(Number number) {
        long jLongValue = this.f381072a + number.longValue();
        this.f381072a = jLongValue;
        return jLongValue;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f381072a == ((g) obj).longValue();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        return sk.c.c(this.f381072a, gVar.f381072a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f381072a;
    }

    public int hashCode() {
        long j10 = this.f381072a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f381072a;
    }

    public void k() {
        this.f381072a--;
    }

    public long l() {
        long j10 = this.f381072a - 1;
        this.f381072a = j10;
        return j10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f381072a;
    }

    public long n(long j10) {
        long j11 = this.f381072a;
        this.f381072a = j10 + j11;
        return j11;
    }

    public long o(Number number) {
        long j10 = this.f381072a;
        this.f381072a = number.longValue() + j10;
        return j10;
    }

    public long p() {
        long j10 = this.f381072a;
        this.f381072a = j10 - 1;
        return j10;
    }

    public long q() {
        long j10 = this.f381072a;
        this.f381072a = 1 + j10;
        return j10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long getValue() {
        return Long.valueOf(this.f381072a);
    }

    public void s() {
        this.f381072a++;
    }

    public long t() {
        long j10 = this.f381072a + 1;
        this.f381072a = j10;
        return j10;
    }

    public String toString() {
        return String.valueOf(this.f381072a);
    }

    public void v(long j10) {
        this.f381072a = j10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f381072a = number.longValue();
    }

    public void x(long j10) {
        this.f381072a -= j10;
    }

    public void z(Number number) {
        this.f381072a -= number.longValue();
    }

    public g(long j10) {
        this.f381072a = j10;
    }

    public g(Number number) {
        this.f381072a = number.longValue();
    }

    public g(String str) throws NumberFormatException {
        this.f381072a = Long.parseLong(str);
    }
}
