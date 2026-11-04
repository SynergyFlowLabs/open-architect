package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<ma.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b> f148302b;

    public w(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b> cVar) {
        this.f148301a = iVar;
        this.f148302b = cVar;
    }

    public static w a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b> cVar) {
        return new w(iVar, cVar);
    }

    public static ma.a c(i iVar, com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b bVar) {
        return (ma.a) dagger.internal.p.f(iVar.r(bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ma.a get() {
        return c(this.f148301a, this.f148302b.get());
    }
}
