package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.y2;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.RateLimit"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class k0 implements com.google.firebase.inappmessaging.dagger.internal.c<y2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f122779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122780b;

    public k0(h0 h0Var, ij.c<Application> cVar) {
        this.f122779a = h0Var;
        this.f122780b = cVar;
    }

    public static k0 a(h0 h0Var, ij.c<Application> cVar) {
        return new k0(h0Var, cVar);
    }

    public static y2 c(h0 h0Var, Application application) {
        return (y2) com.google.firebase.inappmessaging.dagger.internal.e.f(h0Var.c(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y2 get() {
        return c(this.f122779a, this.f122780b.get());
    }
}
