package com.planner5d.library.activity.fragment.startup;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f136452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.legal.model.manager.a> f136453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136454c;

    public b(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.legal.model.manager.a> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3) {
        this.f136452a = cVar;
        this.f136453b = cVar2;
        this.f136454c = cVar3;
    }

    public static b a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.legal.model.manager.a> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3) {
        return new b(cVar, cVar2, cVar3);
    }

    public static a c(com.planner5d.library.application.b bVar, com.planner5d.library.legal.model.manager.a aVar, com.planner5d.library.modules.user.user.t tVar) {
        return new a(bVar, aVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f136452a.get(), this.f136453b.get(), this.f136454c.get());
    }
}
