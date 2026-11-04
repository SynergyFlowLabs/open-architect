package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.media3.common.n4;
import androidx.media3.common.s0;
import androidx.media3.common.util.r0;
import androidx.media3.common.util.y0;
import androidx.media3.exoplayer.z4;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class e implements m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f66287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.common.util.j f66288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f66289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Queue<m0.c> f66290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Surface f66291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.common.w f66292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f66293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f66294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m0.b f66295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Executor f66296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private w f66297m;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements a0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.media3.common.w f66298a;

        private b() {
        }

        @Override // androidx.media3.exoplayer.video.a0.a
        public void a(final n4 n4Var) {
            this.f66298a = new androidx.media3.common.w.b().B0(n4Var.f60997a).d0(n4Var.f60998b).u0(s0.E).N();
            e.this.f66296l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.h
                @Override // java.lang.Runnable
                public final void run() {
                    e.b bVar = this.f66310a;
                    e.this.f66295k.d(e.this, n4Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.a0.a
        public void b(long j10, long j11, boolean z10) {
            if (z10 && e.this.f66291g != null) {
                e.this.f66296l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.b bVar = this.f66303a;
                        e.this.f66295k.a(e.this);
                    }
                });
            }
            androidx.media3.common.w wVarN = this.f66298a;
            if (wVarN == null) {
                wVarN = new androidx.media3.common.w.b().N();
            }
            e.this.f66297m.h(j11, e.this.f66288d.a(), wVarN, null);
            ((m0.c) e.this.f66290f.remove()).b(j10);
        }

        @Override // androidx.media3.exoplayer.video.a0.a
        public void c() {
            e.this.f66296l.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    e.b bVar = this.f66307a;
                    e.this.f66295k.c(e.this);
                }
            });
            ((m0.c) e.this.f66290f.remove()).a();
        }
    }

    public e(x xVar, androidx.media3.common.util.j jVar) {
        this.f66287c = xVar;
        xVar.o(jVar);
        this.f66288d = jVar;
        this.f66289e = new a0(new b(), xVar);
        this.f66290f = new ArrayDeque();
        this.f66292h = new androidx.media3.common.w.b().N();
        this.f66293i = -9223372036854775807L;
        this.f66295k = m0.b.f66395a;
        this.f66296l = new Executor() { // from class: androidx.media3.exoplayer.video.c
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                e.e(runnable);
            }
        };
        this.f66297m = new w() { // from class: androidx.media3.exoplayer.video.d
            @Override // androidx.media3.exoplayer.video.w
            public final void h(long j10, long j11, androidx.media3.common.w wVar, MediaFormat mediaFormat) {
                e.p(j10, j11, wVar, mediaFormat);
            }
        };
    }

    public static /* synthetic */ void e(Runnable runnable) {
    }

    public static /* synthetic */ void p(long j10, long j11, androidx.media3.common.w wVar, MediaFormat mediaFormat) {
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void B(boolean z10) {
        this.f66287c.e(z10);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void G(float f10) {
        this.f66287c.r(f10);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void L(List<androidx.media3.common.p> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public boolean Z() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public boolean a() {
        return this.f66289e.d();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public Surface b() {
        return (Surface) androidx.media3.common.util.a.k(this.f66291g);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void c(Surface surface, r0 r0Var) {
        this.f66291g = surface;
        this.f66287c.q(surface);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void d() {
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void f() {
        this.f66291g = null;
        this.f66287c.q(null);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void g(long j10, long j11) throws m0.d {
        try {
            this.f66289e.j(j10, j11);
        } catch (androidx.media3.exoplayer.s0 e10) {
            throw new m0.d(e10, this.f66292h);
        }
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void h() {
        this.f66289e.l();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void i() {
        this.f66287c.l();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void j() {
        this.f66287c.a();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void k(w wVar) {
        this.f66297m = wVar;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public boolean l(androidx.media3.common.w wVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void m(boolean z10) {
        this.f66287c.h(z10);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void n(int i10) {
        this.f66287c.n(i10);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public boolean o(Bitmap bitmap, y0 y0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void q(m0.b bVar, Executor executor) {
        this.f66295k = bVar;
        this.f66296l = executor;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public boolean r(long j10, boolean z10, m0.c cVar) {
        this.f66290f.add(cVar);
        this.f66289e.g(j10 - this.f66294j);
        return true;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void s(long j10, long j11) {
        if (j10 != this.f66293i) {
            this.f66289e.h(j10);
            this.f66293i = j10;
        }
        this.f66294j = j11;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void t(z4.c cVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public boolean v(boolean z10) {
        return this.f66287c.d(z10);
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void w() {
        this.f66287c.k();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void x(int i10, androidx.media3.common.w wVar, List<androidx.media3.common.p> list) {
        androidx.media3.common.util.a.i(list.isEmpty());
        int i11 = wVar.f61768v;
        androidx.media3.common.w wVar2 = this.f66292h;
        if (i11 != wVar2.f61768v || wVar.f61769w != wVar2.f61769w) {
            this.f66289e.i(i11, wVar.f61769w);
        }
        float f10 = wVar.f61770x;
        if (f10 != this.f66292h.f61770x) {
            this.f66287c.p(f10);
        }
        this.f66292h = wVar;
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void y() {
        this.f66287c.g();
    }

    @Override // androidx.media3.exoplayer.video.m0
    public void z(boolean z10) {
        if (z10) {
            this.f66287c.m();
        }
        this.f66289e.b();
        this.f66290f.clear();
    }
}
