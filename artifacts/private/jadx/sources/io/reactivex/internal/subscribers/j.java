package io.reactivex.internal.subscribers;

import androidx.compose.animation.core.z1;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public final class j<T> extends CountDownLatch implements io.reactivex.q<T>, Future<T>, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    T f303359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f303360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<w> f303361c;

    public j() {
        super(1);
        this.f303361c = new AtomicReference<>();
    }

    @Override // org.reactivestreams.w
    public void cancel() {
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
        Throwable th2 = this.f303360b;
        if (th2 == null) {
            return this.f303359a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f303361c.get() == io.reactivex.internal.subscriptions.j.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.q, org.reactivestreams.v
    public void l(w wVar) {
        io.reactivex.internal.subscriptions.j.o(this.f303361c, wVar, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        w wVar;
        if (this.f303359a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            wVar = this.f303361c.get();
            if (wVar == this || wVar == io.reactivex.internal.subscriptions.j.CANCELLED) {
                return;
            }
        } while (!z1.a(this.f303361c, wVar, this));
        countDown();
    }

    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        w wVar;
        do {
            wVar = this.f303361c.get();
            if (wVar == this || wVar == io.reactivex.internal.subscriptions.j.CANCELLED) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f303360b = th2;
        } while (!z1.a(this.f303361c, wVar, this));
        countDown();
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        if (this.f303359a == null) {
            this.f303359a = t10;
        } else {
            this.f303361c.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        w wVar;
        io.reactivex.internal.subscriptions.j jVar;
        do {
            wVar = this.f303361c.get();
            if (wVar != this && wVar != (jVar = io.reactivex.internal.subscriptions.j.CANCELLED)) {
            }
            return false;
        } while (!z1.a(this.f303361c, wVar, jVar));
        if (wVar != null) {
            wVar.cancel();
        }
        countDown();
        return true;
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
        Throwable th2 = this.f303360b;
        if (th2 == null) {
            return this.f303359a;
        }
        throw new ExecutionException(th2);
    }
}
