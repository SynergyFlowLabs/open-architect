package com.planner5d.library.activity.fragment.dialog.titleedit;

import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.f1;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class b implements g<ProjectRename> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d0> f133078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f133079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f133080c;

    public b(ij.c<d0> cVar, ij.c<t> cVar2, ij.c<f1> cVar3) {
        this.f133078a = cVar;
        this.f133079b = cVar2;
        this.f133080c = cVar3;
    }

    public static g<ProjectRename> a(ij.c<d0> cVar, ij.c<t> cVar2, ij.c<f1> cVar3) {
        return new b(cVar, cVar2, cVar3);
    }

    @j("com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename.coroutineScope")
    public static void b(ProjectRename projectRename, f1 f1Var) {
        projectRename.coroutineScope = f1Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename.projectManager")
    public static void d(ProjectRename projectRename, d0 d0Var) {
        projectRename.projectManager = d0Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename.userAuthorization")
    public static void e(ProjectRename projectRename, t tVar) {
        projectRename.userAuthorization = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ProjectRename projectRename) {
        d(projectRename, this.f133078a.get());
        e(projectRename, this.f133079b.get());
        b(projectRename, this.f133080c.get());
    }
}
