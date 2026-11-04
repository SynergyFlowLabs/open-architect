package com.planner5d.library.activity.fragment.startup;

import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class t implements fg.g<StartupPaywall> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y1> f136530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f136531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ia.b> f136532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f136533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.n> f136534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f136535f;

    public t(ij.c<y1> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<ia.b> cVar3, ij.c<f1> cVar4, ij.c<com.planner5d.library.activity.fragment.n> cVar5, ij.c<com.planner5d.library.model.manager.config.j> cVar6) {
        this.f136530a = cVar;
        this.f136531b = cVar2;
        this.f136532c = cVar3;
        this.f136533d = cVar4;
        this.f136534e = cVar5;
        this.f136535f = cVar6;
    }

    public static fg.g<StartupPaywall> a(ij.c<y1> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<ia.b> cVar3, ij.c<f1> cVar4, ij.c<com.planner5d.library.activity.fragment.n> cVar5, ij.c<com.planner5d.library.model.manager.config.j> cVar6) {
        return new t(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupPaywall.coroutineScope")
    public static void b(StartupPaywall startupPaywall, f1 f1Var) {
        startupPaywall.coroutineScope = f1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupPaywall.defaultFragmentProvider")
    public static void c(StartupPaywall startupPaywall, com.planner5d.library.activity.fragment.n nVar) {
        startupPaywall.defaultFragmentProvider = nVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupPaywall.featureConfigManager")
    public static void d(StartupPaywall startupPaywall, com.planner5d.library.model.manager.config.j jVar) {
        startupPaywall.featureConfigManager = jVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupPaywall.menuManager")
    public static void f(StartupPaywall startupPaywall, y1 y1Var) {
        startupPaywall.menuManager = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupPaywall.paywallStrategy")
    public static void g(StartupPaywall startupPaywall, ia.b bVar) {
        startupPaywall.paywallStrategy = bVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.startup.StartupPaywall.preferences")
    public static void h(StartupPaywall startupPaywall, com.planner5d.library.model.manager.config.p pVar) {
        startupPaywall.preferences = pVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(StartupPaywall startupPaywall) {
        f(startupPaywall, this.f136530a.get());
        h(startupPaywall, this.f136531b.get());
        g(startupPaywall, this.f136532c.get());
        b(startupPaywall, this.f136533d.get());
        c(startupPaywall, this.f136534e.get());
        d(startupPaywall, this.f136535f.get());
    }
}
