package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class n1<T> extends io.reactivex.b0<T> implements ej.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300908a;

    static final class a<T> extends io.reactivex.internal.observers.l<T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f300909k = 7603343402964826922L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        io.reactivex.disposables.c f300910j;

        a(io.reactivex.i0<? super T> i0Var) {
            super(i0Var);
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            c(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300910j, cVar)) {
                this.f300910j = cVar;
                this.f298769b.d(this);
            }
        }

        @Override // io.reactivex.internal.observers.l, io.reactivex.disposables.c
        public void dispose() {
            super.dispose();
            this.f300910j.dispose();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            e(th2);
        }
    }

    public n1(io.reactivex.y<T> yVar) {
        this.f300908a = yVar;
    }

    public static <T> io.reactivex.v<T> h8(io.reactivex.i0<? super T> i0Var) {
        return new a(i0Var);
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f300908a.a(h8(i0Var));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300908a;
    }
}
