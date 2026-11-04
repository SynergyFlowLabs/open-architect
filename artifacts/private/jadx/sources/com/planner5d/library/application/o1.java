package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o1 implements dagger.internal.h<com.planner5d.library.services.e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.region.h> f142873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.region.j> f142874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.region.f> f142875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.region.b> f142876e;

    public o1(i iVar, ij.c<com.planner5d.library.model.region.h> cVar, ij.c<com.planner5d.library.model.region.j> cVar2, ij.c<com.planner5d.library.model.region.f> cVar3, ij.c<com.planner5d.library.model.region.b> cVar4) {
        this.f142872a = iVar;
        this.f142873b = cVar;
        this.f142874c = cVar2;
        this.f142875d = cVar3;
        this.f142876e = cVar4;
    }

    public static o1 a(i iVar, ij.c<com.planner5d.library.model.region.h> cVar, ij.c<com.planner5d.library.model.region.j> cVar2, ij.c<com.planner5d.library.model.region.f> cVar3, ij.c<com.planner5d.library.model.region.b> cVar4) {
        return new o1(iVar, cVar, cVar2, cVar3, cVar4);
    }

    public static com.planner5d.library.services.e0 c(i iVar, com.planner5d.library.model.region.h hVar, com.planner5d.library.model.region.j jVar, com.planner5d.library.model.region.f fVar, com.planner5d.library.model.region.b bVar) {
        return (com.planner5d.library.services.e0) dagger.internal.p.f(iVar.k0(hVar, jVar, fVar, bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.e0 get() {
        return c(this.f142872a, this.f142873b.get(), this.f142874c.get(), this.f142875d.get(), this.f142876e.get());
    }
}
