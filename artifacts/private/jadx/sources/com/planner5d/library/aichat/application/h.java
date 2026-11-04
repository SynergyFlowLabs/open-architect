package com.planner5d.library.aichat.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<ya.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.aichat.interactor.d> f141918b;

    public h(b bVar, ij.c<com.planner5d.library.aichat.interactor.d> cVar) {
        this.f141917a = bVar;
        this.f141918b = cVar;
    }

    public static h a(b bVar, ij.c<com.planner5d.library.aichat.interactor.d> cVar) {
        return new h(bVar, cVar);
    }

    public static ya.b c(b bVar, com.planner5d.library.aichat.interactor.d dVar) {
        return (ya.b) dagger.internal.p.f(bVar.f(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ya.b get() {
        return c(this.f141917a, this.f141918b.get());
    }
}
