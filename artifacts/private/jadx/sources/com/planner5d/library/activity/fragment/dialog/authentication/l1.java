package com.planner5d.library.activity.fragment.dialog.authentication;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l1 implements dagger.internal.h<k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.q0> f131815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f131816b;

    public l1(ij.c<com.planner5d.library.modules.user.user.q0> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2) {
        this.f131815a = cVar;
        this.f131816b = cVar2;
    }

    public static l1 a(ij.c<com.planner5d.library.modules.user.user.q0> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2) {
        return new l1(cVar, cVar2);
    }

    public static k1 c(com.planner5d.library.modules.user.user.q0 q0Var, com.planner5d.library.modules.user.user.t tVar) {
        return new k1(q0Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k1 get() {
        return c(this.f131815a.get(), this.f131816b.get());
    }
}
