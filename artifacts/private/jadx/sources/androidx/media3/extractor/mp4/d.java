package androidx.media3.extractor.mp4;

import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f67951a = 8192;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f67952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f67953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f67955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f67956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f67957f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f67952a = jArr;
            this.f67953b = iArr;
            this.f67954c = i10;
            this.f67955d = jArr2;
            this.f67956e = iArr2;
            this.f67957f = j10;
        }
    }

    private d() {
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iQ = 0;
        for (int i12 : iArr) {
            iQ += k1.q(i12, i11);
        }
        long[] jArr2 = new long[iQ];
        int[] iArr2 = new int[iQ];
        long[] jArr3 = new long[iQ];
        int[] iArr3 = new int[iQ];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = ((long) i13) * j10;
                iArr3[i14] = 1;
                j11 += (long) iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * ((long) i13));
    }
}
