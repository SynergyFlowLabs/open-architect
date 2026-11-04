package com.planner5d.library.widget.preloader;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
public final class m implements fg.g<PreloaderBoxV2View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f258558a;

    public m(ij.c<p0> cVar) {
        this.f258558a = cVar;
    }

    public static fg.g<PreloaderBoxV2View> a(ij.c<p0> cVar) {
        return new m(cVar);
    }

    @dagger.internal.j("com.planner5d.library.widget.preloader.PreloaderBoxV2View.formatter")
    public static void b(PreloaderBoxV2View preloaderBoxV2View, fg.e<p0> eVar) {
        preloaderBoxV2View.f258466a = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PreloaderBoxV2View preloaderBoxV2View) {
        b(preloaderBoxV2View, dagger.internal.g.a(this.f258558a));
    }
}
