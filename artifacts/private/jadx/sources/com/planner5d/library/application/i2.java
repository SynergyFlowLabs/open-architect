package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i2 implements dagger.internal.h<com.planner5d.library.model.manager.q4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.p4> f142572b;

    public i2(i iVar, ij.c<com.planner5d.library.model.manager.p4> cVar) {
        this.f142571a = iVar;
        this.f142572b = cVar;
    }

    public static i2 a(i iVar, ij.c<com.planner5d.library.model.manager.p4> cVar) {
        return new i2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.q4 c(i iVar, com.planner5d.library.model.manager.p4 p4Var) {
        return (com.planner5d.library.model.manager.q4) dagger.internal.p.f(iVar.F0(p4Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.q4 get() {
        return c(this.f142571a, this.f142572b.get());
    }
}
