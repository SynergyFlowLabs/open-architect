package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class g implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f122764a;

    public g(d dVar) {
        this.f122764a = dVar;
    }

    public static g a(d dVar) {
        return new g(dVar);
    }

    public static com.google.firebase.h c(d dVar) {
        return (com.google.firebase.h) com.google.firebase.inappmessaging.dagger.internal.e.f(dVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.h get() {
        return c(this.f122764a);
    }
}
