package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
abstract class a extends AtomicReference<Future<?>> implements io.reactivex.disposables.c, io.reactivex.schedulers.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f303173c = 1811839108042568751L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f303174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final FutureTask<Void> f303175e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Runnable f303176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Thread f303177b;

    static {
        Runnable runnable = io.reactivex.internal.functions.a.f298691b;
        f303174d = new FutureTask<>(runnable, null);
        f303175e = new FutureTask<>(runnable, null);
    }

    a(Runnable runnable) {
        this.f303176a = runnable;
    }

    @Override // io.reactivex.schedulers.a
    public Runnable a() {
        return this.f303176a;
    }

    public final void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f303174d) {
                return;
            }
            if (future2 == f303175e) {
                future.cancel(this.f303177b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.c
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future != f303174d && future != (futureTask = f303175e) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f303177b != Thread.currentThread());
        }
    }

    @Override // io.reactivex.disposables.c
    public final boolean k() {
        Future<?> future = get();
        return future == f303174d || future == f303175e;
    }
}
