package io.reactivex.internal.observers;

import io.reactivex.i0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class i<T> extends AtomicReference<io.reactivex.disposables.c> implements i0<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f298754b = -4875965440900746268L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f298755c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Queue<Object> f298756a;

    public i(Queue<Object> queue) {
        this.f298756a = queue;
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
        if (io.reactivex.internal.disposables.d.b(this)) {
            this.f298756a.offer(f298755c);
        }
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return get() == io.reactivex.internal.disposables.d.DISPOSED;
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        this.f298756a.offer(io.reactivex.internal.util.q.k());
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        this.f298756a.offer(io.reactivex.internal.util.q.n(th2));
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        this.f298756a.offer(io.reactivex.internal.util.q.x(t10));
    }
}
