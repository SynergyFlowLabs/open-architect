package com.google.firebase.sessions;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class j0 implements com.google.firebase.sessions.dagger.internal.c<i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f125044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f125045b;

    public j0(ij.c<Context> cVar, ij.c<f1> cVar2) {
        this.f125044a = cVar;
        this.f125045b = cVar2;
    }

    public static j0 a(ij.c<Context> cVar, ij.c<f1> cVar2) {
        return new j0(cVar, cVar2);
    }

    public static i0 c(Context context, f1 f1Var) {
        return new i0(context, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i0 get() {
        return c(this.f125044a.get(), this.f125045b.get());
    }
}
