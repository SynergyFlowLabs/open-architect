package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.d1;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Background"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class m implements com.google.firebase.sessions.dagger.internal.c<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<CoroutineContext> f125156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d1> f125157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<androidx.datastore.core.l<SessionConfigs>> f125158c;

    public m(ij.c<CoroutineContext> cVar, ij.c<d1> cVar2, ij.c<androidx.datastore.core.l<SessionConfigs>> cVar3) {
        this.f125156a = cVar;
        this.f125157b = cVar2;
        this.f125158c = cVar3;
    }

    public static m a(ij.c<CoroutineContext> cVar, ij.c<d1> cVar2, ij.c<androidx.datastore.core.l<SessionConfigs>> cVar3) {
        return new m(cVar, cVar2, cVar3);
    }

    public static l c(CoroutineContext coroutineContext, d1 d1Var, androidx.datastore.core.l<SessionConfigs> lVar) {
        return new l(coroutineContext, d1Var, lVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f125156a.get(), this.f125157b.get(), this.f125158c.get());
    }
}
