package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j0 implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.a0 f67378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.media3.common.util.a0 f67379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f67380f;

    public j0(long[] jArr, long[] jArr2, long j10) {
        androidx.media3.common.util.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f67378d = new androidx.media3.common.util.a0(length);
            this.f67379e = new androidx.media3.common.util.a0(length);
        } else {
            int i10 = length + 1;
            androidx.media3.common.util.a0 a0Var = new androidx.media3.common.util.a0(i10);
            this.f67378d = a0Var;
            androidx.media3.common.util.a0 a0Var2 = new androidx.media3.common.util.a0(i10);
            this.f67379e = a0Var2;
            a0Var.a(0L);
            a0Var2.a(0L);
        }
        this.f67378d.b(jArr);
        this.f67379e.b(jArr2);
        this.f67380f = j10;
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67380f;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        if (this.f67379e.d() == 0) {
            return new p0.a(q0.f68288c);
        }
        int iK = k1.k(this.f67379e, j10, true, true);
        q0 q0Var = new q0(this.f67379e.c(iK), this.f67378d.c(iK));
        if (q0Var.f68289a == j10 || iK == this.f67379e.d() - 1) {
            return new p0.a(q0Var);
        }
        int i10 = iK + 1;
        return new p0.a(q0Var, new q0(this.f67379e.c(i10), this.f67378d.c(i10)));
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return this.f67379e.d() > 0;
    }

    public void a(long j10, long j11) {
        if (this.f67379e.d() == 0 && j10 > 0) {
            this.f67378d.a(0L);
            this.f67379e.a(0L);
        }
        this.f67378d.a(j11);
        this.f67379e.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f67379e.d() == 0) {
            return false;
        }
        androidx.media3.common.util.a0 a0Var = this.f67379e;
        return j10 - a0Var.c(a0Var.d() - 1) < j11;
    }

    public void c(long j10) {
        this.f67380f = j10;
    }

    public long e(long j10) {
        if (this.f67379e.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f67379e.c(k1.k(this.f67378d, j10, true, true));
    }
}
