package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f54407a = 8192;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f54408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f54409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f54411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f54412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f54413f;

        private b(long[] offsets, int[] sizes, int maximumSize, long[] timestamps, int[] flags, long duration) {
            this.f54408a = offsets;
            this.f54409b = sizes;
            this.f54410c = maximumSize;
            this.f54411d = timestamps;
            this.f54412e = flags;
            this.f54413f = duration;
        }
    }

    private d() {
    }

    public static b a(int fixedSampleSize, long[] chunkOffsets, int[] chunkSampleCounts, long timestampDeltaInTimeUnits) {
        int i10 = 8192 / fixedSampleSize;
        int iK = 0;
        for (int i11 : chunkSampleCounts) {
            iK += q0.k(i11, i10);
        }
        long[] jArr = new long[iK];
        int[] iArr = new int[iK];
        long[] jArr2 = new long[iK];
        int[] iArr2 = new int[iK];
        int i12 = 0;
        int i13 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < chunkSampleCounts.length; i14++) {
            int i15 = chunkSampleCounts[i14];
            long j10 = chunkOffsets[i14];
            while (i15 > 0) {
                int iMin = Math.min(i10, i15);
                jArr[i13] = j10;
                int i16 = fixedSampleSize * iMin;
                iArr[i13] = i16;
                iMax = Math.max(iMax, i16);
                jArr2[i13] = ((long) i12) * timestampDeltaInTimeUnits;
                iArr2[i13] = 1;
                j10 += (long) iArr[i13];
                i12 += iMin;
                i15 -= iMin;
                i13++;
            }
        }
        return new b(jArr, iArr, iMax, jArr2, iArr2, timestampDeltaInTimeUnits * ((long) i12));
    }
}
