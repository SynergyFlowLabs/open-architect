package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final androidx.media3.exoplayer.source.t0.b f64678a = new androidx.media3.exoplayer.source.t0.b(new Object());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.analytics.j4 f64679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.z3 f64680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.t0.b f64681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f64682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f64683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f64684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f64685g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f64686h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f64687i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f64688j;

        public a(androidx.media3.exoplayer.analytics.j4 j4Var, androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11, float f10, boolean z10, boolean z11, long j12, long j13) {
            this.f64679a = j4Var;
            this.f64680b = z3Var;
            this.f64681c = bVar;
            this.f64682d = j10;
            this.f64683e = j11;
            this.f64684f = f10;
            this.f64685g = z10;
            this.f64686h = z11;
            this.f64687i = j12;
            this.f64688j = j13;
        }
    }

    @Deprecated
    default void a() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default void c() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default long d() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    androidx.media3.exoplayer.upstream.b e();

    @Deprecated
    default void f() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    default void g(z4[] z4VarArr, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void h(androidx.media3.exoplayer.analytics.j4 j4Var) {
        a();
    }

    @Deprecated
    default void i(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, z4[] z4VarArr, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        g(z4VarArr, h2Var, c0VarArr);
    }

    default boolean j(a aVar) {
        return l(aVar.f64682d, aVar.f64683e, aVar.f64684f);
    }

    @Deprecated
    default void k(androidx.media3.exoplayer.analytics.j4 j4Var, androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, z4[] z4VarArr, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        i(z3Var, bVar, z4VarArr, h2Var, c0VarArr);
    }

    @Deprecated
    default boolean l(long j10, long j11, float f10) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default long m(androidx.media3.exoplayer.analytics.j4 j4Var) {
        return d();
    }

    default boolean n(a aVar) {
        return t(aVar.f64680b, aVar.f64681c, aVar.f64683e, aVar.f64684f, aVar.f64686h, aVar.f64687i);
    }

    @Deprecated
    default boolean o(long j10, float f10, boolean z10, long j11) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default boolean p(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10) {
        androidx.media3.common.util.z.n("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void q(a aVar, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.c0[] c0VarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void r(androidx.media3.exoplayer.analytics.j4 j4Var) {
        c();
    }

    default void s(androidx.media3.exoplayer.analytics.j4 j4Var) {
        f();
    }

    @Deprecated
    default boolean t(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10, float f10, boolean z10, long j11) {
        return o(j10, f10, z10, j11);
    }

    default boolean u(androidx.media3.exoplayer.analytics.j4 j4Var) {
        return b();
    }
}
