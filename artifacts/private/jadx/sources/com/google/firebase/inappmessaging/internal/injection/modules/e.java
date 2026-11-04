package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.z2;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class e implements com.google.firebase.inappmessaging.dagger.internal.c<com.google.firebase.inappmessaging.internal.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f122755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.p0> f122756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<Application> f122757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<z2> f122758d;

    public e(d dVar, ij.c<com.google.firebase.inappmessaging.internal.p0> cVar, ij.c<Application> cVar2, ij.c<z2> cVar3) {
        this.f122755a = dVar;
        this.f122756b = cVar;
        this.f122757c = cVar2;
        this.f122758d = cVar3;
    }

    public static e a(d dVar, ij.c<com.google.firebase.inappmessaging.internal.p0> cVar, ij.c<Application> cVar2, ij.c<z2> cVar3) {
        return new e(dVar, cVar, cVar2, cVar3);
    }

    public static com.google.firebase.inappmessaging.internal.g c(d dVar, ij.c<com.google.firebase.inappmessaging.internal.p0> cVar, Application application, z2 z2Var) {
        return (com.google.firebase.inappmessaging.internal.g) com.google.firebase.inappmessaging.dagger.internal.e.f(dVar.a(cVar, application, z2Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.inappmessaging.internal.g get() {
        return c(this.f122755a, this.f122756b, this.f122757c.get(), this.f122758d.get());
    }
}
