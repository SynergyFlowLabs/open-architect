package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<ke.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.r> f230741b;

    public s(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.r> cVar) {
        this.f230740a = hVar;
        this.f230741b = cVar;
    }

    public static s a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.r> cVar) {
        return new s(hVar, cVar);
    }

    public static ke.h c(h hVar, com.planner5d.library.uploadplan.interactor.r rVar) {
        return (ke.h) dagger.internal.p.f(hVar.k(rVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.h get() {
        return c(this.f230740a, this.f230741b.get());
    }
}
