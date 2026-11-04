package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w1 implements dagger.internal.h<pa.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f> f148306b;

    public w1(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f> cVar) {
        this.f148305a = iVar;
        this.f148306b = cVar;
    }

    public static w1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f> cVar) {
        return new w1(iVar, cVar);
    }

    public static pa.d c(i iVar, com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f fVar) {
        return (pa.d) dagger.internal.p.f(iVar.t0(fVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pa.d get() {
        return c(this.f148305a, this.f148306b.get());
    }
}
