package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z1 implements dagger.internal.h<com.planner5d.library.spaces.data.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.b> f148342b;

    public z1(i iVar, ij.c<com.planner5d.library.model.manager.spaces.b> cVar) {
        this.f148341a = iVar;
        this.f148342b = cVar;
    }

    public static z1 a(i iVar, ij.c<com.planner5d.library.model.manager.spaces.b> cVar) {
        return new z1(iVar, cVar);
    }

    public static com.planner5d.library.spaces.data.e c(i iVar, com.planner5d.library.model.manager.spaces.b bVar) {
        return (com.planner5d.library.spaces.data.e) dagger.internal.p.f(iVar.w0(bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.spaces.data.e get() {
        return c(this.f148341a, this.f148342b.get());
    }
}
