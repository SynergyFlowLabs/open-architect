package com.planner5d.library.activity.fragment.dialog;

import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.editor.helper.n3;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class h0 implements fg.g<ProjectConflict> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.m0> f132065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n3> f132066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f132067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<p0> f132068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f132069e;

    public h0(ij.c<com.planner5d.library.model.manager.project.m0> cVar, ij.c<n3> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<p0> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        this.f132065a = cVar;
        this.f132066b = cVar2;
        this.f132067c = cVar3;
        this.f132068d = cVar4;
        this.f132069e = cVar5;
    }

    public static fg.g<ProjectConflict> a(ij.c<com.planner5d.library.model.manager.project.m0> cVar, ij.c<n3> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<p0> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        return new h0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.ProjectConflict.formatter")
    public static void b(ProjectConflict projectConflict, p0 p0Var) {
        projectConflict.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.ProjectConflict.helperProjectPersistence")
    public static void c(ProjectConflict projectConflict, n3 n3Var) {
        projectConflict.helperProjectPersistence = n3Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.ProjectConflict.projectRevisionManager")
    public static void e(ProjectConflict projectConflict, com.planner5d.library.model.manager.project.m0 m0Var) {
        projectConflict.projectRevisionManager = m0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.ProjectConflict.synchronizationManager")
    public static void f(ProjectConflict projectConflict, com.planner5d.library.model.manager.synchronization.i iVar) {
        projectConflict.synchronizationManager = iVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.ProjectConflict.userAuthorization")
    public static void g(ProjectConflict projectConflict, com.planner5d.library.modules.user.user.t tVar) {
        projectConflict.userAuthorization = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ProjectConflict projectConflict) {
        e(projectConflict, this.f132065a.get());
        c(projectConflict, this.f132066b.get());
        f(projectConflict, this.f132067c.get());
        b(projectConflict, this.f132068d.get());
        g(projectConflict, this.f132069e.get());
    }
}
