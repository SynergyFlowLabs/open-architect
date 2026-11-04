package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.y2;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.ImpressionStore"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class j0 implements com.google.firebase.inappmessaging.dagger.internal.c<y2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f122775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122776b;

    public j0(h0 h0Var, ij.c<Application> cVar) {
        this.f122775a = h0Var;
        this.f122776b = cVar;
    }

    public static j0 a(h0 h0Var, ij.c<Application> cVar) {
        return new j0(h0Var, cVar);
    }

    public static y2 c(h0 h0Var, Application application) {
        return (y2) com.google.firebase.inappmessaging.dagger.internal.e.f(h0Var.b(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y2 get() {
        return c(this.f122775a, this.f122776b.get());
    }
}
