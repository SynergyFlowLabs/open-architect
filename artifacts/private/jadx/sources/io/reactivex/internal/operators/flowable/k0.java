package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class k0<T, U> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<? extends T> f299626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<U> f299627c;

    static final class a<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299628e = 2259811067697317255L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.u<? extends T> f299630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T>.C2139a f299631c = new C2139a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299632d = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.k0$a$a, reason: collision with other inner class name */
        final class C2139a extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299633b = -3892798459447644106L;

            C2139a() {
            }

            @Override // io.reactivex.q, org.reactivestreams.v
            public void l(org.reactivestreams.w wVar) {
                if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
                    wVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.v
            public void onComplete() {
                if (get() != io.reactivex.internal.subscriptions.j.CANCELLED) {
                    a.this.a();
                }
            }

            @Override // org.reactivestreams.v
            public void onError(Throwable th2) {
                if (get() != io.reactivex.internal.subscriptions.j.CANCELLED) {
                    a.this.f299629a.onError(th2);
                } else {
                    io.reactivex.plugins.a.Y(th2);
                }
            }

            @Override // org.reactivestreams.v
            public void onNext(Object obj) {
                org.reactivestreams.w wVar = get();
                io.reactivex.internal.subscriptions.j jVar = io.reactivex.internal.subscriptions.j.CANCELLED;
                if (wVar != jVar) {
                    lazySet(jVar);
                    wVar.cancel();
                    a.this.a();
                }
            }
        }

        a(org.reactivestreams.v<? super T> vVar, org.reactivestreams.u<? extends T> uVar) {
            this.f299629a = vVar;
            this.f299630b = uVar;
        }

        void a() {
            this.f299630b.e(this);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299631c);
            io.reactivex.internal.subscriptions.j.b(this.f299632d);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f299632d, this, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299629a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299629a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299629a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.subscriptions.j.c(this.f299632d, this, j10);
            }
        }
    }

    public k0(org.reactivestreams.u<? extends T> uVar, org.reactivestreams.u<U> uVar2) {
        this.f299626b = uVar;
        this.f299627c = uVar2;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar, this.f299626b);
        vVar.l(aVar);
        this.f299627c.e(aVar.f299631c);
    }
}
