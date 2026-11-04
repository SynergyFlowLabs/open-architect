package com.planner5d.library.activity.helper;

import com.planner5d.library.model.manager.b4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class j1 implements fg.g<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b4> f136977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f136979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f136980d;

    public j1(ij.c<b4> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<com.planner5d.library.model.manager.b2> cVar4) {
        this.f136977a = cVar;
        this.f136978b = cVar2;
        this.f136979c = cVar3;
        this.f136980d = cVar4;
    }

    public static fg.g<f1> a(ij.c<b4> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<com.planner5d.library.model.manager.b2> cVar4) {
        return new j1(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperSnapshotCreate.messageManager")
    public static void c(f1 f1Var, com.planner5d.library.model.manager.b2 b2Var) {
        f1Var.f136840d = b2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperSnapshotCreate.snapshotManager")
    public static void d(f1 f1Var, b4 b4Var) {
        f1Var.f136837a = b4Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperSnapshotCreate.userAuthorization")
    public static void e(f1 f1Var, com.planner5d.library.modules.user.user.t tVar) {
        f1Var.f136838b = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperSnapshotCreate.userPurchases")
    public static void f(f1 f1Var, com.planner5d.library.modules.user.user.t0 t0Var) {
        f1Var.f136839c = t0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(f1 f1Var) {
        d(f1Var, this.f136977a.get());
        e(f1Var, this.f136978b.get());
        f(f1Var, this.f136979c.get());
        c(f1Var, this.f136980d.get());
    }
}
