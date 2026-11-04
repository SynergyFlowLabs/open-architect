package com.google.firebase.inappmessaging.internal.injection.modules;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.annotations.concurrent.Background"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class o implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.inappmessaging.internal.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f122786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Executor> f122787b;

    public o(n nVar, ij.c<Executor> cVar) {
        this.f122786a = nVar;
        this.f122787b = cVar;
    }

    public static o a(n nVar, ij.c<Executor> cVar) {
        return new o(nVar, cVar);
    }

    public static com.google.firebase.inappmessaging.internal.w b(n nVar, Executor executor) {
        return (com.google.firebase.inappmessaging.internal.w) com.google.firebase.inappmessaging.dagger.internal.e.f(nVar.a(executor));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.internal.w get() {
        return b(this.f122786a, this.f122787b.get());
    }
}
