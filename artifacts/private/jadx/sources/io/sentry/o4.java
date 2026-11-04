package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public interface o4 extends f1 {
    void e(@NotNull n4 n4Var);

    boolean f();

    void l(@Nullable Boolean bool);

    boolean m();

    void p();

    void pause();

    @NotNull
    n4 r();

    void start();

    void stop();

    @NotNull
    io.sentry.protocol.v t();
}
