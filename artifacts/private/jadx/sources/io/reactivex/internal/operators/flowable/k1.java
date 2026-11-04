package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class k1<T> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.reactivex.b0<T> f299635b;

    static final class a<T> implements io.reactivex.i0<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f299637b;

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299636a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299637b.dispose();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f299637b = cVar;
            this.f299636a.l(this);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f299636a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f299636a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f299636a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
        }
    }

    public k1(io.reactivex.b0<T> b0Var) {
        this.f299635b = b0Var;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299635b.a(new a(vVar));
    }
}
