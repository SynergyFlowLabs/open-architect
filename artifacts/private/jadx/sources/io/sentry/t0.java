package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class t0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i1 f306787a;

    public t0(@NotNull i1 i1Var) {
        this.f306787a = i1Var;
    }

    @Override // io.sentry.i1
    public void C0(@NotNull v4 v4Var) {
        this.f306787a.C0(v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public r1 E0(@NotNull ga gaVar, @NotNull ia iaVar) {
        return this.f306787a.E0(gaVar, iaVar);
    }

    @Override // io.sentry.i1
    @Nullable
    public i1 G0() {
        return this.f306787a.G0();
    }

    @Override // io.sentry.i1
    @Nullable
    public Boolean H0() {
        return this.f306787a.H0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v I0(@NotNull o7 o7Var, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return this.f306787a.I0(o7Var, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v J0(@NotNull String str, @NotNull y7 y7Var, @NotNull v4 v4Var) {
        return this.f306787a.J0(str, y7Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v K0(@NotNull h hVar) {
        return this.f306787a.K0(hVar);
    }

    @Override // io.sentry.i1
    public boolean L() {
        return this.f306787a.L();
    }

    @Override // io.sentry.i1
    @Nullable
    public e M0() {
        return this.f306787a.M0();
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v N0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable n0 n0Var, @Nullable k4 k4Var) {
        return this.f306787a.N0(c0Var, daVar, n0Var, k4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 O0(@NotNull String str) {
        return t5.N(str);
    }

    @Override // io.sentry.i1
    @Nullable
    public w8 P0() {
        return this.f306787a.P0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v R0(@NotNull Throwable th2, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return this.f306787a.R0(th2, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    public void T0(@Nullable x4 x4Var, @NotNull v4 v4Var) {
        this.f306787a.T0(x4Var, v4Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 U0() {
        return this.f306787a.U0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.logger.a V0() {
        return this.f306787a.V0();
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 W0(@NotNull String str) {
        return this.f306787a.W0(str);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v Y0(@NotNull g4 g4Var) {
        return this.f306787a.Y0(g4Var);
    }

    @Override // io.sentry.i1
    public void a(@Nullable String str, @Nullable String str2) {
        this.f306787a.a(str, str2);
    }

    @Override // io.sentry.i1
    public void a1() {
        this.f306787a.a1();
    }

    @Override // io.sentry.i1
    @NotNull
    public n8 b() {
        return this.f306787a.b();
    }

    @Override // io.sentry.i1
    public boolean b1(@Nullable i1 i1Var) {
        return this.f306787a.b1(i1Var);
    }

    @Override // io.sentry.i1
    public void c(@Nullable String str) {
        this.f306787a.c(str);
    }

    @Override // io.sentry.i1
    public void close() {
        this.f306787a.close();
    }

    @Override // io.sentry.i1
    public void d(@Nullable String str, @Nullable String str2) {
        this.f306787a.d(str, str2);
    }

    @Override // io.sentry.i1
    public void d1() {
        this.f306787a.d1();
    }

    @Override // io.sentry.i1
    @Nullable
    public p1 e() {
        return this.f306787a.e();
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 e1() {
        return this.f306787a.e1();
    }

    @Override // io.sentry.i1
    public void f(@Nullable String str) {
        this.f306787a.f(str);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 g() {
        return t5.S();
    }

    @Override // io.sentry.i1
    public void g1(@NotNull v4 v4Var) {
        this.f306787a.g1(v4Var);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 getScope() {
        return this.f306787a.getScope();
    }

    @Override // io.sentry.i1
    public void h(@Nullable y7 y7Var) {
        this.f306787a.h(y7Var);
    }

    @Override // io.sentry.i1
    @Nullable
    public ga h1(@Nullable String str, @Nullable List<String> list) {
        return this.f306787a.h1(str, list);
    }

    @Override // io.sentry.i1
    public void i(boolean z10) {
        this.f306787a.i(z10);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public io.sentry.transport.a0 i0() {
        return this.f306787a.i0();
    }

    @Override // io.sentry.i1
    public boolean isEnabled() {
        return this.f306787a.isEnabled();
    }

    @Override // io.sentry.i1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
        this.f306787a.j(g0Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v j0(@NotNull String str, @NotNull y7 y7Var) {
        return this.f306787a.j0(str, y7Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 j1() {
        return this.f306787a.j1();
    }

    @Override // io.sentry.i1
    public void k(@NotNull f fVar) {
        this.f306787a.k(fVar);
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 k1(@NotNull String str) {
        return this.f306787a.k1(str);
    }

    @Override // io.sentry.i1
    public void l(@Nullable String str) {
        this.f306787a.l(str);
    }

    @Override // io.sentry.i1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
        this.f306787a.m(fVar, n0Var);
    }

    @Override // io.sentry.i1
    @lm.a.c
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
        this.f306787a.n(th2, p1Var, str);
    }

    @Override // io.sentry.i1
    public void o() {
        this.f306787a.o();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v o0(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return this.f306787a.o0(o7Var, n0Var);
    }

    @Override // io.sentry.i1
    @lm.a.c
    @Nullable
    public r1 p() {
        return this.f306787a.p();
    }

    @NotNull
    public i1 q() {
        return this.f306787a;
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 q0() {
        return this.f306787a.q0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v r0(@NotNull Throwable th2, @Nullable n0 n0Var) {
        return this.f306787a.r0(th2, n0Var);
    }

    @Override // io.sentry.i1
    public void s(@NotNull k1 k1Var) {
        this.f306787a.s(k1Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var) {
        return this.f306787a.s0(g6Var, n0Var);
    }

    @Override // io.sentry.i1
    public void t0(@NotNull na naVar) {
        this.f306787a.t0(naVar);
    }

    @Override // io.sentry.i1
    public void u() {
        this.f306787a.u();
    }

    @Override // io.sentry.i1
    public void u0() {
        this.f306787a.u0();
    }

    @Override // io.sentry.i1
    public void v(@NotNull List<String> list) {
        this.f306787a.v(list);
    }

    @Override // io.sentry.i1
    public void w(long j10) {
        this.f306787a.w(j10);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v w0(@NotNull o8 o8Var, @Nullable n0 n0Var) {
        return this.f306787a.w0(o8Var, n0Var);
    }

    @Override // io.sentry.i1
    public void x(@Nullable p1 p1Var) {
        this.f306787a.x(p1Var);
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v x0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        return this.f306787a.x0(fVar, n0Var, v4Var);
    }

    @Override // io.sentry.i1
    public void y() {
        this.f306787a.y();
    }

    @Override // io.sentry.i1
    @Deprecated
    public void y0() {
        this.f306787a.y0();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v z() {
        return this.f306787a.z();
    }

    @Override // io.sentry.i1
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public z0 m783clone() {
        return this.f306787a.m779clone();
    }
}
