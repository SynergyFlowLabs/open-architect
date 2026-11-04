package com.planner5d.library.activity.fragment.dialog.purchase;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d implements dagger.internal.h<c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f132520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f132521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f132522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<v> f132523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f132524e;

    public d(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<com.planner5d.library.model.manager.payments.j> cVar3, ij.c<v> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        this.f132520a = cVar;
        this.f132521b = cVar2;
        this.f132522c = cVar3;
        this.f132523d = cVar4;
        this.f132524e = cVar5;
    }

    public static d a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<com.planner5d.library.model.manager.payments.j> cVar3, ij.c<v> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c.a c(fg.e<com.planner5d.library.application.b> eVar, com.planner5d.library.application.d dVar, com.planner5d.library.model.manager.payments.j jVar, fg.e<v> eVar2, com.planner5d.library.modules.user.user.t tVar) {
        return new c.a(eVar, dVar, jVar, eVar2, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.a get() {
        return c(dagger.internal.g.a(this.f132520a), this.f132521b.get(), this.f132522c.get(), dagger.internal.g.a(this.f132523d), this.f132524e.get());
    }
}
