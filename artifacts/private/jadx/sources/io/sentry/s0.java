package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class s0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s0 f306763a = new s0();

    private s0() {
    }

    public static s0 q() {
        return f306763a;
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v B0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var) {
        return t5.w(fVar, n0Var);
    }

    @Override // io.sentry.i1
    public void C0(@NotNull v4 v4Var) {
        t5.U0(v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public r1 E0(@NotNull ga gaVar, @NotNull ia iaVar) {
        return t5.P0(gaVar, iaVar);
    }

    @Override // io.sentry.i1
    @Nullable
    public i1 G0() {
        return t5.R().G0();
    }

    @Override // io.sentry.i1
    @Nullable
    public Boolean H0() {
        return t5.m0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v I0(@NotNull o7 o7Var, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return t5.p(o7Var, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v J0(@NotNull String str, @NotNull y7 y7Var, @NotNull v4 v4Var) {
        return t5.B(str, y7Var, v4Var);
    }

    @Override // io.sentry.i1
    @lm.a.b
    @NotNull
    public io.sentry.protocol.v K0(@NotNull h hVar) {
        return t5.m(hVar);
    }

    @Override // io.sentry.i1
    public boolean L() {
        return t5.o0();
    }

    @Override // io.sentry.i1
    @Nullable
    public e M0() {
        return t5.P();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v N0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable n0 n0Var, @Nullable k4 k4Var) {
        return t5.R().N0(c0Var, daVar, n0Var, k4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 O0(@NotNull String str) {
        return t5.N(str);
    }

    @Override // io.sentry.i1
    @Nullable
    public w8 P0() {
        return t5.W();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v Q0(@NotNull io.sentry.protocol.f fVar) {
        return t5.v(fVar);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v R0(@NotNull Throwable th2, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return t5.t(th2, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    public void T0(@Nullable x4 x4Var, @NotNull v4 v4Var) {
        t5.G(x4Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 U0() {
        return t5.v0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.logger.a V0() {
        return t5.R().V0();
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 W0(@NotNull String str) {
        return t5.M(str);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v Y0(@NotNull g4 g4Var) {
        return t5.R().Y0(g4Var);
    }

    @Override // io.sentry.i1
    public void a(@Nullable String str, @Nullable String str2) {
        t5.G0(str, str2);
    }

    @Override // io.sentry.i1
    public void a1() {
        t5.M0();
    }

    @Override // io.sentry.i1
    @NotNull
    public n8 b() {
        return t5.R().b();
    }

    @Override // io.sentry.i1
    public boolean b1(@Nullable i1 i1Var) {
        return t5.R().b1(i1Var);
    }

    @Override // io.sentry.i1
    public void c(@Nullable String str) {
        t5.w0(str);
    }

    @Override // io.sentry.i1
    public void close() {
        t5.E();
    }

    @Override // io.sentry.i1
    public void d(@Nullable String str, @Nullable String str2) {
        t5.D0(str, str2);
    }

    @Override // io.sentry.i1
    public void d1() {
        t5.z0();
    }

    @Override // io.sentry.i1
    @Nullable
    public p1 e() {
        return t5.R().e();
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 e1() {
        return t5.R().e1();
    }

    @Override // io.sentry.i1
    public void f(@Nullable String str) {
        t5.x0(str);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 g() {
        return t5.S();
    }

    @Override // io.sentry.i1
    public void g1(@NotNull v4 v4Var) {
        t5.V0(v4Var);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 getScope() {
        return t5.R().getScope();
    }

    @Override // io.sentry.i1
    public void h(@Nullable y7 y7Var) {
        t5.F0(y7Var);
    }

    @Override // io.sentry.i1
    @Nullable
    public ga h1(@Nullable String str, @Nullable List<String> list) {
        return t5.H(str, list);
    }

    @Override // io.sentry.i1
    public void i(boolean z10) {
        t5.E();
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public io.sentry.transport.a0 i0() {
        return t5.R().i0();
    }

    @Override // io.sentry.i1
    public boolean isEnabled() {
        return t5.n0();
    }

    @Override // io.sentry.i1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
        t5.I0(g0Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v j0(@NotNull String str, @NotNull y7 y7Var) {
        return t5.A(str, y7Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 j1() {
        return t5.u0();
    }

    @Override // io.sentry.i1
    public void k(@NotNull f fVar) {
        m(fVar, new n0());
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 k1(@NotNull String str) {
        return t5.O(str);
    }

    @Override // io.sentry.i1
    public void l(@Nullable String str) {
        t5.H0(str);
    }

    @Override // io.sentry.i1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
        t5.h(fVar, n0Var);
    }

    @Override // io.sentry.i1
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
        t5.R().n(th2, p1Var, str);
    }

    @Override // io.sentry.i1
    public void o() {
        t5.D();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v o0(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return t5.o(o7Var, n0Var);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public r1 p() {
        return t5.R().p();
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 q0() {
        return j3.a();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v r0(@NotNull Throwable th2, @Nullable n0 n0Var) {
        return t5.s(th2, n0Var);
    }

    @Override // io.sentry.i1
    public void s(@NotNull k1 k1Var) {
        t5.l(k1Var);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var) {
        return t5.R().s0(g6Var, n0Var);
    }

    @Override // io.sentry.i1
    public void t0(@NotNull na naVar) {
        t5.C(naVar);
    }

    @Override // io.sentry.i1
    public void u() {
        t5.N0();
    }

    @Override // io.sentry.i1
    public void u0() {
        t5.T0();
    }

    @Override // io.sentry.i1
    public void v(@NotNull List<String> list) {
        t5.E0(list);
    }

    @Override // io.sentry.i1
    public void w(long j10) {
        t5.L(j10);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v w0(@NotNull o8 o8Var, @Nullable n0 n0Var) {
        return t5.R().w0(o8Var, n0Var);
    }

    @Override // io.sentry.i1
    public void x(@Nullable p1 p1Var) {
        t5.R().x(p1Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v x0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        return t5.x(fVar, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    public void y() {
        t5.J();
    }

    @Override // io.sentry.i1
    @Deprecated
    public void y0() {
        t5.s0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v z() {
        return t5.T();
    }

    @Override // io.sentry.i1
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public z0 m782clone() {
        return t5.R().m782clone();
    }
}
