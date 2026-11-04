package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class k2<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.c<T, T, T> f301865b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f301866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<T, T, T> f301867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f301868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        T f301869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f301870e;

        a(io.reactivex.v<? super T> vVar, dj.c<T, T, T> cVar) {
            this.f301866a = vVar;
            this.f301867b = cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301870e, cVar)) {
                this.f301870e = cVar;
                this.f301866a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301870e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301870e.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301868c) {
                return;
            }
            this.f301868c = true;
            T t10 = this.f301869d;
            this.f301869d = null;
            if (t10 != null) {
                this.f301866a.b(t10);
            } else {
                this.f301866a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301868c) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f301868c = true;
            this.f301869d = null;
            this.f301866a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (!this.f301868c) {
                T t11 = this.f301869d;
                if (t11 == null) {
                    this.f301869d = t10;
                    return;
                }
                try {
                    this.f301869d = (T) io.reactivex.internal.functions.b.g(this.f301867b.apply(t11, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f301870e.dispose();
                    onError(th2);
                }
            }
        }
    }

    public k2(io.reactivex.g0<T> g0Var, dj.c<T, T, T> cVar) {
        this.f301864a = g0Var;
        this.f301865b = cVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f301864a.a(new a(vVar, this.f301865b));
    }
}
