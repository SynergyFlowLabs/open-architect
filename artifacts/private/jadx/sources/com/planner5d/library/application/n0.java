package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n0 implements dagger.internal.h<com.planner5d.library.model.manager.y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142861a;

    public n0(i iVar) {
        this.f142861a = iVar;
    }

    public static n0 a(i iVar) {
        return new n0(iVar);
    }

    public static com.planner5d.library.model.manager.y1 c(i iVar) {
        return (com.planner5d.library.model.manager.y1) dagger.internal.p.f(iVar.I());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.y1 get() {
        return c(this.f142861a);
    }
}
