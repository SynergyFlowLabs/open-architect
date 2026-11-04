package com.google.firebase.sessions;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class v implements com.google.firebase.sessions.dagger.internal.c<androidx.datastore.core.l<SessionData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f125187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<CoroutineContext> f125188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<o0> f125189c;

    public v(ij.c<Context> cVar, ij.c<CoroutineContext> cVar2, ij.c<o0> cVar3) {
        this.f125187a = cVar;
        this.f125188b = cVar2;
        this.f125189c = cVar3;
    }

    public static v a(ij.c<Context> cVar, ij.c<CoroutineContext> cVar2, ij.c<o0> cVar3) {
        return new v(cVar, cVar2, cVar3);
    }

    public static androidx.datastore.core.l<SessionData> c(Context context, CoroutineContext coroutineContext, o0 o0Var) {
        return (androidx.datastore.core.l) com.google.firebase.sessions.dagger.internal.e.f(o.b.f125065a.l(context, coroutineContext, o0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.core.l<SessionData> get() {
        return c(this.f125187a.get(), this.f125188b.get(), this.f125189c.get());
    }
}
