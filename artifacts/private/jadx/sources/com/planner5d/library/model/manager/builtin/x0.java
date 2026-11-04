package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class x0 implements dagger.internal.h<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f181262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f181263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f181264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f181265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y0> f181266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<i> f181267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<n> f181268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a> f181269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a> f181270j;

    public x0(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<t1> cVar3, ij.c<c2> cVar4, ij.c<com.planner5d.library.services.z> cVar5, ij.c<com.planner5d.library.model.manager.y0> cVar6, ij.c<i> cVar7, ij.c<n> cVar8, ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a> cVar9, ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a> cVar10) {
        this.f181261a = cVar;
        this.f181262b = cVar2;
        this.f181263c = cVar3;
        this.f181264d = cVar4;
        this.f181265e = cVar5;
        this.f181266f = cVar6;
        this.f181267g = cVar7;
        this.f181268h = cVar8;
        this.f181269i = cVar9;
        this.f181270j = cVar10;
    }

    public static x0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<t1> cVar3, ij.c<c2> cVar4, ij.c<com.planner5d.library.services.z> cVar5, ij.c<com.planner5d.library.model.manager.y0> cVar6, ij.c<i> cVar7, ij.c<n> cVar8, ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a> cVar9, ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a> cVar10) {
        return new x0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static v0 c(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.config.p pVar, fg.e<t1> eVar, c2 c2Var, com.planner5d.library.services.z zVar, fg.e<com.planner5d.library.model.manager.y0> eVar2, fg.e<i> eVar3, fg.e<n> eVar4, com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a aVar, com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a aVar2) {
        return new v0(bVar, pVar, eVar, c2Var, zVar, eVar2, eVar3, eVar4, aVar, aVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f181261a.get(), this.f181262b.get(), dagger.internal.g.a(this.f181263c), this.f181264d.get(), this.f181265e.get(), dagger.internal.g.a(this.f181266f), dagger.internal.g.a(this.f181267g), dagger.internal.g.a(this.f181268h), this.f181269i.get(), this.f181270j.get());
    }
}
