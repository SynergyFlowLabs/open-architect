package com.google.firebase.inappmessaging.display.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.InAppMessageScope")
public final class r implements com.google.firebase.inappmessaging.display.dagger.internal.d<com.google.firebase.inappmessaging.display.internal.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f122403a;

    public r(q qVar) {
        this.f122403a = qVar;
    }

    public static r a(q qVar) {
        return new r(qVar);
    }

    public static com.google.firebase.inappmessaging.display.internal.k c(q qVar) {
        return (com.google.firebase.inappmessaging.display.internal.k) com.google.firebase.inappmessaging.display.dagger.internal.f.f(qVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.display.internal.k get() {
        return c(this.f122403a);
    }
}
