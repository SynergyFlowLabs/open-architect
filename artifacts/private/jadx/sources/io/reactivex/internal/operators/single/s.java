package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class s<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f303055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super io.reactivex.disposables.c> f303056b;

    static final class a<T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f303057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super io.reactivex.disposables.c> f303058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f303059c;

        a(io.reactivex.n0<? super T> n0Var, dj.g<? super io.reactivex.disposables.c> gVar) {
            this.f303057a = n0Var;
            this.f303058b = gVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            if (this.f303059c) {
                return;
            }
            this.f303057a.b(t10);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            try {
                this.f303058b.accept(cVar);
                this.f303057a.d(cVar);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303059c = true;
                cVar.dispose();
                io.reactivex.internal.disposables.e.o(th2, this.f303057a);
            }
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            if (this.f303059c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f303057a.onError(th2);
            }
        }
    }

    public s(io.reactivex.q0<T> q0Var, dj.g<? super io.reactivex.disposables.c> gVar) {
        this.f303055a = q0Var;
        this.f303056b = gVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f303055a.f(new a(n0Var, this.f303056b));
    }
}
