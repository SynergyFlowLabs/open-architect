package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class v1<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.f0<? extends R, ? super T> f302449b;

    public v1(io.reactivex.g0<T> g0Var, io.reactivex.f0<? extends R, ? super T> f0Var) {
        super(g0Var);
        this.f302449b = f0Var;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super R> i0Var) {
        try {
            this.f301291a.a((io.reactivex.i0) io.reactivex.internal.functions.b.g(this.f302449b.a(i0Var), "Operator " + this.f302449b + " returned a null Observer"));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
