package com.planner5d.library.activity.fragment.feed.interactor;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.q0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f133479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<q0> f133480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ka.c> f133481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ka.b> f133482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.usecase.b> f133483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<p> f133484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.p> f133485g;

    public d(ij.c<com.planner5d.library.application.b> cVar, ij.c<q0> cVar2, ij.c<ka.c> cVar3, ij.c<ka.b> cVar4, ij.c<com.planner5d.library.feed.usecase.b> cVar5, ij.c<p> cVar6, ij.c<com.planner5d.library.model.manager.p> cVar7) {
        this.f133479a = cVar;
        this.f133480b = cVar2;
        this.f133481c = cVar3;
        this.f133482d = cVar4;
        this.f133483e = cVar5;
        this.f133484f = cVar6;
        this.f133485g = cVar7;
    }

    public static d a(ij.c<com.planner5d.library.application.b> cVar, ij.c<q0> cVar2, ij.c<ka.c> cVar3, ij.c<ka.b> cVar4, ij.c<com.planner5d.library.feed.usecase.b> cVar5, ij.c<p> cVar6, ij.c<com.planner5d.library.model.manager.p> cVar7) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static c c(com.planner5d.library.application.b bVar, q0 q0Var, ka.c cVar, ka.b bVar2, com.planner5d.library.feed.usecase.b bVar3, p pVar, com.planner5d.library.model.manager.p pVar2) {
        return new c(bVar, q0Var, cVar, bVar2, bVar3, pVar, pVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f133479a.get(), this.f133480b.get(), this.f133481c.get(), this.f133482d.get(), this.f133483e.get(), this.f133484f.get(), this.f133485g.get());
    }
}
