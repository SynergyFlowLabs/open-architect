package com.planner5d.library.model.manager.builtin;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f181191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n> f181192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f181193c;

    public q(ij.c<i> cVar, ij.c<n> cVar2, ij.c<com.planner5d.library.model.manager.config.p> cVar3) {
        this.f181191a = cVar;
        this.f181192b = cVar2;
        this.f181193c = cVar3;
    }

    public static q a(ij.c<i> cVar, ij.c<n> cVar2, ij.c<com.planner5d.library.model.manager.config.p> cVar3) {
        return new q(cVar, cVar2, cVar3);
    }

    public static p c(i iVar, n nVar, com.planner5d.library.model.manager.config.p pVar) {
        return new p(iVar, nVar, pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f181191a.get(), this.f181192b.get(), this.f181193c.get());
    }
}
