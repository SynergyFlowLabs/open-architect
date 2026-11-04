package com.planner5d.library.activity.tutorial;

import android.app.Application;
import com.planner5d.library.services.utility.z0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class r implements fg.g<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f141871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f141872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<z0> f141873c;

    public r(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<z0> cVar3) {
        this.f141871a = cVar;
        this.f141872b = cVar2;
        this.f141873c = cVar3;
    }

    public static fg.g<p> a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<z0> cVar3) {
        return new r(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.tutorial.TutorialManager.application")
    public static void b(p pVar, Application application) {
        pVar.f141864c = application;
    }

    @dagger.internal.j("com.planner5d.library.activity.tutorial.TutorialManager.formatter")
    public static void c(p pVar, z0 z0Var) {
        pVar.f141866e = z0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.tutorial.TutorialManager.preferences")
    public static void e(p pVar, com.planner5d.library.model.manager.config.p pVar2) {
        pVar.f141865d = pVar2;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(p pVar) {
        b(pVar, this.f141871a.get());
        e(pVar, this.f141872b.get());
        c(pVar, this.f141873c.get());
    }
}
