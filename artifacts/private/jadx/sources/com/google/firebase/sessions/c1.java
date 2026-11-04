package com.google.firebase.sessions;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Background"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class c1 implements com.google.firebase.sessions.dagger.internal.c<b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.sessions.settings.i> f124961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<v0> f124962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<s0> f124963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<d1> f124964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<androidx.datastore.core.l<SessionData>> f124965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<e0> f124966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<CoroutineContext> f124967g;

    public c1(ij.c<com.google.firebase.sessions.settings.i> cVar, ij.c<v0> cVar2, ij.c<s0> cVar3, ij.c<d1> cVar4, ij.c<androidx.datastore.core.l<SessionData>> cVar5, ij.c<e0> cVar6, ij.c<CoroutineContext> cVar7) {
        this.f124961a = cVar;
        this.f124962b = cVar2;
        this.f124963c = cVar3;
        this.f124964d = cVar4;
        this.f124965e = cVar5;
        this.f124966f = cVar6;
        this.f124967g = cVar7;
    }

    public static c1 a(ij.c<com.google.firebase.sessions.settings.i> cVar, ij.c<v0> cVar2, ij.c<s0> cVar3, ij.c<d1> cVar4, ij.c<androidx.datastore.core.l<SessionData>> cVar5, ij.c<e0> cVar6, ij.c<CoroutineContext> cVar7) {
        return new c1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static b1 c(com.google.firebase.sessions.settings.i iVar, v0 v0Var, s0 s0Var, d1 d1Var, androidx.datastore.core.l<SessionData> lVar, e0 e0Var, CoroutineContext coroutineContext) {
        return new b1(iVar, v0Var, s0Var, d1Var, lVar, e0Var, coroutineContext);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b1 get() {
        return c(this.f124961a.get(), this.f124962b.get(), this.f124963c.get(), this.f124964d.get(), this.f124965e.get(), this.f124966f.get(), this.f124967g.get());
    }
}
