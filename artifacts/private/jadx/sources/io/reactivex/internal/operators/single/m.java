package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class m<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f302996b;

    static final class a<T> implements io.reactivex.n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super T> f302998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302999c;

        a(io.reactivex.n0<? super T> n0Var, dj.g<? super T> gVar) {
            this.f302997a = n0Var;
            this.f302998b = gVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            this.f302997a.b(t10);
            try {
                this.f302998b.accept(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302999c, cVar)) {
                this.f302999c = cVar;
                this.f302997a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302999c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302999c.k();
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f302997a.onError(th2);
        }
    }

    public m(io.reactivex.q0<T> q0Var, dj.g<? super T> gVar) {
        this.f302995a = q0Var;
        this.f302996b = gVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f302995a.f(new a(n0Var, this.f302996b));
    }
}
