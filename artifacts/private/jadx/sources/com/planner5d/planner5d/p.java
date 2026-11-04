package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<com.planner5d.library.model.manager.synchronization.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f264538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f264539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.g> f264540c;

    public p(o oVar, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar, ij.c<com.planner5d.library.model.manager.contest.g> cVar2) {
        this.f264538a = oVar;
        this.f264539b = cVar;
        this.f264540c = cVar2;
    }

    public static p a(o oVar, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar, ij.c<com.planner5d.library.model.manager.contest.g> cVar2) {
        return new p(oVar, cVar, cVar2);
    }

    public static com.planner5d.library.model.manager.synchronization.k c(o oVar, com.planner5d.library.model.manager.synchronization.i iVar, com.planner5d.library.model.manager.contest.g gVar) {
        return (com.planner5d.library.model.manager.synchronization.k) dagger.internal.p.f(oVar.a(iVar, gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.synchronization.k get() {
        return c(this.f264538a, this.f264539b.get(), this.f264540c.get());
    }
}
