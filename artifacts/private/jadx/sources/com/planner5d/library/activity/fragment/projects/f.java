package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class f implements fg.g<Editor3dFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f134992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.editor3d.l> f134993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.s> f134994c;

    public f(ij.c<c2> cVar, ij.c<com.planner5d.library.widget.editor.editor3d.l> cVar2, ij.c<com.planner5d.library.widget.editor.facade.s> cVar3) {
        this.f134992a = cVar;
        this.f134993b = cVar2;
        this.f134994c = cVar3;
    }

    public static fg.g<Editor3dFragment> a(ij.c<c2> cVar, ij.c<com.planner5d.library.widget.editor.editor3d.l> cVar2, ij.c<com.planner5d.library.widget.editor.facade.s> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Editor3dFragment.editor")
    public static void b(Editor3dFragment editor3dFragment, com.planner5d.library.widget.editor.editor3d.l lVar) {
        editor3dFragment.f134900f = lVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Editor3dFragment.editorFacadeFactory")
    public static void c(Editor3dFragment editor3dFragment, com.planner5d.library.widget.editor.facade.s sVar) {
        editor3dFragment.editorFacadeFactory = sVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.projects.Editor3dFragment.messageManager")
    public static void e(Editor3dFragment editor3dFragment, c2 c2Var) {
        editor3dFragment.f134899e = c2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Editor3dFragment editor3dFragment) {
        e(editor3dFragment, this.f134992a.get());
        b(editor3dFragment, this.f134993b.get());
        c(editor3dFragment, this.f134994c.get());
    }
}
