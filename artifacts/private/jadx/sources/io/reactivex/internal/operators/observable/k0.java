package io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class k0<T, K> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, K> f301831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends Collection<? super K>> f301832c;

    static final class a<T, K> extends io.reactivex.internal.observers.a<T, T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Collection<? super K> f301833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final dj.o<? super T, K> f301834g;

        a(io.reactivex.i0<? super T> i0Var, dj.o<? super T, K> oVar, Collection<? super K> collection) {
            super(i0Var);
            this.f301834g = oVar;
            this.f301833f = collection;
        }

        @Override // io.reactivex.internal.observers.a, ej.o
        public void clear() {
            this.f301833f.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.a, io.reactivex.i0
        public void onComplete() {
            if (this.f298739d) {
                return;
            }
            this.f298739d = true;
            this.f301833f.clear();
            this.f298736a.onComplete();
        }

        @Override // io.reactivex.internal.observers.a, io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f298739d) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f298739d = true;
            this.f301833f.clear();
            this.f298736a.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (!this.f298739d) {
                if (this.f298740e != 0) {
                    this.f298736a.onNext(null);
                    return;
                }
                try {
                    if (this.f301833f.add(io.reactivex.internal.functions.b.g(this.f301834g.apply(t10), "The keySelector returned a null key"))) {
                        this.f298736a.onNext((Object) t10);
                    }
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return e(i10);
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f298738c.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f301833f.add((Object) io.reactivex.internal.functions.b.g(this.f301834g.apply(tPoll), "The keySelector returned a null key")));
            return tPoll;
        }
    }

    public k0(io.reactivex.g0<T> g0Var, dj.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        super(g0Var);
        this.f301831b = oVar;
        this.f301832c = callable;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        try {
            this.f301291a.a(new a(i0Var, this.f301831b, (Collection) io.reactivex.internal.functions.b.g(this.f301832c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
