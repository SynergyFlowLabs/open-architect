package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f299040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.h f299041b;

    public y(io.reactivex.i iVar, io.reactivex.h hVar) {
        this.f299040a = iVar;
        this.f299041b = hVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        try {
            this.f299040a.b(this.f299041b.a(fVar));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }
}
