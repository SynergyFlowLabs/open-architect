package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f191767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f191768b;

    public j(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<t1> cVar2) {
        this.f191767a = cVar;
        this.f191768b = cVar2;
    }

    public static j a(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<t1> cVar2) {
        return new j(cVar, cVar2);
    }

    public static i c(com.planner5d.library.model.manager.config.p pVar, t1 t1Var) {
        return new i(pVar, t1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f191767a.get(), this.f191768b.get());
    }
}
