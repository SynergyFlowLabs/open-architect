package androidx.media3.exoplayer.source;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class z extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f65584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f65585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private androidx.media3.common.k0 f65586j;

    public static final class b implements t0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f65587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x f65588d;

        public b(long j10, x xVar) {
            this.f65587c = j10;
            this.f65588d = xVar;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public int[] c() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public t0.a e(androidx.media3.exoplayer.drm.w wVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public t0.a f(androidx.media3.exoplayer.upstream.m mVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public z h(androidx.media3.common.k0 k0Var) {
            return new z(k0Var, this.f65587c, this.f65588d);
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized void K(androidx.media3.common.k0 k0Var) {
        try {
            this.f65586j = k0Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.t0
    public boolean O(androidx.media3.common.k0 k0Var) {
        androidx.media3.common.k0.h hVar = k0Var.f60822b;
        androidx.media3.common.k0.h hVar2 = (androidx.media3.common.k0.h) androidx.media3.common.util.a.g(g().f60822b);
        if (hVar == null || !hVar.f60920a.equals(hVar2.f60920a) || !Objects.equals(hVar.f60921b, hVar2.f60921b)) {
            return false;
        }
        long j10 = hVar.f60929j;
        return j10 == -9223372036854775807L || androidx.media3.common.util.k1.D1(j10) == this.f65585i;
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void a() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public synchronized androidx.media3.common.k0 g() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f65586j;
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        k0(new w1(this.f65585i, true, false, false, (Object) null, g()));
    }

    @Override // androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        ((y) s0Var).q();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void l0() {
    }

    @Override // androidx.media3.exoplayer.source.t0
    public s0 x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        androidx.media3.common.k0 k0VarG = g();
        androidx.media3.common.util.a.g(k0VarG.f60822b);
        androidx.media3.common.util.a.h(k0VarG.f60822b.f60921b, "Externally loaded mediaItems require a MIME type.");
        androidx.media3.common.k0.h hVar = k0VarG.f60822b;
        return new y(hVar.f60920a, hVar.f60921b, this.f65584h);
    }

    private z(androidx.media3.common.k0 k0Var, long j10, x xVar) {
        this.f65586j = k0Var;
        this.f65585i = j10;
        this.f65584h = xVar;
    }
}
