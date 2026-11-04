package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class g3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super io.reactivex.l<Throwable>, ? extends org.reactivestreams.u<?>> f299437c;

    static final class a<T> extends c3.c<T, Throwable> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299438o = -2680129890138081029L;

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.processors.c<Throwable> cVar, org.reactivestreams.w wVar) {
            super(vVar, cVar, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299182l.cancel();
            this.f299180j.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            i(th2);
        }
    }

    public g3(io.reactivex.l<T> lVar, dj.o<? super io.reactivex.l<Throwable>, ? extends org.reactivestreams.u<?>> oVar) {
        super(lVar);
        this.f299437c = oVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.subscribers.e eVar = new io.reactivex.subscribers.e(vVar);
        io.reactivex.processors.c<T> cVarQ8 = io.reactivex.processors.h.T8(8).Q8();
        try {
            org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299437c.apply(cVarQ8), "handler returned a null Publisher");
            c3.b bVar = new c3.b(this.f299043b);
            a aVar = new a(eVar, cVarQ8, bVar);
            bVar.f299178d = aVar;
            vVar.l(aVar);
            uVar.e(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
