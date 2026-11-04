package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<ke.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.a> f230721b;

    public i(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.a> cVar) {
        this.f230720a = hVar;
        this.f230721b = cVar;
    }

    public static i a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.a> cVar) {
        return new i(hVar, cVar);
    }

    public static ke.a c(h hVar, com.planner5d.library.uploadplan.interactor.a aVar) {
        return (ke.a) dagger.internal.p.f(hVar.a(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.a get() {
        return c(this.f230720a, this.f230721b.get());
    }
}
