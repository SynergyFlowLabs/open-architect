package io.reactivex.internal.observers;

import androidx.compose.animation.core.z1;
import io.reactivex.i0;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class q<T> extends CountDownLatch implements i0<T>, Future<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f298783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f298784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f298785c;

    public q() {
        super(1);
        this.f298785c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        io.reactivex.disposables.c cVar;
        io.reactivex.internal.disposables.d dVar;
        do {
            cVar = this.f298785c.get();
            if (cVar == this || cVar == (dVar = io.reactivex.internal.disposables.d.DISPOSED)) {
                return false;
            }
        } while (!z1.a(this.f298785c, cVar, dVar));
        if (cVar != null) {
            cVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.i0
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this.f298785c, cVar);
    }

    @Override // io.reactivex.disposables.c
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            io.reactivex.internal.util.e.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f298784b;
        if (th2 == null) {
            return this.f298783a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return io.reactivex.internal.disposables.d.c(this.f298785c.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return isDone();
    }

    @Override // io.reactivex.i0
    public void onComplete() {
        io.reactivex.disposables.c cVar;
        if (this.f298783a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            cVar = this.f298785c.get();
            if (cVar == this || cVar == io.reactivex.internal.disposables.d.DISPOSED) {
                return;
            }
        } while (!z1.a(this.f298785c, cVar, this));
        countDown();
    }

    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        io.reactivex.disposables.c cVar;
        if (this.f298784b != null) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f298784b = th2;
        do {
            cVar = this.f298785c.get();
            if (cVar == this || cVar == io.reactivex.internal.disposables.d.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
        } while (!z1.a(this.f298785c, cVar, this));
        countDown();
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        if (this.f298783a == null) {
            this.f298783a = t10;
        } else {
            this.f298785c.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.e.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(io.reactivex.internal.util.k.e(j10, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th2 = this.f298784b;
            if (th2 == null) {
                return this.f298783a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
