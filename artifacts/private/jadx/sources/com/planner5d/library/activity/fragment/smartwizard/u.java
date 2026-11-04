package com.planner5d.library.activity.fragment.smartwizard;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f135873a;

    public u(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        this.f135873a = cVar;
    }

    public static u a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        return new u(cVar);
    }

    public static t c(com.planner5d.library.model.manager.builtin.i iVar) {
        return new t(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f135873a.get());
    }
}
