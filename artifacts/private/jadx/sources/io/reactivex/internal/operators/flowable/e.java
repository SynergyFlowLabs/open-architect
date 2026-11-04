package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299272a;

    static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b<T> f299273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.reactivestreams.u<? extends T> f299274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f299275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f299276d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f299277e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Throwable f299278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f299279g;

        a(org.reactivestreams.u<? extends T> uVar, b<T> bVar) {
            this.f299274b = uVar;
            this.f299273a = bVar;
        }

        private boolean b() {
            try {
                if (!this.f299279g) {
                    this.f299279g = true;
                    this.f299273a.f();
                    io.reactivex.l.Y2(this.f299274b).L3().j6(this.f299273a);
                }
                io.reactivex.a0<T> a0VarG = this.f299273a.g();
                if (a0VarG.h()) {
                    this.f299277e = false;
                    this.f299275c = a0VarG.e();
                    return true;
                }
                this.f299276d = false;
                if (a0VarG.f()) {
                    return false;
                }
                if (!a0VarG.g()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable thD = a0VarG.d();
                this.f299278f = thD;
                throw io.reactivex.internal.util.k.f(thD);
            } catch (InterruptedException e10) {
                this.f299273a.dispose();
                this.f299278f = e10;
                throw io.reactivex.internal.util.k.f(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f299278f;
            if (th2 != null) {
                throw io.reactivex.internal.util.k.f(th2);
            }
            if (this.f299276d) {
                return !this.f299277e || b();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f299278f;
            if (th2 != null) {
                throw io.reactivex.internal.util.k.f(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f299277e = true;
            return this.f299275c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    static final class b<T> extends io.reactivex.subscribers.b<io.reactivex.a0<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BlockingQueue<io.reactivex.a0<T>> f299280b = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f299281c = new AtomicInteger();

        b() {
        }

        @Override // org.reactivestreams.v
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(io.reactivex.a0<T> a0Var) {
            if (this.f299281c.getAndSet(0) == 1 || !a0Var.h()) {
                while (!this.f299280b.offer(a0Var)) {
                    io.reactivex.a0<T> a0VarPoll = this.f299280b.poll();
                    if (a0VarPoll != null && !a0VarPoll.h()) {
                        a0Var = a0VarPoll;
                    }
                }
            }
        }

        void f() {
            this.f299281c.set(1);
        }

        public io.reactivex.a0<T> g() throws InterruptedException {
            f();
            io.reactivex.internal.util.e.b();
            return this.f299280b.take();
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }
    }

    public e(org.reactivestreams.u<? extends T> uVar) {
        this.f299272a = uVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f299272a, new b());
    }
}
