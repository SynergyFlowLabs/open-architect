package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class z1<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.p<? extends R, ? super T> f300604c;

    public z1(io.reactivex.l<T> lVar, io.reactivex.p<? extends R, ? super T> pVar) {
        super(lVar);
        this.f300604c = pVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super R> vVar) {
        try {
            org.reactivestreams.v<? super Object> vVarA = this.f300604c.a(vVar);
            if (vVarA != null) {
                this.f299043b.e(vVarA);
                return;
            }
            throw new NullPointerException("Operator " + this.f300604c + " returned a null Subscriber");
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
