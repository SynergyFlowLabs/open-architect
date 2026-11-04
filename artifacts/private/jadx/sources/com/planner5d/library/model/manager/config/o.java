package com.planner5d.library.model.manager.config;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<j> f181608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.purchaseplacement.c> f181609b;

    public o(ij.c<j> cVar, ij.c<com.planner5d.library.model.manager.config.purchaseplacement.c> cVar2) {
        this.f181608a = cVar;
        this.f181609b = cVar2;
    }

    public static o a(ij.c<j> cVar, ij.c<com.planner5d.library.model.manager.config.purchaseplacement.c> cVar2) {
        return new o(cVar, cVar2);
    }

    public static n c(j jVar, com.planner5d.library.model.manager.config.purchaseplacement.c cVar) {
        return new n(jVar, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f181608a.get(), this.f181609b.get());
    }
}
