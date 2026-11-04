package androidx.media3.common.util;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f61638c = new r0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f61639d = new r0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61641b;

    public r0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f61640a = i10;
        this.f61641b = i11;
    }

    public int a() {
        return this.f61641b;
    }

    public int b() {
        return this.f61640a;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f61640a == r0Var.f61640a && this.f61641b == r0Var.f61641b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f61641b;
        int i11 = this.f61640a;
        return ((i11 >>> 16) | (i11 << 16)) ^ i10;
    }

    public String toString() {
        return this.f61640a + "x" + this.f61641b;
    }
}
