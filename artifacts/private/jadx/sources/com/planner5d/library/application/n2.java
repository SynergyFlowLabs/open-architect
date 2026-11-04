package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n2 implements dagger.internal.h<com.planner5d.library.model.manager.m5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.unlockeditems.b> f142865b;

    public n2(i iVar, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar) {
        this.f142864a = iVar;
        this.f142865b = cVar;
    }

    public static n2 a(i iVar, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar) {
        return new n2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.m5 c(i iVar, com.planner5d.library.model.manager.unlockeditems.b bVar) {
        return (com.planner5d.library.model.manager.m5) dagger.internal.p.f(iVar.K0(bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.m5 get() {
        return c(this.f142864a, this.f142865b.get());
    }
}
