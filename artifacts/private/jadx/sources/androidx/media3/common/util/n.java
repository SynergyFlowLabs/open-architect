package androidx.media3.common.util;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class n implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f61576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f61578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f61579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61580f;

    public n(@androidx.annotation.g0(from = 1) long j10, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        this(0L, j10, f10);
    }

    private long d(int i10) {
        long jRound = this.f61578d + Math.round(this.f61576b * ((double) i10));
        a.i(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.y0
    public long a() {
        int i10 = this.f61577c;
        if (i10 == 0) {
            return -9223372036854775807L;
        }
        return d(i10 - 1);
    }

    @Override // androidx.media3.common.util.y0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n b() {
        return new n(this.f61578d, this.f61579e, this.f61575a);
    }

    @Override // androidx.media3.common.util.y0
    public boolean hasNext() {
        return this.f61580f < this.f61577c;
    }

    @Override // androidx.media3.common.util.y0
    public long next() {
        a.i(hasNext());
        int i10 = this.f61580f;
        this.f61580f = i10 + 1;
        return d(i10);
    }

    public n(@androidx.annotation.g0(from = 0) long j10, @androidx.annotation.g0(from = 1) long j11, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        boolean z10 = false;
        a.a(j11 > 0);
        a.a(f10 > 0.0f);
        if (0 <= j10 && j10 < j11) {
            z10 = true;
        }
        a.a(z10);
        this.f61578d = j10;
        this.f61579e = j11;
        this.f61575a = f10;
        this.f61577c = Math.max(Math.round(((j11 - j10) / 1000000.0f) * f10), 1);
        this.f61576b = 1000000.0f / f10;
    }
}
