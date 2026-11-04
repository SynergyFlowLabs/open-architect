package com.google.firebase.inappmessaging.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground", "com.google.firebase.inappmessaging.internal.injection.qualifiers.ProgrammaticTrigger", "com.google.firebase.annotations.concurrent.Blocking"})
@com.google.firebase.inappmessaging.dagger.internal.g("com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope")
@com.google.firebase.inappmessaging.dagger.internal.a
public final class n2 implements com.google.firebase.inappmessaging.dagger.internal.c<m2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<io.reactivex.flowables.a<String>> f122872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<io.reactivex.flowables.a<String>> f122873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<n> f122874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.time.a> f122875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<g> f122876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f> f122877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<q3> f122878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<a1> f122879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<o3> f122880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.model.m> f122881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<u3> f122882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.google.firebase.installations.k> f122883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<q> f122884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<c> f122885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<Executor> f122886o;

    public n2(ij.c<io.reactivex.flowables.a<String>> cVar, ij.c<io.reactivex.flowables.a<String>> cVar2, ij.c<n> cVar3, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar4, ij.c<g> cVar5, ij.c<f> cVar6, ij.c<q3> cVar7, ij.c<a1> cVar8, ij.c<o3> cVar9, ij.c<com.google.firebase.inappmessaging.model.m> cVar10, ij.c<u3> cVar11, ij.c<com.google.firebase.installations.k> cVar12, ij.c<q> cVar13, ij.c<c> cVar14, ij.c<Executor> cVar15) {
        this.f122872a = cVar;
        this.f122873b = cVar2;
        this.f122874c = cVar3;
        this.f122875d = cVar4;
        this.f122876e = cVar5;
        this.f122877f = cVar6;
        this.f122878g = cVar7;
        this.f122879h = cVar8;
        this.f122880i = cVar9;
        this.f122881j = cVar10;
        this.f122882k = cVar11;
        this.f122883l = cVar12;
        this.f122884m = cVar13;
        this.f122885n = cVar14;
        this.f122886o = cVar15;
    }

    public static n2 a(ij.c<io.reactivex.flowables.a<String>> cVar, ij.c<io.reactivex.flowables.a<String>> cVar2, ij.c<n> cVar3, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar4, ij.c<g> cVar5, ij.c<f> cVar6, ij.c<q3> cVar7, ij.c<a1> cVar8, ij.c<o3> cVar9, ij.c<com.google.firebase.inappmessaging.model.m> cVar10, ij.c<u3> cVar11, ij.c<com.google.firebase.installations.k> cVar12, ij.c<q> cVar13, ij.c<c> cVar14, ij.c<Executor> cVar15) {
        return new n2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15);
    }

    public static m2 c(io.reactivex.flowables.a<String> aVar, io.reactivex.flowables.a<String> aVar2, n nVar, com.google.firebase.inappmessaging.internal.time.a aVar3, g gVar, f fVar, q3 q3Var, a1 a1Var, o3 o3Var, com.google.firebase.inappmessaging.model.m mVar, u3 u3Var, com.google.firebase.installations.k kVar, q qVar, c cVar, Executor executor) {
        return new m2(aVar, aVar2, nVar, aVar3, gVar, fVar, q3Var, a1Var, o3Var, mVar, u3Var, kVar, qVar, cVar, executor);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m2 get() {
        return c(this.f122872a.get(), this.f122873b.get(), this.f122874c.get(), this.f122875d.get(), this.f122876e.get(), this.f122877f.get(), this.f122878g.get(), this.f122879h.get(), this.f122880i.get(), this.f122881j.get(), this.f122882k.get(), this.f122883l.get(), this.f122884m.get(), this.f122885n.get(), this.f122886o.get());
    }
}
