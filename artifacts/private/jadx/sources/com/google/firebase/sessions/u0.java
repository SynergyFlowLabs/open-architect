package com.google.firebase.sessions;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Background"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class u0 implements com.google.firebase.sessions.dagger.internal.c<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f125182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.installations.k> f125183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.sessions.settings.i> f125184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<j> f125185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<CoroutineContext> f125186e;

    public u0(ij.c<com.google.firebase.h> cVar, ij.c<com.google.firebase.installations.k> cVar2, ij.c<com.google.firebase.sessions.settings.i> cVar3, ij.c<j> cVar4, ij.c<CoroutineContext> cVar5) {
        this.f125182a = cVar;
        this.f125183b = cVar2;
        this.f125184c = cVar3;
        this.f125185d = cVar4;
        this.f125186e = cVar5;
    }

    public static u0 a(ij.c<com.google.firebase.h> cVar, ij.c<com.google.firebase.installations.k> cVar2, ij.c<com.google.firebase.sessions.settings.i> cVar3, ij.c<j> cVar4, ij.c<CoroutineContext> cVar5) {
        return new u0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static t0 c(com.google.firebase.h hVar, com.google.firebase.installations.k kVar, com.google.firebase.sessions.settings.i iVar, j jVar, CoroutineContext coroutineContext) {
        return new t0(hVar, kVar, iVar, jVar, coroutineContext);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f125182a.get(), this.f125183b.get(), this.f125184c.get(), this.f125185d.get(), this.f125186e.get());
    }
}
