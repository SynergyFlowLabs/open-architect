package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
public final class m1 implements fg.g<k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191874a;

    public m1(ij.c<com.planner5d.library.modules.user.user.t> cVar) {
        this.f191874a = cVar;
    }

    public static fg.g<k1> a(ij.c<com.planner5d.library.modules.user.user.t> cVar) {
        return new m1(cVar);
    }

    @dagger.internal.j("com.planner5d.library.model.manager.ItemManager.userAuthorization")
    public static void c(k1 k1Var, com.planner5d.library.modules.user.user.t tVar) {
        k1Var.f191802d = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(k1 k1Var) {
        c(k1Var, this.f191874a.get());
    }
}
