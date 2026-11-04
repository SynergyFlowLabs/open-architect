package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class i3 implements i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i3 f305547b = new i3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<n8> f305548a = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.h3
        @Override // io.sentry.util.s.a
        public final Object a() {
            return n8.empty();
        }
    });

    private i3() {
    }

    public static i3 r() {
        return f305547b;
    }

    @Override // io.sentry.i1
    public void C0(@NotNull v4 v4Var) {
        v4Var.a(g3.w());
    }

    @Override // io.sentry.i1
    @NotNull
    public r1 E0(@NotNull ga gaVar, @NotNull ia iaVar) {
        return u3.R();
    }

    @Override // io.sentry.i1
    @Nullable
    public i1 G0() {
        return null;
    }

    @Override // io.sentry.i1
    @Nullable
    public Boolean H0() {
        return null;
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v I0(@NotNull o7 o7Var, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v J0(@NotNull String str, @NotNull y7 y7Var, @NotNull v4 v4Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    @lm.a.b
    @NotNull
    public io.sentry.protocol.v K0(@NotNull h hVar) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public boolean L() {
        return true;
    }

    @Override // io.sentry.i1
    @Nullable
    public e M0() {
        return null;
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v N0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable n0 n0Var, @Nullable k4 k4Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 O0(@NotNull String str) {
        return r();
    }

    @Override // io.sentry.i1
    @Nullable
    public w8 P0() {
        return null;
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v R0(@NotNull Throwable th2, @Nullable n0 n0Var, @NotNull v4 v4Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public void T0(@Nullable x4 x4Var, @NotNull v4 v4Var) {
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 U0() {
        return j3.a();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.logger.a V0() {
        return io.sentry.logger.f.c();
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 W0(@NotNull String str) {
        return r();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v Y0(@NotNull g4 g4Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public void a(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.i1
    public void a1() {
    }

    @Override // io.sentry.i1
    @NotNull
    public n8 b() {
        return this.f305548a.a();
    }

    @Override // io.sentry.i1
    public boolean b1(@Nullable i1 i1Var) {
        return false;
    }

    @Override // io.sentry.i1
    public void c(@Nullable String str) {
    }

    @Override // io.sentry.i1
    public void close() {
    }

    @Override // io.sentry.i1
    public void d(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.i1
    public void d1() {
    }

    @Override // io.sentry.i1
    @Nullable
    public p1 e() {
        return null;
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 e1() {
        return g3.w();
    }

    @Override // io.sentry.i1
    public void f(@Nullable String str) {
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 g() {
        return g3.w();
    }

    @Override // io.sentry.i1
    public void g1(@NotNull v4 v4Var) {
        v4Var.a(g3.w());
    }

    @Override // io.sentry.i1
    @lm.a.c
    @NotNull
    public g1 getScope() {
        return g3.w();
    }

    @Override // io.sentry.i1
    public void h(@Nullable y7 y7Var) {
    }

    @Override // io.sentry.i1
    @Nullable
    public ga h1(@Nullable String str, @Nullable List<String> list) {
        return null;
    }

    @Override // io.sentry.i1
    public void i(boolean z10) {
    }

    @Override // io.sentry.i1
    @Nullable
    public io.sentry.transport.a0 i0() {
        return null;
    }

    @Override // io.sentry.i1
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.i1
    public void j(@Nullable io.sentry.protocol.g0 g0Var) {
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v j0(@NotNull String str, @NotNull y7 y7Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 j1() {
        return j3.a();
    }

    @Override // io.sentry.i1
    public void k(@NotNull f fVar) {
    }

    @Override // io.sentry.i1
    @NotNull
    public i1 k1(@NotNull String str) {
        return r();
    }

    @Override // io.sentry.i1
    public void l(@Nullable String str) {
    }

    @Override // io.sentry.i1
    public void m(@NotNull f fVar, @Nullable n0 n0Var) {
    }

    @Override // io.sentry.i1
    public void n(@NotNull Throwable th2, @NotNull p1 p1Var, @NotNull String str) {
    }

    @Override // io.sentry.i1
    public boolean n0() {
        return true;
    }

    @Override // io.sentry.i1
    public void o() {
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v o0(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    @Nullable
    public r1 p() {
        return null;
    }

    @Override // io.sentry.i1
    @NotNull
    public m1 q0() {
        return j3.a();
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v r0(@NotNull Throwable th2, @Nullable n0 n0Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public void s(@NotNull k1 k1Var) {
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public void t0(@NotNull na naVar) {
    }

    @Override // io.sentry.i1
    public void u() {
    }

    @Override // io.sentry.i1
    public void u0() {
    }

    @Override // io.sentry.i1
    public void v(@NotNull List<String> list) {
    }

    @Override // io.sentry.i1
    public void w(long j10) {
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v w0(@NotNull o8 o8Var, @Nullable n0 n0Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public void x(@Nullable p1 p1Var) {
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v x0(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @Nullable v4 v4Var) {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    public void y() {
    }

    @Override // io.sentry.i1
    @Deprecated
    public void y0() {
    }

    @Override // io.sentry.i1
    @NotNull
    public io.sentry.protocol.v z() {
        return io.sentry.protocol.v.f306474b;
    }

    @Override // io.sentry.i1
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public z0 m780clone() {
        return b3.q();
    }
}
