package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f137182a;

    public v(ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar) {
        this.f137182a = cVar;
    }

    public static v a(ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar) {
        return new v(cVar);
    }

    public static u c(com.planner5d.library.model.manager.managedfiles.a0 a0Var) {
        return new u(a0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f137182a.get());
    }
}
