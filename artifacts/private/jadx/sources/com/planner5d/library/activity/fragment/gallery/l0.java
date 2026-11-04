package com.planner5d.library.activity.fragment.gallery;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l0 implements dagger.internal.h<k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.a> f133800a;

    public l0(ij.c<com.planner5d.library.model.manager.favorite.a> cVar) {
        this.f133800a = cVar;
    }

    public static l0 a(ij.c<com.planner5d.library.model.manager.favorite.a> cVar) {
        return new l0(cVar);
    }

    public static k0 c(com.planner5d.library.model.manager.favorite.a aVar) {
        return new k0(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0 get() {
        return c(this.f133800a.get());
    }
}
