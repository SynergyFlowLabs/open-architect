package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r5 implements dagger.internal.h<com.planner5d.library.model.manager.config.source.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q5 f148255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f148256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.a> f148257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.l> f148258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<hd.b> f148259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.g.a> f148260f;

    public r5(q5 q5Var, ij.c<com.planner5d.library.model.manager.t1> cVar, ij.c<com.planner5d.library.model.manager.config.source.a> cVar2, ij.c<com.planner5d.library.model.manager.config.source.l> cVar3, ij.c<hd.b> cVar4, ij.c<com.planner5d.library.model.manager.config.source.g.a> cVar5) {
        this.f148255a = q5Var;
        this.f148256b = cVar;
        this.f148257c = cVar2;
        this.f148258d = cVar3;
        this.f148259e = cVar4;
        this.f148260f = cVar5;
    }

    public static r5 a(q5 q5Var, ij.c<com.planner5d.library.model.manager.t1> cVar, ij.c<com.planner5d.library.model.manager.config.source.a> cVar2, ij.c<com.planner5d.library.model.manager.config.source.l> cVar3, ij.c<hd.b> cVar4, ij.c<com.planner5d.library.model.manager.config.source.g.a> cVar5) {
        return new r5(q5Var, cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static com.planner5d.library.model.manager.config.source.j c(q5 q5Var, com.planner5d.library.model.manager.t1 t1Var, com.planner5d.library.model.manager.config.source.a aVar, com.planner5d.library.model.manager.config.source.l lVar, hd.b bVar, com.planner5d.library.model.manager.config.source.g.a aVar2) {
        return (com.planner5d.library.model.manager.config.source.j) dagger.internal.p.f(q5Var.a(t1Var, aVar, lVar, bVar, aVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.source.j get() {
        return c(this.f148255a, this.f148256b.get(), this.f148257c.get(), this.f148258d.get(), this.f148259e.get(), this.f148260f.get());
    }
}
