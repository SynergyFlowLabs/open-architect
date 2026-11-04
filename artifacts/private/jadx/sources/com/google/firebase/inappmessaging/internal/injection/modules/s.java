package com.google.firebase.inappmessaging.internal.injection.modules;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class s implements com.google.firebase.inappmessaging.dagger.internal.c<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f122796a;

    public s(q qVar) {
        this.f122796a = qVar;
    }

    public static s a(q qVar) {
        return new s(qVar);
    }

    public static Executor c(q qVar) {
        return (Executor) com.google.firebase.inappmessaging.dagger.internal.e.f(qVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return c(this.f122796a);
    }
}
