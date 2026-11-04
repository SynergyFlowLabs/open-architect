package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class z<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f301026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super T> f301027b;

    static final class a<T> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f301028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.r<? super T> f301029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301030c;

        a(io.reactivex.v<? super T> vVar, dj.r<? super T> rVar) {
            this.f301028a = vVar;
            this.f301029b = rVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                if (this.f301029b.test(t10)) {
                    this.f301028a.b(t10);
                } else {
                    this.f301028a.onComplete();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301028a.onError(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301030c, cVar)) {
                this.f301030c = cVar;
                this.f301028a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.disposables.c cVar = this.f301030c;
            this.f301030c = io.reactivex.internal.disposables.d.DISPOSED;
            cVar.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301030c.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f301028a.onError(th2);
        }
    }

    public z(io.reactivex.q0<T> q0Var, dj.r<? super T> rVar) {
        this.f301026a = q0Var;
        this.f301027b = rVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f301026a.f(new a(vVar, this.f301027b));
    }
}
