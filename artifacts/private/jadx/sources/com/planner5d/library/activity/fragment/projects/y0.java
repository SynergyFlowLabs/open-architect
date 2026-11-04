package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class y0 implements fg.g<Projects> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f135168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.list.d0> f135169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y1> f135170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f135171d;

    public y0(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<com.planner5d.library.activity.fragment.list.d0> cVar2, ij.c<y1> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4) {
        this.f135168a = cVar;
        this.f135169b = cVar2;
        this.f135170c = cVar3;
        this.f135171d = cVar4;
    }

    public static fg.g<Projects> a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar, ij.c<com.planner5d.library.activity.fragment.list.d0> cVar2, ij.c<y1> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4) {
        return new y0(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Projects.actionsObserve")
    public static void b(Projects projects, com.planner5d.library.activity.fragment.list.d0 d0Var) {
        projects.actionsObserve = d0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Projects.configManager")
    public static void c(Projects projects, com.planner5d.library.model.manager.config.d dVar) {
        projects.configManager = dVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Projects.dialogLauncher")
    public static void d(Projects projects, com.planner5d.library.activity.fragment.dialog.k kVar) {
        projects.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Projects.menuManager")
    public static void f(Projects projects, y1 y1Var) {
        projects.menuManager = y1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Projects projects) {
        d(projects, this.f135168a.get());
        b(projects, this.f135169b.get());
        f(projects, this.f135170c.get());
        c(projects, this.f135171d.get());
    }
}
