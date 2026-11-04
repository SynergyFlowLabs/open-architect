package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public interface s1 {
    void a(@NotNull r1 r1Var);

    @Nullable
    k4 b(@NotNull r1 r1Var, @Nullable List<e4> list, @NotNull n8 n8Var);

    void close();

    boolean isRunning();

    void start();
}
