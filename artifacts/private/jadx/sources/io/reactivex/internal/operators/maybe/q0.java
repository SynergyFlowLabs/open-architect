package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class q0<T> extends io.reactivex.c implements ej.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300935a;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f300936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f300937b;

        a(io.reactivex.f fVar) {
            this.f300936a = fVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300937b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300936a.onComplete();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300937b, cVar)) {
                this.f300937b = cVar;
                this.f300936a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300937b.dispose();
            this.f300937b = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300937b.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300937b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300936a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300937b = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300936a.onError(th2);
        }
    }

    public q0(io.reactivex.y<T> yVar) {
        this.f300935a = yVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f300935a.a(new a(fVar));
    }

    @Override // ej.c
    public io.reactivex.s<T> a() {
        return io.reactivex.plugins.a.Q(new p0(this.f300935a));
    }
}
