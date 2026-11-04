package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k2 implements dagger.internal.h<j2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f136988a;

    public k2(ij.c<com.planner5d.library.model.manager.b2> cVar) {
        this.f136988a = cVar;
    }

    public static k2 a(ij.c<com.planner5d.library.model.manager.b2> cVar) {
        return new k2(cVar);
    }

    public static j2 c(com.planner5d.library.model.manager.b2 b2Var) {
        return new j2(b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j2 get() {
        return c(this.f136988a.get());
    }
}
