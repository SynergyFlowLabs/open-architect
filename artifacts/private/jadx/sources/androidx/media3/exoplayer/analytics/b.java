package androidx.media3.exoplayer.analytics;

import android.util.SparseArray;
import androidx.media3.common.n4;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    @androidx.media3.common.util.b1
    public static final int A = 26;

    @androidx.media3.common.util.b1
    public static final int B = 28;

    @androidx.media3.common.util.b1
    public static final int C = 27;

    @androidx.media3.common.util.b1
    public static final int D = 29;

    @androidx.media3.common.util.b1
    public static final int E = 30;

    @androidx.media3.common.util.b1
    public static final int F = 1000;

    @androidx.media3.common.util.b1
    public static final int G = 1001;

    @androidx.media3.common.util.b1
    public static final int H = 1002;

    @androidx.media3.common.util.b1
    public static final int I = 1003;

    @androidx.media3.common.util.b1
    public static final int J = 1004;

    @androidx.media3.common.util.b1
    public static final int K = 1005;

    @androidx.media3.common.util.b1
    public static final int L = 1006;

    @androidx.media3.common.util.b1
    public static final int M = 1007;

    @androidx.media3.common.util.b1
    public static final int N = 1008;

    @androidx.media3.common.util.b1
    public static final int O = 1009;

    @androidx.media3.common.util.b1
    public static final int P = 1010;

    @androidx.media3.common.util.b1
    public static final int Q = 1011;

    @androidx.media3.common.util.b1
    public static final int R = 1012;

    @androidx.media3.common.util.b1
    public static final int S = 1013;

    @androidx.media3.common.util.b1
    public static final int T = 1014;

    @androidx.media3.common.util.b1
    public static final int U = 1015;

    @androidx.media3.common.util.b1
    public static final int V = 1016;

    @androidx.media3.common.util.b1
    public static final int W = 1017;

    @androidx.media3.common.util.b1
    public static final int X = 1018;

    @androidx.media3.common.util.b1
    public static final int Y = 1019;

    @androidx.media3.common.util.b1
    public static final int Z = 1020;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62799a = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62800a0 = 1021;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62801b = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62802b0 = 1022;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62803c = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62804c0 = 1023;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62805d = 3;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62806d0 = 1024;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62807e = 4;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62808e0 = 1025;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62809f = 5;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62810f0 = 1026;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62811g = 6;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62812g0 = 1027;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62813h = 7;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62814h0 = 1028;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62815i = 8;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62816i0 = 1029;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62817j = 9;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62818j0 = 1030;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62819k = 10;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62820k0 = 1031;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62821l = 11;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62822l0 = 1032;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62823m = 12;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62824m0 = 1033;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62825n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62826o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62827p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62828q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62829r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62830s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62831t = 19;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62832u = 20;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62833v = 21;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62834w = 22;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62835x = 23;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62836y = 24;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public static final int f62837z = 25;

    @androidx.media3.common.util.b1
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.b$b, reason: collision with other inner class name */
    @androidx.media3.common.util.b1
    public static final class C0577b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.z3 f62839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final androidx.media3.exoplayer.source.t0.b f62841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f62842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.media3.common.z3 f62843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f62844g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        public final androidx.media3.exoplayer.source.t0.b f62845h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f62846i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f62847j;

        public C0577b(long j10, androidx.media3.common.z3 z3Var, int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, long j11, androidx.media3.common.z3 z3Var2, int i11, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar2, long j12, long j13) {
            this.f62838a = j10;
            this.f62839b = z3Var;
            this.f62840c = i10;
            this.f62841d = bVar;
            this.f62842e = j11;
            this.f62843f = z3Var2;
            this.f62844g = i11;
            this.f62845h = bVar2;
            this.f62846i = j12;
            this.f62847j = j13;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0577b.class == obj.getClass()) {
                C0577b c0577b = (C0577b) obj;
                if (this.f62838a == c0577b.f62838a && this.f62840c == c0577b.f62840c && this.f62842e == c0577b.f62842e && this.f62844g == c0577b.f62844g && this.f62846i == c0577b.f62846i && this.f62847j == c0577b.f62847j && Objects.equals(this.f62839b, c0577b.f62839b) && Objects.equals(this.f62841d, c0577b.f62841d) && Objects.equals(this.f62843f, c0577b.f62843f) && Objects.equals(this.f62845h, c0577b.f62845h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f62838a), this.f62839b, Integer.valueOf(this.f62840c), this.f62841d, Long.valueOf(this.f62842e), this.f62843f, Integer.valueOf(this.f62844g), this.f62845h, Long.valueOf(this.f62846i), Long.valueOf(this.f62847j));
        }
    }

    @androidx.media3.common.util.b1
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.common.s f62848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<C0577b> f62849b;

        public c(androidx.media3.common.s sVar, SparseArray<C0577b> sparseArray) {
            this.f62848a = sVar;
            SparseArray<C0577b> sparseArray2 = new SparseArray<>(sVar.d());
            for (int i10 = 0; i10 < sVar.d(); i10++) {
                int iC = sVar.c(i10);
                sparseArray2.append(iC, (C0577b) androidx.media3.common.util.a.g(sparseArray.get(iC)));
            }
            this.f62849b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f62848a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f62848a.b(iArr);
        }

        public int c(int i10) {
            return this.f62848a.c(i10);
        }

        public C0577b d(int i10) {
            return (C0577b) androidx.media3.common.util.a.g(this.f62849b.get(i10));
        }

        public int e() {
            return this.f62848a.d();
        }
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void A(C0577b c0577b, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void A0(C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var) {
    }

    @androidx.media3.common.util.b1
    default void B(C0577b c0577b, int i10, long j10) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void C(C0577b c0577b, String str, long j10) {
    }

    @androidx.media3.common.util.b1
    default void C0(C0577b c0577b, androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.exoplayer.k kVar) {
    }

    @androidx.media3.common.util.b1
    default void D(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void E(C0577b c0577b, androidx.media3.common.i4 i4Var) {
    }

    @androidx.media3.common.util.b1
    default void G(C0577b c0577b, n4 n4Var) {
    }

    @androidx.media3.common.util.b1
    default void H(C0577b c0577b, long j10) {
    }

    @androidx.media3.common.util.b1
    default void I(C0577b c0577b, long j10, int i10) {
    }

    @androidx.media3.common.util.b1
    default void J(C0577b c0577b, androidx.media3.exoplayer.source.h0 h0Var) {
    }

    @androidx.media3.common.util.b1
    default void K(androidx.media3.common.z0 z0Var, c cVar) {
    }

    @androidx.media3.common.util.b1
    default void L(C0577b c0577b, androidx.media3.common.o oVar) {
    }

    @androidx.media3.common.util.b1
    default void M(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void N(C0577b c0577b, Object obj, long j10) {
    }

    @androidx.media3.common.util.b1
    default void O(C0577b c0577b, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void P(C0577b c0577b, int i10, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void Q(C0577b c0577b, androidx.media3.common.r0 r0Var) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void R(C0577b c0577b, List<androidx.media3.common.text.a> list) {
    }

    @androidx.media3.common.util.b1
    default void S(C0577b c0577b, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void T(C0577b c0577b, androidx.media3.common.x0 x0Var) {
    }

    @androidx.media3.common.util.b1
    default void U(C0577b c0577b, long j10) {
    }

    @androidx.media3.common.util.b1
    default void V(C0577b c0577b, androidx.media3.exoplayer.j jVar) {
    }

    @androidx.media3.common.util.b1
    default void W(C0577b c0577b, androidx.media3.common.q0 q0Var) {
    }

    @androidx.media3.common.util.b1
    default void X(C0577b c0577b, androidx.media3.common.d dVar) {
    }

    @androidx.media3.common.util.b1
    default void Y(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    default void Z(C0577b c0577b, androidx.media3.exoplayer.j jVar) {
    }

    @androidx.media3.common.util.b1
    default void a0(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void b(C0577b c0577b, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void b0(C0577b c0577b, androidx.media3.common.z0.k kVar, androidx.media3.common.z0.k kVar2, int i10) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void c(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    default void c0(C0577b c0577b, androidx.media3.exoplayer.j jVar) {
    }

    @androidx.media3.common.util.b1
    default void d(C0577b c0577b, boolean z10, int i10) {
    }

    @androidx.media3.common.util.b1
    default void d0(C0577b c0577b, Exception exc) {
    }

    @androidx.media3.common.util.b1
    default void e(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void e0(C0577b c0577b, float f10) {
    }

    @androidx.media3.common.util.b1
    default void f(C0577b c0577b, int i10, long j10, long j11) {
    }

    @androidx.media3.common.util.b1
    default void f0(C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var, IOException iOException, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void g(C0577b c0577b, Exception exc) {
    }

    @androidx.media3.common.util.b1
    default void g0(C0577b c0577b, long j10) {
    }

    @androidx.media3.common.util.b1
    default void h(C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var) {
    }

    @androidx.media3.common.util.b1
    default void h0(C0577b c0577b, int i10, long j10, long j11) {
    }

    @androidx.media3.common.util.b1
    default void i(C0577b c0577b, String str, long j10, long j11) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void i0(C0577b c0577b, String str, long j10) {
    }

    @androidx.media3.common.util.b1
    default void j(C0577b c0577b, androidx.media3.common.e4 e4Var) {
    }

    @androidx.media3.common.util.b1
    default void j0(C0577b c0577b, androidx.media3.exoplayer.audio.x.a aVar) {
    }

    @androidx.media3.common.util.b1
    default void k(C0577b c0577b, Exception exc) {
    }

    @androidx.media3.common.util.b1
    default void k0(C0577b c0577b, String str) {
    }

    @androidx.media3.common.util.b1
    default void l(C0577b c0577b, @androidx.annotation.p0 androidx.media3.common.k0 k0Var, int i10) {
    }

    @androidx.media3.common.util.b1
    default void l0(C0577b c0577b, String str) {
    }

    @androidx.media3.common.util.b1
    default void m(C0577b c0577b, androidx.media3.exoplayer.j jVar) {
    }

    @androidx.media3.common.util.b1
    default void m0(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void n(C0577b c0577b, int i10, int i11) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void n0(C0577b c0577b, int i10, int i11, int i12, float f10) {
    }

    @androidx.media3.common.util.b1
    default void o(C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var, int i10) {
    }

    @androidx.media3.common.util.b1
    default void o0(C0577b c0577b, int i10, int i11, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void p(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void p0(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void q(C0577b c0577b, androidx.media3.common.z0.c cVar) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void q0(C0577b c0577b, androidx.media3.exoplayer.source.d0 d0Var, androidx.media3.exoplayer.source.h0 h0Var) {
    }

    @androidx.media3.common.util.b1
    default void r(C0577b c0577b, Exception exc) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void r0(C0577b c0577b, boolean z10, int i10) {
    }

    @androidx.media3.common.util.b1
    default void s(C0577b c0577b, boolean z10) {
    }

    @androidx.media3.common.util.b1
    default void s0(C0577b c0577b, @androidx.annotation.p0 androidx.media3.common.x0 x0Var) {
    }

    @androidx.media3.common.util.b1
    default void t(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    default void t0(C0577b c0577b) {
    }

    @androidx.media3.common.util.b1
    default void u(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    default void u0(C0577b c0577b, long j10) {
    }

    @androidx.media3.common.util.b1
    default void v(C0577b c0577b, androidx.media3.common.w wVar, @androidx.annotation.p0 androidx.media3.exoplayer.k kVar) {
    }

    @androidx.media3.common.util.b1
    default void v0(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    default void w(C0577b c0577b, androidx.media3.common.y0 y0Var) {
    }

    @androidx.media3.common.util.b1
    default void w0(C0577b c0577b, androidx.media3.common.text.d dVar) {
    }

    @androidx.media3.common.util.b1
    default void x(C0577b c0577b, androidx.media3.exoplayer.audio.x.a aVar) {
    }

    @androidx.media3.common.util.b1
    default void x0(C0577b c0577b, String str, long j10, long j11) {
    }

    @androidx.media3.common.util.b1
    default void y(C0577b c0577b, int i10) {
    }

    @androidx.media3.common.util.b1
    default void y0(C0577b c0577b, androidx.media3.common.q0 q0Var) {
    }

    @androidx.media3.common.util.b1
    default void z(C0577b c0577b, androidx.media3.exoplayer.source.h0 h0Var) {
    }
}
