package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f299186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final T f299187b;

    static final class a<T> extends io.reactivex.subscribers.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile Object f299188b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.d$a$a, reason: collision with other inner class name */
        final class C2131a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f299189a;

            C2131a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = a.this.f299188b;
                this.f299189a = obj;
                return !io.reactivex.internal.util.q.s(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f299189a == null) {
                        this.f299189a = a.this.f299188b;
                    }
                    if (io.reactivex.internal.util.q.s(this.f299189a)) {
                        throw new NoSuchElementException();
                    }
                    if (io.reactivex.internal.util.q.v(this.f299189a)) {
                        throw io.reactivex.internal.util.k.f(io.reactivex.internal.util.q.p(this.f299189a));
                    }
                    T t10 = (T) io.reactivex.internal.util.q.r(this.f299189a);
                    this.f299189a = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f299189a = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t10) {
            this.f299188b = io.reactivex.internal.util.q.x(t10);
        }

        public a<T>.C2131a d() {
            return new C2131a();
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299188b = io.reactivex.internal.util.q.k();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299188b = io.reactivex.internal.util.q.n(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299188b = io.reactivex.internal.util.q.x(t10);
        }
    }

    public d(io.reactivex.l<T> lVar, T t10) {
        this.f299186a = lVar;
        this.f299187b = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f299187b);
        this.f299186a.j6(aVar);
        return aVar.d();
    }
}
