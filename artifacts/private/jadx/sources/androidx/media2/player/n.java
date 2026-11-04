package androidx.media2.player;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final n f58408d = new n(-1, -1, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f58410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f58411c;

    n(long j10, long j11, float f10) {
        this.f58409a = j10;
        this.f58410b = j11;
        this.f58411c = f10;
    }

    public long a() {
        return this.f58409a;
    }

    public long b() {
        return this.f58410b;
    }

    public float c() {
        return this.f58411c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f58409a == nVar.f58409a && this.f58410b == nVar.f58410b && this.f58411c == nVar.f58411c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((int) (((long) (Long.valueOf(this.f58409a).hashCode() * 31)) + this.f58410b)) * 31) + this.f58411c);
    }

    public String toString() {
        return n.class.getName() + "{AnchorMediaTimeUs=" + this.f58409a + " AnchorSystemNanoTime=" + this.f58410b + " ClockRate=" + this.f58411c + "}";
    }

    n() {
        this.f58409a = 0L;
        this.f58410b = 0L;
        this.f58411c = 1.0f;
    }
}
