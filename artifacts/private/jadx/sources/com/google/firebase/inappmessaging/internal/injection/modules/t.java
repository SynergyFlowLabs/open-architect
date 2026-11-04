package com.google.firebase.inappmessaging.internal.injection.modules;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.annotations.concurrent.Lightweight"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class t implements com.google.firebase.inappmessaging.dagger.internal.c<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f122798a;

    public t(q qVar) {
        this.f122798a = qVar;
    }

    public static t a(q qVar) {
        return new t(qVar);
    }

    public static Executor c(q qVar) {
        return (Executor) com.google.firebase.inappmessaging.dagger.internal.e.f(qVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return c(this.f122798a);
    }
}
