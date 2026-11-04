package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v3<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<U> f300393c;

    static final class a<T> extends AtomicInteger implements ej.a<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300394g = -6270983465606289181L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300396b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicLong f300397c = new AtomicLong();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T>.C2142a f300398d = new C2142a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f300399e = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f300400f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.v3$a$a, reason: collision with other inner class name */
        final class C2142a extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f300401b = -5592042965931999169L;

            C2142a() {
            }

            @Override // io.reactivex.q, org.reactivestreams.v
            public void l(org.reactivestreams.w wVar) {
                io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.v
            public void onComplete() {
                a.this.f300400f = true;
            }

            @Override // org.reactivestreams.v
            public void onError(Throwable th2) {
                io.reactivex.internal.subscriptions.j.b(a.this.f300396b);
                a aVar = a.this;
                io.reactivex.internal.util.l.d(aVar.f300395a, th2, aVar, aVar.f300399e);
            }

            @Override // org.reactivestreams.v
            public void onNext(Object obj) {
                a.this.f300400f = true;
                get().cancel();
            }
        }

        a(org.reactivestreams.v<? super T> vVar) {
            this.f300395a = vVar;
        }

        @Override // ej.a
        public boolean L(T t10) {
            if (!this.f300400f) {
                return false;
            }
            io.reactivex.internal.util.l.f(this.f300395a, t10, this, this.f300399e);
            return true;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f300396b);
            io.reactivex.internal.subscriptions.j.b(this.f300398d);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f300396b, this.f300397c, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            io.reactivex.internal.subscriptions.j.b(this.f300398d);
            io.reactivex.internal.util.l.b(this.f300395a, this, this.f300399e);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f300398d);
            io.reactivex.internal.util.l.d(this.f300395a, th2, this, this.f300399e);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!L(t10)) {
                this.f300396b.get().request(1L);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f300396b, this.f300397c, j10);
        }
    }

    public v3(io.reactivex.l<T> lVar, org.reactivestreams.u<U> uVar) {
        super(lVar);
        this.f300393c = uVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.l(aVar);
        this.f300393c.e(aVar.f300398d);
        this.f299043b.j6(aVar);
    }
}
