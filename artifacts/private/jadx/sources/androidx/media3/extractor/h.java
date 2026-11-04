package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class h implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f67340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f67341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f67342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f67343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f67344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f67345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f67346j;

    public h(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    private long a(long j10) {
        long j11 = (j10 * ((long) this.f67344h)) / 8000000;
        int i10 = this.f67342f;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f67343g;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f67341e + Math.max(jMin, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67345i;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        if (this.f67343g == -1 && !this.f67346j) {
            return new p0.a(new q0(0L, this.f67341e));
        }
        long jA = a(j10);
        long jB = b(jA);
        q0 q0Var = new q0(jB, jA);
        if (this.f67343g != -1 && jB < j10) {
            int i10 = this.f67342f;
            if (((long) i10) + jA < this.f67340d) {
                long j11 = jA + ((long) i10);
                return new p0.a(q0Var, new q0(b(j11), j11));
            }
        }
        return new p0.a(q0Var);
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return this.f67343g != -1 || this.f67346j;
    }

    public long b(long j10) {
        return c(j10, this.f67341e, this.f67344h);
    }

    public h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f67340d = j10;
        this.f67341e = j11;
        this.f67342f = i11 == -1 ? 1 : i11;
        this.f67344h = i10;
        this.f67346j = z10;
        if (j10 == -1) {
            this.f67343g = -1L;
            this.f67345i = -9223372036854775807L;
        } else {
            this.f67343g = j10 - j11;
            this.f67345i = c(j10, j11, i10);
        }
    }
}
