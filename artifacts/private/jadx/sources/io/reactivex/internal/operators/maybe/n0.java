package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class n0<T> extends io.reactivex.s<T> implements ej.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f300905a;

    static final class a<T> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300907b;

        a(io.reactivex.v<? super T> vVar) {
            this.f300906a = vVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f300907b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300906a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300907b, cVar)) {
                this.f300907b = cVar;
                this.f300906a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300907b.dispose();
            this.f300907b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300907b.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f300907b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300906a.onError(th2);
        }
    }

    public n0(io.reactivex.q0<T> q0Var) {
        this.f300905a = q0Var;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300905a.f(new a(vVar));
    }

    @Override // ej.i
    public io.reactivex.q0<T> source() {
        return this.f300905a;
    }
}
