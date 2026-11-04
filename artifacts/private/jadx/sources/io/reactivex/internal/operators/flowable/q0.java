package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class q0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.a f299997c;

    static final class a<T> extends io.reactivex.internal.subscriptions.c<T> implements ej.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299998g = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ej.a<? super T> f299999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.a f300000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ej.l<T> f300002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f300003f;

        a(ej.a<? super T> aVar, dj.a aVar2) {
            this.f299999b = aVar;
            this.f300000c = aVar2;
        }

        @Override // ej.a
        public boolean L(T t10) {
            return this.f299999b.L(t10);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300001d.cancel();
            f();
        }

        @Override // ej.o
        public void clear() {
            this.f300002e.clear();
        }

        void f() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f300000c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f300002e.isEmpty();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300001d, wVar)) {
                this.f300001d = wVar;
                if (wVar instanceof ej.l) {
                    this.f300002e = (ej.l) wVar;
                }
                this.f299999b.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299999b.onComplete();
            f();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299999b.onError(th2);
            f();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f299999b.onNext(t10);
        }

        @Override // ej.k
        public int p(int i10) {
            ej.l<T> lVar = this.f300002e;
            if (lVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iP = lVar.p(i10);
            if (iP != 0) {
                this.f300003f = iP == 1;
            }
            return iP;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f300002e.poll();
            if (tPoll == null && this.f300003f) {
                f();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300001d.request(j10);
        }
    }

    static final class b<T> extends io.reactivex.internal.subscriptions.c<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f300004g = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.a f300006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        org.reactivestreams.w f300007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ej.l<T> f300008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f300009f;

        b(org.reactivestreams.v<? super T> vVar, dj.a aVar) {
            this.f300005b = vVar;
            this.f300006c = aVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300007d.cancel();
            f();
        }

        @Override // ej.o
        public void clear() {
            this.f300008e.clear();
        }

        void f() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f300006c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f300008e.isEmpty();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300007d, wVar)) {
                this.f300007d = wVar;
                if (wVar instanceof ej.l) {
                    this.f300008e = (ej.l) wVar;
                }
                this.f300005b.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300005b.onComplete();
            f();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300005b.onError(th2);
            f();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300005b.onNext(t10);
        }

        @Override // ej.k
        public int p(int i10) {
            ej.l<T> lVar = this.f300008e;
            if (lVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iP = lVar.p(i10);
            if (iP != 0) {
                this.f300009f = iP == 1;
            }
            return iP;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f300008e.poll();
            if (tPoll == null && this.f300009f) {
                f();
            }
            return tPoll;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300007d.request(j10);
        }
    }

    public q0(io.reactivex.l<T> lVar, dj.a aVar) {
        super(lVar);
        this.f299997c = aVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new a((ej.a) vVar, this.f299997c));
        } else {
            this.f299043b.j6(new b(vVar, this.f299997c));
        }
    }
}
