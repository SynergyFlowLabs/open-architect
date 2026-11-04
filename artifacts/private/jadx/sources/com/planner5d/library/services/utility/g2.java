package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g2 implements dagger.internal.h<f2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.u1> f225250a;

    public g2(ij.c<com.planner5d.library.model.manager.u1> cVar) {
        this.f225250a = cVar;
    }

    public static g2 a(ij.c<com.planner5d.library.model.manager.u1> cVar) {
        return new g2(cVar);
    }

    public static f2 c(com.planner5d.library.model.manager.u1 u1Var) {
        return new f2(u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f2 get() {
        return c(this.f225250a.get());
    }
}
