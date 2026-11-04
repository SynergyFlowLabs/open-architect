package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class v2 implements dagger.internal.h<com.planner5d.library.modules.user.user.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.z> f148298b;

    public v2(i iVar, ij.c<com.planner5d.library.modules.user.user.z> cVar) {
        this.f148297a = iVar;
        this.f148298b = cVar;
    }

    public static v2 a(i iVar, ij.c<com.planner5d.library.modules.user.user.z> cVar) {
        return new v2(iVar, cVar);
    }

    public static com.planner5d.library.modules.user.user.a0 c(i iVar, com.planner5d.library.modules.user.user.z zVar) {
        return (com.planner5d.library.modules.user.user.a0) dagger.internal.p.f(iVar.U0(zVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.modules.user.user.a0 get() {
        return c(this.f148297a, this.f148298b.get());
    }
}
