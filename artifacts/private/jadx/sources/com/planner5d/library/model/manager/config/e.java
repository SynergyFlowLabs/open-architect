package com.planner5d.library.model.manager.config;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f181486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.g.a> f181487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.l> f181488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.j> f181489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<j> f181490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f181491f;

    public e(ij.c<com.planner5d.library.application.d> cVar, ij.c<com.planner5d.library.model.manager.config.source.g.a> cVar2, ij.c<com.planner5d.library.model.manager.config.source.l> cVar3, ij.c<com.planner5d.library.model.manager.config.source.j> cVar4, ij.c<j> cVar5, ij.c<com.planner5d.library.services.utility.t> cVar6) {
        this.f181486a = cVar;
        this.f181487b = cVar2;
        this.f181488c = cVar3;
        this.f181489d = cVar4;
        this.f181490e = cVar5;
        this.f181491f = cVar6;
    }

    public static e a(ij.c<com.planner5d.library.application.d> cVar, ij.c<com.planner5d.library.model.manager.config.source.g.a> cVar2, ij.c<com.planner5d.library.model.manager.config.source.l> cVar3, ij.c<com.planner5d.library.model.manager.config.source.j> cVar4, ij.c<j> cVar5, ij.c<com.planner5d.library.services.utility.t> cVar6) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static d c(com.planner5d.library.application.d dVar, fg.e<com.planner5d.library.model.manager.config.source.g.a> eVar, com.planner5d.library.model.manager.config.source.l lVar, fg.e<com.planner5d.library.model.manager.config.source.j> eVar2, j jVar, com.planner5d.library.services.utility.t tVar) {
        return new d(dVar, eVar, lVar, eVar2, jVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f181486a.get(), dagger.internal.g.a(this.f181487b), this.f181488c.get(), dagger.internal.g.a(this.f181489d), this.f181490e.get(), this.f181491f.get());
    }
}
