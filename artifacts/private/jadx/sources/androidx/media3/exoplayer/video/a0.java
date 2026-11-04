package androidx.media3.exoplayer.video;

import androidx.media3.common.n4;
import androidx.media3.common.util.v0;
import androidx.media3.exoplayer.s0;

/* JADX INFO: loaded from: classes3.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f66242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f66243b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f66252k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x.b f66244c = new x.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v0<n4> f66245d = new v0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0<Long> f66246e = new v0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.common.util.b0 f66247f = new androidx.media3.common.util.b0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f66248g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n4 f66251j = n4.f60993h;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f66249h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f66250i = -9223372036854775807L;

    interface a {
        void a(n4 n4Var);

        void b(long j10, long j11, boolean z10);

        void c();
    }

    public a0(a aVar, x xVar) {
        this.f66242a = aVar;
        this.f66243b = xVar;
    }

    private void a() {
        this.f66247f.g();
        this.f66242a.c();
    }

    private static <T> T c(v0<T> v0Var) {
        androidx.media3.common.util.a.a(v0Var.l() > 0);
        while (v0Var.l() > 1) {
            v0Var.i();
        }
        return (T) androidx.media3.common.util.a.g(v0Var.i());
    }

    private boolean e(long j10) {
        Long lJ = this.f66246e.j(j10);
        if (lJ == null || lJ.longValue() == this.f66252k) {
            return false;
        }
        this.f66252k = lJ.longValue();
        return true;
    }

    private boolean f(long j10) {
        n4 n4VarJ = this.f66245d.j(j10);
        if (n4VarJ == null || n4VarJ.equals(n4.f60993h) || n4VarJ.equals(this.f66251j)) {
            return false;
        }
        this.f66251j = n4VarJ;
        return true;
    }

    private void k(boolean z10) {
        long jG = this.f66247f.g();
        if (f(jG)) {
            this.f66242a.a(this.f66251j);
        }
        this.f66242a.b(z10 ? -1L : this.f66244c.g(), jG, this.f66243b.i());
    }

    public void b() {
        this.f66247f.c();
        this.f66248g = -9223372036854775807L;
        this.f66249h = -9223372036854775807L;
        this.f66250i = -9223372036854775807L;
        if (this.f66246e.l() > 0) {
            Long l10 = (Long) c(this.f66246e);
            l10.longValue();
            this.f66246e.a(0L, l10);
        }
        if (this.f66245d.l() > 0) {
            this.f66245d.a(0L, (n4) c(this.f66245d));
        }
    }

    public boolean d() {
        long j10 = this.f66250i;
        return j10 != -9223372036854775807L && this.f66249h == j10;
    }

    public void g(long j10) {
        this.f66247f.a(j10);
        this.f66248g = j10;
        this.f66250i = -9223372036854775807L;
    }

    public void h(long j10) {
        v0<Long> v0Var = this.f66246e;
        long j11 = this.f66248g;
        v0Var.a(j11 == -9223372036854775807L ? 0L : j11 + 1, Long.valueOf(j10));
    }

    public void i(int i10, int i11) {
        v0<n4> v0Var = this.f66245d;
        long j10 = this.f66248g;
        v0Var.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new n4(i10, i11));
    }

    public void j(long j10, long j11) throws s0 {
        while (!this.f66247f.f()) {
            long jE = this.f66247f.e();
            if (e(jE)) {
                this.f66243b.j();
            }
            int iC = this.f66243b.c(jE, j10, j11, this.f66252k, false, false, this.f66244c);
            if (iC == 0 || iC == 1) {
                this.f66249h = jE;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f66249h = jE;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f66249h = jE;
            }
        }
    }

    public void l() {
        this.f66250i = this.f66248g;
    }
}
