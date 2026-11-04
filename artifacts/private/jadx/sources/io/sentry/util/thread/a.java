package io.sentry.util.thread;

import io.sentry.protocol.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public interface a {
    boolean a();

    @NotNull
    String b();

    long c();

    boolean d(long j10);

    boolean e(@NotNull b0 b0Var);

    boolean f(@NotNull Thread thread);
}
