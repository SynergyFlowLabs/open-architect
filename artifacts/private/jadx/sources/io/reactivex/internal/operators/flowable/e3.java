package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<? super Integer, ? super Throwable> f299304c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299305g = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.subscriptions.i f299307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.u<? extends T> f299308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.d<? super Integer, ? super Throwable> f299309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f299310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f299311f;

        a(org.reactivestreams.v<? super T> vVar, dj.d<? super Integer, ? super Throwable> dVar, io.reactivex.internal.subscriptions.i iVar, org.reactivestreams.u<? extends T> uVar) {
            this.f299306a = vVar;
            this.f299307b = iVar;
            this.f299308c = uVar;
            this.f299309d = dVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f299307b.e()) {
                    long j10 = this.f299311f;
                    if (j10 != 0) {
                        this.f299311f = 0L;
                        this.f299307b.g(j10);
                    }
                    this.f299308c.e(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f299307b.h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299306a.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            try {
                dj.d<? super Integer, ? super Throwable> dVar = this.f299309d;
                int i10 = this.f299310e + 1;
                this.f299310e = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    this.f299306a.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f299306a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299311f++;
            this.f299306a.onNext(t10);
        }
    }

    public e3(io.reactivex.l<T> lVar, dj.d<? super Integer, ? super Throwable> dVar) {
        super(lVar);
        this.f299304c = dVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.subscriptions.i iVar = new io.reactivex.internal.subscriptions.i(false);
        vVar.l(iVar);
        new a(vVar, this.f299304c, iVar, this.f299043b).a();
    }
}
