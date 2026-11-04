package com.planner5d.library.widget.editor.catalog;

import com.planner5d.library.modules.user.user.t0;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f254659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.d> f254660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.b> f254661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f254662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t0> f254663e;

    public h(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.model.manager.d> cVar2, ij.c<com.planner5d.library.model.manager.contest.b> cVar3, ij.c<com.planner5d.library.services.utility.t> cVar4, ij.c<t0> cVar5) {
        this.f254659a = cVar;
        this.f254660b = cVar2;
        this.f254661c = cVar3;
        this.f254662d = cVar4;
        this.f254663e = cVar5;
    }

    public static h a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.model.manager.d> cVar2, ij.c<com.planner5d.library.model.manager.contest.b> cVar3, ij.c<com.planner5d.library.services.utility.t> cVar4, ij.c<t0> cVar5) {
        return new h(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static g c(com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.model.manager.d dVar, com.planner5d.library.model.manager.contest.b bVar, com.planner5d.library.services.utility.t tVar, t0 t0Var) {
        return new g(iVar, dVar, bVar, tVar, t0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f254659a.get(), this.f254660b.get(), this.f254661c.get(), this.f254662d.get(), this.f254663e.get());
    }
}
