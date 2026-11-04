package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.b2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class i0 implements fg.g<ProjectsPagesFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<sd.e> f135024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f135025b;

    public i0(ij.c<sd.e> cVar, ij.c<b2> cVar2) {
        this.f135024a = cVar;
        this.f135025b = cVar2;
    }

    public static fg.g<ProjectsPagesFragment> a(ij.c<sd.e> cVar, ij.c<b2> cVar2) {
        return new i0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment.firebaseInAppMessageTrigger")
    public static void b(ProjectsPagesFragment projectsPagesFragment, sd.e eVar) {
        projectsPagesFragment.firebaseInAppMessageTrigger = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment.messageManager")
    public static void d(ProjectsPagesFragment projectsPagesFragment, b2 b2Var) {
        projectsPagesFragment.messageManager = b2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ProjectsPagesFragment projectsPagesFragment) {
        b(projectsPagesFragment, this.f135024a.get());
        d(projectsPagesFragment, this.f135025b.get());
    }
}
