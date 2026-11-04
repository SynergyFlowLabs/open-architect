package com.google.firebase.inappmessaging.internal;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.dagger.internal.f({"com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground"})
@com.google.firebase.inappmessaging.dagger.internal.g
@com.google.firebase.inappmessaging.dagger.internal.a
public final class y implements com.google.firebase.inappmessaging.dagger.internal.c<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a1> f122998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.internal.time.a> f122999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<q3> f123000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<o3> f123001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<n> f123002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.model.m> f123003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<u2> f123004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<q> f123005h;

    public y(ij.c<a1> cVar, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar2, ij.c<q3> cVar3, ij.c<o3> cVar4, ij.c<n> cVar5, ij.c<com.google.firebase.inappmessaging.model.m> cVar6, ij.c<u2> cVar7, ij.c<q> cVar8) {
        this.f122998a = cVar;
        this.f122999b = cVar2;
        this.f123000c = cVar3;
        this.f123001d = cVar4;
        this.f123002e = cVar5;
        this.f123003f = cVar6;
        this.f123004g = cVar7;
        this.f123005h = cVar8;
    }

    public static y a(ij.c<a1> cVar, ij.c<com.google.firebase.inappmessaging.internal.time.a> cVar2, ij.c<q3> cVar3, ij.c<o3> cVar4, ij.c<n> cVar5, ij.c<com.google.firebase.inappmessaging.model.m> cVar6, ij.c<u2> cVar7, ij.c<q> cVar8) {
        return new y(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static x c(a1 a1Var, com.google.firebase.inappmessaging.internal.time.a aVar, q3 q3Var, o3 o3Var, n nVar, com.google.firebase.inappmessaging.model.m mVar, u2 u2Var, q qVar) {
        return new x(a1Var, aVar, q3Var, o3Var, nVar, mVar, u2Var, qVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f122998a.get(), this.f122999b.get(), this.f123000c.get(), this.f123001d.get(), this.f123002e.get(), this.f123003f.get(), this.f123004g.get(), this.f123005h.get());
    }
}
