package androidx.compose.ui.graphics;

import androidx.compose.runtime.k7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.ui.layout.k2
public interface r1 extends androidx.compose.ui.unit.d {

    public static final class a {
        @k7
        @Deprecated
        public static long A(@NotNull r1 r1Var, int i10) {
            return r1.super.j1(i10);
        }

        @Deprecated
        public static long a(@NotNull r1 r1Var) {
            return r1.super.f0();
        }

        @Deprecated
        public static int b(@NotNull r1 r1Var) {
            return r1.super.t();
        }

        public static /* synthetic */ void c() {
        }

        @Deprecated
        @Nullable
        public static r0 d(@NotNull r1 r1Var) {
            return r1.super.e();
        }

        @Deprecated
        public static int e(@NotNull r1 r1Var) {
            return r1.super.T();
        }

        @Deprecated
        @Nullable
        public static e3 f(@NotNull r1 r1Var) {
            return r1.super.g();
        }

        @Deprecated
        public static long g(@NotNull r1 r1Var) {
            return r1.super.d();
        }

        @Deprecated
        public static long h(@NotNull r1 r1Var) {
            return r1.super.L();
        }

        @k7
        @Deprecated
        public static int i(@NotNull r1 r1Var, long j10) {
            return r1.super.c8(j10);
        }

        @k7
        @Deprecated
        public static int j(@NotNull r1 r1Var, float f10) {
            return r1.super.g6(f10);
        }

        @Deprecated
        public static void k(@NotNull r1 r1Var, long j10) {
            r1.super.h0(j10);
        }

        @Deprecated
        public static void l(@NotNull r1 r1Var, int i10) {
            r1.super.s(i10);
        }

        @Deprecated
        public static void m(@NotNull r1 r1Var, @Nullable r0 r0Var) {
            r1.super.f(r0Var);
        }

        @Deprecated
        public static void n(@NotNull r1 r1Var, int i10) {
            r1.super.H(i10);
        }

        @Deprecated
        public static void o(@NotNull r1 r1Var, @Nullable e3 e3Var) {
            r1.super.A(e3Var);
        }

        @Deprecated
        public static void p(@NotNull r1 r1Var, long j10) {
            r1.super.j0(j10);
        }

        @k7
        @Deprecated
        public static float q(@NotNull r1 r1Var, long j10) {
            return r1.super.y(j10);
        }

        @k7
        @Deprecated
        public static float r(@NotNull r1 r1Var, float f10) {
            return r1.super.F3(f10);
        }

        @k7
        @Deprecated
        public static float s(@NotNull r1 r1Var, int i10) {
            return r1.super.D3(i10);
        }

        @k7
        @Deprecated
        public static long t(@NotNull r1 r1Var, long j10) {
            return r1.super.C0(j10);
        }

        @k7
        @Deprecated
        public static float u(@NotNull r1 r1Var, long j10) {
            return r1.super.p6(j10);
        }

        @k7
        @Deprecated
        public static float v(@NotNull r1 r1Var, float f10) {
            return r1.super.S7(f10);
        }

        @k7
        @Deprecated
        @NotNull
        public static n0.j w(@NotNull r1 r1Var, @NotNull androidx.compose.ui.unit.k kVar) {
            return r1.super.N3(kVar);
        }

        @k7
        @Deprecated
        public static long x(@NotNull r1 r1Var, long j10) {
            return r1.super.k4(j10);
        }

        @k7
        @Deprecated
        public static long y(@NotNull r1 r1Var, float f10) {
            return r1.super.d0(f10);
        }

        @k7
        @Deprecated
        public static long z(@NotNull r1 r1Var, float f10) {
            return r1.super.m1(f10);
        }
    }

    default void A(@Nullable e3 e3Var) {
    }

    float B();

    void C(float f10);

    float D();

    void E(float f10);

    float F();

    default void H(int i10) {
    }

    default long L() {
        return s1.b();
    }

    void O(boolean z10);

    void Q(float f10);

    void Q3(@NotNull q3 q3Var);

    default int T() {
        return h1.f37790b.a();
    }

    void W1(long j10);

    float a0();

    boolean b();

    long c6();

    default long d() {
        return n0.n.f332724b.a();
    }

    @Nullable
    default r0 e() {
        return null;
    }

    default void f(@Nullable r0 r0Var) {
    }

    default long f0() {
        return s1.b();
    }

    @Nullable
    default e3 g() {
        return null;
    }

    void h(float f10);

    default void h0(long j10) {
    }

    float i();

    void j(float f10);

    default void j0(long j10) {
    }

    void k(float f10);

    void l(float f10);

    void m(float f10);

    float o();

    float p();

    float q();

    float r();

    default void s(int i10) {
    }

    void setAlpha(float f10);

    default int t() {
        return d0.f37693b.B();
    }

    @NotNull
    q3 t3();

    float v();

    void z(float f10);
}
