package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.i f299360c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299361h = -4592979584110982903L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f299363b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final C2133a f299364c = new C2133a(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f299365d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f299366e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f299367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f299368g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.f2$a$a, reason: collision with other inner class name */
        static final class C2133a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f299369b = -2935427570954647017L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?> f299370a;

            C2133a(a<?> aVar) {
                this.f299370a = aVar;
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                this.f299370a.a();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f299370a.b(th2);
            }
        }

        a(org.reactivestreams.v<? super T> vVar) {
            this.f299362a = vVar;
        }

        void a() {
            this.f299368g = true;
            if (this.f299367f) {
                io.reactivex.internal.util.l.b(this.f299362a, this, this.f299365d);
            }
        }

        void b(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f299363b);
            io.reactivex.internal.util.l.d(this.f299362a, th2, this, this.f299365d);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.subscriptions.j.b(this.f299363b);
            io.reactivex.internal.disposables.d.b(this.f299364c);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.d(this.f299363b, this.f299366e, wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299367f = true;
            if (this.f299368g) {
                io.reactivex.internal.util.l.b(this.f299362a, this, this.f299365d);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f299363b);
            io.reactivex.internal.util.l.d(this.f299362a, th2, this, this.f299365d);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            io.reactivex.internal.util.l.f(this.f299362a, t10, this, this.f299365d);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.subscriptions.j.c(this.f299363b, this.f299366e, j10);
        }
    }

    public f2(io.reactivex.l<T> lVar, io.reactivex.i iVar) {
        super(lVar);
        this.f299360c = iVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        a aVar = new a(vVar);
        vVar.l(aVar);
        this.f299043b.j6(aVar);
        this.f299360c.b(aVar.f299364c);
    }
}
