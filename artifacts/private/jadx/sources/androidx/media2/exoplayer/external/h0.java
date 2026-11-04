package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.source.z.a f55252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f55257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f55258g;

    h0(androidx.media2.exoplayer.external.source.z.a id2, long startPositionUs, long contentPositionUs, long endPositionUs, long durationUs, boolean isLastInTimelinePeriod, boolean isFinal) {
        this.f55252a = id2;
        this.f55253b = startPositionUs;
        this.f55254c = contentPositionUs;
        this.f55255d = endPositionUs;
        this.f55256e = durationUs;
        this.f55257f = isLastInTimelinePeriod;
        this.f55258g = isFinal;
    }

    public h0 a(long contentPositionUs) {
        return contentPositionUs == this.f55254c ? this : new h0(this.f55252a, this.f55253b, contentPositionUs, this.f55255d, this.f55256e, this.f55257f, this.f55258g);
    }

    public h0 b(long startPositionUs) {
        return startPositionUs == this.f55253b ? this : new h0(this.f55252a, startPositionUs, this.f55254c, this.f55255d, this.f55256e, this.f55257f, this.f55258g);
    }

    public boolean equals(@androidx.annotation.p0 Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && h0.class == o10.getClass()) {
            h0 h0Var = (h0) o10;
            if (this.f55253b == h0Var.f55253b && this.f55254c == h0Var.f55254c && this.f55255d == h0Var.f55255d && this.f55256e == h0Var.f55256e && this.f55257f == h0Var.f55257f && this.f55258g == h0Var.f55258g && androidx.media2.exoplayer.external.util.q0.b(this.f55252a, h0Var.f55252a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((527 + this.f55252a.hashCode()) * 31) + ((int) this.f55253b)) * 31) + ((int) this.f55254c)) * 31) + ((int) this.f55255d)) * 31) + ((int) this.f55256e)) * 31) + (this.f55257f ? 1 : 0)) * 31) + (this.f55258g ? 1 : 0);
    }
}
