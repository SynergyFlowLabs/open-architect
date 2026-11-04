package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f68288c = new q0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68290b;

    public q0(long j10, long j11) {
        this.f68289a = j10;
        this.f68290b = j11;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f68289a == q0Var.f68289a && this.f68290b == q0Var.f68290b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f68289a) * 31) + ((int) this.f68290b);
    }

    public String toString() {
        return "[timeUs=" + this.f68289a + ", position=" + this.f68290b + "]";
    }
}
