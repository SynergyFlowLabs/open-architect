package com.planner5d.library.activity.fragment.gallery;

import com.planner5d.library.model.manager.b2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class n0 implements fg.g<Gallery> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b2> f133817a;

    public n0(ij.c<b2> cVar) {
        this.f133817a = cVar;
    }

    public static fg.g<Gallery> a(ij.c<b2> cVar) {
        return new n0(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.gallery.Gallery.messageManager")
    public static void c(Gallery gallery, b2 b2Var) {
        gallery.messageManager = b2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(Gallery gallery) {
        c(gallery, this.f133817a.get());
    }
}
