package androidx.media3.extractor.mp3;

import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.k0;
import androidx.media3.extractor.q0;

/* JADX INFO: loaded from: classes3.dex */
final class h implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f67872i = "VbriSeeker";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f67873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f67874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f67875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f67876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f67877h;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f67873d = jArr;
        this.f67874e = jArr2;
        this.f67875f = j10;
        this.f67876g = j11;
        this.f67877h = i10;
    }

    @p0
    public static h a(long j10, long j11, k0.a aVar, o0 o0Var) {
        int iL;
        o0Var.b0(6);
        long jS = j11 + ((long) aVar.f67438c) + ((long) o0Var.s());
        int iS = o0Var.s();
        if (iS <= 0) {
            return null;
        }
        long jW1 = k1.W1((((long) iS) * ((long) aVar.f67442g)) - 1, aVar.f67439d);
        int iT = o0Var.T();
        int iT2 = o0Var.T();
        int iT3 = o0Var.T();
        o0Var.b0(2);
        long[] jArr = new long[iT];
        long[] jArr2 = new long[iT];
        int i10 = 0;
        long j12 = j11 + ((long) aVar.f67438c);
        while (i10 < iT) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int i11 = i10;
            jArr3[i11] = (((long) i10) * jW1) / ((long) iT);
            jArr4[i11] = j12;
            if (iT3 == 1) {
                iL = o0Var.L();
            } else if (iT3 == 2) {
                iL = o0Var.T();
            } else if (iT3 == 3) {
                iL = o0Var.O();
            } else {
                if (iT3 != 4) {
                    return null;
                }
                iL = o0Var.P();
            }
            j12 += ((long) iL) * ((long) iT2);
            i10 = i11 + 1;
            jArr = jArr3;
            jArr2 = jArr4;
        }
        long[] jArr5 = jArr;
        long[] jArr6 = jArr2;
        if (j10 != -1 && j10 != jS) {
            z.n(f67872i, "VBRI data size mismatch: " + j10 + ", " + jS);
        }
        if (jS != j12) {
            z.n(f67872i, "VBRI bytes and ToC mismatch (using max): " + jS + ", " + j12 + "\nSeeking will be inaccurate.");
            jS = Math.max(jS, j12);
        }
        return new h(jArr5, jArr6, jW1, jS, aVar.f67441f);
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67875f;
    }

    @Override // androidx.media3.extractor.p0
    public androidx.media3.extractor.p0.a R1(long j10) {
        int iN = k1.n(this.f67873d, j10, true, true);
        q0 q0Var = new q0(this.f67873d[iN], this.f67874e[iN]);
        if (q0Var.f68289a < j10 && iN != this.f67873d.length - 1) {
            int i10 = iN + 1;
            return new androidx.media3.extractor.p0.a(q0Var, new q0(this.f67873d[i10], this.f67874e[i10]));
        }
        return new androidx.media3.extractor.p0.a(q0Var);
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long d() {
        return this.f67876g;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long e(long j10) {
        return this.f67873d[k1.n(this.f67874e, j10, true, true)];
    }

    @Override // androidx.media3.extractor.mp3.g
    public int i() {
        return this.f67877h;
    }
}
