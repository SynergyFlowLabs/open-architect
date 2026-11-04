package io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n4 extends io.reactivex.l<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f299898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f299900d;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements org.reactivestreams.w, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f299901c = -2809475196591179431L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super Long> f299902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f299903b;

        a(org.reactivestreams.v<? super Long> vVar) {
            this.f299902a = vVar;
        }

        public void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.p(this, cVar);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                this.f299903b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != io.reactivex.internal.disposables.d.DISPOSED) {
                if (!this.f299903b) {
                    lazySet(io.reactivex.internal.disposables.e.INSTANCE);
                    this.f299902a.onError(new io.reactivex.exceptions.c("Can't deliver value due to lack of requests"));
                } else {
                    this.f299902a.onNext(0L);
                    lazySet(io.reactivex.internal.disposables.e.INSTANCE);
                    this.f299902a.onComplete();
                }
            }
        }
    }

    public n4(long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f299899c = j10;
        this.f299900d = timeUnit;
        this.f299898b = j0Var;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super Long> vVar) {
        a aVar = new a(vVar);
        vVar.l(aVar);
        aVar.a(this.f299898b.f(aVar, this.f299899c, this.f299900d));
    }
}
