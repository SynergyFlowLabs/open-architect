package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class p<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.reactivex.v<? super T> f300922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300923b;

        a(io.reactivex.v<? super T> vVar) {
            this.f300922a = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300923b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.v<? super T> vVar = this.f300922a;
            if (vVar != null) {
                this.f300922a = null;
                vVar.b(t10);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300923b, cVar)) {
                this.f300923b = cVar;
                this.f300922a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300922a = null;
            this.f300923b.dispose();
            this.f300923b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300923b.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300923b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.v<? super T> vVar = this.f300922a;
            if (vVar != null) {
                this.f300922a = null;
                vVar.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300923b = io.reactivex.internal.disposables.d.DISPOSED;
            io.reactivex.v<? super T> vVar = this.f300922a;
            if (vVar != null) {
                this.f300922a = null;
                vVar.onError(th2);
            }
        }
    }

    public p(io.reactivex.y<T> yVar) {
        super(yVar);
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar));
    }
}
