package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
public final class b<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f299091b;

    static final class a<T> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<T>, Iterator<T>, Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299092i = 6695226475494099826L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.internal.queue.b<T> f299093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f299095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Lock f299096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Condition f299097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f299098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f299099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f299100h;

        a(int i10) {
            this.f299093a = new io.reactivex.internal.queue.b<>(i10);
            this.f299094b = i10;
            this.f299095c = i10 - (i10 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f299096d = reentrantLock;
            this.f299097e = reentrantLock.newCondition();
        }

        void b() {
            this.f299096d.lock();
            try {
                this.f299097e.signalAll();
                this.f299096d.unlock();
            } catch (Throwable th2) {
                this.f299096d.unlock();
                throw th2;
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z10 = this.f299099g;
                boolean zIsEmpty = this.f299093a.isEmpty();
                if (z10) {
                    Throwable th2 = this.f299100h;
                    if (th2 != null) {
                        throw io.reactivex.internal.util.k.f(th2);
                    }
                    if (zIsEmpty) {
                        int i10 = 5 | 0;
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                io.reactivex.internal.util.e.b();
                this.f299096d.lock();
                while (!this.f299099g && this.f299093a.isEmpty()) {
                    try {
                        try {
                            this.f299097e.await();
                        } catch (InterruptedException e10) {
                            run();
                            throw io.reactivex.internal.util.k.f(e10);
                        }
                    } catch (Throwable th3) {
                        this.f299096d.unlock();
                        throw th3;
                    }
                }
                this.f299096d.unlock();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, this.f299094b);
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tPoll = this.f299093a.poll();
            long j10 = this.f299098f + 1;
            if (j10 != this.f299095c) {
                this.f299098f = j10;
                return tPoll;
            }
            this.f299098f = 0L;
            get().request(j10);
            return tPoll;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299099g = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299100h = th2;
            this.f299099g = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299093a.offer(t10)) {
                b();
            } else {
                io.reactivex.internal.subscriptions.j.b(this);
                onError(new io.reactivex.exceptions.c("Queue full?!"));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            io.reactivex.internal.subscriptions.j.b(this);
            b();
        }
    }

    public b(io.reactivex.l<T> lVar, int i10) {
        this.f299090a = lVar;
        this.f299091b = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f299091b);
        this.f299090a.j6(aVar);
        return aVar;
    }
}
