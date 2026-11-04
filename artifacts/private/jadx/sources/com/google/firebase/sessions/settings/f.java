package com.google.firebase.sessions.settings;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class f implements com.google.firebase.sessions.dagger.internal.c<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.sessions.b> f125120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<CoroutineContext> f125121b;

    public f(ij.c<com.google.firebase.sessions.b> cVar, ij.c<CoroutineContext> cVar2) {
        this.f125120a = cVar;
        this.f125121b = cVar2;
    }

    public static f a(ij.c<com.google.firebase.sessions.b> cVar, ij.c<CoroutineContext> cVar2) {
        return new f(cVar, cVar2);
    }

    public static e c(com.google.firebase.sessions.b bVar, CoroutineContext coroutineContext) {
        return new e(bVar, coroutineContext);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f125120a.get(), this.f125121b.get());
    }
}
