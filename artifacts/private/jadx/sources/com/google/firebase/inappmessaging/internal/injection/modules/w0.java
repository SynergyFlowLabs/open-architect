package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.u2;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class w0 implements com.google.firebase.inappmessaging.dagger.internal.c<u2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.google.firebase.h> f122803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.m> f122804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.analytics.connector.a> f122805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.google.firebase.installations.k> f122806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.time.a> f122807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.w> f122808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<Executor> f122809g;

    public w0(ij.c<com.google.firebase.h> cVar, ij.c<com.google.android.datatransport.m> cVar2, ij.c<com.google.firebase.analytics.connector.a> cVar3, ij.c<com.google.firebase.installations.k> cVar4, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar5, ij.c<com.google.firebase.inappmessaging.internal.w> cVar6, ij.c<Executor> cVar7) {
        this.f122803a = cVar;
        this.f122804b = cVar2;
        this.f122805c = cVar3;
        this.f122806d = cVar4;
        this.f122807e = cVar5;
        this.f122808f = cVar6;
        this.f122809g = cVar7;
    }

    public static w0 a(ij.c<com.google.firebase.h> cVar, ij.c<com.google.android.datatransport.m> cVar2, ij.c<com.google.firebase.analytics.connector.a> cVar3, ij.c<com.google.firebase.installations.k> cVar4, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar5, ij.c<com.google.firebase.inappmessaging.internal.w> cVar6, ij.c<Executor> cVar7) {
        return new w0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static u2 c(com.google.firebase.h hVar, com.google.android.datatransport.m mVar, com.google.firebase.analytics.connector.a aVar, com.google.firebase.installations.k kVar, com.google.firebase.inappmessaging.internal.time.a aVar2, com.google.firebase.inappmessaging.internal.w wVar, Executor executor) {
        return (u2) com.google.firebase.inappmessaging.dagger.internal.e.f(v0.c(hVar, mVar, aVar, kVar, aVar2, wVar, executor));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u2 get() {
        return c(this.f122803a.get(), this.f122804b.get(), this.f122805c.get(), this.f122806d.get(), this.f122807e.get(), this.f122808f.get(), this.f122809g.get());
    }
}
