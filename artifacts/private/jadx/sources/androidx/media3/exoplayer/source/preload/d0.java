package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.exoplayer.source.j2;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.t3;
import androidx.media3.exoplayer.trackselection.k0;
import androidx.media3.exoplayer.trackselection.l0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d0 extends j2 {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final String f65305h3 = "PreloadMediaSource";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final long f65306i3 = 100;

    @p0
    private Pair<x, t0.b> H1;
    private boolean X;
    private boolean Y;
    private long Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f65307g3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f65308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k0 f65309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.d f65310o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private z3 f65311p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private Pair<x, c> f65312p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f65313p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a5[] f65314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f65315t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Handler f65316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Handler f65317w;

    public static final class b implements t0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t0.a f65318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Looper f65319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.media3.exoplayer.upstream.b f65320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final k0 f65321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final androidx.media3.exoplayer.upstream.d f65322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final a5[] f65323h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final d f65324i;

        public b(t0.a aVar, d dVar, k0 k0Var, androidx.media3.exoplayer.upstream.d dVar2, a5[] a5VarArr, androidx.media3.exoplayer.upstream.b bVar, Looper looper) {
            this.f65318c = aVar;
            this.f65324i = dVar;
            this.f65321f = k0Var;
            this.f65322g = dVar2;
            this.f65323h = (a5[]) Arrays.copyOf(a5VarArr, a5VarArr.length);
            this.f65320e = bVar;
            this.f65319d = looper;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        public int[] c() {
            return this.f65318c.c();
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public d0 h(androidx.media3.common.k0 k0Var) {
            return new d0(this.f65318c.h(k0Var), this.f65324i, this.f65321f, this.f65322g, this.f65323h, this.f65320e, this.f65319d);
        }

        public d0 j(t0 t0Var) {
            return new d0(t0Var, this.f65324i, this.f65321f, this.f65322g, this.f65323h, this.f65320e, this.f65319d);
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b g(androidx.media3.exoplayer.upstream.f.c cVar) {
            this.f65318c.g(cVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e(androidx.media3.exoplayer.drm.w wVar) {
            this.f65318c.e(wVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.t0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b f(androidx.media3.exoplayer.upstream.m mVar) {
            this.f65318c.f(mVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t0.b f65325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Long f65326b;

        public c(t0.b bVar, long j10) {
            this.f65325a = bVar;
            this.f65326b = Long.valueOf(j10);
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return d0.i1(this.f65325a, cVar.f65325a) && this.f65326b.equals(cVar.f65326b);
        }

        public int hashCode() {
            int iHashCode = (527 + this.f65325a.f65467a.hashCode()) * 31;
            t0.b bVar = this.f65325a;
            return ((((((iHashCode + bVar.f65468b) * 31) + bVar.f65469c) * 31) + bVar.f65471e) * 31) + this.f65326b.intValue();
        }
    }

    public interface d {
        default void a(d0 d0Var) {
        }

        boolean b(d0 d0Var);

        void c(v vVar, d0 d0Var);

        void d(d0 d0Var);

        boolean e(d0 d0Var, long j10);

        boolean f(d0 d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f65327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f65328b;

        public e(long j10) {
            this.f65327a = j10;
        }

        public static /* synthetic */ void a(e eVar, s0 s0Var) {
            if (d0.this.h1()) {
                return;
            }
            x xVar = (x) s0Var;
            long jB = s0Var.b();
            boolean z10 = eVar.f65328b;
            if (z10 && jB == Long.MIN_VALUE) {
                d0.this.f65308m.a(d0.this);
                d0.this.m1();
            } else if (!z10 || d0.this.f65308m.e(d0.this, jB - eVar.f65327a)) {
                xVar.k(new t3.b().f(eVar.f65327a).d());
            } else {
                d0.this.m1();
            }
        }

        public static /* synthetic */ void b(e eVar, s0 s0Var) {
            l0 l0VarK;
            if (d0.this.h1()) {
                return;
            }
            x xVar = (x) s0Var;
            try {
                l0VarK = d0.this.f65309n.k(d0.this.f65314s, xVar.m(), ((c) ((Pair) androidx.media3.common.util.a.g(d0.this.f65312p1)).second).f65325a, (z3) androidx.media3.common.util.a.g(d0.this.f65311p0));
            } catch (androidx.media3.exoplayer.s0 e10) {
                androidx.media3.common.util.z.e(d0.f65305h3, "Failed to select tracks", e10);
                l0VarK = null;
            }
            if (l0VarK == null) {
                d0.this.m1();
                return;
            }
            xVar.s(l0VarK.f65720c, eVar.f65327a);
            if (d0.this.f65308m.b(d0.this)) {
                xVar.k(new t3.b().f(eVar.f65327a).d());
            } else {
                d0.this.m1();
            }
        }

        @Override // androidx.media3.exoplayer.source.t1.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void l(final s0 s0Var) {
            d0.this.f65316v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.f0
                @Override // java.lang.Runnable
                public final void run() {
                    d0.e.a(this.f65335a, s0Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.s0.a
        public void j(final s0 s0Var) {
            this.f65328b = true;
            d0.this.f65316v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.e0
                @Override // java.lang.Runnable
                public final void run() {
                    d0.e.b(this.f65333a, s0Var);
                }
            });
        }
    }

    public static /* synthetic */ void Q0(d0 d0Var) {
        d0Var.X = false;
        d0Var.Z = -9223372036854775807L;
        d0Var.f65313p2 = false;
        Pair<x, c> pair = d0Var.f65312p1;
        if (pair != null) {
            d0Var.f65088k.l(((x) pair.first).f65384a);
            d0Var.f65312p1 = null;
        }
        d0Var.l0();
        d0Var.f65316v.removeCallbacksAndMessages(null);
        d0Var.f65317w.removeCallbacksAndMessages(null);
    }

    public static /* synthetic */ void R0(d0 d0Var) {
        Pair<x, c> pair = d0Var.f65312p1;
        if (pair != null) {
            d0Var.f65088k.l(((x) pair.first).f65384a);
            d0Var.f65312p1 = null;
        }
    }

    public static /* synthetic */ void T0(d0 d0Var, long j10) {
        d0Var.X = true;
        d0Var.Z = j10;
        d0Var.f65313p2 = false;
        if (d0Var.h1()) {
            d0Var.j1();
            return;
        }
        d0Var.q0(j4.f63008d);
        d0Var.j0(d0Var.f65310o.e());
        d0Var.e1();
    }

    public static /* synthetic */ void U0(d0 d0Var, z3 z3Var) {
        if (!d0Var.h1() && !d0Var.f65313p2) {
            d0Var.f65313p2 = true;
            if (!d0Var.f65308m.f(d0Var)) {
                d0Var.m1();
            } else {
                Pair<Object, Long> pairP = z3Var.p(new z3.d(), new z3.b(), 0, d0Var.Z);
                d0Var.x(new t0.b(pairP.first), d0Var.f65315t, ((Long) pairP.second).longValue()).q(d0Var.new e(((Long) pairP.second).longValue()), ((Long) pairP.second).longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        try {
            a();
            Pair<x, c> pair = this.f65312p1;
            if (pair != null) {
                x xVar = (x) pair.first;
                if (xVar.f65385b) {
                    xVar.l();
                } else {
                    xVar.o();
                }
            }
            this.f65316v.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65295a.e1();
                }
            }, f65306i3);
        } catch (IOException e10) {
            this.f65308m.c(new v(g(), null, e10), this);
            m1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h1() {
        return h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i1(t0.b bVar, t0.b bVar2) {
        return bVar.f65467a.equals(bVar2.f65467a) && bVar.f65468b == bVar2.f65468b && bVar.f65469c == bVar2.f65469c && bVar.f65471e == bVar2.f65471e;
    }

    private void j1() {
        this.f65308m.d(this);
        m1();
        this.f65307g3 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1() {
        this.f65316v.removeCallbacksAndMessages(null);
    }

    @Override // androidx.media3.exoplayer.source.j2
    protected t0.b F0(t0.b bVar) {
        Pair<x, t0.b> pair = this.H1;
        return (pair == null || !i1(bVar, (t0.b) ((Pair) androidx.media3.common.util.a.g(pair)).second)) ? bVar : (t0.b) ((Pair) androidx.media3.common.util.a.g(this.H1)).second;
    }

    @Override // androidx.media3.exoplayer.source.j2
    protected void L0(final z3 z3Var) {
        this.f65311p0 = z3Var;
        k0(z3Var);
        this.f65316v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.U0(this.f65301a, z3Var);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.j2
    protected void O0() {
        if (h1() && !this.f65307g3) {
            j1();
        }
        z3 z3Var = this.f65311p0;
        if (z3Var != null) {
            L0(z3Var);
        } else {
            if (this.Y) {
                return;
            }
            this.Y = true;
            N0();
        }
    }

    public void f1() {
        k1.O1(this.f65316v, new Runnable() { // from class: androidx.media3.exoplayer.source.preload.z
            @Override // java.lang.Runnable
            public final void run() {
                d0.R0(this.f65396a);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public x x(t0.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j10) {
        c cVar = new c(bVar, j10);
        Pair<x, c> pair = this.f65312p1;
        if (pair != null && cVar.equals(pair.second)) {
            x xVar = (x) ((Pair) androidx.media3.common.util.a.g(this.f65312p1)).first;
            if (h1()) {
                this.f65312p1 = null;
                this.H1 = new Pair<>(xVar, bVar);
            }
            return xVar;
        }
        Pair<x, c> pair2 = this.f65312p1;
        if (pair2 != null) {
            this.f65088k.l(((x) ((Pair) androidx.media3.common.util.a.g(pair2)).first).f65384a);
            this.f65312p1 = null;
        }
        x xVar2 = new x(this.f65088k.x(bVar, bVar2, j10));
        if (!h1()) {
            this.f65312p1 = new Pair<>(xVar2, cVar);
        }
        return xVar2;
    }

    public void k1(final long j10) {
        this.f65316v.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.b0
            @Override // java.lang.Runnable
            public final void run() {
                d0.T0(this.f65297a, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.j2, androidx.media3.exoplayer.source.t0
    public void l(s0 s0Var) {
        x xVar = (x) s0Var;
        Pair<x, c> pair = this.f65312p1;
        if (pair == null || xVar != ((Pair) androidx.media3.common.util.a.g(pair)).first) {
            Pair<x, t0.b> pair2 = this.H1;
            if (pair2 != null && xVar == ((Pair) androidx.media3.common.util.a.g(pair2)).first) {
                this.H1 = null;
            }
        } else {
            this.f65312p1 = null;
        }
        this.f65088k.l(xVar.f65384a);
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    protected void l0() {
        if (h1()) {
            return;
        }
        this.f65307g3 = false;
        if (this.X) {
            return;
        }
        this.f65311p0 = null;
        this.Y = false;
        super.l0();
    }

    public void l1() {
        this.f65317w.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.y
            @Override // java.lang.Runnable
            public final void run() {
                d0.Q0(this.f65395a);
            }
        });
    }

    private d0(t0 t0Var, d dVar, k0 k0Var, androidx.media3.exoplayer.upstream.d dVar2, a5[] a5VarArr, androidx.media3.exoplayer.upstream.b bVar, Looper looper) {
        super(t0Var);
        this.f65308m = dVar;
        this.f65309n = k0Var;
        this.f65310o = dVar2;
        this.f65314s = a5VarArr;
        this.f65315t = bVar;
        this.f65316v = k1.G(looper, null);
        this.f65317w = k1.G(looper, null);
        this.Z = -9223372036854775807L;
    }
}
