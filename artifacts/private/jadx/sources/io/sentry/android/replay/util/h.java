package io.sentry.android.replay.util;

import io.sentry.l1;
import io.sentry.n8;
import io.sentry.y7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static final void d(@NotNull ExecutorService executorService, @NotNull n8 options) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
                if (!executorService.awaitTermination(options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
            Unit unit = Unit.f312394a;
        }
    }

    @e.a({"DiscouragedApi"})
    @Nullable
    public static final ScheduledFuture<?> e(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull final n8 options, @NotNull final String taskName, long j10, long j11, @NotNull TimeUnit unit, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: io.sentry.android.replay.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    h.f(task, options, taskName);
                }
            }, j10, j11, unit);
        } catch (Throwable th2) {
            options.getLogger().a(y7.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, n8 n8Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Failed to execute task " + str, th2);
        }
    }

    @Nullable
    public static final Future<?> g(@NotNull l1 l1Var, @NotNull final n8 options, @NotNull final String taskName, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            return l1Var.submit(new Runnable() { // from class: io.sentry.android.replay.util.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.i(task, options, taskName);
                }
            });
        } catch (Throwable th2) {
            options.getLogger().a(y7.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    @Nullable
    public static final Future<?> h(@NotNull ExecutorService executorService, @NotNull final n8 options, @NotNull final String taskName, @NotNull final Runnable task) {
        Intrinsics.checkNotNullParameter(executorService, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(task, "task");
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.u2(name, "SentryReplayIntegration", false, 2, null)) {
            task.run();
            return null;
        }
        try {
            return executorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.f
                @Override // java.lang.Runnable
                public final void run() {
                    h.j(task, options, taskName);
                }
            });
        } catch (Throwable th2) {
            options.getLogger().a(y7.ERROR, "Failed to submit task " + taskName + " to executor", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Runnable runnable, n8 n8Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Failed to execute task " + str, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Runnable runnable, n8 n8Var, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.ERROR, "Failed to execute task " + str, th2);
        }
    }
}
