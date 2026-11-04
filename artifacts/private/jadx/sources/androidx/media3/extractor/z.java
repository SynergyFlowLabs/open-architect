package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class z implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f69666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f69667e;

    public z(a0 a0Var, long j10) {
        this.f69666d = a0Var;
        this.f69667e = j10;
    }

    private q0 a(long j10, long j11) {
        return new q0((j10 * 1000000) / ((long) this.f69666d.f67016e), this.f69667e + j11);
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f69666d.h();
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        androidx.media3.common.util.a.k(this.f69666d.f67022k);
        a0 a0Var = this.f69666d;
        a0.a aVar = a0Var.f67022k;
        long[] jArr = aVar.f67024a;
        long[] jArr2 = aVar.f67025b;
        int iN = k1.n(jArr, a0Var.l(j10), true, false);
        q0 q0VarA = a(iN == -1 ? 0L : jArr[iN], iN != -1 ? jArr2[iN] : 0L);
        if (q0VarA.f68289a == j10 || iN == jArr.length - 1) {
            return new p0.a(q0VarA);
        }
        int i10 = iN + 1;
        return new p0.a(q0VarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }
}
