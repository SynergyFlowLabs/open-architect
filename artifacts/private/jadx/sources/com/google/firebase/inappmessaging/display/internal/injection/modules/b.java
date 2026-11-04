package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("javax.inject.Singleton")
public final class b implements com.google.firebase.inappmessaging.display.dagger.internal.d<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f122373a;

    public b(a aVar) {
        this.f122373a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static Application c(a aVar) {
        return (Application) com.google.firebase.inappmessaging.display.dagger.internal.f.f(aVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f122373a);
    }
}
