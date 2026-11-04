package com.planner5d.library.activity.fragment.gallery.project;

import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.model.manager.y0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class f implements fg.g<GalleryProjectFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f133842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c0> f133843b;

    public f(ij.c<y0> cVar, ij.c<c0> cVar2) {
        this.f133842a = cVar;
        this.f133843b = cVar2;
    }

    public static fg.g<GalleryProjectFragment> a(ij.c<y0> cVar, ij.c<c0> cVar2) {
        return new f(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.project.GalleryProjectFragment.imageManager")
    public static void b(GalleryProjectFragment galleryProjectFragment, y0 y0Var) {
        galleryProjectFragment.imageManager = y0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.project.GalleryProjectFragment.projectsAndSnapshotsSourceManager")
    public static void d(GalleryProjectFragment galleryProjectFragment, c0 c0Var) {
        galleryProjectFragment.projectsAndSnapshotsSourceManager = c0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(GalleryProjectFragment galleryProjectFragment) {
        b(galleryProjectFragment, this.f133842a.get());
        d(galleryProjectFragment, this.f133843b.get());
    }
}
