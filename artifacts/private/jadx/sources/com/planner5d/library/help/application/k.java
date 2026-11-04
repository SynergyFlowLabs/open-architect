package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<com.planner5d.library.model.manager.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180009a;

    public k(i iVar) {
        this.f180009a = iVar;
    }

    public static k a(i iVar) {
        return new k(iVar);
    }

    public static com.planner5d.library.model.manager.h c(i iVar) {
        return (com.planner5d.library.model.manager.h) dagger.internal.p.f(iVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.h get() {
        return c(this.f180009a);
    }
}
