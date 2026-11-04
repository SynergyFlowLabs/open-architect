package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class e2<T> extends io.reactivex.internal.operators.flowable.a<T, io.reactivex.a0<T>> {

    static final class a<T> extends io.reactivex.internal.subscribers.t<T, io.reactivex.a0<T>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299303h = -3740826063558713822L;

        a(org.reactivestreams.v<? super io.reactivex.a0<T>> vVar) {
            super(vVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.reactivex.internal.subscribers.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(io.reactivex.a0<T> a0Var) {
            if (a0Var.g()) {
                io.reactivex.plugins.a.Y(a0Var.d());
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            a(io.reactivex.a0.a());
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            a(io.reactivex.a0.b(th2));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f303423d++;
            this.f303420a.onNext(io.reactivex.a0.c(t10));
        }
    }

    public e2(io.reactivex.l<T> lVar) {
        super(lVar);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super io.reactivex.a0<T>> vVar) {
        this.f299043b.j6(new a(vVar));
    }
}
