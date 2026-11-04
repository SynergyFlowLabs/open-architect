package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d implements dagger.internal.h<com.planner5d.library.model.manager.push.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f258923b;

    public d(b bVar, ij.c<com.planner5d.library.application.b> cVar) {
        this.f258922a = bVar;
        this.f258923b = cVar;
    }

    public static d a(b bVar, ij.c<com.planner5d.library.application.b> cVar) {
        return new d(bVar, cVar);
    }

    public static com.planner5d.library.model.manager.push.b c(b bVar, com.planner5d.library.application.b bVar2) {
        return (com.planner5d.library.model.manager.push.b) dagger.internal.p.f(bVar.c(bVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.push.b get() {
        return c(this.f258922a, this.f258923b.get());
    }
}
