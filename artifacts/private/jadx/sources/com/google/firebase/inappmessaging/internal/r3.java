package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"javax.inject.Named"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class r3 implements com.google.firebase.inappmessaging.dagger.internal.c<q3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<io.reactivex.j0> f122926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<io.reactivex.j0> f122927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<io.reactivex.j0> f122928c;

    public r3(ij.c<io.reactivex.j0> cVar, ij.c<io.reactivex.j0> cVar2, ij.c<io.reactivex.j0> cVar3) {
        this.f122926a = cVar;
        this.f122927b = cVar2;
        this.f122928c = cVar3;
    }

    public static r3 a(ij.c<io.reactivex.j0> cVar, ij.c<io.reactivex.j0> cVar2, ij.c<io.reactivex.j0> cVar3) {
        return new r3(cVar, cVar2, cVar3);
    }

    public static q3 c(io.reactivex.j0 j0Var, io.reactivex.j0 j0Var2, io.reactivex.j0 j0Var3) {
        return new q3(j0Var, j0Var2, j0Var3);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q3 get() {
        return c(this.f122926a.get(), this.f122927b.get(), this.f122928c.get());
    }
}
