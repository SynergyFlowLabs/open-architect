package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class q4<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f300020c;

    static final class a<T> extends AtomicBoolean implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300021d = 1015244841293359600L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0 f300023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300024c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.q4$a$a, reason: collision with other inner class name */
        final class RunnableC2141a implements Runnable {
            RunnableC2141a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f300024c.cancel();
            }
        }

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.j0 j0Var) {
            this.f300022a = vVar;
            this.f300023b = j0Var;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f300023b.e(new RunnableC2141a());
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300024c, wVar)) {
                this.f300024c = wVar;
                this.f300022a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f300022a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (get()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300022a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f300022a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300024c.request(j10);
        }
    }

    public q4(io.reactivex.l<T> lVar, io.reactivex.j0 j0Var) {
        super(lVar);
        this.f300020c = j0Var;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f300020c));
    }
}
