package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class r0 implements dagger.internal.h<com.planner5d.library.model.manager.i2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.n> f148248b;

    public r0(i iVar, ij.c<com.planner5d.library.activity.fragment.n> cVar) {
        this.f148247a = iVar;
        this.f148248b = cVar;
    }

    public static r0 a(i iVar, ij.c<com.planner5d.library.activity.fragment.n> cVar) {
        return new r0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.i2 c(i iVar, com.planner5d.library.activity.fragment.n nVar) {
        return (com.planner5d.library.model.manager.i2) dagger.internal.p.f(iVar.M(nVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.i2 get() {
        return c(this.f148247a, this.f148248b.get());
    }
}
