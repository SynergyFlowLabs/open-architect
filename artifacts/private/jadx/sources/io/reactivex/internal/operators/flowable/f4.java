package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f4<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<? extends U> f299380c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299381f = -4945480365982832967L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLong f299383b = new AtomicLong();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299384c = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final a<T>.C2134a f299386e = new C2134a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f299385d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.f4$a$a, reason: collision with other inner class name */
        final class C2134a extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299387b = -3592821756711087922L;

            C2134a() {
            }

            @Override // io.reactivex.q, org.reactivestreams.v
            public void l(org.reactivestreams.w wVar) {
                io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.v
            public void onComplete() {
                io.reactivex.internal.subscriptions.j.b(a.this.f299384c);
                a aVar = a.this;
                io.reactivex.internal.util.l.b(aVar.f299382a, aVar, aVar.f299385d);
            }

            @Override // org.reactivestreams.v
            public void onError(Throwable th2) {
                io.reactivex.internal.subscriptions.j.b(a.this.f299384c);
                a aVar = a.this;
                io.reactivex.internal.util.l.d(aVar.f299382a, th2, aVar, aVar.f299385d);
            }

            @Override // org.reactivestreams.v
            public void onNext(Object obj) {
                io.reactivex.internal.subscriptions.j.b(this);
                onComplete();
            }
        }

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299382a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299384c);
            io.reactivex.internal.subscriptions.j.b(this.f299386e);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f299384c, this.f299383b, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.internal.subscriptions.j.b(this.f299386e);
            io.reactivex.internal.util.l.b(this.f299382a, this, this.f299385d);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f299386e);
            io.reactivex.internal.util.l.d(this.f299382a, th2, this, this.f299385d);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            io.reactivex.internal.util.l.f(this.f299382a, t10, this, this.f299385d);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f299384c, this.f299383b, j10);
        }
    }

    public f4(io.reactivex.l<T> lVar, org.reactivestreams.u<? extends U> uVar) {
        super(lVar);
        this.f299380c = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.l(aVar);
        this.f299380c.e(aVar.f299386e);
        this.f299043b.j6(aVar);
    }
}
