package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class p0 implements com.google.firebase.sessions.dagger.internal.c<o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<v0> f125068a;

    public p0(ij.c<v0> cVar) {
        this.f125068a = cVar;
    }

    public static p0 a(ij.c<v0> cVar) {
        return new p0(cVar);
    }

    public static o0 c(v0 v0Var) {
        return new o0(v0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c(this.f125068a.get());
    }
}
