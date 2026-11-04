package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class o0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f303019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends T> f303020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f303021c;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.n0<? super T> f303022a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f303022a = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f303022a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f303022a.d(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            T tApply;
            o0 o0Var = o0.this;
            dj.o<? super Throwable, ? extends T> oVar = o0Var.f303020b;
            if (oVar != null) {
                try {
                    tApply = oVar.apply(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.f303022a.onError(new io.reactivex.exceptions.a(th2, th3));
                    return;
                }
            } else {
                tApply = o0Var.f303021c;
            }
            if (tApply != null) {
                this.f303022a.b(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.f303022a.onError(nullPointerException);
        }
    }

    public o0(io.reactivex.q0<? extends T> q0Var, dj.o<? super Throwable, ? extends T> oVar, T t10) {
        this.f303019a = q0Var;
        this.f303020b = oVar;
        this.f303021c = t10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303019a.f(new a(n0Var));
    }
}
