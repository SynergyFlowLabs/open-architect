package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f54700c = new r(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f54701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54702b;

    public r(long timeUs, long position) {
        this.f54701a = timeUs;
        this.f54702b = position;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f54701a == rVar.f54701a && this.f54702b == rVar.f54702b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f54701a) * 31) + ((int) this.f54702b);
    }

    public String toString() {
        long j10 = this.f54701a;
        long j11 = this.f54702b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
