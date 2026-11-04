package com.planner5d.library.widget.editor.catalog.drawer;

import com.planner5d.library.services.utility.w;
import com.planner5d.library.widget.editor.catalog.v;
import com.planner5d.library.widget.editor.helper.a2;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
public final class t implements fg.g<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a2> f254593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ia.b> f254594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f254595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<v.c> f254596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<r> f254597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f254598f;

    public t(ij.c<a2> cVar, ij.c<ia.b> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3, ij.c<v.c> cVar4, ij.c<r> cVar5, ij.c<w> cVar6) {
        this.f254593a = cVar;
        this.f254594b = cVar2;
        this.f254595c = cVar3;
        this.f254596d = cVar4;
        this.f254597e = cVar5;
        this.f254598f = cVar6;
    }

    public static fg.g<p> a(ij.c<a2> cVar, ij.c<ia.b> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3, ij.c<v.c> cVar4, ij.c<r> cVar5, ij.c<w> cVar6) {
        return new t(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawer.catalogSearchFactory")
    public static void b(p pVar, v.c cVar) {
        pVar.f254469d = cVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawer.coroutineExecutor")
    public static void c(p pVar, w wVar) {
        pVar.f254471f = wVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawer.dialogLauncher")
    public static void d(p pVar, com.planner5d.library.activity.fragment.dialog.k kVar) {
        pVar.f254468c = kVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawer.helperEditorDragItem")
    public static void e(p pVar, a2 a2Var) {
        pVar.f254466a = a2Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawer.paywallStrategy")
    public static void g(p pVar, ia.b bVar) {
        pVar.f254467b = bVar;
    }

    @dagger.internal.j("com.planner5d.library.widget.editor.catalog.drawer.CatalogDrawer.viewModel")
    public static void h(p pVar, r rVar) {
        pVar.f254470e = rVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void injectMembers(p pVar) {
        e(pVar, this.f254593a.get());
        g(pVar, this.f254594b.get());
        d(pVar, this.f254595c.get());
        b(pVar, this.f254596d.get());
        h(pVar, this.f254597e.get());
        c(pVar, this.f254598f.get());
    }
}
