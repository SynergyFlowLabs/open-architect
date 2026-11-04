package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o implements dagger.internal.h<com.planner5d.library.model.manager.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f142869b;

    public o(i iVar, ij.c<com.planner5d.library.model.manager.config.d> cVar) {
        this.f142868a = iVar;
        this.f142869b = cVar;
    }

    public static o a(i iVar, ij.c<com.planner5d.library.model.manager.config.d> cVar) {
        return new o(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.h c(i iVar, com.planner5d.library.model.manager.config.d dVar) {
        return (com.planner5d.library.model.manager.h) dagger.internal.p.f(iVar.j(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.h get() {
        return c(this.f142868a, this.f142869b.get());
    }
}
