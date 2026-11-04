package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x1 implements dagger.internal.h<pa.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i> f148317b;

    public x1(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i> cVar) {
        this.f148316a = iVar;
        this.f148317b = cVar;
    }

    public static x1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i> cVar) {
        return new x1(iVar, cVar);
    }

    public static pa.e c(i iVar, com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i iVar2) {
        return (pa.e) dagger.internal.p.f(iVar.u0(iVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pa.e get() {
        return c(this.f148316a, this.f148317b.get());
    }
}
