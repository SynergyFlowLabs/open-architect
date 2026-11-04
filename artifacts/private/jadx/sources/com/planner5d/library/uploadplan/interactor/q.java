package com.planner5d.library.uploadplan.interactor;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230814a;

    public q(ij.c<com.planner5d.library.application.b> cVar) {
        this.f230814a = cVar;
    }

    public static q a(ij.c<com.planner5d.library.application.b> cVar) {
        return new q(cVar);
    }

    public static p c(com.planner5d.library.application.b bVar) {
        return new p(bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f230814a.get());
    }
}
