package androidx.media3.exoplayer;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface z4 extends w4.b {
    public static final int A0 = 15;
    public static final int B0 = 16;
    public static final int C0 = 17;
    public static final int D0 = 10000;
    public static final int E0 = 0;
    public static final int F0 = 1;
    public static final int G0 = 2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final long f66968k0 = 10000;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f66969l0 = 1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f66970m0 = 2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f66971n0 = 3;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f66972o0 = 4;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f66973q0 = 5;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f66974r0 = 6;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f66975s0 = 7;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f66976t0 = 8;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f66977u0 = 9;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f66978v0 = 10;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f66979w0 = 11;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f66980x0 = 12;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f66981y0 = 13;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f66982z0 = 14;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a();

        void b();
    }

    void J(int i10, androidx.media3.exoplayer.analytics.j4 j4Var, androidx.media3.common.util.j jVar);

    default long O(long j10, long j11) {
        return 10000L;
    }

    void P(androidx.media3.common.z3 z3Var);

    default void R(float f10, float f11) throws s0 {
    }

    boolean a();

    void d();

    @androidx.annotation.p0
    androidx.media3.exoplayer.source.s1 e();

    int f();

    void g(long j10, long j11) throws s0;

    String getName();

    int getState();

    boolean isReady();

    default void j() {
    }

    void m(c5 c5Var, androidx.media3.common.w[] wVarArr, androidx.media3.exoplayer.source.s1 s1Var, long j10, boolean z10, boolean z11, long j11, long j12, androidx.media3.exoplayer.source.t0.b bVar) throws s0;

    a5 p();

    boolean q();

    boolean r();

    default void release() {
    }

    void reset();

    long s();

    void start() throws s0;

    void stop();

    void t(long j10) throws s0;

    @androidx.annotation.p0
    u3 u();

    void v();

    void x() throws IOException;

    void y(androidx.media3.common.w[] wVarArr, androidx.media3.exoplayer.source.s1 s1Var, long j10, long j11, androidx.media3.exoplayer.source.t0.b bVar) throws s0;
}
