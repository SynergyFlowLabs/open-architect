package com.planner5d.library.uploadplan.interactor;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.imagechooser.j> f230756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<le.m> f230757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230758c;

    public f(ij.c<com.planner5d.library.activity.helper.imagechooser.j> cVar, ij.c<le.m> cVar2, ij.c<com.planner5d.library.application.b> cVar3) {
        this.f230756a = cVar;
        this.f230757b = cVar2;
        this.f230758c = cVar3;
    }

    public static f a(ij.c<com.planner5d.library.activity.helper.imagechooser.j> cVar, ij.c<le.m> cVar2, ij.c<com.planner5d.library.application.b> cVar3) {
        return new f(cVar, cVar2, cVar3);
    }

    public static e c(com.planner5d.library.activity.helper.imagechooser.j jVar, le.m mVar, com.planner5d.library.application.b bVar) {
        return new e(jVar, mVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f230756a.get(), this.f230757b.get(), this.f230758c.get());
    }
}
