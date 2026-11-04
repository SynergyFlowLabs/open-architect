package com.planner5d.library.model.manager.crashreporting;

import com.planner5d.library.model.manager.c1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e0 implements dagger.internal.h<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f191180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c1> f191181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.performancetracing.e> f191183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<ad.b> f191184f;

    public e0(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<c1> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.model.manager.performancetracing.e> cVar5, ij.c<ad.b> cVar6) {
        this.f191179a = cVar;
        this.f191180b = cVar2;
        this.f191181c = cVar3;
        this.f191182d = cVar4;
        this.f191183e = cVar5;
        this.f191184f = cVar6;
    }

    public static e0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<c1> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.model.manager.performancetracing.e> cVar5, ij.c<ad.b> cVar6) {
        return new e0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static d0 c(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.builtin.i iVar, fg.e<c1> eVar, fg.e<com.planner5d.library.modules.user.user.t> eVar2, com.planner5d.library.model.manager.performancetracing.e eVar3, ad.b bVar2) {
        return new d0(bVar, iVar, eVar, eVar2, eVar3, bVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0 get() {
        return c(this.f191179a.get(), this.f191180b.get(), dagger.internal.g.a(this.f191181c), dagger.internal.g.a(this.f191182d), this.f191183e.get(), this.f191184f.get());
    }
}
