package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class y<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f301021b;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f301022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f301023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301024c;

        a(io.reactivex.v<? super T> vVar, dj.r<? super T> rVar) {
            this.f301022a = vVar;
            this.f301023b = rVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                if (this.f301023b.test(t10)) {
                    this.f301022a.b(t10);
                } else {
                    this.f301022a.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301022a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301024c, cVar)) {
                this.f301024c = cVar;
                this.f301022a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.disposables.c cVar = this.f301024c;
            this.f301024c = io.reactivex.internal.disposables.d.DISPOSED;
            cVar.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301024c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f301022a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f301022a.onError(th2);
        }
    }

    public y(io.reactivex.y<T> yVar, dj.r<? super T> rVar) {
        super(yVar);
        this.f301021b = rVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f301021b));
    }
}
