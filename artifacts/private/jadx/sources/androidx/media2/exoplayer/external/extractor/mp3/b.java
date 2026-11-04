package androidx.media2.exoplayer.external.extractor.mp3;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.r;
import androidx.media2.exoplayer.external.metadata.id3.MlltFrame;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class b implements e.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f54255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f54256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f54257f;

    private b(long[] referencePositions, long[] referenceTimesMs) {
        this.f54255d = referencePositions;
        this.f54256e = referenceTimesMs;
        this.f54257f = androidx.media2.exoplayer.external.c.b(referenceTimesMs[referenceTimesMs.length - 1]);
    }

    public static b a(long firstFramePosition, MlltFrame mlltFrame) {
        int length = mlltFrame.f55517e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = firstFramePosition;
        long j10 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            firstFramePosition += (long) (mlltFrame.f55515c + mlltFrame.f55517e[i12]);
            j10 += (long) (mlltFrame.f55516d + mlltFrame.f55518f[i12]);
            jArr[i11] = firstFramePosition;
            jArr2[i11] = j10;
        }
        return new b(jArr, jArr2);
    }

    private static Pair<Long, Long> b(long x10, long[] xReferences, long[] yReferences) {
        int iH = q0.h(xReferences, x10, true, true);
        long j10 = xReferences[iH];
        long j11 = yReferences[iH];
        int i10 = iH + 1;
        if (i10 == xReferences.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = xReferences[i10];
        return Pair.create(Long.valueOf(x10), Long.valueOf(((long) ((j12 == j10 ? 0.0d : (x10 - j10) / (j12 - j10)) * (yReferences[i10] - j11))) + j11));
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public long Q1() {
        return this.f54257f;
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public q.a R1(long timeUs) {
        Pair<Long, Long> pairB = b(androidx.media2.exoplayer.external.c.c(q0.s(timeUs, 0L, this.f54257f)), this.f54256e, this.f54255d);
        return new q.a(new r(androidx.media2.exoplayer.external.c.b(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // androidx.media2.exoplayer.external.extractor.q
    public boolean S1() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long d() {
        return -1L;
    }

    @Override // androidx.media2.exoplayer.external.extractor.mp3.e.b
    public long e(long position) {
        return androidx.media2.exoplayer.external.c.b(((Long) b(position, this.f54255d, this.f54256e).second).longValue());
    }
}
