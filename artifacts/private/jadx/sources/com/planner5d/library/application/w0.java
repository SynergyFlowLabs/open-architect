package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w0 implements dagger.internal.h<com.planner5d.library.model.manager.q2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f148304b;

    public w0(i iVar, ij.c<d> cVar) {
        this.f148303a = iVar;
        this.f148304b = cVar;
    }

    public static w0 a(i iVar, ij.c<d> cVar) {
        return new w0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.q2 c(i iVar, d dVar) {
        return (com.planner5d.library.model.manager.q2) dagger.internal.p.f(iVar.R(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.q2 get() {
        return c(this.f148303a, this.f148304b.get());
    }
}
