package io.reactivex.internal.queue;

import cj.g;
import ej.n;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<C2191a<T>> f303152a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<C2191a<T>> f303153b = new AtomicReference<>();

    /* JADX INFO: renamed from: io.reactivex.internal.queue.a$a, reason: collision with other inner class name */
    static final class C2191a<E> extends AtomicReference<C2191a<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303154b = 2404266111789071508L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E f303155a;

        C2191a() {
        }

        public E a() {
            E eB = b();
            e(null);
            return eB;
        }

        public E b() {
            return this.f303155a;
        }

        public C2191a<E> c() {
            return get();
        }

        public void d(C2191a<E> c2191a) {
            lazySet(c2191a);
        }

        public void e(E e10) {
            this.f303155a = e10;
        }

        C2191a(E e10) {
            e(e10);
        }
    }

    public a() {
        C2191a<T> c2191a = new C2191a<>();
        d(c2191a);
        e(c2191a);
    }

    C2191a<T> a() {
        return this.f303153b.get();
    }

    C2191a<T> b() {
        return this.f303153b.get();
    }

    C2191a<T> c() {
        return this.f303152a.get();
    }

    @Override // ej.o
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(C2191a<T> c2191a) {
        this.f303153b.lazySet(c2191a);
    }

    C2191a<T> e(C2191a<T> c2191a) {
        return this.f303152a.getAndSet(c2191a);
    }

    @Override // ej.o
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // ej.o
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C2191a<T> c2191a = new C2191a<>(t10);
        e(c2191a).d(c2191a);
        return true;
    }

    @Override // ej.n, ej.o
    @g
    public T poll() {
        C2191a<T> c2191aC;
        C2191a<T> c2191aA = a();
        C2191a<T> c2191aC2 = c2191aA.c();
        if (c2191aC2 != null) {
            T tA = c2191aC2.a();
            d(c2191aC2);
            return tA;
        }
        if (c2191aA == c()) {
            return null;
        }
        do {
            c2191aC = c2191aA.c();
        } while (c2191aC == null);
        T tA2 = c2191aC.a();
        d(c2191aC);
        return tA2;
    }

    @Override // ej.o
    public boolean r(T t10, T t11) {
        offer(t10);
        offer(t11);
        return true;
    }
}
