package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class c5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c5 f63542c = new c5(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63544b;

    public c5(boolean z10) {
        this.f63543a = 0;
        this.f63544b = z10;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c5.class == obj.getClass()) {
            c5 c5Var = (c5) obj;
            if (this.f63543a == c5Var.f63543a && this.f63544b == c5Var.f63544b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f63543a << 1) + (this.f63544b ? 1 : 0);
    }

    public c5(int i10, boolean z10) {
        this.f63543a = i10;
        this.f63544b = z10;
    }
}
