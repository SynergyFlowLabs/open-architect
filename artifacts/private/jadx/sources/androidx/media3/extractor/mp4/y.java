package androidx.media3.extractor.mp4;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f68146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f68148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f68149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f68151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f68152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f68153h;

    public y(v vVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        androidx.media3.common.util.a.a(iArr.length == jArr2.length);
        androidx.media3.common.util.a.a(jArr.length == jArr2.length);
        androidx.media3.common.util.a.a(iArr2.length == jArr2.length);
        this.f68146a = vVar;
        this.f68148c = jArr;
        this.f68149d = iArr;
        this.f68150e = i10;
        this.f68151f = jArr2;
        this.f68152g = iArr2;
        this.f68153h = j10;
        this.f68147b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iN = k1.n(this.f68151f, j10, true, false); iN >= 0; iN--) {
            if ((this.f68152g[iN] & 1) != 0) {
                return iN;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iJ = k1.j(this.f68151f, j10, true, false); iJ < this.f68151f.length; iJ++) {
            if ((this.f68152g[iJ] & 1) != 0) {
                return iJ;
            }
        }
        return -1;
    }
}
