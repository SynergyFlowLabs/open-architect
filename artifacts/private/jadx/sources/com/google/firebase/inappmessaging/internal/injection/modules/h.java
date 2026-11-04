package com.google.firebase.inappmessaging.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class h implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.installations.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f122766a;

    public h(d dVar) {
        this.f122766a = dVar;
    }

    public static h a(d dVar) {
        return new h(dVar);
    }

    public static com.google.firebase.installations.k c(d dVar) {
        return (com.google.firebase.installations.k) com.google.firebase.inappmessaging.dagger.internal.e.f(dVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.installations.k get() {
        return c(this.f122766a);
    }
}
