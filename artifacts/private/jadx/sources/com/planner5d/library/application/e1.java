package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e1 implements dagger.internal.h<pa.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d> f142526b;

    public e1(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d> cVar) {
        this.f142525a = iVar;
        this.f142526b = cVar;
    }

    public static e1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d> cVar) {
        return new e1(iVar, cVar);
    }

    public static pa.c c(i iVar, com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d dVar) {
        return (pa.c) dagger.internal.p.f(iVar.a0(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pa.c get() {
        return c(this.f142525a, this.f142526b.get());
    }
}
