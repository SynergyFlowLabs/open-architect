package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<com.planner5d.library.model.manager.uploadplan.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.uploadplan.d> f148291b;

    public v(i iVar, ij.c<com.planner5d.library.model.manager.uploadplan.d> cVar) {
        this.f148290a = iVar;
        this.f148291b = cVar;
    }

    public static v a(i iVar, ij.c<com.planner5d.library.model.manager.uploadplan.d> cVar) {
        return new v(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.uploadplan.g c(i iVar, com.planner5d.library.model.manager.uploadplan.d dVar) {
        return (com.planner5d.library.model.manager.uploadplan.g) dagger.internal.p.f(iVar.q(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.uploadplan.g get() {
        return c(this.f148290a, this.f148291b.get());
    }
}
