package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class a3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f299069c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299070f = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.subscriptions.i f299072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.u<? extends T> f299073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f299074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f299075e;

        a(org.reactivestreams.v<? super T> vVar, long j10, io.reactivex.internal.subscriptions.i iVar, org.reactivestreams.u<? extends T> uVar) {
            this.f299071a = vVar;
            this.f299072b = iVar;
            this.f299073c = uVar;
            this.f299074d = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f299072b.e()) {
                    long j10 = this.f299075e;
                    if (j10 != 0) {
                        this.f299075e = 0L;
                        this.f299072b.g(j10);
                    }
                    this.f299073c.e(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f299072b.h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            long j10 = this.f299074d;
            if (j10 != Long.MAX_VALUE) {
                this.f299074d = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f299071a.onComplete();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299071a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299075e++;
            this.f299071a.onNext(t10);
        }
    }

    public a3(io.reactivex.l<T> lVar, long j10) {
        super(lVar);
        this.f299069c = j10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.subscriptions.i iVar = new io.reactivex.internal.subscriptions.i(false);
        vVar.l(iVar);
        long j10 = this.f299069c;
        new a(vVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, iVar, this.f299043b).a();
    }
}
