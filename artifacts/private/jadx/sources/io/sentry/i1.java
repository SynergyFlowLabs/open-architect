package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface i1 {
    @NotNull
    default io.sentry.protocol.v A0(@NotNull String str, @NotNull v4 v4Var) {
        return J0(str, y7.INFO, v4Var);
    }

    @NotNull
    default io.sentry.protocol.v B0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var) {
        return x0(fVar, n0Var, null);
    }

    void C0(@NotNull v4 v4Var);

    @NotNull
    default r1 D0(@NotNull String str, @NotNull String str2) {
        return i1(str, str2, new ia());
    }

    @NotNull
    r1 E0(@NotNull ga gaVar, @NotNull ia iaVar);

    @NotNull
    default io.sentry.protocol.v F0(@NotNull Throwable th2, @NotNull v4 v4Var) {
        return R0(th2, new n0(), v4Var);
    }

    @lm.a.c
    @Nullable
    i1 G0();

    @Nullable
    Boolean H0();

    @NotNull
    io.sentry.protocol.v I0(@NotNull o7 o7Var, @Nullable n0 n0Var, @NotNull v4 v4Var);

    @NotNull
    io.sentry.protocol.v J0(@NotNull String str, @NotNull y7 y7Var, @NotNull v4 v4Var);

    @NotNull
    io.sentry.protocol.v K0(@NotNull h hVar);

    boolean L();

    default void L0(@NotNull String str, @NotNull String str2) {
        f fVar = new f(str);
        fVar.T(str2);
        k(fVar);
    }

    @Nullable
    e M0();

    @lm.a.c
    @NotNull
    io.sentry.protocol.v N0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable n0 n0Var, @Nullable k4 k4Var);

    @NotNull
    i1 O0(@NotNull String str);

    @Nullable
    w8 P0();

    @NotNull
    default io.sentry.protocol.v Q0(@NotNull io.sentry.protocol.f fVar) {
        return B0(fVar, null);
    }

    @NotNull
    io.sentry.protocol.v R0(@NotNull Throwable th2, @Nullable n0 n0Var, @NotNull v4 v4Var);

    @lm.a.c
    @NotNull
    default io.sentry.protocol.v S0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable n0 n0Var) {
        return N0(c0Var, daVar, n0Var, null);
    }

    void T0(@Nullable x4 x4Var, @NotNull v4 v4Var);

    @NotNull
    m1 U0();

    @NotNull
    io.sentry.logger.a V0();

    @NotNull
    i1 W0(@NotNull String str);

    @NotNull
    default io.sentry.protocol.v X0(@NotNull String str) {
        return j0(str, y7.INFO);
    }

    @lm.a.c
    @NotNull
    io.sentry.protocol.v Y0(@NotNull g4 g4Var);

    @NotNull
    default io.sentry.protocol.v Z0(@NotNull o7 o7Var, @NotNull v4 v4Var) {
        return I0(o7Var, new n0(), v4Var);
    }

    void a(@Nullable String str, @Nullable String str2);

    void a1();

    @NotNull
    n8 b();

    @lm.a.c
    boolean b1(@Nullable i1 i1Var);

    void c(@Nullable String str);

    @NotNull
    default r1 c1(@NotNull ga gaVar) {
        return E0(gaVar, new ia());
    }

    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone */
    z0 m779clone();

    void close();

    void d(@Nullable String str, @Nullable String str2);

    void d1();

    @Nullable
    p1 e();

    @lm.a.c
    @NotNull
    g1 e1();

    void f(@Nullable String str);

    @lm.a.c
    @NotNull
    default io.sentry.protocol.v f1(@NotNull io.sentry.protocol.c0 c0Var, @Nullable n0 n0Var) {
        return S0(c0Var, null, n0Var);
    }

    @lm.a.c
    @NotNull
    g1 g();

    void g1(@NotNull v4 v4Var);

    @lm.a.c
    @NotNull
    g1 getScope();

    void h(@Nullable y7 y7Var);

    @Nullable
    ga h1(@Nullable String str, @Nullable List<String> list);

    void i(boolean z10);

    @lm.a.c
    @Nullable
    io.sentry.transport.a0 i0();

    @NotNull
    default r1 i1(@NotNull String str, @NotNull String str2, @NotNull ia iaVar) {
        return E0(new ga(str, str2), iaVar);
    }

    boolean isEnabled();

    void j(@Nullable io.sentry.protocol.g0 g0Var);

    @NotNull
    io.sentry.protocol.v j0(@NotNull String str, @NotNull y7 y7Var);

    @NotNull
    m1 j1();

    void k(@NotNull f fVar);

    @NotNull
    default io.sentry.protocol.v k0(@NotNull g6 g6Var) {
        return s0(g6Var, new n0());
    }

    @NotNull
    i1 k1(@NotNull String str);

    void l(@Nullable String str);

    @NotNull
    default io.sentry.protocol.v l0(@NotNull o7 o7Var) {
        return o0(o7Var, new n0());
    }

    void m(@NotNull f fVar, @Nullable n0 n0Var);

    @NotNull
    default io.sentry.protocol.v m0(@NotNull Throwable th2) {
        return r0(th2, new n0());
    }

    @lm.a.c
    void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str);

    default boolean n0() {
        return false;
    }

    void o();

    @NotNull
    io.sentry.protocol.v o0(@NotNull o7 o7Var, @Nullable n0 n0Var);

    @lm.a.c
    @Nullable
    r1 p();

    @lm.a.c
    @NotNull
    default io.sentry.protocol.v p0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar) {
        return S0(c0Var, daVar, null);
    }

    @NotNull
    m1 q0();

    @NotNull
    io.sentry.protocol.v r0(@NotNull Throwable th2, @Nullable n0 n0Var);

    void s(@NotNull k1 k1Var);

    @NotNull
    io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var);

    void t0(@NotNull na naVar);

    void u();

    void u0();

    void v(@NotNull List<String> list);

    default void v0(@NotNull v4 v4Var) {
        T0(null, v4Var);
    }

    void w(long j10);

    @NotNull
    io.sentry.protocol.v w0(@NotNull o8 o8Var, @Nullable n0 n0Var);

    @lm.a.c
    void x(@Nullable p1 p1Var);

    @NotNull
    io.sentry.protocol.v x0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @Nullable v4 v4Var);

    void y();

    @Deprecated
    void y0();

    @NotNull
    io.sentry.protocol.v z();

    default void z0(@NotNull String str) {
        k(new f(str));
    }
}
