package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class r0<T> extends io.reactivex.internal.operators.maybe.a<T, Boolean> {

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super Boolean> f300943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300944b;

        a(io.reactivex.v<? super Boolean> vVar) {
            this.f300943a = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300943a.b(Boolean.FALSE);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300944b, cVar)) {
                this.f300944b = cVar;
                this.f300943a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300944b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300944b.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300943a.b(Boolean.TRUE);
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300943a.onError(th2);
        }
    }

    public r0(io.reactivex.y<T> yVar) {
        super(yVar);
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super Boolean> vVar) {
        this.f300667a.a(new a(vVar));
    }
}
