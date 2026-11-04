package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class p0<T> extends a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj.g<? super io.reactivex.disposables.c> f302107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj.a f302108c;

    public p0(io.reactivex.b0<T> b0Var, dj.g<? super io.reactivex.disposables.c> gVar, dj.a aVar) {
        super(b0Var);
        this.f302107b = gVar;
        this.f302108c = aVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new io.reactivex.internal.observers.n(i0Var, this.f302107b, this.f302108c));
    }
}
