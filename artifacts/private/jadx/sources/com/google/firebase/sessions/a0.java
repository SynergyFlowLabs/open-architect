package com.google.firebase.sessions;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Background"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class a0 implements com.google.firebase.sessions.dagger.internal.c<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f124845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.sessions.settings.i> f124846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<CoroutineContext> f124847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y0> f124848d;

    public a0(ij.c<com.google.firebase.h> cVar, ij.c<com.google.firebase.sessions.settings.i> cVar2, ij.c<CoroutineContext> cVar3, ij.c<y0> cVar4) {
        this.f124845a = cVar;
        this.f124846b = cVar2;
        this.f124847c = cVar3;
        this.f124848d = cVar4;
    }

    public static a0 a(ij.c<com.google.firebase.h> cVar, ij.c<com.google.firebase.sessions.settings.i> cVar2, ij.c<CoroutineContext> cVar3, ij.c<y0> cVar4) {
        return new a0(cVar, cVar2, cVar3, cVar4);
    }

    public static n c(com.google.firebase.h hVar, com.google.firebase.sessions.settings.i iVar, CoroutineContext coroutineContext, y0 y0Var) {
        return new n(hVar, iVar, coroutineContext, y0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f124845a.get(), this.f124846b.get(), this.f124847c.get(), this.f124848d.get());
    }
}
