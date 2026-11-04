package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f4 implements dagger.internal.h<d4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b4> f191348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.render.a> f191350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f191351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<w> f191352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f191353f;

    public f4(ij.c<b4> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.services.render.a> cVar3, ij.c<com.planner5d.library.model.manager.config.p> cVar4, ij.c<w> cVar5, ij.c<com.planner5d.library.services.utility.f1> cVar6) {
        this.f191348a = cVar;
        this.f191349b = cVar2;
        this.f191350c = cVar3;
        this.f191351d = cVar4;
        this.f191352e = cVar5;
        this.f191353f = cVar6;
    }

    public static f4 a(ij.c<b4> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.services.render.a> cVar3, ij.c<com.planner5d.library.model.manager.config.p> cVar4, ij.c<w> cVar5, ij.c<com.planner5d.library.services.utility.f1> cVar6) {
        return new f4(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static d4 c(fg.e<b4> eVar, fg.e<com.planner5d.library.modules.user.user.t> eVar2, com.planner5d.library.services.render.a aVar, com.planner5d.library.model.manager.config.p pVar, w wVar, com.planner5d.library.services.utility.f1 f1Var) {
        return new d4(eVar, eVar2, aVar, pVar, wVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d4 get() {
        return c(dagger.internal.g.a(this.f191348a), dagger.internal.g.a(this.f191349b), this.f191350c.get(), this.f191351d.get(), this.f191352e.get(), this.f191353f.get());
    }
}
