package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class n0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f302004b;

    static final class a<T> extends io.reactivex.internal.observers.b<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302005g = 4109457741734051389L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.a f302007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ej.j<T> f302009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f302010f;

        a(io.reactivex.i0<? super T> i0Var, dj.a aVar) {
            this.f302006b = i0Var;
            this.f302007c = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f302007c.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // ej.o
        public void clear() {
            this.f302009e.clear();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302008d, cVar)) {
                this.f302008d = cVar;
                if (cVar instanceof ej.j) {
                    this.f302009e = (ej.j) cVar;
                }
                this.f302006b.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302008d.dispose();
            a();
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f302009e.isEmpty();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302008d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302006b.onComplete();
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302006b.onError(th2);
            a();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302006b.onNext(t10);
        }

        @Override // ej.k
        public int p(int i10) {
            ej.j<T> jVar = this.f302009e;
            if (jVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iP = jVar.p(i10);
            if (iP != 0) {
                this.f302010f = iP == 1;
            }
            return iP;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f302009e.poll();
            if (tPoll == null && this.f302010f) {
                a();
            }
            return tPoll;
        }
    }

    public n0(io.reactivex.g0<T> g0Var, dj.a aVar) {
        super(g0Var);
        this.f302004b = aVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302004b));
    }
}
