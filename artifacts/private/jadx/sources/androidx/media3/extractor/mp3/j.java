package androidx.media3.extractor.mp3;

import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.k0;
import androidx.media3.extractor.q0;

/* JADX INFO: loaded from: classes3.dex */
final class j implements g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f67884k = "XingSeeker";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f67885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f67886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f67887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f67888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f67889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f67890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private final long[] f67891j;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    @p0
    public static j a(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f67880c;
        if (j11 == -1 || (jArr = iVar.f67883f) == null) {
            k0.a aVar = iVar.f67878a;
            return new j(j10, aVar.f67438c, jA, aVar.f67441f);
        }
        k0.a aVar2 = iVar.f67878a;
        return new j(j10, aVar2.f67438c, jA, aVar2.f67441f, j11, jArr);
    }

    private long b(int i10) {
        return (this.f67887f * ((long) i10)) / 100;
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67887f;
    }

    @Override // androidx.media3.extractor.p0
    public androidx.media3.extractor.p0.a R1(long j10) {
        if (!S1()) {
            return new androidx.media3.extractor.p0.a(new q0(0L, this.f67885d + ((long) this.f67886e)));
        }
        long jX = k1.x(j10, 0L, this.f67887f);
        double d10 = (jX * 100.0d) / this.f67887f;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) androidx.media3.common.util.a.k(this.f67891j);
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new androidx.media3.extractor.p0.a(new q0(jX, this.f67885d + k1.x(Math.round((d11 / 256.0d) * this.f67889h), this.f67886e, this.f67889h - 1)));
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return this.f67891j != null;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long d() {
        return this.f67890i;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long e(long j10) {
        long j11 = j10 - this.f67885d;
        if (!S1() || j11 <= this.f67886e) {
            return 0L;
        }
        long[] jArr = (long[]) androidx.media3.common.util.a.k(this.f67891j);
        double d10 = (j11 * 256.0d) / this.f67889h;
        int iN = k1.n(jArr, (long) d10, true, true);
        long jB = b(iN);
        long j12 = jArr[iN];
        int i10 = iN + 1;
        long jB2 = b(i10);
        long j13 = iN == 99 ? 256L : jArr[i10];
        return jB + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jB2 - jB));
    }

    @Override // androidx.media3.extractor.mp3.g
    public int i() {
        return this.f67888g;
    }

    private j(long j10, int i10, long j11, int i11, long j12, @p0 long[] jArr) {
        this.f67885d = j10;
        this.f67886e = i10;
        this.f67887f = j11;
        this.f67888g = i11;
        this.f67889h = j12;
        this.f67891j = jArr;
        long j13 = -1;
        if (j12 != -1) {
            j13 = j10 + j12;
        }
        this.f67890i = j13;
    }
}
