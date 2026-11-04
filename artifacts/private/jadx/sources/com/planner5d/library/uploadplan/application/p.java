package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<ke.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.p> f230735b;

    public p(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.p> cVar) {
        this.f230734a = hVar;
        this.f230735b = cVar;
    }

    public static p a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.p> cVar) {
        return new p(hVar, cVar);
    }

    public static ke.f c(h hVar, com.planner5d.library.uploadplan.interactor.p pVar) {
        return (ke.f) dagger.internal.p.f(hVar.h(pVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.f get() {
        return c(this.f230734a, this.f230735b.get());
    }
}
