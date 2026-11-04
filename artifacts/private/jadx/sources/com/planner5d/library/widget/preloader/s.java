package com.planner5d.library.widget.preloader;

import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.q1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
public final class s implements fg.g<PreloaderBoxView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f258569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<q1> f258570b;

    public s(ij.c<p0> cVar, ij.c<q1> cVar2) {
        this.f258569a = cVar;
        this.f258570b = cVar2;
    }

    public static fg.g<PreloaderBoxView> a(ij.c<p0> cVar, ij.c<q1> cVar2) {
        return new s(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.widget.preloader.PreloaderBoxView.formatter")
    public static void b(PreloaderBoxView preloaderBoxView, p0 p0Var) {
        preloaderBoxView.f258472a = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.widget.preloader.PreloaderBoxView.toolbarStyling")
    public static void d(PreloaderBoxView preloaderBoxView, q1 q1Var) {
        preloaderBoxView.f258473b = q1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PreloaderBoxView preloaderBoxView) {
        b(preloaderBoxView, this.f258569a.get());
        d(preloaderBoxView, this.f258570b.get());
    }
}
