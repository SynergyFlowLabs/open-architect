package tk;

/* JADX INFO: loaded from: classes14.dex */
public class f extends Number implements Comparable<f>, a<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381069b = 512176391864L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f381070a;

    public f() {
    }

    public Integer D() {
        return Integer.valueOf(intValue());
    }

    public void b(int i10) {
        this.f381070a += i10;
    }

    public void c(Number number) {
        this.f381070a += number.intValue();
    }

    public int d(int i10) {
        int i11 = this.f381070a + i10;
        this.f381070a = i11;
        return i11;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f381070a;
    }

    public int e(Number number) {
        int iIntValue = this.f381070a + number.intValue();
        this.f381070a = iIntValue;
        return iIntValue;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f381070a == ((f) obj).intValue();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return sk.c.b(this.f381070a, fVar.f381070a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f381070a;
    }

    public int hashCode() {
        return this.f381070a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f381070a;
    }

    public void k() {
        this.f381070a--;
    }

    public int l() {
        int i10 = this.f381070a - 1;
        this.f381070a = i10;
        return i10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f381070a;
    }

    public int n(int i10) {
        int i11 = this.f381070a;
        this.f381070a = i10 + i11;
        return i11;
    }

    public int o(Number number) {
        int i10 = this.f381070a;
        this.f381070a = number.intValue() + i10;
        return i10;
    }

    public int p() {
        int i10 = this.f381070a;
        this.f381070a = i10 - 1;
        return i10;
    }

    public int q() {
        int i10 = this.f381070a;
        this.f381070a = i10 + 1;
        return i10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        return Integer.valueOf(this.f381070a);
    }

    public void s() {
        this.f381070a++;
    }

    public int t() {
        int i10 = this.f381070a + 1;
        this.f381070a = i10;
        return i10;
    }

    public String toString() {
        return String.valueOf(this.f381070a);
    }

    public void v(int i10) {
        this.f381070a = i10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f381070a = number.intValue();
    }

    public void x(int i10) {
        this.f381070a -= i10;
    }

    public void z(Number number) {
        this.f381070a -= number.intValue();
    }

    public f(int i10) {
        this.f381070a = i10;
    }

    public f(Number number) {
        this.f381070a = number.intValue();
    }

    public f(String str) throws NumberFormatException {
        this.f381070a = Integer.parseInt(str);
    }
}
