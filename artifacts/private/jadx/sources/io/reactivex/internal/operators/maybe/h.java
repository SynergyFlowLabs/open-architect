package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T> extends io.reactivex.k0<Boolean> implements ej.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f300813b;

    static final class a implements io.reactivex.v<Object>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f300814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f300815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300816c;

        a(io.reactivex.n0<? super Boolean> n0Var, Object obj) {
            this.f300814a = n0Var;
            this.f300815b = obj;
        }

        @Override // io.reactivex.v
        public void b(Object obj) {
            this.f300816c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300814a.b(Boolean.valueOf(io.reactivex.internal.functions.b.c(obj, this.f300815b)));
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300816c, cVar)) {
                this.f300816c = cVar;
                this.f300814a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300816c.dispose();
            this.f300816c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300816c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300816c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300814a.b(Boolean.FALSE);
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300816c = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300814a.onError(th2);
        }
    }

    public h(io.reactivex.y<T> yVar, Object obj) {
        this.f300812a = yVar;
        this.f300813b = obj;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        this.f300812a.a(new a(n0Var, this.f300813b));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300812a;
    }
}
