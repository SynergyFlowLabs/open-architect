package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k3 implements dagger.internal.h<com.planner5d.library.modules.user.user.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f142595b;

    public k3(i iVar, ij.c<com.planner5d.library.modules.user.user.t> cVar) {
        this.f142594a = iVar;
        this.f142595b = cVar;
    }

    public static k3 a(i iVar, ij.c<com.planner5d.library.modules.user.user.t> cVar) {
        return new k3(iVar, cVar);
    }

    public static com.planner5d.library.modules.user.user.w c(i iVar, com.planner5d.library.modules.user.user.t tVar) {
        return (com.planner5d.library.modules.user.user.w) dagger.internal.p.f(iVar.j1(tVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.modules.user.user.w get() {
        return c(this.f142594a, this.f142595b.get());
    }
}
