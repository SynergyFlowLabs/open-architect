package com.planner5d.library.activity.fragment;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f134499a;

    public o(ij.c<com.planner5d.library.model.manager.config.j> cVar) {
        this.f134499a = cVar;
    }

    public static o a(ij.c<com.planner5d.library.model.manager.config.j> cVar) {
        return new o(cVar);
    }

    public static n c(fg.e<com.planner5d.library.model.manager.config.j> eVar) {
        return new n(eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(dagger.internal.g.a(this.f134499a));
    }
}
