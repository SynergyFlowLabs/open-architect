package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes10.dex */
public final class j0<T, R> extends io.reactivex.k0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<T> f302980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.p0<? extends R, ? super T> f302981b;

    public j0(io.reactivex.q0<T> q0Var, io.reactivex.p0<? extends R, ? super T> p0Var) {
        this.f302980a = q0Var;
        this.f302981b = p0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super R> n0Var) {
        try {
            this.f302980a.f((io.reactivex.n0) io.reactivex.internal.functions.b.g(this.f302981b.a(n0Var), "The onLift returned a null SingleObserver"));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.disposables.e.o(th2, n0Var);
        }
    }
}
