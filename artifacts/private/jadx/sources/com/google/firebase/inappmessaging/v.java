package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.internal.m2;
import com.google.firebase.inappmessaging.internal.v2;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger", "com.google.firebase.annotations.concurrent.Lightweight"})
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class v implements com.google.firebase.inappmessaging.dagger.internal.c<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<m2> f123127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<v2> f123128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.q> f123129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.google.firebase.installations.k> f123130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.x> f123131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.w> f123132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<Executor> f123133g;

    public v(ij.c<m2> cVar, ij.c<v2> cVar2, ij.c<com.google.firebase.inappmessaging.internal.q> cVar3, ij.c<com.google.firebase.installations.k> cVar4, ij.c<com.google.firebase.inappmessaging.internal.x> cVar5, ij.c<com.google.firebase.inappmessaging.internal.w> cVar6, ij.c<Executor> cVar7) {
        this.f123127a = cVar;
        this.f123128b = cVar2;
        this.f123129c = cVar3;
        this.f123130d = cVar4;
        this.f123131e = cVar5;
        this.f123132f = cVar6;
        this.f123133g = cVar7;
    }

    public static v a(ij.c<m2> cVar, ij.c<v2> cVar2, ij.c<com.google.firebase.inappmessaging.internal.q> cVar3, ij.c<com.google.firebase.installations.k> cVar4, ij.c<com.google.firebase.inappmessaging.internal.x> cVar5, ij.c<com.google.firebase.inappmessaging.internal.w> cVar6, ij.c<Executor> cVar7) {
        return new v(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static m c(m2 m2Var, v2 v2Var, com.google.firebase.inappmessaging.internal.q qVar, com.google.firebase.installations.k kVar, com.google.firebase.inappmessaging.internal.x xVar, com.google.firebase.inappmessaging.internal.w wVar, Executor executor) {
        return new m(m2Var, v2Var, qVar, kVar, xVar, wVar, executor);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f123127a.get(), this.f123128b.get(), this.f123129c.get(), this.f123130d.get(), this.f123131e.get(), this.f123132f.get(), this.f123133g.get());
    }
}
