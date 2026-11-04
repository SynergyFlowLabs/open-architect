package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class f0 implements com.google.firebase.inappmessaging.dagger.internal.c<io.reactivex.flowables.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f122763a;

    public f0(e0 e0Var) {
        this.f122763a = e0Var;
    }

    public static f0 a(e0 e0Var) {
        return new f0(e0Var);
    }

    public static io.reactivex.flowables.a<String> c(e0 e0Var) {
        return (io.reactivex.flowables.a) com.google.firebase.inappmessaging.dagger.internal.e.f(e0Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public io.reactivex.flowables.a<String> get() {
        return c(this.f122763a);
    }
}
