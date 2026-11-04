package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class v implements com.google.firebase.inappmessaging.dagger.internal.c<io.reactivex.flowables.a<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f122800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122801b;

    public v(u uVar, ij.c<Application> cVar) {
        this.f122800a = uVar;
        this.f122801b = cVar;
    }

    public static v a(u uVar, ij.c<Application> cVar) {
        return new v(uVar, cVar);
    }

    public static io.reactivex.flowables.a<String> c(u uVar, Application application) {
        return (io.reactivex.flowables.a) com.google.firebase.inappmessaging.dagger.internal.e.f(uVar.a(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public io.reactivex.flowables.a<String> get() {
        return c(this.f122800a, this.f122801b.get());
    }
}
