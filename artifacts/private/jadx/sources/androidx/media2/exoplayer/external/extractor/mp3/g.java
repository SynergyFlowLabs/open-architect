package androidx.media2.exoplayer.external.extractor.mp3;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.extractor.o;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class g implements e.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f54288j = "XingSeeker";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f54289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f54292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f54293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final long[] f54294i;

    private g(long dataStartPosition, int xingFrameSize, long durationUs) {
        this(dataStartPosition, xingFrameSize, durationUs, -1L, null);
    }

    @p0
    public static g a(long inputLength, long position, o mpegAudioHeader, x frame) {
        int iH;
        int i10 = mpegAudioHeader.f54573g;
        int i11 = mpegAudioHeader.f54570d;
        int iL = frame.l();
        if ((iL & 1) != 1 || (iH = frame.H()) == 0) {
            return null;
        }
        long jI0 = q0.I0(iH, ((long) i10) * 1000000, i11);
        if ((iL & 6) != 6) {
            return new g(position, mpegAudioHeader.f54569c, jI0);
        }
        long jH = frame.H();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = frame.D();
        }
        if (inputLength != -1) {
            long j10 = position + jH;
            if (inputLength != j10) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(inputLength);
                sb2.append(", ");
                sb2.append(j10);
                p.l(f54288j, sb2.toString());
            }
        }
        return new g(position, mpegAudioHeader.f54569c, jI0, jH, jArr);
    }

    private long b(int tableIndex) {
        return (this.f54291f * ((long) tableIndex)) / 100;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return this.f54291f;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        if (!S1()) {
            return new q.a(new r(0L, this.f54289d + ((long) this.f54290e)));
        }
        long jS = q0.s(timeUs, 0L, this.f54291f);
        double d10 = (jS * 100.0d) / this.f54291f;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) androidx.media2.exoplayer.external.util.a.g(this.f54294i);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new q.a(new r(jS, this.f54289d + q0.s(Math.round((d11 / 256.0d) * this.f54292g), this.f54290e, this.f54292g - 1)));
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return this.f54294i != null;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long d() {
        return this.f54293h;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long e(long position) {
        long j10 = position - this.f54289d;
        if (S1() && j10 > this.f54290e) {
            long[] jArr = (long[]) androidx.media2.exoplayer.external.util.a.g(this.f54294i);
            double d10 = (j10 * 256.0d) / this.f54292g;
            int iH = q0.h(jArr, (long) d10, true, true);
            long jB = b(iH);
            long j11 = jArr[iH];
            int i10 = iH + 1;
            long jB2 = b(i10);
            long j12 = iH == 99 ? 256L : jArr[i10];
            return jB + Math.round((j11 == j12 ? 0.0d : (d10 - j11) / (j12 - j11)) * (jB2 - jB));
        }
        return 0L;
    }

    private g(long dataStartPosition, int xingFrameSize, long durationUs, long dataSize, @p0 long[] tableOfContents) {
        this.f54289d = dataStartPosition;
        this.f54290e = xingFrameSize;
        this.f54291f = durationUs;
        this.f54294i = tableOfContents;
        this.f54292g = dataSize;
        this.f54293h = dataSize != -1 ? dataStartPosition + dataSize : -1L;
    }
}
