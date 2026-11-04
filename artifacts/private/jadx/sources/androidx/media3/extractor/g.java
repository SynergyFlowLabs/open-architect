package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f67330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f67331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f67332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f67333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f67334i;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f67330e = iArr;
        this.f67331f = jArr;
        this.f67332g = jArr2;
        this.f67333h = jArr3;
        int length = iArr.length;
        this.f67329d = length;
        if (length > 0) {
            this.f67334i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f67334i = 0L;
        }
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67334i;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        int iA = a(j10);
        q0 q0Var = new q0(this.f67333h[iA], this.f67331f[iA]);
        if (q0Var.f68289a < j10 && iA != this.f67329d - 1) {
            int i10 = iA + 1;
            return new p0.a(q0Var, new q0(this.f67333h[i10], this.f67331f[i10]));
        }
        return new p0.a(q0Var);
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }

    public int a(long j10) {
        return k1.n(this.f67333h, j10, true, true);
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f67329d + ", sizes=" + Arrays.toString(this.f67330e) + ", offsets=" + Arrays.toString(this.f67331f) + ", timeUs=" + Arrays.toString(this.f67333h) + ", durationsUs=" + Arrays.toString(this.f67332g) + ")";
    }
}
