package com.planner5d.library.activity.fragment.gallery;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y implements dagger.internal.h<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<v> f133932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f133933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f133934c;

    public y(ij.c<v> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.services.utility.t> cVar3) {
        this.f133932a = cVar;
        this.f133933b = cVar2;
        this.f133934c = cVar3;
    }

    public static y a(ij.c<v> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<com.planner5d.library.services.utility.t> cVar3) {
        return new y(cVar, cVar2, cVar3);
    }

    public static x c(v vVar, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.services.utility.t tVar) {
        return new x(vVar, iVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f133932a.get(), this.f133933b.get(), this.f133934c.get());
    }
}
