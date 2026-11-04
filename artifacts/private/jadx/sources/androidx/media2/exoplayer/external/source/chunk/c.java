package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.source.u0;
import androidx.media2.exoplayer.external.util.p;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c implements e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f55771c = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f55772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u0[] f55773b;

    public c(int[] trackTypes, u0[] sampleQueues) {
        this.f55772a = trackTypes;
        this.f55773b = sampleQueues;
    }

    @Override // androidx.media2.exoplayer.external.source.chunk.e.b
    public s a(int id2, int type) {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f55772a;
            if (i10 >= iArr.length) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unmatched track of type: ");
                sb2.append(type);
                p.d(f55771c, sb2.toString());
                return new androidx.media2.exoplayer.external.extractor.h();
            }
            if (type == iArr[i10]) {
                return this.f55773b[i10];
            }
            i10++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.f55773b.length];
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f55773b;
            if (i10 >= u0VarArr.length) {
                return iArr;
            }
            u0 u0Var = u0VarArr[i10];
            if (u0Var != null) {
                iArr[i10] = u0Var.t();
            }
            i10++;
        }
    }

    public void c(long sampleOffsetUs) {
        for (u0 u0Var : this.f55773b) {
            if (u0Var != null) {
                u0Var.J(sampleOffsetUs);
            }
        }
    }
}
