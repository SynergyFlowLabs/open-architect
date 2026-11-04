package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.i f299044c;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.q<T>, io.reactivex.f, org.reactivestreams.w {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f299045e = -7346385463600070225L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.reactivestreams.w f299047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.i f299048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f299049d;

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.i iVar) {
            this.f299046a = vVar;
            this.f299048c = iVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f299047b.cancel();
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299047b, wVar)) {
                this.f299047b = wVar;
                this.f299046a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299049d) {
                this.f299046a.onComplete();
                return;
            }
            this.f299049d = true;
            this.f299047b = io.reactivex.internal.subscriptions.j.CANCELLED;
            io.reactivex.i iVar = this.f299048c;
            this.f299048c = null;
            iVar.b(this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299046a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299046a.onNext(t10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f299047b.request(j10);
        }
    }

    public a0(io.reactivex.l<T> lVar, io.reactivex.i iVar) {
        super(lVar);
        this.f299044c = iVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299044c));
    }
}
