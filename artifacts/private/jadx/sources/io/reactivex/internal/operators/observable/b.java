package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
public final class b<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f301347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f301348b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, Iterator<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f301349f = 6695226475494099826L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f301350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Lock f301351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Condition f301352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f301353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Throwable f301354e;

        a(int i10) {
            this.f301350a = new io.reactivex.internal.queue.c<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f301351b = reentrantLock;
            this.f301352c = reentrantLock.newCondition();
        }

        void b() {
            this.f301351b.lock();
            try {
                this.f301352c.signalAll();
                this.f301351b.unlock();
            } catch (Throwable th2) {
                this.f301351b.unlock();
                throw th2;
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.f301353d;
                boolean zIsEmpty = this.f301350a.isEmpty();
                if (z10) {
                    Throwable th2 = this.f301354e;
                    if (th2 != null) {
                        throw io.reactivex.internal.util.k.f(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    io.reactivex.internal.util.e.b();
                    this.f301351b.lock();
                    while (!this.f301353d && this.f301350a.isEmpty()) {
                        try {
                            this.f301352c.await();
                        } catch (Throwable th3) {
                            this.f301351b.unlock();
                            throw th3;
                        }
                    }
                    this.f301351b.unlock();
                } catch (InterruptedException e10) {
                    io.reactivex.internal.disposables.d.b(this);
                    b();
                    throw io.reactivex.internal.util.k.f(e10);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f301350a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301353d = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301354e = th2;
            this.f301353d = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301350a.offer(t10);
            b();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public b(io.reactivex.g0<? extends T> g0Var, int i10) {
        this.f301347a = g0Var;
        this.f301348b = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f301348b);
        this.f301347a.a(aVar);
        return aVar;
    }
}
