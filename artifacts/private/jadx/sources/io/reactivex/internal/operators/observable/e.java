package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301475a;

    static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<T> f301476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.g0<T> f301477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f301478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f301479d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f301480e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Throwable f301481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f301482g;

        a(io.reactivex.g0<T> g0Var, b<T> bVar) {
            this.f301477b = g0Var;
            this.f301476a = bVar;
        }

        private boolean b() {
            if (!this.f301482g) {
                this.f301482g = true;
                this.f301476a.e();
                new y1(this.f301477b).a(this.f301476a);
            }
            try {
                io.reactivex.a0<T> a0VarF = this.f301476a.f();
                if (a0VarF.h()) {
                    this.f301480e = false;
                    this.f301478c = a0VarF.e();
                    return true;
                }
                this.f301479d = false;
                if (a0VarF.f()) {
                    return false;
                }
                Throwable thD = a0VarF.d();
                this.f301481f = thD;
                throw io.reactivex.internal.util.k.f(thD);
            } catch (InterruptedException e10) {
                this.f301476a.dispose();
                this.f301481f = e10;
                throw io.reactivex.internal.util.k.f(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f301481f;
            if (th2 != null) {
                throw io.reactivex.internal.util.k.f(th2);
            }
            if (this.f301479d) {
                return !this.f301480e || b();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f301481f;
            if (th2 != null) {
                throw io.reactivex.internal.util.k.f(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f301480e = true;
            return this.f301478c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    static final class b<T> extends io.reactivex.observers.e<io.reactivex.a0<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.a0<T>> f301483b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f301484c = new AtomicInteger();

        b() {
        }

        @Override // io.reactivex.i0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.a0<T> a0Var) {
            if (this.f301484c.getAndSet(0) == 1 || !a0Var.h()) {
                while (!this.f301483b.offer(a0Var)) {
                    io.reactivex.a0<T> a0VarPoll = this.f301483b.poll();
                    if (a0VarPoll != null && !a0VarPoll.h()) {
                        a0Var = a0VarPoll;
                    }
                }
            }
        }

        void e() {
            this.f301484c.set(1);
        }

        public io.reactivex.a0<T> f() throws InterruptedException {
            e();
            io.reactivex.internal.util.e.b();
            return this.f301483b.take();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }
    }

    public e(io.reactivex.g0<T> g0Var) {
        this.f301475a = g0Var;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f301475a, new b());
    }
}
