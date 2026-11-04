package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class z0 implements com.google.firebase.sessions.dagger.internal.c<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a1> f125205a;

    public z0(ij.c<a1> cVar) {
        this.f125205a = cVar;
    }

    public static z0 a(ij.c<a1> cVar) {
        return new z0(cVar);
    }

    public static y0 c(a1 a1Var) {
        return new y0(a1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y0 get() {
        return c(this.f125205a.get());
    }
}
