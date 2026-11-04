package com.planner5d.library.activity.fragment.projects;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o0 implements dagger.internal.h<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f135078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.b> f135079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<sd.e> f135080c;

    public o0(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<com.planner5d.library.model.manager.spaces.b> cVar2, ij.c<sd.e> cVar3) {
        this.f135078a = cVar;
        this.f135079b = cVar2;
        this.f135080c = cVar3;
    }

    public static o0 a(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<com.planner5d.library.model.manager.spaces.b> cVar2, ij.c<sd.e> cVar3) {
        return new o0(cVar, cVar2, cVar3);
    }

    public static n0 c(com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.model.manager.spaces.b bVar, sd.e eVar) {
        return new n0(jVar, bVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f135078a.get(), this.f135079b.get(), this.f135080c.get());
    }
}
