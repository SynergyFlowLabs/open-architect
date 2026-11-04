package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class u2 implements dagger.internal.h<com.planner5d.library.model.manager.p5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.m2> f148287b;

    public u2(i iVar, ij.c<com.planner5d.library.activity.helper.m2> cVar) {
        this.f148286a = iVar;
        this.f148287b = cVar;
    }

    public static u2 a(i iVar, ij.c<com.planner5d.library.activity.helper.m2> cVar) {
        return new u2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.p5 c(i iVar, com.planner5d.library.activity.helper.m2 m2Var) {
        return (com.planner5d.library.model.manager.p5) dagger.internal.p.f(iVar.T0(m2Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.p5 get() {
        return c(this.f148286a, this.f148287b.get());
    }
}
