package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class s<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.b<? super T, ? super Throwable> f300950b;

    static final class a<T> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.b<? super T, ? super Throwable> f300952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300953c;

        a(io.reactivex.v<? super T> vVar, dj.b<? super T, ? super Throwable> bVar) {
            this.f300951a = vVar;
            this.f300952b = bVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300953c = io.reactivex.internal.disposables.d.DISPOSED;
            try {
                this.f300952b.accept(t10, null);
                this.f300951a.b(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300951a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300953c, cVar)) {
                this.f300953c = cVar;
                this.f300951a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300953c.dispose();
            this.f300953c = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300953c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300953c = io.reactivex.internal.disposables.d.DISPOSED;
            try {
                this.f300952b.accept(null, null);
                this.f300951a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300951a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300953c = io.reactivex.internal.disposables.d.DISPOSED;
            try {
                this.f300952b.accept(null, th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f300951a.onError(th2);
        }
    }

    public s(io.reactivex.y<T> yVar, dj.b<? super T, ? super Throwable> bVar) {
        super(yVar);
        this.f300950b = bVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300950b));
    }
}
