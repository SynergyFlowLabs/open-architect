package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g0<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<U>> f299395c;

    static final class a<T, U> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299396g = 6725975399620862591L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<U>> f299398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f299399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f299400d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f299401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f299402f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.g0$a$a, reason: collision with other inner class name */
        static final class C2135a<T, U> extends io.reactivex.subscribers.b<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<T, U> f299403b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final long f299404c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final T f299405d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f299406e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final AtomicBoolean f299407f = new AtomicBoolean();

            C2135a(a<T, U> aVar, long j10, T t10) {
                this.f299403b = aVar;
                this.f299404c = j10;
                this.f299405d = t10;
            }

            void e() {
                if (this.f299407f.compareAndSet(false, true)) {
                    this.f299403b.a(this.f299404c, this.f299405d);
                }
            }

            @Override // org.reactivestreams.v
            public void onComplete() {
                if (this.f299406e) {
                    return;
                }
                this.f299406e = true;
                e();
            }

            @Override // org.reactivestreams.v
            public void onError(Throwable th2) {
                if (this.f299406e) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f299406e = true;
                    this.f299403b.onError(th2);
                }
            }

            @Override // org.reactivestreams.v
            public void onNext(U u10) {
                if (this.f299406e) {
                    return;
                }
                this.f299406e = true;
                b();
                e();
            }
        }

        a(org.reactivestreams.v<? super T> vVar, dj.o<? super T, ? extends org.reactivestreams.u<U>> oVar) {
            this.f299397a = vVar;
            this.f299398b = oVar;
        }

        void a(long j10, T t10) {
            if (j10 == this.f299401e) {
                if (get() != 0) {
                    this.f299397a.onNext(t10);
                    io.reactivex.internal.util.d.e(this, 1L);
                } else {
                    cancel();
                    this.f299397a.onError(new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299399c.cancel();
            io.reactivex.internal.disposables.d.b(this.f299400d);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299399c, wVar)) {
                this.f299399c = wVar;
                this.f299397a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (!this.f299402f) {
                this.f299402f = true;
                io.reactivex.disposables.c cVar = this.f299400d.get();
                if (!io.reactivex.internal.disposables.d.c(cVar)) {
                    ((C2135a) cVar).e();
                    io.reactivex.internal.disposables.d.b(this.f299400d);
                    this.f299397a.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f299400d);
            this.f299397a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (!this.f299402f) {
                long j10 = this.f299401e + 1;
                this.f299401e = j10;
                io.reactivex.disposables.c cVar = this.f299400d.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                try {
                    org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299398b.apply(t10), "The publisher supplied is null");
                    C2135a c2135a = new C2135a(this, j10, t10);
                    if (androidx.compose.animation.core.z1.a(this.f299400d, cVar, c2135a)) {
                        uVar.e(c2135a);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    cancel();
                    this.f299397a.onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }
    }

    public g0(io.reactivex.l<T> lVar, dj.o<? super T, ? extends org.reactivestreams.u<U>> oVar) {
        super(lVar);
        this.f299395c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(new io.reactivex.subscribers.e(vVar), this.f299395c));
    }
}
