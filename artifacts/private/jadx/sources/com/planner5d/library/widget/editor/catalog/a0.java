package com.planner5d.library.widget.editor.catalog;

import com.planner5d.library.widget.editor.helper.a2;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
public final class a0 implements fg.g<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a2> f254357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f254358b;

    public a0(ij.c<a2> cVar, ij.c<com.planner5d.library.services.utility.w> cVar2) {
        this.f254357a = cVar;
        this.f254358b = cVar2;
    }

    public static fg.g<z> a(ij.c<a2> cVar, ij.c<com.planner5d.library.services.utility.w> cVar2) {
        return new a0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.CatalogSearchResultsView.coroutineExecutor")
    public static void b(z zVar, com.planner5d.library.services.utility.w wVar) {
        zVar.f254712b5 = wVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.CatalogSearchResultsView.helperEditorDragItem")
    public static void c(z zVar, a2 a2Var) {
        zVar.f254711a5 = a2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(z zVar) {
        c(zVar, this.f254357a.get());
        b(zVar, this.f254358b.get());
    }
}
