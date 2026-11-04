package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<ke.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.e> f230723b;

    public j(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.e> cVar) {
        this.f230722a = hVar;
        this.f230723b = cVar;
    }

    public static j a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.e> cVar) {
        return new j(hVar, cVar);
    }

    public static ke.b c(h hVar, com.planner5d.library.uploadplan.interactor.e eVar) {
        return (ke.b) dagger.internal.p.f(hVar.b(eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.b get() {
        return c(this.f230722a, this.f230723b.get());
    }
}
