package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope")
public final class d implements com.google.firebase.inappmessaging.display.dagger.internal.d<com.bumptech.glide.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f122374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122375b;

    public d(c cVar, ij.c<Application> cVar2) {
        this.f122374a = cVar;
        this.f122375b = cVar2;
    }

    public static d a(c cVar, ij.c<Application> cVar2) {
        return new d(cVar, cVar2);
    }

    public static com.bumptech.glide.l c(c cVar, Application application) {
        return (com.bumptech.glide.l) com.google.firebase.inappmessaging.display.dagger.internal.f.f(cVar.a(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.l get() {
        return c(this.f122374a, this.f122375b.get());
    }
}
