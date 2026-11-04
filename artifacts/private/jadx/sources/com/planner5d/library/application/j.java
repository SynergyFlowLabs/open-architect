package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<com.planner5d.library.activity.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.l0> f142577b;

    public j(i iVar, ij.c<com.planner5d.library.activity.helper.l0> cVar) {
        this.f142576a = iVar;
        this.f142577b = cVar;
    }

    public static j a(i iVar, ij.c<com.planner5d.library.activity.helper.l0> cVar) {
        return new j(iVar, cVar);
    }

    public static com.planner5d.library.activity.a c(i iVar, com.planner5d.library.activity.helper.l0 l0Var) {
        return (com.planner5d.library.activity.a) dagger.internal.p.f(iVar.e(l0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.a get() {
        return c(this.f142576a, this.f142577b.get());
    }
}
