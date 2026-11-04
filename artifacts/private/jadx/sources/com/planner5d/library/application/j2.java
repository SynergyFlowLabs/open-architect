package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class j2 implements dagger.internal.h<com.planner5d.library.model.manager.z4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.r> f142583b;

    public j2(i iVar, ij.c<com.planner5d.library.model.manager.config.r> cVar) {
        this.f142582a = iVar;
        this.f142583b = cVar;
    }

    public static j2 a(i iVar, ij.c<com.planner5d.library.model.manager.config.r> cVar) {
        return new j2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.z4 c(i iVar, com.planner5d.library.model.manager.config.r rVar) {
        return (com.planner5d.library.model.manager.z4) dagger.internal.p.f(iVar.G0(rVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.z4 get() {
        return c(this.f142582a, this.f142583b.get());
    }
}
