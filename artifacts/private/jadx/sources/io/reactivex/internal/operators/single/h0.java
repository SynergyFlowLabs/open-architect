package io.reactivex.internal.operators.single;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    enum a implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    enum b implements dj.o<io.reactivex.q0, org.reactivestreams.u> {
        INSTANCE;

        @Override // dj.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.u apply(io.reactivex.q0 q0Var) {
            return new u0(q0Var);
        }
    }

    static final class c<T> implements Iterable<io.reactivex.l<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterable<? extends io.reactivex.q0<? extends T>> f302963a;

        c(Iterable<? extends io.reactivex.q0<? extends T>> iterable) {
            this.f302963a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<io.reactivex.l<T>> iterator() {
            return new d(this.f302963a.iterator());
        }
    }

    static final class d<T> implements Iterator<io.reactivex.l<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<? extends io.reactivex.q0<? extends T>> f302964a;

        d(Iterator<? extends io.reactivex.q0<? extends T>> it) {
            this.f302964a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public io.reactivex.l<T> next() {
            return new u0(this.f302964a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f302964a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    enum e implements dj.o<io.reactivex.q0, io.reactivex.b0> {
        INSTANCE;

        @Override // dj.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public io.reactivex.b0 apply(io.reactivex.q0 q0Var) {
            return new v0(q0Var);
        }
    }

    private h0() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Callable<NoSuchElementException> a() {
        return a.INSTANCE;
    }

    public static <T> Iterable<? extends io.reactivex.l<T>> b(Iterable<? extends io.reactivex.q0<? extends T>> iterable) {
        return new c(iterable);
    }

    public static <T> dj.o<io.reactivex.q0<? extends T>, org.reactivestreams.u<? extends T>> c() {
        return b.INSTANCE;
    }

    public static <T> dj.o<io.reactivex.q0<? extends T>, io.reactivex.b0<? extends T>> d() {
        return e.INSTANCE;
    }
}
