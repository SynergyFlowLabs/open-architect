package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class t0 implements dagger.internal.h<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f222228a;

    public t0(ij.c<com.planner5d.library.model.manager.config.p> cVar) {
        this.f222228a = cVar;
    }

    public static t0 a(ij.c<com.planner5d.library.model.manager.config.p> cVar) {
        return new t0(cVar);
    }

    public static s0 c(com.planner5d.library.model.manager.config.p pVar) {
        return new s0(pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f222228a.get());
    }
}
