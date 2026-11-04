package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class f3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.r<? super Throwable> f299371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f299372d;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299373g = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.subscriptions.i f299375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.u<? extends T> f299376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.r<? super Throwable> f299377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f299378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f299379f;

        a(org.reactivestreams.v<? super T> vVar, long j10, dj.r<? super Throwable> rVar, io.reactivex.internal.subscriptions.i iVar, org.reactivestreams.u<? extends T> uVar) {
            this.f299374a = vVar;
            this.f299375b = iVar;
            this.f299376c = uVar;
            this.f299377d = rVar;
            this.f299378e = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f299375b.e()) {
                    long j10 = this.f299379f;
                    if (j10 != 0) {
                        this.f299379f = 0L;
                        this.f299375b.g(j10);
                    }
                    this.f299376c.e(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f299375b.h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299374a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            long j10 = this.f299378e;
            if (j10 != Long.MAX_VALUE) {
                this.f299378e = j10 - 1;
            }
            if (j10 == 0) {
                this.f299374a.onError(th2);
                return;
            }
            try {
                if (this.f299377d.test(th2)) {
                    a();
                } else {
                    this.f299374a.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f299374a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299379f++;
            this.f299374a.onNext(t10);
        }
    }

    public f3(io.reactivex.l<T> lVar, long j10, dj.r<? super Throwable> rVar) {
        super(lVar);
        this.f299371c = rVar;
        this.f299372d = j10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.subscriptions.i iVar = new io.reactivex.internal.subscriptions.i(false);
        vVar.l(iVar);
        new a(vVar, this.f299372d, this.f299371c, iVar, this.f299043b).a();
    }
}
