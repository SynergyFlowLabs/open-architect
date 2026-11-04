package androidx.media3.common;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60594c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f60596b;

    public f(int i10, float f10) {
        this.f60595a = i10;
        this.f60596b = f10;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f60595a == fVar.f60595a && Float.compare(fVar.f60596b, this.f60596b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f60595a) * 31) + Float.floatToIntBits(this.f60596b);
    }
}
