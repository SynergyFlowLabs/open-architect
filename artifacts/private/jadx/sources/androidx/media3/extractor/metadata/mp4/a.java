package androidx.media3.extractor.metadata.mp4;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import com.google.common.primitives.n;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f67597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f67598e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f67594a = j10;
        this.f67595b = j11;
        this.f67596c = j12;
        this.f67597d = j13;
        this.f67598e = j14;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f67594a == aVar.f67594a && this.f67595b == aVar.f67595b && this.f67596c == aVar.f67596c && this.f67597d == aVar.f67597d && this.f67598e == aVar.f67598e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + n.l(this.f67594a)) * 31) + n.l(this.f67595b)) * 31) + n.l(this.f67596c)) * 31) + n.l(this.f67597d)) * 31) + n.l(this.f67598e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f67594a + ", photoSize=" + this.f67595b + ", photoPresentationTimestampUs=" + this.f67596c + ", videoStartPosition=" + this.f67597d + ", videoSize=" + this.f67598e;
    }
}
