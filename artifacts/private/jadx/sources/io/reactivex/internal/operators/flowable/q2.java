package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class q2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends T> f300012c;

    static final class a<T> extends io.reactivex.internal.subscribers.t<T, T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300013i = -3740826063558713822L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends T> f300014h;

        a(org.reactivestreams.v<? super T> vVar, dj.o<? super Throwable, ? extends T> oVar) {
            super(vVar);
            this.f300014h = oVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f303420a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            try {
                a(io.reactivex.internal.functions.b.g(this.f300014h.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f303420a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f303423d++;
            this.f303420a.onNext((Object) t10);
        }
    }

    public q2(io.reactivex.l<T> lVar, dj.o<? super Throwable, ? extends T> oVar) {
        super(lVar);
        this.f300012c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300012c));
    }
}
