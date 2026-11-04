package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299140a;

    static final class a<T> extends io.reactivex.subscribers.b<io.reactivex.a0<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Semaphore f299141b = new Semaphore(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<io.reactivex.a0<T>> f299142c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.a0<T> f299143d;

        a() {
        }

        @Override // org.reactivestreams.v
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.a0<T> a0Var) {
            if (this.f299142c.getAndSet(a0Var) == null) {
                this.f299141b.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.a0<T> a0Var = this.f299143d;
            if (a0Var != null && a0Var.g()) {
                throw io.reactivex.internal.util.k.f(this.f299143d.d());
            }
            io.reactivex.a0<T> a0Var2 = this.f299143d;
            if ((a0Var2 == null || a0Var2.h()) && this.f299143d == null) {
                try {
                    io.reactivex.internal.util.e.b();
                    this.f299141b.acquire();
                    io.reactivex.a0<T> andSet = this.f299142c.getAndSet(null);
                    this.f299143d = andSet;
                    if (andSet.g()) {
                        throw io.reactivex.internal.util.k.f(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f299143d = io.reactivex.a0.b(e10);
                    throw io.reactivex.internal.util.k.f(e10);
                }
            }
            return this.f299143d.h();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f299143d.h()) {
                throw new NoSuchElementException();
            }
            T tE = this.f299143d.e();
            this.f299143d = null;
            return tE;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public c(org.reactivestreams.u<? extends T> uVar) {
        this.f299140a = uVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        io.reactivex.l.Y2(this.f299140a).L3().j6(aVar);
        return aVar;
    }
}
