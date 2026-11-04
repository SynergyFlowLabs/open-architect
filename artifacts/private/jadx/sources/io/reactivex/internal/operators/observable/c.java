package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301402a;

    static final class a<T> extends io.reactivex.observers.e<io.reactivex.a0<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.a0<T> f301403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Semaphore f301404c = new Semaphore(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.a0<T>> f301405d = new AtomicReference<>();

        a() {
        }

        @Override // io.reactivex.i0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.a0<T> a0Var) {
            if (this.f301405d.getAndSet(a0Var) == null) {
                this.f301404c.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.a0<T> a0Var = this.f301403b;
            if (a0Var != null && a0Var.g()) {
                throw io.reactivex.internal.util.k.f(this.f301403b.d());
            }
            if (this.f301403b == null) {
                try {
                    io.reactivex.internal.util.e.b();
                    this.f301404c.acquire();
                    io.reactivex.a0<T> andSet = this.f301405d.getAndSet(null);
                    this.f301403b = andSet;
                    if (andSet.g()) {
                        throw io.reactivex.internal.util.k.f(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f301403b = io.reactivex.a0.b(e10);
                    throw io.reactivex.internal.util.k.f(e10);
                }
            }
            return this.f301403b.h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tE = this.f301403b.e();
            this.f301403b = null;
            return tE;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public c(io.reactivex.g0<T> g0Var) {
        this.f301402a = g0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.b0.O7(this.f301402a).A3().a(aVar);
        return aVar;
    }
}
