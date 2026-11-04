package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j0 implements dagger.internal.h<com.planner5d.library.database.model.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.room.a> f142579b;

    public j0(i iVar, ij.c<com.planner5d.library.model.manager.favorite.room.a> cVar) {
        this.f142578a = iVar;
        this.f142579b = cVar;
    }

    public static j0 a(i iVar, ij.c<com.planner5d.library.model.manager.favorite.room.a> cVar) {
        return new j0(iVar, cVar);
    }

    public static com.planner5d.library.database.model.h c(i iVar, com.planner5d.library.model.manager.favorite.room.a aVar) {
        return (com.planner5d.library.database.model.h) dagger.internal.p.f(iVar.E(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.model.h get() {
        return c(this.f142578a, this.f142579b.get());
    }
}
