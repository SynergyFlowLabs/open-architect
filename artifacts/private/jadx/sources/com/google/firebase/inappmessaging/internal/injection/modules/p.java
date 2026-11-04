package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class p implements com.google.firebase.inappmessaging.dagger.internal.c<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f122789a;

    public p(n nVar) {
        this.f122789a = nVar;
    }

    public static p a(n nVar) {
        return new p(nVar);
    }

    public static Application c(n nVar) {
        return (Application) com.google.firebase.inappmessaging.dagger.internal.e.f(nVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f122789a);
    }
}
