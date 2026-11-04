package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class s0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj.g<? super org.reactivestreams.w> f300107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dj.q f300108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dj.a f300109e;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super org.reactivestreams.w> f300111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.q f300112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.a f300113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f300114e;

        a(org.reactivestreams.v<? super T> vVar, dj.g<? super org.reactivestreams.w> gVar, dj.q qVar, dj.a aVar) {
            this.f300110a = vVar;
            this.f300111b = gVar;
            this.f300113d = aVar;
            this.f300112c = qVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            org.reactivestreams.w wVar = this.f300114e;
            io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
            if (wVar != jVar) {
                this.f300114e = jVar;
                try {
                    this.f300113d.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
                wVar.cancel();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            try {
                this.f300111b.accept(wVar);
                if (io.reactivex.internal.subscriptions.j.q(this.f300114e, wVar)) {
                    this.f300114e = wVar;
                    this.f300110a.l(this);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                wVar.cancel();
                this.f300114e = io.reactivex.internal.subscriptions.j.CANCELLED;
                io.reactivex.internal.subscriptions.g.c(th2, this.f300110a);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300114e != io.reactivex.internal.subscriptions.j.CANCELLED) {
                this.f300110a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300114e != io.reactivex.internal.subscriptions.j.CANCELLED) {
                this.f300110a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300110a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            try {
                this.f300112c.accept(j10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
            this.f300114e.request(j10);
        }
    }

    public s0(io.reactivex.l<T> lVar, dj.g<? super org.reactivestreams.w> gVar, dj.q qVar, dj.a aVar) {
        super(lVar);
        this.f300107c = gVar;
        this.f300108d = qVar;
        this.f300109e = aVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300107c, this.f300108d, this.f300109e));
    }
}
