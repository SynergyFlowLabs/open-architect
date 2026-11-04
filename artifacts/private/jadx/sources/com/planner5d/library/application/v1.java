package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v1 implements dagger.internal.h<com.planner5d.library.model.manager.config.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.sql.l> f148296b;

    public v1(i iVar, ij.c<com.planner5d.library.model.manager.config.sql.l> cVar) {
        this.f148295a = iVar;
        this.f148296b = cVar;
    }

    public static v1 a(i iVar, ij.c<com.planner5d.library.model.manager.config.sql.l> cVar) {
        return new v1(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.config.p c(i iVar, com.planner5d.library.model.manager.config.sql.l lVar) {
        return (com.planner5d.library.model.manager.config.p) dagger.internal.p.f(iVar.s0(lVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.p get() {
        return c(this.f148295a, this.f148296b.get());
    }
}
