package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z1 implements dagger.internal.h<m1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y1> f137248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f137249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f137250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.e0> f137251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f137252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<sd.e> f137253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.v> f137254g;

    public z1(ij.c<com.planner5d.library.model.manager.y1> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<com.planner5d.library.modules.user.user.e0> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<sd.e> cVar6, ij.c<com.planner5d.library.services.v> cVar7) {
        this.f137248a = cVar;
        this.f137249b = cVar2;
        this.f137250c = cVar3;
        this.f137251d = cVar4;
        this.f137252e = cVar5;
        this.f137253f = cVar6;
        this.f137254g = cVar7;
    }

    public static z1 a(ij.c<com.planner5d.library.model.manager.y1> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<com.planner5d.library.modules.user.user.e0> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<sd.e> cVar6, ij.c<com.planner5d.library.services.v> cVar7) {
        return new z1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static m1 c() {
        return new m1();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m1 get() {
        m1 m1VarC = c();
        a2.f(m1VarC, this.f137248a.get());
        a2.b(m1VarC, this.f137249b.get());
        a2.h(m1VarC, this.f137250c.get());
        a2.i(m1VarC, this.f137251d.get());
        a2.g(m1VarC, this.f137252e.get());
        a2.c(m1VarC, this.f137253f.get());
        a2.d(m1VarC, this.f137254g.get());
        return m1VarC;
    }
}
