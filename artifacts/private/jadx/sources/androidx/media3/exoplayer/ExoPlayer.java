package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ExoPlayer extends androidx.media3.common.z0 {

    @androidx.media3.common.util.b1
    public static final long Z0 = 500;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final long f62743a1 = 2000;

    @androidx.media3.common.util.b1
    public interface a {
        default void l(boolean z10) {
        }

        default void n(boolean z10) {
        }
    }

    public static final class b {
        long A;
        long B;
        boolean C;
        boolean D;

        @androidx.annotation.p0
        v4 E;
        boolean F;
        boolean G;
        String H;
        boolean I;
        y5 J;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f62744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.media3.common.util.j f62745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f62746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.common.base.s0<e5> f62747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a> f62748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.common.base.s0<androidx.media3.exoplayer.trackselection.k0> f62749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.google.common.base.s0<s3> f62750g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        com.google.common.base.s0<androidx.media3.exoplayer.upstream.d> f62751h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        com.google.common.base.t<androidx.media3.common.util.j, androidx.media3.exoplayer.analytics.a> f62752i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f62753j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f62754k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        androidx.media3.common.b1 f62755l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        androidx.media3.common.d f62756m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f62757n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f62758o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f62759p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f62760q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f62761r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f62762s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f62763t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f62764u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        f5 f62765v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f62766w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f62767x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f62768y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        r3 f62769z;

        public b(final Context context) {
            this(context, (com.google.common.base.s0<e5>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.v0
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.b(context);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.w0
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.e(context);
                }
            });
        }

        public static /* synthetic */ e5 a(e5 e5Var) {
            return e5Var;
        }

        public static /* synthetic */ e5 b(Context context) {
            return new r(context);
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a c(androidx.media3.exoplayer.source.t0.a aVar) {
            return aVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a d(Context context) {
            return new androidx.media3.exoplayer.source.q(context, new androidx.media3.extractor.l());
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a e(Context context) {
            return new androidx.media3.exoplayer.source.q(context, new androidx.media3.extractor.l());
        }

        public static /* synthetic */ e5 f(e5 e5Var) {
            return e5Var;
        }

        public static /* synthetic */ s3 g(s3 s3Var) {
            return s3Var;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a h(androidx.media3.exoplayer.source.t0.a aVar) {
            return aVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.upstream.d i(androidx.media3.exoplayer.upstream.d dVar) {
            return dVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a j(androidx.media3.exoplayer.source.t0.a aVar) {
            return aVar;
        }

        public static /* synthetic */ e5 k(Context context) {
            return new r(context);
        }

        public static /* synthetic */ androidx.media3.exoplayer.trackselection.k0 m(androidx.media3.exoplayer.trackselection.k0 k0Var) {
            return k0Var;
        }

        public static /* synthetic */ e5 n(e5 e5Var) {
            return e5Var;
        }

        public static /* synthetic */ androidx.media3.exoplayer.analytics.a o(androidx.media3.exoplayer.analytics.a aVar, androidx.media3.common.util.j jVar) {
            return aVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.t0.a p(androidx.media3.exoplayer.source.t0.a aVar) {
            return aVar;
        }

        public static /* synthetic */ e5 q(e5 e5Var) {
            return e5Var;
        }

        public static /* synthetic */ androidx.media3.exoplayer.analytics.a r(androidx.media3.exoplayer.analytics.a aVar, androidx.media3.common.util.j jVar) {
            return aVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.trackselection.k0 s(androidx.media3.exoplayer.trackselection.k0 k0Var) {
            return k0Var;
        }

        public static /* synthetic */ androidx.media3.exoplayer.upstream.d t(androidx.media3.exoplayer.upstream.d dVar) {
            return dVar;
        }

        public static /* synthetic */ androidx.media3.exoplayer.trackselection.k0 u(Context context) {
            return new androidx.media3.exoplayer.trackselection.n(context);
        }

        public static /* synthetic */ s3 v(s3 s3Var) {
            return s3Var;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b A(final androidx.media3.exoplayer.analytics.a aVar) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(aVar);
            this.f62752i = new com.google.common.base.t() { // from class: androidx.media3.exoplayer.u0
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return ExoPlayer.b.r(aVar, (androidx.media3.common.util.j) obj);
                }
            };
            return this;
        }

        @z7.a
        public b B(androidx.media3.common.d dVar, boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62756m = (androidx.media3.common.d) androidx.media3.common.util.a.g(dVar);
            this.f62757n = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b C(final androidx.media3.exoplayer.upstream.d dVar) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(dVar);
            this.f62751h = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.e1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.t(dVar);
                }
            };
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @androidx.annotation.l1
        public b D(androidx.media3.common.util.j jVar) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62745b = jVar;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b E(long j10) {
            androidx.media3.common.util.a.i(!this.F);
            this.B = j10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b F(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62761r = z10;
            return this;
        }

        @z7.a
        public b G(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62759p = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b H(r3 r3Var) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62769z = (r3) androidx.media3.common.util.a.g(r3Var);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b I(final s3 s3Var) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(s3Var);
            this.f62750g = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.t0
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.g(s3Var);
                }
            };
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b J(Looper looper) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(looper);
            this.f62753j = looper;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b K(@androidx.annotation.g0(from = 0) long j10) {
            androidx.media3.common.util.a.a(j10 >= 0);
            androidx.media3.common.util.a.i(!this.F);
            this.f62768y = j10;
            return this;
        }

        @z7.a
        public b L(final androidx.media3.exoplayer.source.t0.a aVar) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(aVar);
            this.f62748e = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.q1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.h(aVar);
                }
            };
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b M(String str) {
            androidx.media3.common.util.a.i(!this.F);
            this.H = str;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b N(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.C = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b O(Looper looper) {
            androidx.media3.common.util.a.i(!this.F);
            this.E = new v4(looper);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public b P(v4 v4Var) {
            androidx.media3.common.util.a.i(!this.F);
            this.E = v4Var;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b Q(int i10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62754k = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b R(@androidx.annotation.p0 androidx.media3.common.b1 b1Var) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62755l = b1Var;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b S(long j10) {
            androidx.media3.common.util.a.i(!this.F);
            this.A = j10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b T(final e5 e5Var) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(e5Var);
            this.f62747d = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.x0
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.a(e5Var);
                }
            };
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b U(@androidx.annotation.g0(from = 1) long j10) {
            androidx.media3.common.util.a.a(j10 > 0);
            androidx.media3.common.util.a.i(!this.F);
            this.f62766w = j10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b V(@androidx.annotation.g0(from = 1) long j10) {
            androidx.media3.common.util.a.a(j10 > 0);
            androidx.media3.common.util.a.i(!this.F);
            this.f62767x = j10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b W(f5 f5Var) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62765v = (f5) androidx.media3.common.util.a.g(f5Var);
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b X(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62760q = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        @androidx.annotation.l1
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public b Y(y5 y5Var) {
            androidx.media3.common.util.a.i(!this.F);
            this.J = y5Var;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b Z(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.G = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b a0(final androidx.media3.exoplayer.trackselection.k0 k0Var) {
            androidx.media3.common.util.a.i(!this.F);
            androidx.media3.common.util.a.g(k0Var);
            this.f62749f = new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.p1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.m(k0Var);
                }
            };
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b b0(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62764u = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b c0(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.D = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b d0(int i10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62763t = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b e0(int i10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62762s = i10;
            return this;
        }

        @z7.a
        public b f0(int i10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62758o = i10;
            return this;
        }

        public ExoPlayer w() {
            androidx.media3.common.util.a.i(!this.F);
            this.F = true;
            return new y2(this, null);
        }

        g5 x() {
            androidx.media3.common.util.a.i(!this.F);
            this.F = true;
            return new g5(this);
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b y(boolean z10) {
            androidx.media3.common.util.a.i(!this.F);
            this.I = z10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b z(long j10) {
            androidx.media3.common.util.a.i(!this.F);
            this.f62746c = j10;
            return this;
        }

        @androidx.media3.common.util.b1
        public b(final Context context, final e5 e5Var) {
            this(context, (com.google.common.base.s0<e5>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.a1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.q(e5Var);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.b1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.d(context);
                }
            });
            androidx.media3.common.util.a.g(e5Var);
        }

        @androidx.media3.common.util.b1
        public b(final Context context, final androidx.media3.exoplayer.source.t0.a aVar) {
            this(context, (com.google.common.base.s0<e5>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.n1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.k(context);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.o1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.c(aVar);
                }
            });
            androidx.media3.common.util.a.g(aVar);
        }

        @androidx.media3.common.util.b1
        public b(Context context, final e5 e5Var, final androidx.media3.exoplayer.source.t0.a aVar) {
            this(context, (com.google.common.base.s0<e5>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.y0
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.f(e5Var);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.z0
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.j(aVar);
                }
            });
            androidx.media3.common.util.a.g(e5Var);
            androidx.media3.common.util.a.g(aVar);
        }

        @androidx.media3.common.util.b1
        public b(Context context, final e5 e5Var, final androidx.media3.exoplayer.source.t0.a aVar, final androidx.media3.exoplayer.trackselection.k0 k0Var, final s3 s3Var, final androidx.media3.exoplayer.upstream.d dVar, final androidx.media3.exoplayer.analytics.a aVar2) {
            this(context, (com.google.common.base.s0<e5>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.c1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.n(e5Var);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.d1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.p(aVar);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.trackselection.k0>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.f1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.s(k0Var);
                }
            }, (com.google.common.base.s0<s3>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.g1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.v(s3Var);
                }
            }, (com.google.common.base.s0<androidx.media3.exoplayer.upstream.d>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.h1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.i(dVar);
                }
            }, (com.google.common.base.t<androidx.media3.common.util.j, androidx.media3.exoplayer.analytics.a>) new com.google.common.base.t() { // from class: androidx.media3.exoplayer.i1
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return ExoPlayer.b.o(aVar2, (androidx.media3.common.util.j) obj);
                }
            });
            androidx.media3.common.util.a.g(e5Var);
            androidx.media3.common.util.a.g(aVar);
            androidx.media3.common.util.a.g(k0Var);
            androidx.media3.common.util.a.g(dVar);
            androidx.media3.common.util.a.g(aVar2);
        }

        private b(final Context context, com.google.common.base.s0<e5> s0Var, com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a> s0Var2) {
            this(context, s0Var, s0Var2, (com.google.common.base.s0<androidx.media3.exoplayer.trackselection.k0>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.j1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return ExoPlayer.b.u(context);
                }
            }, new k1(), (com.google.common.base.s0<androidx.media3.exoplayer.upstream.d>) new com.google.common.base.s0() { // from class: androidx.media3.exoplayer.l1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return androidx.media3.exoplayer.upstream.k.o(context);
                }
            }, (com.google.common.base.t<androidx.media3.common.util.j, androidx.media3.exoplayer.analytics.a>) new com.google.common.base.t() { // from class: androidx.media3.exoplayer.m1
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return new androidx.media3.exoplayer.analytics.w1((androidx.media3.common.util.j) obj);
                }
            });
        }

        private b(Context context, com.google.common.base.s0<e5> s0Var, com.google.common.base.s0<androidx.media3.exoplayer.source.t0.a> s0Var2, com.google.common.base.s0<androidx.media3.exoplayer.trackselection.k0> s0Var3, com.google.common.base.s0<s3> s0Var4, com.google.common.base.s0<androidx.media3.exoplayer.upstream.d> s0Var5, com.google.common.base.t<androidx.media3.common.util.j, androidx.media3.exoplayer.analytics.a> tVar) {
            this.f62744a = (Context) androidx.media3.common.util.a.g(context);
            this.f62747d = s0Var;
            this.f62748e = s0Var2;
            this.f62749f = s0Var3;
            this.f62750g = s0Var4;
            this.f62751h = s0Var5;
            this.f62752i = tVar;
            this.f62753j = androidx.media3.common.util.k1.n0();
            this.f62756m = androidx.media3.common.d.f60472g;
            this.f62758o = 0;
            this.f62762s = 1;
            this.f62763t = 0;
            this.f62764u = true;
            this.f62765v = f5.f63791g;
            this.f62766w = 5000L;
            this.f62767x = 15000L;
            this.f62768y = androidx.media3.common.j.f60679f2;
            this.f62769z = new l.b().a();
            this.f62745b = androidx.media3.common.util.j.f61520a;
            this.A = 500L;
            this.B = 2000L;
            this.D = true;
            this.H = "";
            this.f62754k = -1000;
            this.J = new s();
        }
    }

    @androidx.media3.common.util.b1
    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f62770b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62771a;

        public c(long j10) {
            this.f62771a = j10;
        }
    }

    @androidx.media3.common.util.b1
    void A0(@androidx.annotation.p0 f5 f5Var);

    @androidx.media3.common.util.b1
    void B0(androidx.media3.exoplayer.source.t0 t0Var, boolean z10);

    @androidx.media3.common.util.b1
    void C0(a aVar);

    @androidx.media3.common.util.b1
    void E0(androidx.media3.exoplayer.source.t0 t0Var, long j10);

    @androidx.media3.common.util.b1
    void E1(c cVar);

    @androidx.media3.common.util.b1
    void H1(List<androidx.media3.exoplayer.source.t0> list);

    @androidx.media3.common.util.b1
    @Deprecated
    androidx.media3.exoplayer.source.h2 I();

    void J0(androidx.media3.exoplayer.analytics.b bVar);

    @androidx.media3.common.util.b1
    w4 J1(w4.b bVar);

    @androidx.media3.common.util.b1
    int K1();

    @androidx.media3.common.util.b1
    void L(List<androidx.media3.common.p> list);

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    androidx.media3.common.w L1();

    @androidx.media3.common.util.b1
    int M();

    @androidx.media3.common.util.b1
    @androidx.annotation.w0(23)
    void N0(@androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo);

    @androidx.media3.common.util.b1
    void N1(List<androidx.media3.exoplayer.source.t0> list, boolean z10);

    @androidx.media3.common.util.b1
    void Q0(boolean z10);

    void R1(boolean z10);

    @androidx.media3.common.util.b1
    void S0(List<androidx.media3.exoplayer.source.t0> list, int i10, long j10);

    @androidx.media3.common.util.b1
    void S1(int i10);

    @androidx.media3.common.util.b1
    boolean T0();

    @androidx.media3.common.util.b1
    void W(boolean z10);

    void W1(androidx.media3.exoplayer.analytics.b bVar);

    @androidx.media3.common.util.b1
    boolean Y1();

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    s0 a();

    @androidx.media3.common.util.b1
    void a1(int i10, List<androidx.media3.exoplayer.source.t0> list);

    @androidx.media3.common.util.b1
    void b(int i10);

    @androidx.media3.common.util.b1
    z4 b1(int i10);

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    default z4 d2(int i10) {
        return null;
    }

    @androidx.media3.common.util.b1
    void e1(a aVar);

    @androidx.media3.common.util.b1
    c e2();

    @androidx.media3.common.util.b1
    void f1(List<androidx.media3.exoplayer.source.t0> list);

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    androidx.media3.common.w f2();

    @androidx.media3.common.util.b1
    void g(int i10);

    @androidx.media3.common.util.b1
    @Deprecated
    androidx.media3.exoplayer.trackselection.i0 g0();

    @androidx.media3.common.util.b1
    @Deprecated
    void g1(androidx.media3.exoplayer.source.t0 t0Var);

    @androidx.media3.common.util.b1
    int getAudioSessionId();

    @androidx.media3.common.util.b1
    void h2(int i10, androidx.media3.exoplayer.source.t0 t0Var);

    @androidx.media3.common.util.b1
    int i0(int i10);

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    j j1();

    @androidx.media3.common.util.b1
    void j2(androidx.media3.exoplayer.source.t0 t0Var);

    @androidx.media3.common.util.b1
    void k(androidx.media3.exoplayer.video.w wVar);

    @androidx.media3.common.util.b1
    void k2(androidx.media3.exoplayer.video.w wVar);

    @androidx.media3.common.util.b1
    @Deprecated
    void l1(androidx.media3.exoplayer.source.t0 t0Var, boolean z10, boolean z11);

    @androidx.media3.common.util.b1
    void m1(@androidx.annotation.p0 androidx.media3.common.b1 b1Var);

    void m2(int i10);

    @androidx.media3.common.util.b1
    void n();

    @Override // androidx.media3.common.z0
    void o(int i10, androidx.media3.common.k0 k0Var);

    @androidx.media3.common.util.b1
    Looper p0();

    @androidx.media3.common.util.b1
    androidx.media3.exoplayer.analytics.a p1();

    @androidx.media3.common.util.b1
    boolean q();

    @androidx.media3.common.util.b1
    void q2(androidx.media3.exoplayer.video.spherical.a aVar);

    @androidx.media3.common.util.b1
    f5 r();

    @androidx.media3.common.util.b1
    void r1(androidx.media3.exoplayer.video.spherical.a aVar);

    @Override // androidx.media3.common.z0
    void release();

    @androidx.media3.common.util.b1
    int s();

    @androidx.media3.common.util.b1
    boolean s1();

    @androidx.media3.common.util.b1
    void s2(androidx.media3.exoplayer.source.t0 t0Var);

    @androidx.media3.common.util.b1
    void setImageOutput(@androidx.annotation.p0 ImageOutput imageOutput);

    @androidx.media3.common.util.b1
    void t(androidx.media3.common.f fVar);

    @androidx.media3.common.util.b1
    void t0(boolean z10);

    @androidx.media3.common.util.b1
    boolean u0();

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    j u1();

    @androidx.media3.common.util.b1
    void v1(int i10);

    @Override // androidx.media3.common.z0
    void w(int i10, int i11, List<androidx.media3.common.k0> list);

    @androidx.media3.common.util.b1
    void w0(androidx.media3.exoplayer.source.u1 u1Var);

    @androidx.media3.common.util.b1
    androidx.media3.common.util.j x0();

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    androidx.media3.exoplayer.trackselection.k0 y0();
}
