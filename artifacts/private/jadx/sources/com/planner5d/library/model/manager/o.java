package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f192219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f192220b;

    public o(ij.c<com.planner5d.library.activity.fragment.x> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2) {
        this.f192219a = cVar;
        this.f192220b = cVar2;
    }

    public static o a(ij.c<com.planner5d.library.activity.fragment.x> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2) {
        return new o(cVar, cVar2);
    }

    public static n c(com.planner5d.library.activity.fragment.x xVar, fg.e<com.planner5d.library.model.manager.config.j> eVar) {
        return new n(xVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f192219a.get(), dagger.internal.g.a(this.f192220b));
    }
}
