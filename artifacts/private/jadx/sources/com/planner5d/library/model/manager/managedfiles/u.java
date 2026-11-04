package com.planner5d.library.model.manager.managedfiles;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class u implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d> f192082a;

    public u(ij.c<d> cVar) {
        this.f192082a = cVar;
    }

    public static u a(ij.c<d> cVar) {
        return new u(cVar);
    }

    public static t c(d dVar) {
        return new t(dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f192082a.get());
    }
}
