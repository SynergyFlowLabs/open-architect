package com.planner5d.planner5d;

import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g0 implements dagger.internal.h<com.planner5d.library.model.manager.config.source.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f258943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f258944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.a> f258945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.l> f258946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<hd.b> f258947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.g.a> f258948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.growthbook.d> f258949g;

    public g0(f0 f0Var, ij.c<t1> cVar, ij.c<com.planner5d.library.model.manager.config.source.a> cVar2, ij.c<com.planner5d.library.model.manager.config.source.l> cVar3, ij.c<hd.b> cVar4, ij.c<com.planner5d.library.model.manager.config.source.g.a> cVar5, ij.c<com.planner5d.library.model.manager.config.source.growthbook.d> cVar6) {
        this.f258943a = f0Var;
        this.f258944b = cVar;
        this.f258945c = cVar2;
        this.f258946d = cVar3;
        this.f258947e = cVar4;
        this.f258948f = cVar5;
        this.f258949g = cVar6;
    }

    public static g0 a(f0 f0Var, ij.c<t1> cVar, ij.c<com.planner5d.library.model.manager.config.source.a> cVar2, ij.c<com.planner5d.library.model.manager.config.source.l> cVar3, ij.c<hd.b> cVar4, ij.c<com.planner5d.library.model.manager.config.source.g.a> cVar5, ij.c<com.planner5d.library.model.manager.config.source.growthbook.d> cVar6) {
        return new g0(f0Var, cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static com.planner5d.library.model.manager.config.source.j c(f0 f0Var, t1 t1Var, com.planner5d.library.model.manager.config.source.a aVar, com.planner5d.library.model.manager.config.source.l lVar, hd.b bVar, com.planner5d.library.model.manager.config.source.g.a aVar2, com.planner5d.library.model.manager.config.source.growthbook.d dVar) {
        return (com.planner5d.library.model.manager.config.source.j) dagger.internal.p.f(f0Var.a(t1Var, aVar, lVar, bVar, aVar2, dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.source.j get() {
        return c(this.f258943a, this.f258944b.get(), this.f258945c.get(), this.f258946d.get(), this.f258947e.get(), this.f258948f.get(), this.f258949g.get());
    }
}
