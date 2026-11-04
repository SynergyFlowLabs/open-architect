package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@com.google.firebase.inappmessaging.display.dagger.internal.h("javax.inject.Singleton")
public final class b implements com.google.firebase.inappmessaging.display.dagger.internal.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f122252a;

    public b(ij.c<Application> cVar) {
        this.f122252a = cVar;
    }

    public static b a(ij.c<Application> cVar) {
        return new b(cVar);
    }

    public static a c(Application application) {
        return new a(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f122252a.get());
    }
}
