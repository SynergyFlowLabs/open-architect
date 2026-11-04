package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<com.planner5d.library.activity.fragment.projects.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.n> f230716a;

    public d(ij.c<com.planner5d.library.uploadplan.interactor.n> cVar) {
        this.f230716a = cVar;
    }

    public static d a(ij.c<com.planner5d.library.uploadplan.interactor.n> cVar) {
        return new d(cVar);
    }

    public static com.planner5d.library.activity.fragment.projects.g c(com.planner5d.library.uploadplan.interactor.n nVar) {
        return (com.planner5d.library.activity.fragment.projects.g) dagger.internal.p.f(c.f230715a.a(nVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.projects.g get() {
        return c(this.f230716a.get());
    }
}
