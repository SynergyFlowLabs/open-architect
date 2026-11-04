package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class f3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301558b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f301560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301561c;

        a(io.reactivex.i0<? super T> i0Var, long j10) {
            this.f301559a = i0Var;
            this.f301560b = j10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301561c, cVar)) {
                this.f301561c = cVar;
                this.f301559a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301561c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301561c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301559a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301559a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long j10 = this.f301560b;
            if (j10 != 0) {
                this.f301560b = j10 - 1;
            } else {
                this.f301559a.onNext(t10);
            }
        }
    }

    public f3(io.reactivex.g0<T> g0Var, long j10) {
        super(g0Var);
        this.f301558b = j10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301558b));
    }
}
