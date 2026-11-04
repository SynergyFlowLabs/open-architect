package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class i1<T, S> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Callable<S> f301705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.c<S, io.reactivex.k<T>, S> f301706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super S> f301707c;

    static final class a<T, S> implements io.reactivex.k<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<S, ? super io.reactivex.k<T>, S> f301709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.g<? super S> f301710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        S f301711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f301712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f301713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f301714g;

        a(io.reactivex.i0<? super T> i0Var, dj.c<S, ? super io.reactivex.k<T>, S> cVar, dj.g<? super S> gVar, S s10) {
            this.f301708a = i0Var;
            this.f301709b = cVar;
            this.f301710c = gVar;
            this.f301711d = s10;
        }

        private void b(S s10) {
            try {
                this.f301710c.accept(s10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301712e = true;
        }

        public void e() {
            S sApply = this.f301711d;
            if (this.f301712e) {
                this.f301711d = null;
                b(sApply);
                return;
            }
            dj.c<S, ? super io.reactivex.k<T>, S> cVar = this.f301709b;
            while (!this.f301712e) {
                this.f301714g = false;
                try {
                    sApply = cVar.apply(sApply, this);
                    if (this.f301713f) {
                        this.f301712e = true;
                        this.f301711d = null;
                        b(sApply);
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f301711d = null;
                    this.f301712e = true;
                    onError(th2);
                    b(sApply);
                    return;
                }
            }
            this.f301711d = null;
            b(sApply);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301712e;
        }

        @Override // io.reactivex.k
        public void onComplete() {
            if (this.f301713f) {
                return;
            }
            this.f301713f = true;
            this.f301708a.onComplete();
        }

        @Override // io.reactivex.k
        public void onError(Throwable th2) {
            if (this.f301713f) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f301713f = true;
            this.f301708a.onError(th2);
        }

        @Override // io.reactivex.k
        public void onNext(T t10) {
            if (!this.f301713f) {
                if (this.f301714g) {
                    onError(new IllegalStateException("onNext already called in this generate turn"));
                } else if (t10 == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f301714g = true;
                    this.f301708a.onNext(t10);
                }
            }
        }
    }

    public i1(Callable<S> callable, dj.c<S, io.reactivex.k<T>, S> cVar, dj.g<? super S> gVar) {
        this.f301705a = callable;
        this.f301706b = cVar;
        this.f301707c = gVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        try {
            a aVar = new a(i0Var, this.f301706b, this.f301707c, this.f301705a.call());
            i0Var.d(aVar);
            aVar.e();
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.l(th2, i0Var);
        }
    }
}
