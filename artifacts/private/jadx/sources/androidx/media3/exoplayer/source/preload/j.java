package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.b5;
import androidx.media3.exoplayer.e5;
import androidx.media3.exoplayer.k1;
import androidx.media3.exoplayer.s3;
import androidx.media3.exoplayer.trackselection.k0;
import androidx.media3.exoplayer.v4;
import com.google.common.base.s0;
import com.google.common.base.t0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j extends g<Integer> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b5 f65354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k0 f65355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v4 f65356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0.b f65357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f65358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f65359o;

    public static final class b extends g.a<Integer> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f65360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private v4 f65361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k0.a f65362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private s0<androidx.media3.exoplayer.upstream.d> f65363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private s0<e5> f65364h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private s0<s3> f65365i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f65366j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f65367k;

        public b(final Context context, g0<Integer> g0Var) {
            super(new c(), g0Var, t0.b(new s0() { // from class: androidx.media3.exoplayer.source.preload.n
                @Override // com.google.common.base.s0
                public final Object get() {
                    return j.b.e(context);
                }
            }));
            this.f65360d = context;
            this.f65361e = new v4();
            this.f65362f = new k0.a() { // from class: androidx.media3.exoplayer.source.preload.o
                @Override // androidx.media3.exoplayer.trackselection.k0.a
                public final k0 a(Context context2) {
                    return new androidx.media3.exoplayer.trackselection.n(context2);
                }
            };
            this.f65363g = new s0() { // from class: androidx.media3.exoplayer.source.preload.p
                @Override // com.google.common.base.s0
                public final Object get() {
                    return androidx.media3.exoplayer.upstream.k.o(context);
                }
            };
            this.f65364h = t0.b(new s0() { // from class: androidx.media3.exoplayer.source.preload.q
                @Override // com.google.common.base.s0
                public final Object get() {
                    return j.b.f(context);
                }
            });
            this.f65365i = t0.b(new k1());
        }

        public static /* synthetic */ androidx.media3.exoplayer.upstream.d b(androidx.media3.exoplayer.upstream.d dVar) {
            return dVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a d(androidx.media3.exoplayer.source.t0.a aVar) {
            return aVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a e(Context context) {
            return new androidx.media3.exoplayer.source.q(context);
        }

        public static /* synthetic */ e5 f(Context context) {
            return new androidx.media3.exoplayer.r(context);
        }

        public static /* synthetic */ s3 g(s3 s3Var) {
            return s3Var;
        }

        public static /* synthetic */ e5 h(e5 e5Var) {
            return e5Var;
        }

        @Override // androidx.media3.exoplayer.source.preload.g.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public j a() {
            androidx.media3.common.util.a.i(!this.f65366j);
            this.f65366j = true;
            return new j(this);
        }

        public ExoPlayer p() {
            return q(new ExoPlayer.b(this.f65360d));
        }

        public ExoPlayer q(ExoPlayer.b bVar) {
            this.f65367k = true;
            return bVar.L(this.f65348c.get()).C(this.f65363g.get()).T(this.f65364h.get()).I(this.f65365i.get()).P(this.f65361e).a0(this.f65362f.a(this.f65360d)).w();
        }

        @z7.a
        public b r(final androidx.media3.exoplayer.upstream.d dVar) {
            androidx.media3.common.util.a.i((this.f65366j || this.f65367k) ? false : true);
            this.f65363g = new s0() { // from class: androidx.media3.exoplayer.source.preload.m
                @Override // com.google.common.base.s0
                public final Object get() {
                    return j.b.b(dVar);
                }
            };
            return this;
        }

        @z7.a
        public b s(final s3 s3Var) {
            androidx.media3.common.util.a.i((this.f65366j || this.f65367k) ? false : true);
            this.f65365i = new s0() { // from class: androidx.media3.exoplayer.source.preload.k
                @Override // com.google.common.base.s0
                public final Object get() {
                    return j.b.g(s3Var);
                }
            };
            return this;
        }

        @z7.a
        public b t(final androidx.media3.exoplayer.source.t0.a aVar) {
            androidx.media3.common.util.a.i((this.f65366j || this.f65367k) ? false : true);
            this.f65348c = new s0() { // from class: androidx.media3.exoplayer.source.preload.r
                @Override // com.google.common.base.s0
                public final Object get() {
                    return j.b.d(aVar);
                }
            };
            return this;
        }

        @z7.a
        public b u(Looper looper) {
            androidx.media3.common.util.a.i((this.f65366j || this.f65367k) ? false : true);
            this.f65361e = new v4(looper);
            return this;
        }

        @z7.a
        public b v(final e5 e5Var) {
            androidx.media3.common.util.a.i((this.f65366j || this.f65367k) ? false : true);
            this.f65364h = new s0() { // from class: androidx.media3.exoplayer.source.preload.l
                @Override // com.google.common.base.s0
                public final Object get() {
                    return j.b.h(e5Var);
                }
            };
            return this;
        }

        @z7.a
        public b w(k0.a aVar) {
            androidx.media3.common.util.a.i((this.f65366j || this.f65367k) ? false : true);
            this.f65362f = aVar;
            return this;
        }
    }

    private static final class c implements Comparator<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f65368a = -1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.f65368a), Math.abs(num2.intValue() - this.f65368a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements d0.d {
        private d() {
        }

        public static /* synthetic */ boolean g(long j10, e eVar) {
            return eVar.a() == 2 && eVar.getValue() > androidx.media3.common.util.k1.A2(j10);
        }

        public static /* synthetic */ boolean h(e eVar) {
            return eVar.a() > 1;
        }

        public static /* synthetic */ boolean i(e eVar) {
            return eVar.a() > 0;
        }

        private boolean j(d0 d0Var, com.google.common.base.k0<e> k0Var, boolean z10) {
            g0.a aVarO = j.this.o(d0Var);
            if (aVarO == null) {
                j.this.v(d0Var);
            } else {
                if (k0Var.apply((e) androidx.media3.common.util.a.g((e) aVarO))) {
                    return true;
                }
                if (z10) {
                    j.this.k(d0Var);
                }
                j.this.t(d0Var);
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.source.preload.d0.d
        public void a(d0 d0Var) {
            j.this.t(d0Var);
        }

        @Override // androidx.media3.exoplayer.source.preload.d0.d
        public boolean b(d0 d0Var) {
            return j(d0Var, new com.google.common.base.k0() { // from class: androidx.media3.exoplayer.source.preload.s
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return j.d.h((j.e) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.d0.d
        public void c(v vVar, d0 d0Var) {
            j.this.u(vVar, d0Var);
        }

        @Override // androidx.media3.exoplayer.source.preload.d0.d
        public void d(d0 d0Var) {
            j.this.v(d0Var);
        }

        @Override // androidx.media3.exoplayer.source.preload.d0.d
        public boolean e(d0 d0Var, final long j10) {
            return j(d0Var, new com.google.common.base.k0() { // from class: androidx.media3.exoplayer.source.preload.u
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return j.d.g(j10, (j.e) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.d0.d
        public boolean f(d0 d0Var) {
            return j(d0Var, new com.google.common.base.k0() { // from class: androidx.media3.exoplayer.source.preload.t
                @Override // com.google.common.base.k0
                public final boolean apply(Object obj) {
                    return j.d.i((j.e) obj);
                }
            }, true);
        }
    }

    public static /* synthetic */ void G() {
    }

    public static /* synthetic */ void H(j jVar) {
        jVar.f65354j.release();
        if (!jVar.f65359o) {
            jVar.f65355k.j();
        }
        jVar.f65356l.b();
    }

    public void I(int i10) {
        ((c) this.f65338b).f65368a = i10;
    }

    @Override // androidx.media3.exoplayer.source.preload.g
    protected void k(androidx.media3.exoplayer.source.t0 t0Var) {
        androidx.media3.common.util.a.a(t0Var instanceof d0);
        ((d0) t0Var).f1();
    }

    @Override // androidx.media3.exoplayer.source.preload.g
    public androidx.media3.exoplayer.source.t0 l(androidx.media3.exoplayer.source.t0 t0Var) {
        return this.f65357m.j(t0Var);
    }

    @Override // androidx.media3.exoplayer.source.preload.g
    protected void w(androidx.media3.exoplayer.source.t0 t0Var, long j10) {
        androidx.media3.common.util.a.a(t0Var instanceof d0);
        ((d0) t0Var).k1(j10);
    }

    @Override // androidx.media3.exoplayer.source.preload.g
    protected void y() {
        this.f65358n.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.h
            @Override // java.lang.Runnable
            public final void run() {
                j.H(this.f65353a);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.preload.g
    protected void z(androidx.media3.exoplayer.source.t0 t0Var) {
        androidx.media3.common.util.a.a(t0Var instanceof d0);
        ((d0) t0Var).l1();
    }

    private j(b bVar) {
        super(new c(), bVar.f65347b, bVar.f65348c.get());
        androidx.media3.exoplayer.o oVarA = new androidx.media3.exoplayer.o.b((e5) bVar.f65364h.get()).a();
        this.f65354j = oVarA;
        v4 v4Var = bVar.f65361e;
        this.f65356l = v4Var;
        k0 k0VarA = bVar.f65362f.a(bVar.f65360d);
        this.f65355k = k0VarA;
        androidx.media3.exoplayer.upstream.d dVar = (androidx.media3.exoplayer.upstream.d) bVar.f65363g.get();
        k0VarA.e(new k0.b() { // from class: androidx.media3.exoplayer.source.preload.i
            @Override // androidx.media3.exoplayer.trackselection.k0.b
            public final void b() {
                j.G();
            }
        }, dVar);
        Looper looperA = v4Var.a();
        this.f65357m = new d0.b(bVar.f65348c.get(), new d(), k0VarA, dVar, oVarA.a(), ((s3) bVar.f65365i.get()).e(), looperA);
        this.f65358n = androidx.media3.common.util.k1.G(looperA, null);
        this.f65359o = false;
    }

    public static class e implements g0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f65370c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f65371d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f65372e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f65373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f65374b;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public e(int i10, long j10) {
            this.f65373a = i10;
            this.f65374b = j10;
        }

        @Override // androidx.media3.exoplayer.source.preload.g0.a
        public int a() {
            return this.f65373a;
        }

        @Override // androidx.media3.exoplayer.source.preload.g0.a
        public long getValue() {
            return this.f65374b;
        }

        public e(int i10) {
            this(i10, -9223372036854775807L);
        }
    }

    @Deprecated
    public j(g0<Integer> g0Var, androidx.media3.exoplayer.source.t0.a aVar, k0 k0Var, androidx.media3.exoplayer.upstream.d dVar, b5.a aVar2, androidx.media3.exoplayer.upstream.b bVar, Looper looper) {
        super(new c(), g0Var, aVar);
        b5 b5VarA = aVar2.a();
        this.f65354j = b5VarA;
        v4 v4Var = new v4(looper);
        this.f65356l = v4Var;
        this.f65355k = k0Var;
        Looper looperA = v4Var.a();
        this.f65357m = new d0.b(aVar, new d(), k0Var, dVar, b5VarA.a(), bVar, looperA);
        this.f65358n = androidx.media3.common.util.k1.G(looperA, null);
        this.f65359o = true;
    }
}
