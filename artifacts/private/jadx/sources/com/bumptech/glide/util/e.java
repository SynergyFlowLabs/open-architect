package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f97472a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f97473b = new b();

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f97474a = new Handler(Looper.getMainLooper());

        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f97474a.post(runnable);
        }
    }

    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    private e() {
    }

    public static Executor a() {
        return f97473b;
    }

    public static Executor b() {
        return f97472a;
    }

    @l1
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5L, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e10) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e10);
        }
    }
}
