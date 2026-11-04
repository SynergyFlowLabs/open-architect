package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class f0 implements dagger.internal.h<com.planner5d.library.model.manager.e1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c1> f142535b;

    public f0(i iVar, ij.c<com.planner5d.library.model.manager.c1> cVar) {
        this.f142534a = iVar;
        this.f142535b = cVar;
    }

    public static f0 a(i iVar, ij.c<com.planner5d.library.model.manager.c1> cVar) {
        return new f0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.e1 c(i iVar, com.planner5d.library.model.manager.c1 c1Var) {
        return (com.planner5d.library.model.manager.e1) dagger.internal.p.f(iVar.A(c1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.e1 get() {
        return c(this.f142534a, this.f142535b.get());
    }
}
