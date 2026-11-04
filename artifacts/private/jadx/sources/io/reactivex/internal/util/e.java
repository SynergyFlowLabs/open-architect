package io.reactivex.internal.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    private e() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(CountDownLatch countDownLatch, io.reactivex.disposables.c cVar) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            b();
            countDownLatch.await();
        } catch (InterruptedException e10) {
            cVar.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e10);
        }
    }

    public static void b() {
        if (io.reactivex.plugins.a.L()) {
            if ((Thread.currentThread() instanceof io.reactivex.internal.schedulers.j) || io.reactivex.plugins.a.W()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
