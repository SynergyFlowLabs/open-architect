package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class q<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f300931b;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super T> f300933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300934c;

        a(io.reactivex.v<? super T> vVar, dj.g<? super T> gVar) {
            this.f300932a = vVar;
            this.f300933b = gVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300932a.b(t10);
            try {
                this.f300933b.accept(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300934c, cVar)) {
                this.f300934c = cVar;
                this.f300932a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300934c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300934c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300932a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300932a.onError(th2);
        }
    }

    public q(io.reactivex.y<T> yVar, dj.g<? super T> gVar) {
        super(yVar);
        this.f300931b = gVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300931b));
    }
}
