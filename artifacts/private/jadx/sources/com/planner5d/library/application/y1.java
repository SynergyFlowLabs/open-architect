package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y1 implements dagger.internal.h<com.planner5d.library.activity.fragment.smartwizard.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.t> f148331b;

    public y1(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.t> cVar) {
        this.f148330a = iVar;
        this.f148331b = cVar;
    }

    public static y1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.t> cVar) {
        return new y1(iVar, cVar);
    }

    public static com.planner5d.library.activity.fragment.smartwizard.v c(i iVar, com.planner5d.library.activity.fragment.smartwizard.t tVar) {
        return (com.planner5d.library.activity.fragment.smartwizard.v) dagger.internal.p.f(iVar.v0(tVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.smartwizard.v get() {
        return c(this.f148330a, this.f148331b.get());
    }
}
