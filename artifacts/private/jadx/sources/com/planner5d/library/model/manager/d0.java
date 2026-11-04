package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d0 implements dagger.internal.h<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f191251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f191252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f191253d;

    public d0(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.utility.p0> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<com.planner5d.library.services.utility.w> cVar4) {
        this.f191250a = cVar;
        this.f191251b = cVar2;
        this.f191252c = cVar3;
        this.f191253d = cVar4;
    }

    public static d0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.utility.p0> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<com.planner5d.library.services.utility.w> cVar4) {
        return new d0(cVar, cVar2, cVar3, cVar4);
    }

    public static c0 c(fg.e<com.planner5d.library.application.b> eVar, com.planner5d.library.services.utility.p0 p0Var, fg.e<com.planner5d.library.model.manager.synchronization.i> eVar2, com.planner5d.library.services.utility.w wVar) {
        return new c0(eVar, p0Var, eVar2, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(dagger.internal.g.a(this.f191250a), this.f191251b.get(), dagger.internal.g.a(this.f191252c), this.f191253d.get());
    }
}
