package com.planner5d.library.model.manager.managedfiles;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.l> f191983a;

    public e(ij.c<com.planner5d.library.model.manager.l> cVar) {
        this.f191983a = cVar;
    }

    public static e a(ij.c<com.planner5d.library.model.manager.l> cVar) {
        return new e(cVar);
    }

    public static d c(com.planner5d.library.model.manager.l lVar) {
        return new d(lVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f191983a.get());
    }
}
