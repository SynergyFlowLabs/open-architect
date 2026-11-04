package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class l1 implements dagger.internal.h<k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f191852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191853b;

    public l1(ij.c<y0> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2) {
        this.f191852a = cVar;
        this.f191853b = cVar2;
    }

    public static l1 a(ij.c<y0> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2) {
        return new l1(cVar, cVar2);
    }

    public static k1 c(y0 y0Var) {
        return new k1(y0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k1 get() {
        k1 k1VarC = c(this.f191852a.get());
        m1.c(k1VarC, this.f191853b.get());
        return k1VarC;
    }
}
