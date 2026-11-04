package io.reactivex.internal.observers;

import androidx.compose.animation.core.z1;
import io.reactivex.n0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class r<T> extends CountDownLatch implements n0<T>, Future<T>, io.reactivex.disposables.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f298786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f298787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<io.reactivex.disposables.c> f298788c;

    public r() {
        super(1);
        this.f298788c = new AtomicReference<>();
    }

    @Override // io.reactivex.n0
    public void b(T t10) {
        io.reactivex.disposables.c cVar = this.f298788c.get();
        if (cVar == io.reactivex.internal.disposables.d.DISPOSED) {
            return;
        }
        this.f298786a = t10;
        z1.a(this.f298788c, cVar, this);
        countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        io.reactivex.disposables.c cVar;
        io.reactivex.internal.disposables.d dVar;
        do {
            cVar = this.f298788c.get();
            if (cVar == this || cVar == (dVar = io.reactivex.internal.disposables.d.DISPOSED)) {
                return false;
            }
        } while (!z1.a(this.f298788c, cVar, dVar));
        if (cVar != null) {
            cVar.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.n0
    public void d(io.reactivex.disposables.c cVar) {
        io.reactivex.internal.disposables.d.o(this.f298788c, cVar);
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
        Throwable th2 = this.f298787b;
        if (th2 == null) {
            return this.f298786a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return io.reactivex.internal.disposables.d.c(this.f298788c.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.disposables.c
    public boolean k() {
        return isDone();
    }

    @Override // io.reactivex.n0
    public void onError(Throwable th2) {
        io.reactivex.disposables.c cVar;
        do {
            cVar = this.f298788c.get();
            if (cVar == io.reactivex.internal.disposables.d.DISPOSED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f298787b = th2;
        } while (!z1.a(this.f298788c, cVar, this));
        countDown();
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.e.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException(io.reactivex.internal.util.k.e(j10, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f298787b;
        if (th2 == null) {
            return this.f298786a;
        }
        throw new ExecutionException(th2);
    }
}
