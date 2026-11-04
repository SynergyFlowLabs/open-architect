package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f301428b;

    static final class a<T> extends io.reactivex.observers.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile Object f301429b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.d$a$a, reason: collision with other inner class name */
        final class C2170a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f301430a;

            C2170a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = a.this.f301429b;
                this.f301430a = obj;
                return !io.reactivex.internal.util.q.s(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f301430a == null) {
                        this.f301430a = a.this.f301429b;
                    }
                    if (io.reactivex.internal.util.q.s(this.f301430a)) {
                        throw new NoSuchElementException();
                    }
                    if (io.reactivex.internal.util.q.v(this.f301430a)) {
                        throw io.reactivex.internal.util.k.f(io.reactivex.internal.util.q.p(this.f301430a));
                    }
                    T t10 = (T) io.reactivex.internal.util.q.r(this.f301430a);
                    this.f301430a = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f301430a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t10) {
            this.f301429b = io.reactivex.internal.util.q.x(t10);
        }

        public a<T>.C2170a c() {
            return new C2170a();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301429b = io.reactivex.internal.util.q.k();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301429b = io.reactivex.internal.util.q.n(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301429b = io.reactivex.internal.util.q.x(t10);
        }
    }

    public d(io.reactivex.g0<T> g0Var, T t10) {
        this.f301427a = g0Var;
        this.f301428b = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f301428b);
        this.f301427a.a(aVar);
        return aVar.c();
    }
}
