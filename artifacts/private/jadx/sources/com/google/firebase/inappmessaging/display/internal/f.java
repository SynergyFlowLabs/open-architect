package com.google.firebase.inappmessaging.display.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope")
public final class f implements com.google.firebase.inappmessaging.display.dagger.internal.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.bumptech.glide.l> f122320a;

    public f(ij.c<com.bumptech.glide.l> cVar) {
        this.f122320a = cVar;
    }

    public static f a(ij.c<com.bumptech.glide.l> cVar) {
        return new f(cVar);
    }

    public static e c(com.bumptech.glide.l lVar) {
        return new e(lVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f122320a.get());
    }
}
