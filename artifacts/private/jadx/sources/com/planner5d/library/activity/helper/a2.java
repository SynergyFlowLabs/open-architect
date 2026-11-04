package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class a2 implements fg.g<m1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y1> f136680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f136681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.e0> f136683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f136684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<sd.e> f136685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.v> f136686g;

    public a2(ij.c<com.planner5d.library.model.manager.y1> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<com.planner5d.library.modules.user.user.e0> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<sd.e> cVar6, ij.c<com.planner5d.library.services.v> cVar7) {
        this.f136680a = cVar;
        this.f136681b = cVar2;
        this.f136682c = cVar3;
        this.f136683d = cVar4;
        this.f136684e = cVar5;
        this.f136685f = cVar6;
        this.f136686g = cVar7;
    }

    public static fg.g<m1> a(ij.c<com.planner5d.library.model.manager.y1> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<com.planner5d.library.modules.user.user.e0> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<sd.e> cVar6, ij.c<com.planner5d.library.services.v> cVar7) {
        return new a2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.dialogLauncher")
    public static void b(m1 m1Var, com.planner5d.library.activity.fragment.dialog.k kVar) {
        m1Var.f137038b = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.firebaseInAppMessageTrigger")
    public static void c(m1 m1Var, sd.e eVar) {
        m1Var.f137042f = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.mainComponentsProvider")
    public static void d(m1 m1Var, com.planner5d.library.services.v vVar) {
        m1Var.f137043g = vVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.menuManager")
    public static void f(m1 m1Var, com.planner5d.library.model.manager.y1 y1Var) {
        m1Var.f137037a = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.navigator")
    public static void g(m1 m1Var, com.planner5d.library.activity.fragment.x xVar) {
        m1Var.f137041e = xVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.userAuthorization")
    public static void h(m1 m1Var, com.planner5d.library.modules.user.user.t tVar) {
        m1Var.f137039c = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperUI.userMessages")
    public static void i(m1 m1Var, com.planner5d.library.modules.user.user.e0 e0Var) {
        m1Var.f137040d = e0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(m1 m1Var) {
        f(m1Var, this.f136680a.get());
        b(m1Var, this.f136681b.get());
        h(m1Var, this.f136682c.get());
        i(m1Var, this.f136683d.get());
        g(m1Var, this.f136684e.get());
        c(m1Var, this.f136685f.get());
        d(m1Var, this.f136686g.get());
    }
}
