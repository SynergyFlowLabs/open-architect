package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import com.google.common.primitives.n;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e implements r0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62103d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f62104e = 2082844800;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f62105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62107c;

    public e(long j10, long j11) {
        this.f62105a = j10;
        this.f62106b = j11;
        this.f62107c = -1L;
    }

    public static long b(long j10) {
        return (j10 / 1000) + 2082844800;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f62105a == eVar.f62105a && this.f62106b == eVar.f62106b && this.f62107c == eVar.f62107c;
    }

    public int hashCode() {
        return ((((527 + n.l(this.f62105a)) * 31) + n.l(this.f62106b)) * 31) + n.l(this.f62107c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f62105a + ", modification time=" + this.f62106b + ", timescale=" + this.f62107c;
    }

    public e(long j10, long j11, long j12) {
        this.f62105a = j10;
        this.f62106b = j11;
        this.f62107c = j12;
    }
}
