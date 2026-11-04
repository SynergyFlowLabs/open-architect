package com.planner5d.library.widget.carousel;

import com.planner5d.library.services.utility.f1;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes12.dex */
@r
@e
public final class c implements g<CarouselView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d> f254209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f254210b;

    public c(ij.c<com.planner5d.library.services.bitmaploader.d> cVar, ij.c<f1> cVar2) {
        this.f254209a = cVar;
        this.f254210b = cVar2;
    }

    public static g<CarouselView> a(ij.c<com.planner5d.library.services.bitmaploader.d> cVar, ij.c<f1> cVar2) {
        return new c(cVar, cVar2);
    }

    @j("com.planner5d.library.widget.carousel.CarouselView.bitmapLoader")
    public static void b(CarouselView carouselView, com.planner5d.library.services.bitmaploader.d dVar) {
        carouselView.f254164a = dVar;
    }

    @j("com.planner5d.library.widget.carousel.CarouselView.coroutineScope")
    public static void c(CarouselView carouselView, f1 f1Var) {
        carouselView.f254165b = f1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(CarouselView carouselView) {
        b(carouselView, this.f254209a.get());
        c(carouselView, this.f254210b.get());
    }
}
