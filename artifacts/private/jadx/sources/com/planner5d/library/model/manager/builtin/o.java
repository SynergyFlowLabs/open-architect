package com.planner5d.library.model.manager.builtin;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<i> f181170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<g0> f181171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f181172d;

    public o(ij.c<com.planner5d.library.application.b> cVar, ij.c<i> cVar2, ij.c<g0> cVar3, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar4) {
        this.f181169a = cVar;
        this.f181170b = cVar2;
        this.f181171c = cVar3;
        this.f181172d = cVar4;
    }

    public static o a(ij.c<com.planner5d.library.application.b> cVar, ij.c<i> cVar2, ij.c<g0> cVar3, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar4) {
        return new o(cVar, cVar2, cVar3, cVar4);
    }

    public static n c(com.planner5d.library.application.b bVar, i iVar, g0 g0Var, fg.e<com.planner5d.library.model.manager.managedfiles.a0> eVar) {
        return new n(bVar, iVar, g0Var, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f181169a.get(), this.f181170b.get(), this.f181171c.get(), dagger.internal.g.a(this.f181172d));
    }
}
