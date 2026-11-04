package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i implements dagger.internal.h<com.planner5d.library.model.manager.statistics.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<cd.c> f258953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> f258954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.debug.c> f258955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.customerio.c> f258956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f258957f;

    public i(b bVar, ij.c<cd.c> cVar, ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> cVar2, ij.c<com.planner5d.library.model.manager.statistics.debug.c> cVar3, ij.c<com.planner5d.library.model.manager.statistics.customerio.c> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5) {
        this.f258952a = bVar;
        this.f258953b = cVar;
        this.f258954c = cVar2;
        this.f258955d = cVar3;
        this.f258956e = cVar4;
        this.f258957f = cVar5;
    }

    public static i a(b bVar, ij.c<cd.c> cVar, ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> cVar2, ij.c<com.planner5d.library.model.manager.statistics.debug.c> cVar3, ij.c<com.planner5d.library.model.manager.statistics.customerio.c> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5) {
        return new i(bVar, cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static com.planner5d.library.model.manager.statistics.f c(b bVar, cd.c cVar, com.planner5d.library.model.manager.statistics.devtodev.d dVar, fg.e<com.planner5d.library.model.manager.statistics.debug.c> eVar, fg.e<com.planner5d.library.model.manager.statistics.customerio.c> eVar2, fg.e<com.planner5d.library.model.manager.config.j> eVar3) {
        return (com.planner5d.library.model.manager.statistics.f) dagger.internal.p.f(bVar.h(cVar, dVar, eVar, eVar2, eVar3));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.f get() {
        return c(this.f258952a, this.f258953b.get(), this.f258954c.get(), dagger.internal.g.a(this.f258955d), dagger.internal.g.a(this.f258956e), dagger.internal.g.a(this.f258957f));
    }
}
