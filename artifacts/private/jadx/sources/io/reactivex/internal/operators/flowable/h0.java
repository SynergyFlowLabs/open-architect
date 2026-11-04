package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f299457e;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299458e = 6812032969491025141L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f299459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T> f299461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f299462d = new AtomicBoolean();

        a(T t10, long j10, b<T> bVar) {
            this.f299459a = t10;
            this.f299460b = j10;
            this.f299461c = bVar;
        }

        void a() {
            if (this.f299462d.compareAndSet(false, true)) {
                this.f299461c.a(this.f299460b, this.f299459a, this);
            }
        }

        public void b(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static final class b<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299463i = -9102637559663639004L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f299466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f299467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f299468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f299469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f299470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f299471h;

        b(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            this.f299464a = vVar;
            this.f299465b = j10;
            this.f299466c = timeUnit;
            this.f299467d = cVar;
        }

        void a(long j10, T t10, a<T> aVar) {
            if (j10 == this.f299470g) {
                if (get() == 0) {
                    cancel();
                    this.f299464a.onError(new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
                } else {
                    this.f299464a.onNext(t10);
                    io.reactivex.internal.util.d.e(this, 1L);
                    aVar.dispose();
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299468e.cancel();
            this.f299467d.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299468e, wVar)) {
                this.f299468e = wVar;
                this.f299464a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299471h) {
                return;
            }
            this.f299471h = true;
            io.reactivex.disposables.c cVar = this.f299469f;
            if (cVar != null) {
                cVar.dispose();
            }
            a aVar = (a) cVar;
            if (aVar != null) {
                aVar.a();
            }
            this.f299464a.onComplete();
            this.f299467d.dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299471h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299471h = true;
            io.reactivex.disposables.c cVar = this.f299469f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f299464a.onError(th2);
            this.f299467d.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299471h) {
                return;
            }
            long j10 = this.f299470g + 1;
            this.f299470g = j10;
            io.reactivex.disposables.c cVar = this.f299469f;
            if (cVar != null) {
                cVar.dispose();
            }
            a aVar = new a(t10, j10, this);
            this.f299469f = aVar;
            aVar.b(this.f299467d.c(aVar, this.f299465b, this.f299466c));
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }
    }

    public h0(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(lVar);
        this.f299455c = j10;
        this.f299456d = timeUnit;
        this.f299457e = j0Var;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new b(new io.reactivex.subscribers.e(vVar), this.f299455c, this.f299456d, this.f299457e.c()));
    }
}
