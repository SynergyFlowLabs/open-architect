package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f121060a = 4000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f121061b = 3000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f121062c = k0.d("awaitEvenIfOnMainThread task continuation executor");

    private h1() {
    }

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    @Deprecated
    public static <T> T b(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.m(f121062c, new com.google.android.gms.tasks.c() { // from class: com.google.firebase.crashlytics.internal.common.g1
            @Override // com.google.android.gms.tasks.c
            public final Object a(Task task2) {
                return h1.a(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(androidx.media3.common.j.f60679f2, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.u()) {
            return task.q();
        }
        if (task.s()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.t()) {
            throw new IllegalStateException(task.p());
        }
        throw new TimeoutException();
    }

    @z7.a
    public static boolean c(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th2) {
            if (z10) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }
}
