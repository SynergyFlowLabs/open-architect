package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q0> f222984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f222985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.r> f222986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f222987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f222988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t> f222989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<t0> f222990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.n> f222991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f222992i;

    public c(ij.c<q0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.initialization.r> cVar3, ij.c<com.planner5d.library.activity.fragment.x> cVar4, ij.c<com.planner5d.library.model.manager.config.p> cVar5, ij.c<t> cVar6, ij.c<t0> cVar7, ij.c<com.planner5d.library.activity.fragment.n> cVar8, ij.c<com.planner5d.library.services.utility.f1> cVar9) {
        this.f222984a = cVar;
        this.f222985b = cVar2;
        this.f222986c = cVar3;
        this.f222987d = cVar4;
        this.f222988e = cVar5;
        this.f222989f = cVar6;
        this.f222990g = cVar7;
        this.f222991h = cVar8;
        this.f222992i = cVar9;
    }

    public static c a(ij.c<q0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.initialization.r> cVar3, ij.c<com.planner5d.library.activity.fragment.x> cVar4, ij.c<com.planner5d.library.model.manager.config.p> cVar5, ij.c<t> cVar6, ij.c<t0> cVar7, ij.c<com.planner5d.library.activity.fragment.n> cVar8, ij.c<com.planner5d.library.services.utility.f1> cVar9) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static b c(fg.e<q0> eVar, fg.e<com.planner5d.library.activity.fragment.dialog.k> eVar2, com.planner5d.library.model.manager.initialization.r rVar, fg.e<com.planner5d.library.activity.fragment.x> eVar3, com.planner5d.library.model.manager.config.p pVar, fg.e<t> eVar4, fg.e<t0> eVar5, com.planner5d.library.activity.fragment.n nVar, com.planner5d.library.services.utility.f1 f1Var) {
        return new b(eVar, eVar2, rVar, eVar3, pVar, eVar4, eVar5, nVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(dagger.internal.g.a(this.f222984a), dagger.internal.g.a(this.f222985b), this.f222986c.get(), dagger.internal.g.a(this.f222987d), this.f222988e.get(), dagger.internal.g.a(this.f222989f), dagger.internal.g.a(this.f222990g), this.f222991h.get(), this.f222992i.get());
    }
}
