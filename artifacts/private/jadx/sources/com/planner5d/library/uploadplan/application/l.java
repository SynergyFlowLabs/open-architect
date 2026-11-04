package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<ke.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.j> f230727b;

    public l(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.j> cVar) {
        this.f230726a = hVar;
        this.f230727b = cVar;
    }

    public static l a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.j> cVar) {
        return new l(hVar, cVar);
    }

    public static ke.d c(h hVar, com.planner5d.library.uploadplan.interactor.j jVar) {
        return (ke.d) dagger.internal.p.f(hVar.d(jVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.d get() {
        return c(this.f230726a, this.f230727b.get());
    }
}
