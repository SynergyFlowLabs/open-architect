package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class j0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f299557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f299558f;

    static final class a<T> implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f299561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f299562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f299563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.w f299564f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.j0$a$a, reason: collision with other inner class name */
        final class RunnableC2138a implements Runnable {
            RunnableC2138a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f299559a.onComplete();
                } finally {
                    a.this.f299562d.dispose();
                }
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f299566a;

            b(Throwable th2) {
                this.f299566a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f299559a.onError(this.f299566a);
                    io.reactivex.j0.c cVar = a.this.f299562d;
                } finally {
                    a.this.f299562d.dispose();
                }
            }
        }

        final class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f299568a;

            c(T t10) {
                this.f299568a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f299559a.onNext(this.f299568a);
            }
        }

        a(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar, boolean z10) {
            this.f299559a = vVar;
            this.f299560b = j10;
            this.f299561c = timeUnit;
            this.f299562d = cVar;
            this.f299563e = z10;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299564f.cancel();
            this.f299562d.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299564f, wVar)) {
                this.f299564f = wVar;
                this.f299559a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299562d.c(new RunnableC2138a(), this.f299560b, this.f299561c);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299562d.c(new b(th2), this.f299563e ? this.f299560b : 0L, this.f299561c);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299562d.c(new c(t10), this.f299560b, this.f299561c);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299564f.request(j10);
        }
    }

    public j0(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        super(lVar);
        this.f299555c = j10;
        this.f299556d = timeUnit;
        this.f299557e = j0Var;
        this.f299558f = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(this.f299558f ? vVar : new io.reactivex.subscribers.e(vVar), this.f299555c, this.f299556d, this.f299557e.c(), this.f299558f));
    }
}
