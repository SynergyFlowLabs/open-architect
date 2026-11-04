package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface k1 {
    @lm.a.c
    default boolean L() {
        return true;
    }

    @NotNull
    default io.sentry.protocol.v a(@NotNull io.sentry.protocol.c0 c0Var) {
        return h(c0Var, null, null, null);
    }

    default void b(@NotNull k9 k9Var) {
        n(k9Var, null);
    }

    @NotNull
    io.sentry.protocol.v c(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @NotNull g1 g1Var);

    void close();

    @NotNull
    default io.sentry.protocol.v d(@NotNull Throwable th2, @Nullable g1 g1Var, @Nullable n0 n0Var) {
        return r(new o7(th2), g1Var, n0Var);
    }

    @lm.a.c
    @NotNull
    io.sentry.protocol.v e(@NotNull g4 g4Var, @Nullable g1 g1Var);

    @NotNull
    io.sentry.protocol.v f(@NotNull o8 o8Var, @Nullable g1 g1Var, @Nullable n0 n0Var);

    void g(@NotNull a8 a8Var, @Nullable g1 g1Var);

    @NotNull
    default io.sentry.protocol.v h(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable g1 g1Var, @Nullable n0 n0Var) {
        return l(c0Var, daVar, g1Var, n0Var, null);
    }

    void i(boolean z10);

    @lm.a.c
    @Nullable
    io.sentry.transport.a0 i0();

    boolean isEnabled();

    @NotNull
    default io.sentry.protocol.v j(@NotNull Throwable th2, @Nullable g1 g1Var) {
        return d(th2, g1Var, null);
    }

    @NotNull
    default io.sentry.protocol.v j0(@NotNull String str, @NotNull y7 y7Var) {
        return q(str, y7Var, null);
    }

    @NotNull
    default io.sentry.protocol.v k(@NotNull io.sentry.protocol.c0 c0Var, @Nullable g1 g1Var, @Nullable n0 n0Var) {
        return h(c0Var, null, g1Var, n0Var);
    }

    @Nullable
    default io.sentry.protocol.v k0(@NotNull g6 g6Var) {
        return s0(g6Var, null);
    }

    @lm.a.c
    @NotNull
    io.sentry.protocol.v l(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable g1 g1Var, @Nullable n0 n0Var, @Nullable k4 k4Var);

    @NotNull
    default io.sentry.protocol.v l0(@NotNull o7 o7Var) {
        return r(o7Var, null, null);
    }

    @NotNull
    default io.sentry.protocol.v m(@NotNull o7 o7Var, @Nullable g1 g1Var) {
        return r(o7Var, g1Var, null);
    }

    @NotNull
    default io.sentry.protocol.v m0(@NotNull Throwable th2) {
        return d(th2, null, null);
    }

    void n(@NotNull k9 k9Var, @Nullable n0 n0Var);

    @lm.a.c
    void o(@NotNull c8 c8Var);

    @NotNull
    default io.sentry.protocol.v o0(@NotNull o7 o7Var, @Nullable n0 n0Var) {
        return r(o7Var, null, n0Var);
    }

    @NotNull
    io.sentry.protocol.v p(@NotNull h hVar, @Nullable g1 g1Var, @Nullable n0 n0Var);

    @lm.a.c
    @NotNull
    default io.sentry.protocol.v p0(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar) {
        return h(c0Var, daVar, null, null);
    }

    @NotNull
    default io.sentry.protocol.v q(@NotNull String str, @NotNull y7 y7Var, @Nullable g1 g1Var) {
        o7 o7Var = new o7();
        io.sentry.protocol.k kVar = new io.sentry.protocol.k();
        kVar.g(str);
        o7Var.O0(kVar);
        o7Var.M0(y7Var);
        return m(o7Var, g1Var);
    }

    @NotNull
    io.sentry.protocol.v r(@NotNull o7 o7Var, @Nullable g1 g1Var, @Nullable n0 n0Var);

    @NotNull
    default io.sentry.protocol.v r0(@NotNull Throwable th2, @Nullable n0 n0Var) {
        return d(th2, null, n0Var);
    }

    @Nullable
    io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var);

    void t0(@NotNull na naVar);

    void w(long j10);
}
