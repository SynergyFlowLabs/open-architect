package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class x1<T, R> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.g0<? extends R>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f302567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends io.reactivex.g0<? extends R>> f302568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends io.reactivex.g0<? extends R>> f302569d;

    static final class a<T, R> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.g0<? extends R>> f302570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f302571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends io.reactivex.g0<? extends R>> f302572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Callable<? extends io.reactivex.g0<? extends R>> f302573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f302574e;

        a(io.reactivex.i0<? super io.reactivex.g0<? extends R>> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, dj.o<? super Throwable, ? extends io.reactivex.g0<? extends R>> oVar2, Callable<? extends io.reactivex.g0<? extends R>> callable) {
            this.f302570a = i0Var;
            this.f302571b = oVar;
            this.f302572c = oVar2;
            this.f302573d = callable;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302574e, cVar)) {
                this.f302574e = cVar;
                this.f302570a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302574e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302574e.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            try {
                this.f302570a.onNext((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302573d.call(), "The onComplete ObservableSource returned is null"));
                this.f302570a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302570a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            try {
                this.f302570a.onNext((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302572c.apply(th2), "The onError ObservableSource returned is null"));
                this.f302570a.onComplete();
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f302570a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            try {
                this.f302570a.onNext((io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302571b.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302570a.onError(th2);
            }
        }
    }

    public x1(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, dj.o<? super Throwable, ? extends io.reactivex.g0<? extends R>> oVar2, Callable<? extends io.reactivex.g0<? extends R>> callable) {
        super(g0Var);
        this.f302567b = oVar;
        this.f302568c = oVar2;
        this.f302569d = callable;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.g0<? extends R>> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302567b, this.f302568c, this.f302569d));
    }
}
