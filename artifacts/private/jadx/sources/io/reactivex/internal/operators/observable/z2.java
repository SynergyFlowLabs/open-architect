package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class z2<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.c<R, ? super T, R> f302681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<R> f302682c;

    static final class a<T, R> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<R, ? super T, R> f302684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        R f302685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302687e;

        a(io.reactivex.i0<? super R> i0Var, dj.c<R, ? super T, R> cVar, R r10) {
            this.f302683a = i0Var;
            this.f302684b = cVar;
            this.f302685c = r10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302686d, cVar)) {
                this.f302686d = cVar;
                this.f302683a.d(this);
                this.f302683a.onNext(this.f302685c);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302686d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302686d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302687e) {
                return;
            }
            this.f302687e = true;
            this.f302683a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302687e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302687e = true;
                this.f302683a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302687e) {
                return;
            }
            try {
                R r10 = (R) io.reactivex.internal.functions.b.g(this.f302684b.apply(this.f302685c, t10), "The accumulator returned a null value");
                this.f302685c = r10;
                this.f302683a.onNext(r10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302686d.dispose();
                onError(th2);
            }
        }
    }

    public z2(io.reactivex.g0<T> g0Var, Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        super(g0Var);
        this.f302681b = cVar;
        this.f302682c = callable;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        try {
            this.f301291a.a(new a(i0Var, this.f302681b, io.reactivex.internal.functions.b.g(this.f302682c.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
