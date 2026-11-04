package com.planner5d.library.dgenerator.application;

import com.planner5d.library.interactor.j0;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class m implements dagger.internal.h<le.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j0> f160093b;

    public m(d dVar, ij.c<j0> cVar) {
        this.f160092a = dVar;
        this.f160093b = cVar;
    }

    public static m a(d dVar, ij.c<j0> cVar) {
        return new m(dVar, cVar);
    }

    public static le.m c(d dVar, j0 j0Var) {
        return (le.m) dagger.internal.p.f(dVar.i(j0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.m get() {
        return c(this.f160092a, this.f160093b.get());
    }
}
