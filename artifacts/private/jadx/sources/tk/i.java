package tk;

/* JADX INFO: loaded from: classes14.dex */
public class i extends Number implements Comparable<i>, a<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381075b = -2135791679;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f381076a;

    public i() {
    }

    public Short D() {
        return Short.valueOf(shortValue());
    }

    public void b(Number number) {
        this.f381076a = (short) (this.f381076a + number.shortValue());
    }

    public void c(short s10) {
        this.f381076a = (short) (this.f381076a + s10);
    }

    public short d(Number number) {
        short sShortValue = (short) (this.f381076a + number.shortValue());
        this.f381076a = sShortValue;
        return sShortValue;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f381076a;
    }

    public short e(short s10) {
        short s11 = (short) (this.f381076a + s10);
        this.f381076a = s11;
        return s11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f381076a == ((i) obj).shortValue();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return sk.c.d(this.f381076a, iVar.f381076a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f381076a;
    }

    public int hashCode() {
        return this.f381076a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f381076a;
    }

    public void k() {
        this.f381076a = (short) (this.f381076a - 1);
    }

    public short l() {
        short s10 = (short) (this.f381076a - 1);
        this.f381076a = s10;
        return s10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f381076a;
    }

    public short n(Number number) {
        short s10 = this.f381076a;
        this.f381076a = (short) (number.shortValue() + s10);
        return s10;
    }

    public short o(short s10) {
        short s11 = this.f381076a;
        this.f381076a = (short) (s10 + s11);
        return s11;
    }

    public short p() {
        short s10 = this.f381076a;
        this.f381076a = (short) (s10 - 1);
        return s10;
    }

    public short q() {
        short s10 = this.f381076a;
        this.f381076a = (short) (s10 + 1);
        return s10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Short getValue() {
        return Short.valueOf(this.f381076a);
    }

    public void s() {
        this.f381076a = (short) (this.f381076a + 1);
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.f381076a;
    }

    public short t() {
        short s10 = (short) (this.f381076a + 1);
        this.f381076a = s10;
        return s10;
    }

    public String toString() {
        return String.valueOf((int) this.f381076a);
    }

    @Override // tk.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f381076a = number.shortValue();
    }

    public void w(short s10) {
        this.f381076a = s10;
    }

    public void x(Number number) {
        this.f381076a = (short) (this.f381076a - number.shortValue());
    }

    public void z(short s10) {
        this.f381076a = (short) (this.f381076a - s10);
    }

    public i(short s10) {
        this.f381076a = s10;
    }

    public i(Number number) {
        this.f381076a = number.shortValue();
    }

    public i(String str) throws NumberFormatException {
        this.f381076a = Short.parseShort(str);
    }
}
