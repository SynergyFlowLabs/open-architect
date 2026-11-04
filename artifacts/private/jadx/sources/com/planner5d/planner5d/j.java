package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<com.planner5d.library.database.migration.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f258960b;

    public j(b bVar, ij.c<com.planner5d.library.model.manager.config.p> cVar) {
        this.f258959a = bVar;
        this.f258960b = cVar;
    }

    public static j a(b bVar, ij.c<com.planner5d.library.model.manager.config.p> cVar) {
        return new j(bVar, cVar);
    }

    public static com.planner5d.library.database.migration.p c(b bVar, com.planner5d.library.model.manager.config.p pVar) {
        return (com.planner5d.library.database.migration.p) dagger.internal.p.f(bVar.i(pVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.migration.p get() {
        return c(this.f258959a, this.f258960b.get());
    }
}
