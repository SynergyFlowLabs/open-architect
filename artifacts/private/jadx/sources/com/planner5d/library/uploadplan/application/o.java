package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<ke.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.l> f230733b;

    public o(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.l> cVar) {
        this.f230732a = hVar;
        this.f230733b = cVar;
    }

    public static o a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.l> cVar) {
        return new o(hVar, cVar);
    }

    public static ke.e c(h hVar, com.planner5d.library.uploadplan.interactor.l lVar) {
        return (ke.e) dagger.internal.p.f(hVar.g(lVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.e get() {
        return c(this.f230732a, this.f230733b.get());
    }
}
