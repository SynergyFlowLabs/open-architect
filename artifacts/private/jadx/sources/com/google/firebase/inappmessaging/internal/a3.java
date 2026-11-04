package com.google.firebase.inappmessaging.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class a3 implements com.google.firebase.inappmessaging.dagger.internal.c<z2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f122586a;

    public a3(ij.c<Application> cVar) {
        this.f122586a = cVar;
    }

    public static a3 a(ij.c<Application> cVar) {
        return new a3(cVar);
    }

    public static z2 c(Application application) {
        return new z2(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z2 get() {
        return c(this.f122586a.get());
    }
}
