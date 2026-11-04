package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d3 implements dagger.internal.h<le.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.u> f142495b;

    public d3(i iVar, ij.c<com.planner5d.library.interactor.u> cVar) {
        this.f142494a = iVar;
        this.f142495b = cVar;
    }

    public static d3 a(i iVar, ij.c<com.planner5d.library.interactor.u> cVar) {
        return new d3(iVar, cVar);
    }

    public static le.j c(i iVar, com.planner5d.library.interactor.u uVar) {
        return (le.j) dagger.internal.p.f(iVar.c1(uVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.j get() {
        return c(this.f142494a, this.f142495b.get());
    }
}
