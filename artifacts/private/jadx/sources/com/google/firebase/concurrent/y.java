package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class y {

    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private y() {
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor, int i10) {
        return new a0(executor, i10);
    }

    public static ExecutorService c(ExecutorService executorService, int i10) {
        return new d0(executorService, i10);
    }

    public static ScheduledExecutorService d(ExecutorService executorService, int i10) {
        return new o(c(executorService, i10), ExecutorsRegistrar.f120831d.get());
    }

    public static e0 e(Executor executor) {
        return new f0(false, executor);
    }

    public static g0 f(ExecutorService executorService) {
        return new j0(false, executorService);
    }

    public static k0 g(ScheduledExecutorService scheduledExecutorService) {
        return new l0(f(scheduledExecutorService), ExecutorsRegistrar.f120831d.get());
    }

    public static Executor h(Executor executor) {
        return new m0(executor);
    }
}
