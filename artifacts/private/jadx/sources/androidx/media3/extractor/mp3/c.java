package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.metadata.id3.l;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.q0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f67846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f67847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f67848f;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f67846d = jArr;
        this.f67847e = jArr2;
        this.f67848f = j10 == -9223372036854775807L ? k1.D1(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f67584e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f67582c + lVar.f67584e[i12]);
            j12 += (long) (lVar.f67583d + lVar.f67585f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int iN = k1.n(jArr, j10, true, true);
        long j11 = jArr[iN];
        long j12 = jArr2[iN];
        int i10 = iN + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67848f;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        Pair<Long, Long> pairB = b(k1.A2(k1.x(j10, 0L, this.f67848f)), this.f67847e, this.f67846d);
        return new p0.a(new q0(k1.D1(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long d() {
        return -1L;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long e(long j10) {
        return k1.D1(((Long) b(j10, this.f67846d, this.f67847e).second).longValue());
    }

    @Override // androidx.media3.extractor.mp3.g
    public int i() {
        return androidx.media3.common.j.f60676f;
    }
}
