package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.b1;
import androidx.media3.extractor.e0;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.q0;
import androidx.media3.extractor.t;
import androidx.media3.extractor.u0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f67415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f67416b;

    class a extends e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p0 f67417e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var, p0 p0Var2) {
            super(p0Var);
            this.f67417e = p0Var2;
        }

        @Override // androidx.media3.extractor.e0, androidx.media3.extractor.p0
        public p0.a R1(long j10) {
            p0.a aVarR1 = this.f67417e.R1(j10);
            q0 q0Var = aVarR1.f68280a;
            q0 q0Var2 = new q0(q0Var.f68289a, q0Var.f68290b + e.this.f67415a);
            q0 q0Var3 = aVarR1.f68281b;
            return new p0.a(q0Var2, new q0(q0Var3.f68289a, q0Var3.f68290b + e.this.f67415a));
        }
    }

    public e(long j10, t tVar) {
        this.f67415a = j10;
        this.f67416b = tVar;
    }

    @Override // androidx.media3.extractor.t
    public u0 a(int i10, int i11) {
        return this.f67416b.a(i10, i11);
    }

    @Override // androidx.media3.extractor.t
    public void l() {
        this.f67416b.l();
    }

    @Override // androidx.media3.extractor.t
    public void u(p0 p0Var) {
        this.f67416b.u(new a(p0Var, p0Var));
    }
}
