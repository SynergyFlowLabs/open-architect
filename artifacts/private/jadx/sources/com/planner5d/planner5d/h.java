package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<com.planner5d.library.services.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> f258951b;

    public h(b bVar, ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> cVar) {
        this.f258950a = bVar;
        this.f258951b = cVar;
    }

    public static h a(b bVar, ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> cVar) {
        return new h(bVar, cVar);
    }

    public static com.planner5d.library.services.i c(b bVar, com.planner5d.library.model.manager.statistics.devtodev.d dVar) {
        return (com.planner5d.library.services.i) dagger.internal.p.f(bVar.g(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.i get() {
        return c(this.f258950a, this.f258951b.get());
    }
}
