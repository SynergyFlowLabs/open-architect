package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<com.planner5d.library.model.manager.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.crashreporting.l> f148269b;

    public t(i iVar, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar) {
        this.f148268a = iVar;
        this.f148269b = cVar;
    }

    public static t a(i iVar, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar) {
        return new t(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.k c(i iVar, com.planner5d.library.model.manager.crashreporting.l lVar) {
        return (com.planner5d.library.model.manager.k) dagger.internal.p.f(iVar.o(lVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.k get() {
        return c(this.f148268a, this.f148269b.get());
    }
}
