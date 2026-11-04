package com.planner5d.library.activity.fragment.list;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e0 implements dagger.internal.h<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f134042a;

    public e0(ij.c<com.planner5d.library.model.manager.synchronization.i> cVar) {
        this.f134042a = cVar;
    }

    public static e0 a(ij.c<com.planner5d.library.model.manager.synchronization.i> cVar) {
        return new e0(cVar);
    }

    public static d0 c(com.planner5d.library.model.manager.synchronization.i iVar) {
        return new d0(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0 get() {
        return c(this.f134042a.get());
    }
}
