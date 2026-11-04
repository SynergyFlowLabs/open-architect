package androidx.media2.exoplayer.external.extractor.wav;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class c implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f55169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f55170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f55171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f55172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f55173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f55174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f55175j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f55176k = -1;

    public c(int numChannels, int sampleRateHz, int averageBytesPerSecond, int blockAlignment, int bitsPerSample, int encoding) {
        this.f55169d = numChannels;
        this.f55170e = sampleRateHz;
        this.f55171f = averageBytesPerSecond;
        this.f55172g = blockAlignment;
        this.f55173h = bitsPerSample;
        this.f55174i = encoding;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return (((this.f55176k - ((long) this.f55175j)) / ((long) this.f55172g)) * 1000000) / ((long) this.f55170e);
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        long j10 = this.f55176k - ((long) this.f55175j);
        long j11 = (((long) this.f55171f) * timeUs) / 1000000;
        int i10 = this.f55172g;
        long jS = q0.s((j11 / ((long) i10)) * ((long) i10), 0L, j10 - ((long) i10));
        long j12 = ((long) this.f55175j) + jS;
        long jE = e(j12);
        r rVar = new r(jE, j12);
        if (jE < timeUs) {
            int i11 = this.f55172g;
            if (jS != j10 - ((long) i11)) {
                long j13 = j12 + ((long) i11);
                return new q.a(rVar, new r(e(j13), j13));
            }
        }
        return new q.a(rVar);
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return true;
    }

    public int a() {
        return this.f55170e * this.f55173h * this.f55169d;
    }

    public int b() {
        return this.f55172g;
    }

    public int c() {
        return this.f55175j;
    }

    public long d() {
        return this.f55176k;
    }

    public long e(long position) {
        return (Math.max(0L, position - ((long) this.f55175j)) * 1000000) / ((long) this.f55171f);
    }

    public int f() {
        return this.f55174i;
    }

    public int g() {
        return this.f55169d;
    }

    public int h() {
        return this.f55170e;
    }

    public boolean i() {
        return this.f55175j != -1;
    }

    public void j(int dataStartPosition, long dataEndPosition) {
        this.f55175j = dataStartPosition;
        this.f55176k = dataEndPosition;
    }
}
