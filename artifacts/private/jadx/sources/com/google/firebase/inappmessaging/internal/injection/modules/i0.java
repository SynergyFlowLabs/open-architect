package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.y2;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.CampaignCache"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class i0 implements com.google.firebase.inappmessaging.dagger.internal.c<y2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f122771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122772b;

    public i0(h0 h0Var, ij.c<Application> cVar) {
        this.f122771a = h0Var;
        this.f122772b = cVar;
    }

    public static i0 a(h0 h0Var, ij.c<Application> cVar) {
        return new i0(h0Var, cVar);
    }

    public static y2 c(h0 h0Var, Application application) {
        return (y2) com.google.firebase.inappmessaging.dagger.internal.e.f(h0Var.a(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y2 get() {
        return c(this.f122771a, this.f122772b.get());
    }
}
