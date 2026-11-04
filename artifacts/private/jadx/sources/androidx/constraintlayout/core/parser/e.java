package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class e extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f44166h;

    public e(char[] cArr) {
        super(cArr);
        this.f44166h = Float.NaN;
    }

    public static c M(char[] cArr) {
        return new e(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String K(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        c(sb2, i10);
        float fR = r();
        int i12 = (int) fR;
        if (i12 == fR) {
            sb2.append(i12);
        } else {
            sb2.append(fR);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String L() {
        float fR = r();
        int i10 = (int) fR;
        if (i10 == fR) {
            return "" + i10;
        }
        return "" + fR;
    }

    public boolean N() {
        float fR = r();
        return ((float) ((int) fR)) == fR;
    }

    public void O(float f10) {
        this.f44166h = f10;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float fR = r();
            float fR2 = ((e) obj).r();
            if ((Float.isNaN(fR) && Float.isNaN(fR2)) || fR == fR2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f10 = this.f44166h;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public float r() {
        if (Float.isNaN(this.f44166h) && w()) {
            this.f44166h = Float.parseFloat(k());
        }
        return this.f44166h;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int s() {
        if (Float.isNaN(this.f44166h) && w()) {
            this.f44166h = Integer.parseInt(k());
        }
        return (int) this.f44166h;
    }

    public e(float f10) {
        super(null);
        this.f44166h = f10;
    }
}
