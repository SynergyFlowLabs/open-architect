package com.planner5d.library.widget.editor.catalog.drawer;

import com.planner5d.library.activity.helper.l0;
import com.planner5d.library.modules.user.user.t0;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.d> f254585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.catalog.g> f254586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<le.h> f254587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f254588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.unlockeditems.b> f254589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t0> f254590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<l0> f254591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f254592h;

    public s(ij.c<com.planner5d.library.model.manager.d> cVar, ij.c<com.planner5d.library.widget.editor.catalog.g> cVar2, ij.c<le.h> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar5, ij.c<t0> cVar6, ij.c<l0> cVar7, ij.c<com.planner5d.library.modules.user.user.t> cVar8) {
        this.f254585a = cVar;
        this.f254586b = cVar2;
        this.f254587c = cVar3;
        this.f254588d = cVar4;
        this.f254589e = cVar5;
        this.f254590f = cVar6;
        this.f254591g = cVar7;
        this.f254592h = cVar8;
    }

    public static s a(ij.c<com.planner5d.library.model.manager.d> cVar, ij.c<com.planner5d.library.widget.editor.catalog.g> cVar2, ij.c<le.h> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar5, ij.c<t0> cVar6, ij.c<l0> cVar7, ij.c<com.planner5d.library.modules.user.user.t> cVar8) {
        return new s(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static r c(com.planner5d.library.model.manager.d dVar, com.planner5d.library.widget.editor.catalog.g gVar, le.h hVar, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.model.manager.unlockeditems.b bVar, t0 t0Var, l0 l0Var, com.planner5d.library.modules.user.user.t tVar) {
        return new r(dVar, gVar, hVar, jVar, bVar, t0Var, l0Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f254585a.get(), this.f254586b.get(), this.f254587c.get(), this.f254588d.get(), this.f254589e.get(), this.f254590f.get(), this.f254591g.get(), this.f254592h.get());
    }
}
