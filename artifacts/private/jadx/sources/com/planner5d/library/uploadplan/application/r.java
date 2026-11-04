package com.planner5d.library.uploadplan.application;

import com.planner5d.library.interactor.j0;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r implements dagger.internal.h<le.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j0> f230739b;

    public r(h hVar, ij.c<j0> cVar) {
        this.f230738a = hVar;
        this.f230739b = cVar;
    }

    public static r a(h hVar, ij.c<j0> cVar) {
        return new r(hVar, cVar);
    }

    public static le.m c(h hVar, j0 j0Var) {
        return (le.m) dagger.internal.p.f(hVar.j(j0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.m get() {
        return c(this.f230738a, this.f230739b.get());
    }
}
