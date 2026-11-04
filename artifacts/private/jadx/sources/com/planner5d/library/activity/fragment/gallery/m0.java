package com.planner5d.library.activity.fragment.gallery;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class m0 implements fg.g<GalleryPager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.q0> f133806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y0> f133807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y1> f133808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.i> f133809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f133810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<le.o> f133811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<p0> f133812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<b2> f133813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<m> f133814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f133815j;

    public m0(ij.c<com.planner5d.library.model.manager.q0> cVar, ij.c<y0> cVar2, ij.c<y1> cVar3, ij.c<com.planner5d.library.model.i> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<le.o> cVar6, ij.c<p0> cVar7, ij.c<b2> cVar8, ij.c<m> cVar9, ij.c<com.planner5d.library.services.utility.w> cVar10) {
        this.f133806a = cVar;
        this.f133807b = cVar2;
        this.f133808c = cVar3;
        this.f133809d = cVar4;
        this.f133810e = cVar5;
        this.f133811f = cVar6;
        this.f133812g = cVar7;
        this.f133813h = cVar8;
        this.f133814i = cVar9;
        this.f133815j = cVar10;
    }

    public static fg.g<GalleryPager> a(ij.c<com.planner5d.library.model.manager.q0> cVar, ij.c<y0> cVar2, ij.c<y1> cVar3, ij.c<com.planner5d.library.model.i> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<le.o> cVar6, ij.c<p0> cVar7, ij.c<b2> cVar8, ij.c<m> cVar9, ij.c<com.planner5d.library.services.utility.w> cVar10) {
        return new m0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.cache")
    public static void b(GalleryPager galleryPager, m mVar) {
        galleryPager.f133718m = mVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.coroutineExecutor")
    public static void c(GalleryPager galleryPager, com.planner5d.library.services.utility.w wVar) {
        galleryPager.f133719n = wVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.galleryRecordFactory")
    public static void d(GalleryPager galleryPager, com.planner5d.library.model.i iVar) {
        galleryPager.f133713h = iVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.imageManager")
    public static void e(GalleryPager galleryPager, y0 y0Var) {
        galleryPager.f133711f = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.manager")
    public static void f(GalleryPager galleryPager, com.planner5d.library.model.manager.q0 q0Var) {
        galleryPager.f133710e = q0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.menuManager")
    public static void h(GalleryPager galleryPager, y1 y1Var) {
        galleryPager.f133712g = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.messageManager")
    public static void i(GalleryPager galleryPager, b2 b2Var) {
        galleryPager.f133717l = b2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.saveGalleryItemOnClickListener")
    public static void j(GalleryPager galleryPager, p0 p0Var) {
        galleryPager.f133716k = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.toggleFavoriteUseCase")
    public static void k(GalleryPager galleryPager, le.o oVar) {
        galleryPager.f133715j = oVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.GalleryPager.userAuthorization")
    public static void l(GalleryPager galleryPager, com.planner5d.library.modules.user.user.t tVar) {
        galleryPager.f133714i = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(GalleryPager galleryPager) {
        f(galleryPager, this.f133806a.get());
        e(galleryPager, this.f133807b.get());
        h(galleryPager, this.f133808c.get());
        d(galleryPager, this.f133809d.get());
        l(galleryPager, this.f133810e.get());
        k(galleryPager, this.f133811f.get());
        j(galleryPager, this.f133812g.get());
        i(galleryPager, this.f133813h.get());
        b(galleryPager, this.f133814i.get());
        c(galleryPager, this.f133815j.get());
    }
}
