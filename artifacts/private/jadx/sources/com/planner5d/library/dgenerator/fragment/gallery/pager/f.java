package com.planner5d.library.dgenerator.fragment.gallery.pager;

import com.planner5d.library.model.manager.y0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
public final class f implements fg.g<GalleryPagerFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f160202a;

    public f(ij.c<y0> cVar) {
        this.f160202a = cVar;
    }

    public static fg.g<GalleryPagerFragment> a(ij.c<y0> cVar) {
        return new f(cVar);
    }

    @dagger.internal.j("com.planner5d.library.dgenerator.fragment.gallery.pager.GalleryPagerFragment.imageManager")
    public static void b(GalleryPagerFragment galleryPagerFragment, y0 y0Var) {
        galleryPagerFragment.imageManager = y0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(GalleryPagerFragment galleryPagerFragment) {
        b(galleryPagerFragment, this.f160202a.get());
    }
}
