package io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class a4<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<U> f301343b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super U> f301344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        U f301346c;

        a(io.reactivex.i0<? super U> i0Var, U u10) {
            this.f301344a = i0Var;
            this.f301346c = u10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301345b, cVar)) {
                this.f301345b = cVar;
                this.f301344a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301345b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301345b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            U u10 = this.f301346c;
            this.f301346c = null;
            this.f301344a.onNext(u10);
            this.f301344a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301346c = null;
            this.f301344a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301346c.add(t10);
        }
    }

    public a4(io.reactivex.g0<T> g0Var, int i10) {
        super(g0Var);
        this.f301343b = io.reactivex.internal.functions.a.f(i10);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super U> i0Var) {
        try {
            this.f301291a.a(new a(i0Var, (Collection) io.reactivex.internal.functions.b.g(this.f301343b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }

    public a4(io.reactivex.g0<T> g0Var, Callable<U> callable) {
        super(g0Var);
        this.f301343b = callable;
    }
}
