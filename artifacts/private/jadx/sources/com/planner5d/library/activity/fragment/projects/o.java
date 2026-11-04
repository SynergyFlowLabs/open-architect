package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.b5;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.editor.helper.g1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class o implements fg.g<Project2D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<g1> f135075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<a2> f135076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b5> f135077c;

    public o(ij.c<g1> cVar, ij.c<a2> cVar2, ij.c<b5> cVar3) {
        this.f135075a = cVar;
        this.f135076b = cVar2;
        this.f135077c = cVar3;
    }

    public static fg.g<Project2D> a(ij.c<g1> cVar, ij.c<a2> cVar2, ij.c<b5> cVar3) {
        return new o(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Project2D.helper")
    public static void b(Project2D project2D, g1 g1Var) {
        project2D.helper = g1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Project2D.helperEditorDragItem")
    public static void c(Project2D project2D, a2 a2Var) {
        project2D.helperEditorDragItem = a2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Project2D.surveyManager")
    public static void e(Project2D project2D, b5 b5Var) {
        project2D.surveyManager = b5Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Project2D project2D) {
        b(project2D, this.f135075a.get());
        c(project2D, this.f135076b.get());
        e(project2D, this.f135077c.get());
    }
}
