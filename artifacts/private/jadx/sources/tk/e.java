package tk;

/* JADX INFO: loaded from: classes14.dex */
public class e extends Number implements Comparable<e>, a<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381067b = 5787169186L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f381068a;

    public e() {
    }

    public void D(float f10) {
        this.f381068a -= f10;
    }

    public void E(Number number) {
        this.f381068a -= number.floatValue();
    }

    public Float H() {
        return Float.valueOf(floatValue());
    }

    public void b(float f10) {
        this.f381068a += f10;
    }

    public void c(Number number) {
        this.f381068a += number.floatValue();
    }

    public float d(float f10) {
        float f11 = this.f381068a + f10;
        this.f381068a = f11;
        return f11;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f381068a;
    }

    public float e(Number number) {
        float fFloatValue = this.f381068a + number.floatValue();
        this.f381068a = fFloatValue;
        return fFloatValue;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e) || Float.floatToIntBits(((e) obj).f381068a) != Float.floatToIntBits(this.f381068a)) {
            return false;
        }
        int i10 = 1 >> 1;
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return Float.compare(this.f381068a, eVar.f381068a);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f381068a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f381068a);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f381068a;
    }

    public void k() {
        this.f381068a -= 1.0f;
    }

    public float l() {
        float f10 = this.f381068a - 1.0f;
        this.f381068a = f10;
        return f10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.f381068a;
    }

    public float n(float f10) {
        float f11 = this.f381068a;
        this.f381068a = f10 + f11;
        return f11;
    }

    public float o(Number number) {
        float f10 = this.f381068a;
        this.f381068a = number.floatValue() + f10;
        return f10;
    }

    public float p() {
        float f10 = this.f381068a;
        this.f381068a = f10 - 1.0f;
        return f10;
    }

    public float q() {
        float f10 = this.f381068a;
        this.f381068a = 1.0f + f10;
        return f10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float getValue() {
        return Float.valueOf(this.f381068a);
    }

    public void s() {
        this.f381068a += 1.0f;
    }

    public float t() {
        float f10 = this.f381068a + 1.0f;
        this.f381068a = f10;
        return f10;
    }

    public String toString() {
        return String.valueOf(this.f381068a);
    }

    public boolean v() {
        return Float.isInfinite(this.f381068a);
    }

    public boolean w() {
        return Float.isNaN(this.f381068a);
    }

    public void x(float f10) {
        this.f381068a = f10;
    }

    @Override // tk.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void setValue(Number number) {
        this.f381068a = number.floatValue();
    }

    public e(float f10) {
        this.f381068a = f10;
    }

    public e(Number number) {
        this.f381068a = number.floatValue();
    }

    public e(String str) throws NumberFormatException {
        this.f381068a = Float.parseFloat(str);
    }
}
