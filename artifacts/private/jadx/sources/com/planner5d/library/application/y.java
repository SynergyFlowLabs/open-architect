package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class y implements dagger.internal.h<com.planner5d.library.model.manager.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f148327b;

    public y(i iVar, ij.c<com.planner5d.library.model.manager.config.j> cVar) {
        this.f148326a = iVar;
        this.f148327b = cVar;
    }

    public static y a(i iVar, ij.c<com.planner5d.library.model.manager.config.j> cVar) {
        return new y(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.w c(i iVar, com.planner5d.library.model.manager.config.j jVar) {
        return (com.planner5d.library.model.manager.w) dagger.internal.p.f(iVar.t(jVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.w get() {
        return c(this.f148326a, this.f148327b.get());
    }
}
