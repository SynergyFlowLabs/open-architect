package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.internal.h
@com.google.firebase.sessions.dagger.internal.a
@com.google.firebase.sessions.dagger.internal.i("javax.inject.Singleton")
public final class w0 implements com.google.firebase.sessions.dagger.internal.c<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d1> f125193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f125194b;

    public w0(ij.c<d1> cVar, ij.c<f1> cVar2) {
        this.f125193a = cVar;
        this.f125194b = cVar2;
    }

    public static w0 a(ij.c<d1> cVar, ij.c<f1> cVar2) {
        return new w0(cVar, cVar2);
    }

    public static v0 c(d1 d1Var, f1 f1Var) {
        return new v0(d1Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f125193a.get(), this.f125194b.get());
    }
}
