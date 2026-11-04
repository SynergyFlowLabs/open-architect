package com.planner5d.library.dgenerator.fragment.gallery;

import com.planner5d.library.model.manager.y0;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
public final class j implements fg.g<GalleryFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f160162a;

    public j(ij.c<y0> cVar) {
        this.f160162a = cVar;
    }

    public static fg.g<GalleryFragment> a(ij.c<y0> cVar) {
        return new j(cVar);
    }

    @dagger.internal.j("com.planner5d.library.dgenerator.fragment.gallery.GalleryFragment.imageManager")
    public static void b(GalleryFragment galleryFragment, y0 y0Var) {
        galleryFragment.imageManager = y0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(GalleryFragment galleryFragment) {
        b(galleryFragment, this.f160162a.get());
    }
}
