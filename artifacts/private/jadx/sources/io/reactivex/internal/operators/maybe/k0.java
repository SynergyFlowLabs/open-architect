package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class k0<T> extends io.reactivex.s<T> implements ej.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f300855a;

    static final class a<T> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300857b;

        a(io.reactivex.v<? super T> vVar) {
            this.f300856a = vVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300857b, cVar)) {
                this.f300857b = cVar;
                this.f300856a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300857b.dispose();
            this.f300857b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300857b.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f300857b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300856a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f300857b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300856a.onError(th2);
        }
    }

    public k0(io.reactivex.i iVar) {
        this.f300855a = iVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300855a.b(new a(vVar));
    }

    @Override // ej.e
    public io.reactivex.i source() {
        return this.f300855a;
    }
}
