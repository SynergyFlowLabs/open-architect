package com.google.firebase.inappmessaging.display.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope")
public final class f implements com.google.firebase.inappmessaging.display.dagger.internal.d<com.google.firebase.inappmessaging.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f122377a;

    public f(e eVar) {
        this.f122377a = eVar;
    }

    public static f a(e eVar) {
        return new f(eVar);
    }

    public static com.google.firebase.inappmessaging.m c(e eVar) {
        return (com.google.firebase.inappmessaging.m) com.google.firebase.inappmessaging.display.dagger.internal.f.f(eVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.m get() {
        return c(this.f122377a);
    }
}
