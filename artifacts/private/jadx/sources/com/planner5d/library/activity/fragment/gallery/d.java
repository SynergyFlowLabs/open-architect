package com.planner5d.library.activity.fragment.gallery;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.q0> f133748a;

    public d(ij.c<com.planner5d.library.model.manager.q0> cVar) {
        this.f133748a = cVar;
    }

    public static d a(ij.c<com.planner5d.library.model.manager.q0> cVar) {
        return new d(cVar);
    }

    public static c c(com.planner5d.library.model.manager.q0 q0Var) {
        return new c(q0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f133748a.get());
    }
}
