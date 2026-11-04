package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.analytics.j4;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class m1 extends androidx.media3.exoplayer.source.a implements l1.c {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f65191p0 = 1048576;

    @androidx.annotation.p0
    private androidx.media3.datasource.r1 X;

    @androidx.annotation.b0("this")
    private androidx.media3.common.k0 Y;

    @androidx.annotation.p0
    private c Z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.datasource.p.a f65192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g1.a f65193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.u f65194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.m f65195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f65196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f65197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final androidx.media3.common.w f65198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.common.base.s0<androidx.media3.exoplayer.util.c> f65199o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f65200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f65201t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f65202v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f65203w;

    class a extends b0 {
        a(z3 z3Var) {
            super(z3Var);
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f61972f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.b0, androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            super.u(i10, dVar, j10);
            dVar.f61998k = true;
            return dVar;
        }
    }

    public static final class b implements c1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.datasource.p.a f65205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g1.a f65206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.media3.exoplayer.drm.w f65207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.m f65208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f65209g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.common.base.s0<androidx.media3.exoplayer.util.c> f65210h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f65211i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private androidx.media3.common.w f65212j;

        public b(androidx.media3.datasource.p.a aVar) {
            this(aVar, new androidx.media3.extractor.l());
        }

        public static /* synthetic */ g1 i(androidx.media3.extractor.w wVar, j4 j4Var) {
            return new d(wVar);
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public int[] c() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public m1 h(androidx.media3.common.k0 k0Var) {
            androidx.media3.common.util.a.g(k0Var.f60822b);
            return new m1(k0Var, this.f65205c, this.f65206d, this.f65207e.a(k0Var), this.f65208f, this.f65209g, this.f65211i, this.f65212j, this.f65210h, null);
        }

        @z7.a
        b l(int i10, androidx.media3.common.w wVar) {
            this.f65211i = i10;
            this.f65212j = (androidx.media3.common.w) androidx.media3.common.util.a.g(wVar);
            return this;
        }

        @z7.a
        public b m(int i10) {
            this.f65209g = i10;
            return this;
        }

        @z7.a
        public <T extends Executor> b n(final com.google.common.base.s0<T> s0Var, final androidx.media3.common.util.o<T> oVar) {
            this.f65210h = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.source.o1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return androidx.media3.exoplayer.util.c.y3((Executor) s0Var.get(), oVar);
                }
            };
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        @z7.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b e(androidx.media3.exoplayer.drm.w wVar) {
            this.f65207e = (androidx.media3.exoplayer.drm.w) androidx.media3.common.util.a.h(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        @z7.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b f(androidx.media3.exoplayer.upstream.m mVar) {
            this.f65208f = (androidx.media3.exoplayer.upstream.m) androidx.media3.common.util.a.h(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(androidx.media3.datasource.p.a aVar, final androidx.media3.extractor.w wVar) {
            this(aVar, new g1.a() { // from class: androidx.media3.exoplayer.source.n1
                @Override // androidx.media3.exoplayer.source.g1.a
                public final g1 a(j4 j4Var) {
                    return m1.b.i(wVar, j4Var);
                }
            });
        }

        public b(androidx.media3.datasource.p.a aVar, g1.a aVar2) {
            this(aVar, aVar2, new androidx.media3.exoplayer.drm.l(), new androidx.media3.exoplayer.upstream.l(), 1048576);
        }

        public b(androidx.media3.datasource.p.a aVar, g1.a aVar2, androidx.media3.exoplayer.drm.w wVar, androidx.media3.exoplayer.upstream.m mVar, int i10) {
            this.f65205c = aVar;
            this.f65206d = aVar2;
            this.f65207e = wVar;
            this.f65208f = mVar;
            this.f65209g = i10;
        }
    }

    public interface c {
        void a(t0 t0Var, androidx.media3.extractor.p0 p0Var);
    }

    /* synthetic */ m1(androidx.media3.common.k0 k0Var, androidx.media3.datasource.p.a aVar, g1.a aVar2, androidx.media3.exoplayer.drm.u uVar, androidx.media3.exoplayer.upstream.m mVar, int i10, int i11, androidx.media3.common.w wVar, com.google.common.base.s0 s0Var, a aVar3) {
        this(k0Var, aVar, aVar2, uVar, mVar, i10, i11, wVar, s0Var);
    }

    private androidx.media3.common.k0.h v0() {
        return (androidx.media3.common.k0.h) androidx.media3.common.util.a.g(g().f60822b);
    }

    private void w0() {
        z3 w1Var = new w1(this.f65201t, this.f65202v, false, this.f65203w, (Object) null, g());
        if (this.f65200s) {
            w1Var = new a(w1Var);
        }
        k0(w1Var);
    }

    @Override // androidx.media3.exoplayer.source.l1.c
    public void E(long j10, androidx.media3.extractor.p0 p0Var, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f65201t;
        }
        boolean zS1 = p0Var.S1();
        if (!this.f65200s && this.f65201t == j10 && this.f65202v == zS1 && this.f65203w == z10) {
            return;
        }
        this.f65201t = j10;
        this.f65202v = zS1;
        this.f65203w = z10;
        this.f65200s = false;
        w0();
        c cVar = this.Z;
        if (cVar != null) {
            cVar.a(this, p0Var);
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized void K(androidx.media3.common.k0 k0Var) {
        try {
            this.Y = k0Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        androidx.media3.common.k0.h hVarV0 = v0();
        androidx.media3.common.k0.h hVar = k0Var.f60822b;
        return hVar != null && hVar.f60920a.equals(hVarV0.f60920a) && hVar.f60929j == hVarV0.f60929j && Objects.equals(hVar.f60925f, hVarV0.f60925f);
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void a() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized androidx.media3.common.k0 g() {
        return this.Y;
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        this.X = r1Var;
        this.f65194j.b((Looper) androidx.media3.common.util.a.g(Looper.myLooper()), e0());
        this.f65194j.A();
        w0();
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        ((l1) s0Var).g0();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void l0() {
        this.f65194j.release();
    }

    public void r0() {
        this.Z = null;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        androidx.media3.datasource.p pVarA = this.f65192h.a();
        androidx.media3.datasource.r1 r1Var = this.X;
        if (r1Var != null) {
            pVarA.s(r1Var);
        }
        androidx.media3.common.k0.h hVarV0 = v0();
        Uri uri = hVarV0.f60920a;
        g1 g1VarA = this.f65193i.a(e0());
        androidx.media3.exoplayer.drm.u uVar = this.f65194j;
        androidx.media3.exoplayer.drm.t.a aVarS = S(bVar);
        androidx.media3.exoplayer.upstream.m mVar = this.f65195k;
        b1.a aVarX = X(bVar);
        String str = hVarV0.f60925f;
        int i10 = this.f65196l;
        int i11 = this.f65197m;
        androidx.media3.common.w wVar = this.f65198n;
        long jD1 = androidx.media3.common.util.k1.D1(hVarV0.f60929j);
        com.google.common.base.s0<androidx.media3.exoplayer.util.c> s0Var = this.f65199o;
        return new l1(uri, pVarA, g1VarA, uVar, aVarS, mVar, aVarX, this, bVar2, str, i10, i11, wVar, jD1, s0Var != null ? s0Var.get() : null);
    }

    public void x0(c cVar) {
        this.Z = cVar;
    }

    private m1(androidx.media3.common.k0 k0Var, androidx.media3.datasource.p.a aVar, g1.a aVar2, androidx.media3.exoplayer.drm.u uVar, androidx.media3.exoplayer.upstream.m mVar, int i10, int i11, @androidx.annotation.p0 androidx.media3.common.w wVar, @androidx.annotation.p0 com.google.common.base.s0<androidx.media3.exoplayer.util.c> s0Var) {
        this.Y = k0Var;
        this.f65192h = aVar;
        this.f65193i = aVar2;
        this.f65194j = uVar;
        this.f65195k = mVar;
        this.f65196l = i10;
        this.f65198n = wVar;
        this.f65197m = i11;
        this.f65200s = true;
        this.f65201t = -9223372036854775807L;
        this.f65199o = s0Var;
    }
}
