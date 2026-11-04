package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class p3 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p3 f306006a = new p3();

    private p3() {
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public static /* synthetic */ Object f() {
        return null;
    }

    @NotNull
    public static l1 g() {
        return f306006a;
    }

    @Override // io.sentry.l1
    public void a() {
    }

    @Override // io.sentry.l1
    @NotNull
    public Future<?> b(@NotNull Runnable runnable, long j10) {
        return new FutureTask(new Callable() { // from class: io.sentry.m3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p3.e();
            }
        });
    }

    @Override // io.sentry.l1
    public void c(long j10) {
    }

    @Override // io.sentry.l1
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.l1
    @NotNull
    public Future<?> submit(@NotNull Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.o3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p3.d();
            }
        });
    }

    @Override // io.sentry.l1
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> callable) {
        return new FutureTask(new Callable() { // from class: io.sentry.n3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p3.f();
            }
        });
    }
}
