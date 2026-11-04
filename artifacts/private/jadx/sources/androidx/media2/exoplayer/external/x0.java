package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f57922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x0 f57923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x0 f57924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x0 f57925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x0 f57926g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57928b;

    static {
        x0 x0Var = new x0(0L, 0L);
        f57922c = x0Var;
        f57923d = new x0(Long.MAX_VALUE, Long.MAX_VALUE);
        f57924e = new x0(Long.MAX_VALUE, 0L);
        f57925f = new x0(0L, Long.MAX_VALUE);
        f57926g = x0Var;
    }

    public x0(long toleranceBeforeUs, long toleranceAfterUs) {
        androidx.media2.exoplayer.external.util.a.a(toleranceBeforeUs >= 0);
        androidx.media2.exoplayer.external.util.a.a(toleranceAfterUs >= 0);
        this.f57927a = toleranceBeforeUs;
        this.f57928b = toleranceAfterUs;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f57927a == x0Var.f57927a && this.f57928b == x0Var.f57928b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f57927a) * 31) + ((int) this.f57928b);
    }
}
