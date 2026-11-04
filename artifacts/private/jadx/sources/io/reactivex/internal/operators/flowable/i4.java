package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class i4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f299539e;

    static final class a<T> extends AtomicLong implements io.reactivex.q<T>, org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299540i = -9102637559663639004L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f299543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f299544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        org.reactivestreams.w f299545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f299546f = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f299547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f299548h;

        a(org.reactivestreams.v<? super T> vVar, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            this.f299541a = vVar;
            this.f299542b = j10;
            this.f299543c = timeUnit;
            this.f299544d = cVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299545e.cancel();
            this.f299544d.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299545e, wVar)) {
                this.f299545e = wVar;
                this.f299541a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299548h) {
                return;
            }
            this.f299548h = true;
            this.f299541a.onComplete();
            this.f299544d.dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299548h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299548h = true;
            this.f299541a.onError(th2);
            this.f299544d.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299548h || this.f299547g) {
                return;
            }
            this.f299547g = true;
            if (get() == 0) {
                this.f299548h = true;
                cancel();
                this.f299541a.onError(new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
            } else {
                this.f299541a.onNext(t10);
                io.reactivex.internal.util.d.e(this, 1L);
                io.reactivex.disposables.c cVar = this.f299546f.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                this.f299546f.a(this.f299544d.c(this, this.f299542b, this.f299543c));
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f299547g = false;
        }
    }

    public i4(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(lVar);
        this.f299537c = j10;
        this.f299538d = timeUnit;
        this.f299539e = j0Var;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(new io.reactivex.subscribers.e(vVar), this.f299537c, this.f299538d, this.f299539e.c()));
    }
}
