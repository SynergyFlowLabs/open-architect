package com.google.firebase.inappmessaging.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class d implements com.google.firebase.inappmessaging.dagger.internal.c<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.abt.d> f122601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Executor> f122602b;

    public d(ij.c<com.google.firebase.abt.d> cVar, ij.c<Executor> cVar2) {
        this.f122601a = cVar;
        this.f122602b = cVar2;
    }

    public static d a(ij.c<com.google.firebase.abt.d> cVar, ij.c<Executor> cVar2) {
        return new d(cVar, cVar2);
    }

    public static c c(com.google.firebase.abt.d dVar, Executor executor) {
        return new c(dVar, executor);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f122601a.get(), this.f122602b.get());
    }
}
