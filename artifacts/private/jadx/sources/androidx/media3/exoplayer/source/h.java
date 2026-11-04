package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.z3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class h<T> extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f65055h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Handler f65056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.datasource.r1 f65057j;

    private final class a implements b1, androidx.media3.exoplayer.drm.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.media3.common.util.a1
        private final T f65058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b1.a f65059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.exoplayer.drm.t.a f65060c;

        public a(T t10) {
            this.f65059b = h.this.X(null);
            this.f65060c = h.this.S(null);
            this.f65058a = t10;
        }

        private boolean a(int i10, @androidx.annotation.p0 t0.b bVar) {
            t0.b bVarX0;
            if (bVar != null) {
                bVarX0 = h.this.x0(this.f65058a, bVar);
                if (bVarX0 == null) {
                    return false;
                }
            } else {
                bVarX0 = null;
            }
            int iZ0 = h.this.z0(this.f65058a, i10);
            b1.a aVar = this.f65059b;
            if (aVar.f64830a != iZ0 || !Objects.equals(aVar.f64831b, bVarX0)) {
                this.f65059b = h.this.V(iZ0, bVarX0);
            }
            androidx.media3.exoplayer.drm.t.a aVar2 = this.f65060c;
            if (aVar2.f63732a != iZ0 || !Objects.equals(aVar2.f63733b, bVarX0)) {
                this.f65060c = h.this.Q(iZ0, bVarX0);
            }
            return true;
        }

        private h0 g(h0 h0Var, @androidx.annotation.p0 t0.b bVar) {
            long jY0 = h.this.y0(this.f65058a, h0Var.f65070f, bVar);
            long jY1 = h.this.y0(this.f65058a, h0Var.f65071g, bVar);
            return (jY0 == h0Var.f65070f && jY1 == h0Var.f65071g) ? h0Var : new h0(h0Var.f65065a, h0Var.f65066b, h0Var.f65067c, h0Var.f65068d, h0Var.f65069e, jY0, jY1);
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void L(int i10, @androidx.annotation.p0 t0.b bVar) {
            if (a(i10, bVar)) {
                this.f65060c.h();
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void P(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f65059b.t(d0Var, g(h0Var, bVar), iOException, z10);
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void R(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var) {
            if (a(i10, bVar)) {
                this.f65059b.n(d0Var, g(h0Var, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void U(int i10, @androidx.annotation.p0 t0.b bVar, h0 h0Var) {
            if (a(i10, bVar)) {
                this.f65059b.k(g(h0Var, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void b0(int i10, @androidx.annotation.p0 t0.b bVar) {
            if (a(i10, bVar)) {
                this.f65060c.m();
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void g0(int i10, @androidx.annotation.p0 t0.b bVar, h0 h0Var) {
            if (a(i10, bVar)) {
                this.f65059b.C(g(h0Var, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void m0(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var, int i11) {
            if (a(i10, bVar)) {
                this.f65059b.z(d0Var, g(h0Var, bVar), i11);
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void n0(int i10, @androidx.annotation.p0 t0.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f65060c.k(i11);
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void o0(int i10, @androidx.annotation.p0 t0.b bVar) {
            if (a(i10, bVar)) {
                this.f65060c.i();
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void p0(int i10, @androidx.annotation.p0 t0.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f65060c.l(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.b1
        public void s0(int i10, @androidx.annotation.p0 t0.b bVar, d0 d0Var, h0 h0Var) {
            if (a(i10, bVar)) {
                this.f65059b.q(d0Var, g(h0Var, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void t0(int i10, @androidx.annotation.p0 t0.b bVar) {
            if (a(i10, bVar)) {
                this.f65060c.j();
            }
        }
    }

    private static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t0 f65062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t0.c f65063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h<T>.a f65064c;

        public b(t0 t0Var, t0.c cVar, h<T>.a aVar) {
            this.f65062a = t0Var;
            this.f65063b = cVar;
            this.f65064c = aVar;
        }
    }

    protected h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void A0(@androidx.media3.common.util.a1 T t10, t0 t0Var, z3 z3Var);

    protected final void B0(@androidx.media3.common.util.a1 final T t10, t0 t0Var) {
        androidx.media3.common.util.a.a(!this.f65055h.containsKey(t10));
        t0.c cVar = new t0.c() { // from class: androidx.media3.exoplayer.source.g
            @Override // androidx.media3.exoplayer.source.t0.c
            public final void B(t0 t0Var2, z3 z3Var) {
                this.f65042a.A0(t10, t0Var2, z3Var);
            }
        };
        a aVar = new a(t10);
        this.f65055h.put(t10, new b<>(t0Var, cVar, aVar));
        t0Var.i((Handler) androidx.media3.common.util.a.g(this.f65056i), aVar);
        t0Var.j((Handler) androidx.media3.common.util.a.g(this.f65056i), aVar);
        t0Var.C(cVar, this.f65057j, e0());
        if (!f0()) {
            t0Var.M(cVar);
        }
    }

    protected final void C0(@androidx.media3.common.util.a1 T t10) {
        b bVar = (b) androidx.media3.common.util.a.g(this.f65055h.remove(t10));
        bVar.f65062a.n(bVar.f65063b);
        bVar.f65062a.v(bVar.f65064c);
        bVar.f65062a.A(bVar.f65064c);
    }

    @Override // androidx.media3.exoplayer.source.t0
    @androidx.annotation.i
    public void a() throws IOException {
        Iterator<b<T>> it = this.f65055h.values().iterator();
        while (it.hasNext()) {
            it.next().f65062a.a();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    @androidx.annotation.i
    protected void a0() {
        for (b<T> bVar : this.f65055h.values()) {
            bVar.f65062a.M(bVar.f65063b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    @androidx.annotation.i
    protected void d0() {
        for (b<T> bVar : this.f65055h.values()) {
            bVar.f65062a.F(bVar.f65063b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    @androidx.annotation.i
    protected void j0(@androidx.annotation.p0 androidx.media3.datasource.r1 r1Var) {
        this.f65057j = r1Var;
        this.f65056i = androidx.media3.common.util.k1.H();
    }

    @Override // androidx.media3.exoplayer.source.a
    @androidx.annotation.i
    protected void l0() {
        for (b<T> bVar : this.f65055h.values()) {
            bVar.f65062a.n(bVar.f65063b);
            bVar.f65062a.v(bVar.f65064c);
            bVar.f65062a.A(bVar.f65064c);
        }
        this.f65055h.clear();
    }

    protected final void v0(@androidx.media3.common.util.a1 T t10) {
        b bVar = (b) androidx.media3.common.util.a.g(this.f65055h.get(t10));
        bVar.f65062a.M(bVar.f65063b);
    }

    protected final void w0(@androidx.media3.common.util.a1 T t10) {
        b bVar = (b) androidx.media3.common.util.a.g(this.f65055h.get(t10));
        bVar.f65062a.F(bVar.f65063b);
    }

    @androidx.annotation.p0
    protected t0.b x0(@androidx.media3.common.util.a1 T t10, t0.b bVar) {
        return bVar;
    }

    protected long y0(@androidx.media3.common.util.a1 T t10, long j10, @androidx.annotation.p0 t0.b bVar) {
        return j10;
    }

    protected int z0(@androidx.media3.common.util.a1 T t10, int i10) {
        return i10;
    }
}
