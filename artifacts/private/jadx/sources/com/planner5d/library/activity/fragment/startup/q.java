package com.planner5d.library.activity.fragment.startup;

import com.planner5d.library.model.manager.m2;
import com.planner5d.library.services.o0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<StartupFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f136504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.p> f136505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.t> f136506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<o0> f136507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<m2> f136508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<e> f136509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.rate.g> f136510g;

    public q(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<com.planner5d.library.services.p> cVar2, ij.c<com.planner5d.library.services.t> cVar3, ij.c<o0> cVar4, ij.c<m2> cVar5, ij.c<e> cVar6, ij.c<com.planner5d.library.widget.rate.g> cVar7) {
        this.f136504a = cVar;
        this.f136505b = cVar2;
        this.f136506c = cVar3;
        this.f136507d = cVar4;
        this.f136508e = cVar5;
        this.f136509f = cVar6;
        this.f136510g = cVar7;
    }

    public static fg.g<StartupFragment> a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<com.planner5d.library.services.p> cVar2, ij.c<com.planner5d.library.services.t> cVar3, ij.c<o0> cVar4, ij.c<m2> cVar5, ij.c<e> cVar6, ij.c<com.planner5d.library.widget.rate.g> cVar7) {
        return new q(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.dialogLauncher")
    public static void b(StartupFragment startupFragment, com.planner5d.library.activity.fragment.dialog.k kVar) {
        startupFragment.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.helpDialogFactory")
    public static void c(StartupFragment startupFragment, com.planner5d.library.services.p pVar) {
        startupFragment.helpDialogFactory = pVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.legalDialogFactory")
    public static void d(StartupFragment startupFragment, com.planner5d.library.services.t tVar) {
        startupFragment.legalDialogFactory = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.notificationPermissionManager")
    public static void f(StartupFragment startupFragment, m2 m2Var) {
        startupFragment.notificationPermissionManager = m2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.oneLinkDeeplinkHandler")
    public static void g(StartupFragment startupFragment, e eVar) {
        startupFragment.oneLinkDeeplinkHandler = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.rateUsManager")
    public static void h(StartupFragment startupFragment, com.planner5d.library.widget.rate.g gVar) {
        startupFragment.rateUsManager = gVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupFragment.spacesDialogFactory")
    public static void i(StartupFragment startupFragment, o0 o0Var) {
        startupFragment.spacesDialogFactory = o0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(StartupFragment startupFragment) {
        b(startupFragment, this.f136504a.get());
        c(startupFragment, this.f136505b.get());
        d(startupFragment, this.f136506c.get());
        i(startupFragment, this.f136507d.get());
        f(startupFragment, this.f136508e.get());
        g(startupFragment, this.f136509f.get());
        h(startupFragment, this.f136510g.get());
    }
}
