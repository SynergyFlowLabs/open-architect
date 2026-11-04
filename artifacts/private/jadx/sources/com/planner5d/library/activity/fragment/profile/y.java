package com.planner5d.library.activity.fragment.profile;

import com.planner5d.library.model.manager.s4;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.modules.user.user.z;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y implements dagger.internal.h<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<s4> f134892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.menu.a> f134893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f134894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<z> f134895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t0> f134896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f134897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f134898g;

    public y(ij.c<s4> cVar, ij.c<com.planner5d.library.model.manager.menu.a> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<z> cVar4, ij.c<t0> cVar5, ij.c<com.planner5d.library.application.d> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7) {
        this.f134892a = cVar;
        this.f134893b = cVar2;
        this.f134894c = cVar3;
        this.f134895d = cVar4;
        this.f134896e = cVar5;
        this.f134897f = cVar6;
        this.f134898g = cVar7;
    }

    public static y a(ij.c<s4> cVar, ij.c<com.planner5d.library.model.manager.menu.a> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<z> cVar4, ij.c<t0> cVar5, ij.c<com.planner5d.library.application.d> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7) {
        return new y(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static x c(s4 s4Var, com.planner5d.library.model.manager.menu.a aVar, com.planner5d.library.modules.user.user.t tVar, z zVar, t0 t0Var, com.planner5d.library.application.d dVar, fg.e<com.planner5d.library.model.manager.config.j> eVar) {
        return new x(s4Var, aVar, tVar, zVar, t0Var, dVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f134892a.get(), this.f134893b.get(), this.f134894c.get(), this.f134895d.get(), this.f134896e.get(), this.f134897f.get(), dagger.internal.g.a(this.f134898g));
    }
}
