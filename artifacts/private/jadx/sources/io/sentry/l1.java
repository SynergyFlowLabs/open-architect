package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public interface l1 {
    void a();

    @NotNull
    Future<?> b(@NotNull Runnable runnable, long j10) throws RejectedExecutionException;

    void c(long j10);

    boolean isClosed();

    @NotNull
    Future<?> submit(@NotNull Runnable runnable) throws RejectedExecutionException;

    @NotNull
    <T> Future<T> submit(@NotNull Callable<T> callable) throws RejectedExecutionException;
}
