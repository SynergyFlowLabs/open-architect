package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w4 implements dagger.internal.h<v4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f222377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f222378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f222379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c1> f222380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f222381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f222382f;

    public w4(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<t1> cVar3, ij.c<c1> cVar4, ij.c<com.planner5d.library.api.requests.c> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6) {
        this.f222377a = cVar;
        this.f222378b = cVar2;
        this.f222379c = cVar3;
        this.f222380d = cVar4;
        this.f222381e = cVar5;
        this.f222382f = cVar6;
    }

    public static w4 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<t1> cVar3, ij.c<c1> cVar4, ij.c<com.planner5d.library.api.requests.c> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6) {
        return new w4(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static v4 c(com.planner5d.library.application.b bVar, fg.e<com.planner5d.library.model.manager.project.d0> eVar, fg.e<t1> eVar2, fg.e<c1> eVar3, com.planner5d.library.api.requests.c cVar, com.planner5d.library.modules.user.user.t tVar) {
        return new v4(bVar, eVar, eVar2, eVar3, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v4 get() {
        return c(this.f222377a.get(), dagger.internal.g.a(this.f222378b), dagger.internal.g.a(this.f222379c), dagger.internal.g.a(this.f222380d), this.f222381e.get(), this.f222382f.get());
    }
}
