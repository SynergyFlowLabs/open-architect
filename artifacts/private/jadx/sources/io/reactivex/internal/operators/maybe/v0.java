package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class v0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends R> f300997b;

    static final class a<T, R> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f300998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends R> f300999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301000c;

        a(io.reactivex.v<? super R> vVar, dj.o<? super T, ? extends R> oVar) {
            this.f300998a = vVar;
            this.f300999b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                this.f300998a.b(io.reactivex.internal.functions.b.g(this.f300999b.apply(t10), "The mapper returned a null item"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300998a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301000c, cVar)) {
                this.f301000c = cVar;
                this.f300998a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.disposables.c cVar = this.f301000c;
            this.f301000c = io.reactivex.internal.disposables.d.DISPOSED;
            cVar.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301000c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300998a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300998a.onError(th2);
        }
    }

    public v0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends R> oVar) {
        super(yVar);
        this.f300997b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f300667a.a(new a(vVar, this.f300997b));
    }
}
