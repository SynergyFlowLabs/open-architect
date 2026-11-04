package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class w3<T> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.schedulers.d<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f302543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302544c;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.schedulers.d<T>> f302545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TimeUnit f302546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.j0 f302547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f302548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f302549e;

        a(io.reactivex.i0<? super io.reactivex.schedulers.d<T>> i0Var, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f302545a = i0Var;
            this.f302547c = j0Var;
            this.f302546b = timeUnit;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302549e, cVar)) {
                this.f302549e = cVar;
                this.f302548d = this.f302547c.d(this.f302546b);
                this.f302545a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302549e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302549e.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302545a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302545a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long jD = this.f302547c.d(this.f302546b);
            long j10 = this.f302548d;
            this.f302548d = jD;
            this.f302545a.onNext(new io.reactivex.schedulers.d(t10, jD - j10, this.f302546b));
        }
    }

    public w3(io.reactivex.g0<T> g0Var, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(g0Var);
        this.f302543b = j0Var;
        this.f302544c = timeUnit;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.schedulers.d<T>> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302544c, this.f302543b));
    }
}
