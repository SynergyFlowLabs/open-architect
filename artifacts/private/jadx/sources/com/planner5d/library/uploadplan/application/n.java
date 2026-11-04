package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<com.planner5d.library.model.manager.uploadplan.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.uploadplan.d> f230731b;

    public n(h hVar, ij.c<com.planner5d.library.model.manager.uploadplan.d> cVar) {
        this.f230730a = hVar;
        this.f230731b = cVar;
    }

    public static n a(h hVar, ij.c<com.planner5d.library.model.manager.uploadplan.d> cVar) {
        return new n(hVar, cVar);
    }

    public static com.planner5d.library.model.manager.uploadplan.g c(h hVar, com.planner5d.library.model.manager.uploadplan.d dVar) {
        return (com.planner5d.library.model.manager.uploadplan.g) dagger.internal.p.f(hVar.f(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.uploadplan.g get() {
        return c(this.f230730a, this.f230731b.get());
    }
}
