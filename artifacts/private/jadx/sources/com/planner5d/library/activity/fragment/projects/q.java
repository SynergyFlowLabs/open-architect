package com.planner5d.library.activity.fragment.projects;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<Project3D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.editor3d.t> f135084a;

    public q(ij.c<com.planner5d.library.widget.editor.editor3d.t> cVar) {
        this.f135084a = cVar;
    }

    public static fg.g<Project3D> a(ij.c<com.planner5d.library.widget.editor.editor3d.t> cVar) {
        return new q(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Project3D.controller")
    public static void b(Project3D project3D, com.planner5d.library.widget.editor.editor3d.t tVar) {
        project3D.controller = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Project3D project3D) {
        b(project3D, this.f135084a.get());
    }
}
