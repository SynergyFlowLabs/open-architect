package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface r1 extends p1 {
    @Nullable
    p1 H();

    void L(@NotNull String str);

    @NotNull
    p1 O(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var);

    @lm.a.c
    void e(@NotNull x9 x9Var, boolean z10, @Nullable n0 n0Var);

    @Nullable
    Boolean g();

    @NotNull
    String getName();

    @lm.n
    @NotNull
    List<o9> j();

    void l();

    @lm.a.c
    void r(@Nullable x9 x9Var, @Nullable e6 e6Var, boolean z10, @Nullable n0 n0Var);

    @lm.a.c
    void s(@NotNull String str, @NotNull io.sentry.protocol.f0 f0Var);

    @NotNull
    io.sentry.protocol.v x();

    @NotNull
    io.sentry.protocol.f0 z();
}
