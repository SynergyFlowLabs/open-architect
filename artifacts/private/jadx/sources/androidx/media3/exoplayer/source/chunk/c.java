package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.z;
import androidx.media3.exoplayer.source.r1;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements f.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f64856c = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f64857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r1[] f64858b;

    public c(int[] iArr, r1[] r1VarArr) {
        this.f64857a = iArr;
        this.f64858b = r1VarArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.f.b
    public u0 a(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f64857a;
            if (i12 >= iArr.length) {
                z.d(f64856c, "Unmatched track of type: " + i11);
                return new androidx.media3.extractor.m();
            }
            if (i11 == iArr[i12]) {
                return this.f64858b[i12];
            }
            i12++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.f64858b.length];
        int i10 = 0;
        while (true) {
            r1[] r1VarArr = this.f64858b;
            if (i10 >= r1VarArr.length) {
                return iArr;
            }
            iArr[i10] = r1VarArr[i10].K();
            i10++;
        }
    }

    public void c(long j10) {
        for (r1 r1Var : this.f64858b) {
            r1Var.d0(j10);
        }
    }
}
