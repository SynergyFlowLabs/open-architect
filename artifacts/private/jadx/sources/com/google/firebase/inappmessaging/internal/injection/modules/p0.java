package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"javax.inject.Named"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class p0 implements com.google.firebase.inappmessaging.dagger.internal.c<io.reactivex.j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f122790a;

    public p0(n0 n0Var) {
        this.f122790a = n0Var;
    }

    public static p0 a(n0 n0Var) {
        return new p0(n0Var);
    }

    public static io.reactivex.j0 c(n0 n0Var) {
        return (io.reactivex.j0) com.google.firebase.inappmessaging.dagger.internal.e.f(n0Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public io.reactivex.j0 get() {
        return c(this.f122790a);
    }
}
