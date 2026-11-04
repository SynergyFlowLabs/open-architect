package tk;

/* JADX INFO: loaded from: classes14.dex */
public class c extends Number implements Comparable<c>, a<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381063b = -1585823265;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f381064a;

    public c() {
    }

    public Byte D() {
        return Byte.valueOf(byteValue());
    }

    public void b(byte b10) {
        this.f381064a = (byte) (this.f381064a + b10);
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.f381064a;
    }

    public void c(Number number) {
        this.f381064a = (byte) (this.f381064a + number.byteValue());
    }

    public byte d(byte b10) {
        byte b11 = (byte) (this.f381064a + b10);
        this.f381064a = b11;
        return b11;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f381064a;
    }

    public byte e(Number number) {
        byte bByteValue = (byte) (this.f381064a + number.byteValue());
        this.f381064a = bByteValue;
        return bByteValue;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f381064a == ((c) obj).byteValue();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        return sk.c.a(this.f381064a, cVar.f381064a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f381064a;
    }

    public int hashCode() {
        return this.f381064a;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f381064a;
    }

    public void k() {
        this.f381064a = (byte) (this.f381064a - 1);
    }

    public byte l() {
        byte b10 = (byte) (this.f381064a - 1);
        this.f381064a = b10;
        return b10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f381064a;
    }

    public byte n(byte b10) {
        byte b11 = this.f381064a;
        this.f381064a = (byte) (b10 + b11);
        return b11;
    }

    public byte o(Number number) {
        byte b10 = this.f381064a;
        this.f381064a = (byte) (number.byteValue() + b10);
        return b10;
    }

    public byte p() {
        byte b10 = this.f381064a;
        this.f381064a = (byte) (b10 - 1);
        return b10;
    }

    public byte q() {
        byte b10 = this.f381064a;
        this.f381064a = (byte) (b10 + 1);
        return b10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Byte getValue() {
        return Byte.valueOf(this.f381064a);
    }

    public void s() {
        this.f381064a = (byte) (this.f381064a + 1);
    }

    public byte t() {
        byte b10 = (byte) (this.f381064a + 1);
        this.f381064a = b10;
        return b10;
    }

    public String toString() {
        return String.valueOf((int) this.f381064a);
    }

    public void v(byte b10) {
        this.f381064a = b10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f381064a = number.byteValue();
    }

    public void x(byte b10) {
        this.f381064a = (byte) (this.f381064a - b10);
    }

    public void z(Number number) {
        this.f381064a = (byte) (this.f381064a - number.byteValue());
    }

    public c(byte b10) {
        this.f381064a = b10;
    }

    public c(Number number) {
        this.f381064a = number.byteValue();
    }

    public c(String str) throws NumberFormatException {
        this.f381064a = Byte.parseByte(str);
    }
}
