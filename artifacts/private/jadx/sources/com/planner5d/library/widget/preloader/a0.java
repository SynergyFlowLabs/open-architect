package com.planner5d.library.widget.preloader;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
public final class a0 implements fg.g<PreloaderDialogView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f258521a;

    public a0(ij.c<p0> cVar) {
        this.f258521a = cVar;
    }

    public static fg.g<PreloaderDialogView> a(ij.c<p0> cVar) {
        return new a0(cVar);
    }

    @dagger.internal.j("com.planner5d.library.widget.preloader.PreloaderDialogView.formatter")
    public static void b(PreloaderDialogView preloaderDialogView, fg.e<p0> eVar) {
        preloaderDialogView.f258506a = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PreloaderDialogView preloaderDialogView) {
        b(preloaderDialogView, dagger.internal.g.a(this.f258521a));
    }
}
