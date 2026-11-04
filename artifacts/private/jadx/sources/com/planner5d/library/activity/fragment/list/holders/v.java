package com.planner5d.library.activity.fragment.list.holders;

import com.planner5d.library.model.manager.b4;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f134205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b4> f134206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f134207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f134208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<f1> f134209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f134210f;

    public v(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<b4> cVar2, ij.c<com.planner5d.library.services.utility.p0> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4, ij.c<f1> cVar5, ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar6) {
        this.f134205a = cVar;
        this.f134206b = cVar2;
        this.f134207c = cVar3;
        this.f134208d = cVar4;
        this.f134209e = cVar5;
        this.f134210f = cVar6;
    }

    public static v a(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<b4> cVar2, ij.c<com.planner5d.library.services.utility.p0> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4, ij.c<f1> cVar5, ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar6) {
        return new v(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static u c(com.planner5d.library.model.manager.project.d0 d0Var, b4 b4Var, com.planner5d.library.services.utility.p0 p0Var, fg.e<com.planner5d.library.model.manager.config.j> eVar, f1 f1Var, com.planner5d.library.model.manager.spaces.documents.c cVar) {
        return new u(d0Var, b4Var, p0Var, eVar, f1Var, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f134205a.get(), this.f134206b.get(), this.f134207c.get(), dagger.internal.g.a(this.f134208d), this.f134209e.get(), this.f134210f.get());
    }
}
