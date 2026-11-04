package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.t3;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class f0 implements s0, s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0.b f65016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f65017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f65018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t0 f65019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s0 f65020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private s0.a f65021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private a f65022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f65023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f65024i = -9223372036854775807L;

    public interface a {
        void a(t0.b bVar);

        void b(t0.b bVar, IOException iOException);
    }

    public f0(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        this.f65016a = bVar;
        this.f65018c = bVar2;
        this.f65017b = j10;
    }

    private long r(long j10) {
        long j11 = this.f65024i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public void a(t0.b bVar) {
        long jR = r(this.f65017b);
        s0 s0VarX = ((t0) androidx.media3.common.util.a.g(this.f65019d)).x(bVar, this.f65018c, jR);
        this.f65020e = s0VarX;
        if (this.f65021f != null) {
            s0VarX.v(this, jR);
        }
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long b() {
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).b();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        ((s0) androidx.media3.common.util.k1.o(this.f65020e)).c(j10);
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean d() {
        s0 s0Var = this.f65020e;
        return s0Var != null && s0Var.d();
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public long e() {
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).e();
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long g(long j10, f5 f5Var) {
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).g(j10, f5Var);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long h(long j10) {
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).h(j10);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long i() {
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).i();
    }

    @Override // androidx.media3.exoplayer.source.s0.a
    public void j(s0 s0Var) {
        ((s0.a) androidx.media3.common.util.k1.o(this.f65021f)).j(this);
        a aVar = this.f65022g;
        if (aVar != null) {
            aVar.a(this.f65016a);
        }
    }

    @Override // androidx.media3.exoplayer.source.s0, androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        s0 s0Var = this.f65020e;
        return s0Var != null && s0Var.k(t3Var);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public h2 m() {
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).m();
    }

    public long n() {
        return this.f65024i;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void o() throws IOException {
        try {
            s0 s0Var = this.f65020e;
            if (s0Var != null) {
                s0Var.o();
                return;
            }
            t0 t0Var = this.f65019d;
            if (t0Var != null) {
                t0Var.a();
            }
        } catch (IOException e10) {
            a aVar = this.f65022g;
            if (aVar == null) {
                throw e10;
            }
            if (!this.f65023h) {
                this.f65023h = true;
                aVar.b(this.f65016a, e10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void p(long j10, boolean z10) {
        ((s0) androidx.media3.common.util.k1.o(this.f65020e)).p(j10, z10);
    }

    public long q() {
        return this.f65017b;
    }

    @Override // androidx.media3.exoplayer.source.t1.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void l(s0 s0Var) {
        ((s0.a) androidx.media3.common.util.k1.o(this.f65021f)).l(this);
    }

    @Override // androidx.media3.exoplayer.source.s0
    public long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f65024i;
        if (j11 != -9223372036854775807L && j10 == this.f65017b) {
            j10 = j11;
        }
        this.f65024i = -9223372036854775807L;
        return ((s0) androidx.media3.common.util.k1.o(this.f65020e)).t(c0VarArr, zArr, s1VarArr, zArr2, j10);
    }

    public void u(long j10) {
        this.f65024i = j10;
    }

    @Override // androidx.media3.exoplayer.source.s0
    public void v(s0.a aVar, long j10) {
        this.f65021f = aVar;
        s0 s0Var = this.f65020e;
        if (s0Var != null) {
            s0Var.v(this, r(this.f65017b));
        }
    }

    public void w() {
        if (this.f65020e != null) {
            ((t0) androidx.media3.common.util.a.g(this.f65019d)).l(this.f65020e);
        }
    }

    public void x(t0 t0Var) {
        androidx.media3.common.util.a.i(this.f65019d == null);
        this.f65019d = t0Var;
    }

    public void y(a aVar) {
        this.f65022g = aVar;
    }
}
