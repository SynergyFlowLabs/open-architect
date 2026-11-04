package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q0> f223005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f223006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.r> f223007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f223008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t> f223010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<t0> f223011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.n> f223012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f223013i;

    public e(ij.c<q0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.initialization.r> cVar3, ij.c<com.planner5d.library.activity.fragment.x> cVar4, ij.c<com.planner5d.library.model.manager.config.p> cVar5, ij.c<t> cVar6, ij.c<t0> cVar7, ij.c<com.planner5d.library.activity.fragment.n> cVar8, ij.c<com.planner5d.library.services.utility.f1> cVar9) {
        this.f223005a = cVar;
        this.f223006b = cVar2;
        this.f223007c = cVar3;
        this.f223008d = cVar4;
        this.f223009e = cVar5;
        this.f223010f = cVar6;
        this.f223011g = cVar7;
        this.f223012h = cVar8;
        this.f223013i = cVar9;
    }

    public static e a(ij.c<q0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.initialization.r> cVar3, ij.c<com.planner5d.library.activity.fragment.x> cVar4, ij.c<com.planner5d.library.model.manager.config.p> cVar5, ij.c<t> cVar6, ij.c<t0> cVar7, ij.c<com.planner5d.library.activity.fragment.n> cVar8, ij.c<com.planner5d.library.services.utility.f1> cVar9) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static d c(fg.e<q0> eVar, fg.e<com.planner5d.library.activity.fragment.dialog.k> eVar2, com.planner5d.library.model.manager.initialization.r rVar, fg.e<com.planner5d.library.activity.fragment.x> eVar3, com.planner5d.library.model.manager.config.p pVar, fg.e<t> eVar4, fg.e<t0> eVar5, com.planner5d.library.activity.fragment.n nVar, com.planner5d.library.services.utility.f1 f1Var) {
        return new d(eVar, eVar2, rVar, eVar3, pVar, eVar4, eVar5, nVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(dagger.internal.g.a(this.f223005a), dagger.internal.g.a(this.f223006b), this.f223007c.get(), dagger.internal.g.a(this.f223008d), this.f223009e.get(), dagger.internal.g.a(this.f223010f), dagger.internal.g.a(this.f223011g), this.f223012h.get(), this.f223013i.get());
    }
}
