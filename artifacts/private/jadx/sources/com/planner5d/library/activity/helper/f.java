package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b> f136810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f136811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f136812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<m2> f136813d;

    public f(ij.c<com.planner5d.library.model.manager.b> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2, ij.c<com.planner5d.library.services.utility.f1> cVar3, ij.c<m2> cVar4) {
        this.f136810a = cVar;
        this.f136811b = cVar2;
        this.f136812c = cVar3;
        this.f136813d = cVar4;
    }

    public static f a(ij.c<com.planner5d.library.model.manager.b> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2, ij.c<com.planner5d.library.services.utility.f1> cVar3, ij.c<m2> cVar4) {
        return new f(cVar, cVar2, cVar3, cVar4);
    }

    public static e c(com.planner5d.library.model.manager.b bVar, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.services.utility.f1 f1Var, m2 m2Var) {
        return new e(bVar, xVar, f1Var, m2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f136810a.get(), this.f136811b.get(), this.f136812c.get(), this.f136813d.get());
    }
}
