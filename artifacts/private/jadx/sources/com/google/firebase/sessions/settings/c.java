package com.google.firebase.sessions.settings;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class c implements com.google.firebase.sessions.dagger.internal.c<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f125090a;

    public c(ij.c<Context> cVar) {
        this.f125090a = cVar;
    }

    public static c a(ij.c<Context> cVar) {
        return new c(cVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f125090a.get());
    }
}
