package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<pa.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a> f148313b;

    public x(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a> cVar) {
        this.f148312a = iVar;
        this.f148313b = cVar;
    }

    public static x a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a> cVar) {
        return new x(iVar, cVar);
    }

    public static pa.b c(i iVar, com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a aVar) {
        return (pa.b) dagger.internal.p.f(iVar.s(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pa.b get() {
        return c(this.f148312a, this.f148313b.get());
    }
}
