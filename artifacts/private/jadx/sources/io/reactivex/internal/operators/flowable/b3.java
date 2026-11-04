package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class b3<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.e f299124c;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299125f = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.subscriptions.i f299127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final org.reactivestreams.u<? extends T> f299128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.e f299129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f299130e;

        a(org.reactivestreams.v<? super T> vVar, dj.e eVar, io.reactivex.internal.subscriptions.i iVar, org.reactivestreams.u<? extends T> uVar) {
            this.f299126a = vVar;
            this.f299127b = iVar;
            this.f299128c = uVar;
            this.f299129d = eVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f299127b.e()) {
                    long j10 = this.f299130e;
                    if (j10 != 0) {
                        this.f299130e = 0L;
                        this.f299127b.g(j10);
                    }
                    this.f299128c.e(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            this.f299127b.h(wVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            try {
                if (this.f299129d.a()) {
                    this.f299126a.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f299126a.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299126a.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299130e++;
            this.f299126a.onNext(t10);
        }
    }

    public b3(io.reactivex.l<T> lVar, dj.e eVar) {
        super(lVar);
        this.f299124c = eVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.internal.subscriptions.i iVar = new io.reactivex.internal.subscriptions.i(false);
        vVar.l(iVar);
        new a(vVar, this.f299124c, iVar, this.f299043b).a();
    }
}
