package com.google.firebase.inappmessaging.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.CampaignCache"})
@com.google.firebase.inappmessaging.dagger.internal.g("javax.inject.Singleton")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class o implements com.google.firebase.inappmessaging.dagger.internal.c<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y2> f122889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f122890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.time.a> f122891c;

    public o(ij.c<y2> cVar, ij.c<Application> cVar2, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar3) {
        this.f122889a = cVar;
        this.f122890b = cVar2;
        this.f122891c = cVar3;
    }

    public static o a(ij.c<y2> cVar, ij.c<Application> cVar2, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar3) {
        return new o(cVar, cVar2, cVar3);
    }

    public static n c(y2 y2Var, Application application, com.google.firebase.inappmessaging.internal.time.a aVar) {
        return new n(y2Var, application, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f122889a.get(), this.f122890b.get(), this.f122891c.get());
    }
}
