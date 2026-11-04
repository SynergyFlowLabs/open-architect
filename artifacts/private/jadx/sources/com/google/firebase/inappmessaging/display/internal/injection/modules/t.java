package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.InAppMessageScope")
public final class t implements com.google.firebase.inappmessaging.display.dagger.internal.d<LayoutInflater> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f122405a;

    public t(q qVar) {
        this.f122405a = qVar;
    }

    public static t a(q qVar) {
        return new t(qVar);
    }

    public static LayoutInflater c(q qVar) {
        return (LayoutInflater) com.google.firebase.inappmessaging.display.dagger.internal.f.f(qVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutInflater get() {
        return c(this.f122405a);
    }
}
