package com.planner5d.library.uploadplan.interactor;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230770a;

    public k(ij.c<com.planner5d.library.application.b> cVar) {
        this.f230770a = cVar;
    }

    public static k a(ij.c<com.planner5d.library.application.b> cVar) {
        return new k(cVar);
    }

    public static j c(com.planner5d.library.application.b bVar) {
        return new j(bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f230770a.get());
    }
}
