package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class w2<T> extends io.reactivex.s<T> implements ej.h<T>, ej.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f300454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.c<T, T, T> f300455b;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<T, T, T> f300457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f300458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f300460e;

        a(io.reactivex.v<? super T> vVar, dj.c<T, T, T> cVar) {
            this.f300456a = vVar;
            this.f300457b = cVar;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300459d.cancel();
            this.f300460e = true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300460e;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300459d, wVar)) {
                this.f300459d = wVar;
                this.f300456a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300460e) {
                return;
            }
            this.f300460e = true;
            T t10 = this.f300458c;
            if (t10 != null) {
                this.f300456a.b(t10);
            } else {
                this.f300456a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300460e) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300460e = true;
                this.f300456a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300460e) {
                return;
            }
            T t11 = this.f300458c;
            if (t11 == null) {
                this.f300458c = t10;
                return;
            }
            try {
                this.f300458c = (T) io.reactivex.internal.functions.b.g(this.f300457b.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300459d.cancel();
                onError(th2);
            }
        }
    }

    public w2(io.reactivex.l<T> lVar, dj.c<T, T, T> cVar) {
        this.f300454a = lVar;
        this.f300455b = cVar;
    }

    @Override // ej.b
    public io.reactivex.l<T> e() {
        return io.reactivex.plugins.a.P(new v2(this.f300454a, this.f300455b));
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300454a.j6(new a(vVar, this.f300455b));
    }

    @Override // ej.h
    public org.reactivestreams.u<T> source() {
        return this.f300454a;
    }
}
