package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.z1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
final class f implements Callable<Void>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final FutureTask<Void> f303227f = new FutureTask<>(io.reactivex.internal.functions.a.f298691b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f303228a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ExecutorService f303231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Thread f303232e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f303230c = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<Future<?>> f303229b = new AtomicReference<>();

    f(Runnable runnable, ExecutorService executorService) {
        this.f303228a = runnable;
        this.f303231d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f303232e = Thread.currentThread();
        try {
            this.f303228a.run();
            c(this.f303231d.submit(this));
            this.f303232e = null;
        } catch (Throwable th2) {
            this.f303232e = null;
            io.reactivex.plugins.a.Y(th2);
        }
        return null;
    }

    void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f303230c.get();
            if (future2 == f303227f) {
                future.cancel(this.f303232e != Thread.currentThread());
                return;
            }
        } while (!z1.a(this.f303230c, future2, future));
    }

    void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f303229b.get();
            if (future2 == f303227f) {
                future.cancel(this.f303232e != Thread.currentThread());
                return;
            }
        } while (!z1.a(this.f303229b, future2, future));
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f303230c;
        FutureTask<Void> futureTask = f303227f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f303232e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f303229b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f303232e != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return this.f303230c.get() == f303227f;
    }
}
