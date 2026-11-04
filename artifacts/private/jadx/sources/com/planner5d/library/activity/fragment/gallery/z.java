package com.planner5d.library.activity.fragment.gallery;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class z implements fg.g<GalleryPage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.q0> f133935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y0> f133936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f133937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f133938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c> f133939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<b2> f133940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<m> f133941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.a> f133942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<c2> f133943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<le.o> f133944j;

    public z(ij.c<com.planner5d.library.model.manager.q0> cVar, ij.c<y0> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<com.planner5d.library.application.d> cVar4, ij.c<c> cVar5, ij.c<b2> cVar6, ij.c<m> cVar7, ij.c<com.planner5d.library.model.manager.favorite.a> cVar8, ij.c<c2> cVar9, ij.c<le.o> cVar10) {
        this.f133935a = cVar;
        this.f133936b = cVar2;
        this.f133937c = cVar3;
        this.f133938d = cVar4;
        this.f133939e = cVar5;
        this.f133940f = cVar6;
        this.f133941g = cVar7;
        this.f133942h = cVar8;
        this.f133943i = cVar9;
        this.f133944j = cVar10;
    }

    public static fg.g<GalleryPage> a(ij.c<com.planner5d.library.model.manager.q0> cVar, ij.c<y0> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<com.planner5d.library.application.d> cVar4, ij.c<c> cVar5, ij.c<b2> cVar6, ij.c<m> cVar7, ij.c<com.planner5d.library.model.manager.favorite.a> cVar8, ij.c<c2> cVar9, ij.c<le.o> cVar10) {
        return new z(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.applicationConfiguration")
    public static void b(GalleryPage galleryPage, com.planner5d.library.application.d dVar) {
        galleryPage.f133688h = dVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.builtInDataManager")
    public static void c(GalleryPage galleryPage, com.planner5d.library.model.manager.builtin.i iVar) {
        galleryPage.f133687g = iVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.cache")
    public static void d(GalleryPage galleryPage, m mVar) {
        galleryPage.f133691k = mVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.favoritesRepository")
    public static void e(GalleryPage galleryPage, com.planner5d.library.model.manager.favorite.a aVar) {
        galleryPage.f133692l = aVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.filteringHelperForSortOrders")
    public static void f(GalleryPage galleryPage, c cVar) {
        galleryPage.f133689i = cVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.imageManager")
    public static void g(GalleryPage galleryPage, y0 y0Var) {
        galleryPage.f133686f = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.manager")
    public static void h(GalleryPage galleryPage, com.planner5d.library.model.manager.q0 q0Var) {
        galleryPage.f133685e = q0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.messageManager")
    public static void j(GalleryPage galleryPage, b2 b2Var) {
        galleryPage.f133690j = b2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.networkStateUtility")
    public static void k(GalleryPage galleryPage, c2 c2Var) {
        galleryPage.f133693m = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPage.toggleFavoriteUseCase")
    public static void l(GalleryPage galleryPage, le.o oVar) {
        galleryPage.f133694n = oVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void injectMembers(GalleryPage galleryPage) {
        h(galleryPage, this.f133935a.get());
        g(galleryPage, this.f133936b.get());
        c(galleryPage, this.f133937c.get());
        b(galleryPage, this.f133938d.get());
        f(galleryPage, this.f133939e.get());
        j(galleryPage, this.f133940f.get());
        d(galleryPage, this.f133941g.get());
        e(galleryPage, this.f133942h.get());
        k(galleryPage, this.f133943i.get());
        l(galleryPage, this.f133944j.get());
    }
}
