package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f implements dagger.internal.h<com.planner5d.library.model.manager.statistics.devtodev.d.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f258934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f258935c;

    public f(b bVar, ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2) {
        this.f258933a = bVar;
        this.f258934b = cVar;
        this.f258935c = cVar2;
    }

    public static f a(b bVar, ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2) {
        return new f(bVar, cVar, cVar2);
    }

    public static com.planner5d.library.model.manager.statistics.devtodev.d.b c(b bVar, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.model.manager.payments.j jVar) {
        return (com.planner5d.library.model.manager.statistics.devtodev.d.b) dagger.internal.p.f(bVar.f(tVar, jVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.devtodev.d.b get() {
        return c(this.f258933a, this.f258934b.get(), this.f258935c.get());
    }
}
