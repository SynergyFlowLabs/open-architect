package com.planner5d.library.model.manager.initialization;

import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.y0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c0 implements dagger.internal.h<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f191601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y0> f191602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f191603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c1> f191604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f191605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.crashreporting.l> f191606g;

    public c0(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<y0> cVar3, ij.c<com.planner5d.library.model.manager.builtin.i> cVar4, ij.c<c1> cVar5, ij.c<com.planner5d.library.model.manager.config.j> cVar6, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar7) {
        this.f191600a = cVar;
        this.f191601b = cVar2;
        this.f191602c = cVar3;
        this.f191603d = cVar4;
        this.f191604e = cVar5;
        this.f191605f = cVar6;
        this.f191606g = cVar7;
    }

    public static c0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<y0> cVar3, ij.c<com.planner5d.library.model.manager.builtin.i> cVar4, ij.c<c1> cVar5, ij.c<com.planner5d.library.model.manager.config.j> cVar6, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar7) {
        return new c0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static b0 c(com.planner5d.library.application.b bVar, fg.e<com.planner5d.library.model.manager.config.p> eVar, fg.e<y0> eVar2, fg.e<com.planner5d.library.model.manager.builtin.i> eVar3, fg.e<c1> eVar4, fg.e<com.planner5d.library.model.manager.config.j> eVar5, fg.e<com.planner5d.library.model.manager.crashreporting.l> eVar6) {
        return new b0(bVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f191600a.get(), dagger.internal.g.a(this.f191601b), dagger.internal.g.a(this.f191602c), dagger.internal.g.a(this.f191603d), dagger.internal.g.a(this.f191604e), dagger.internal.g.a(this.f191605f), dagger.internal.g.a(this.f191606g));
    }
}
