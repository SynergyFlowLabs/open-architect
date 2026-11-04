package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.settings.SessionConfigs;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h({"com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class u implements com.google.firebase.sessions.dagger.internal.c<androidx.datastore.core.l<SessionConfigs>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f125180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<CoroutineContext> f125181b;

    public u(ij.c<Context> cVar, ij.c<CoroutineContext> cVar2) {
        this.f125180a = cVar;
        this.f125181b = cVar2;
    }

    public static u a(ij.c<Context> cVar, ij.c<CoroutineContext> cVar2) {
        return new u(cVar, cVar2);
    }

    public static androidx.datastore.core.l<SessionConfigs> c(Context context, CoroutineContext coroutineContext) {
        return (androidx.datastore.core.l) com.google.firebase.sessions.dagger.internal.e.f(o.b.f125065a.i(context, coroutineContext));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public androidx.datastore.core.l<SessionConfigs> get() {
        return c(this.f125180a.get(), this.f125181b.get());
    }
}
