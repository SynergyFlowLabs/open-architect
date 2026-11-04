package com.google.firebase.inappmessaging.display.internal.injection.modules;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h
public final class s implements com.google.firebase.inappmessaging.display.dagger.internal.d<com.google.firebase.inappmessaging.model.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f122404a;

    public s(q qVar) {
        this.f122404a = qVar;
    }

    public static s a(q qVar) {
        return new s(qVar);
    }

    public static com.google.firebase.inappmessaging.model.i c(q qVar) {
        return (com.google.firebase.inappmessaging.model.i) com.google.firebase.inappmessaging.display.dagger.internal.f.f(qVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.model.i get() {
        return c(this.f122404a);
    }
}
