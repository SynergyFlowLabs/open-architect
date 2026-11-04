package com.planner5d.library.help.application;

import com.planner5d.library.interactor.l0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a0 implements dagger.internal.h<le.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<l0> f179969b;

    public a0(i iVar, ij.c<l0> cVar) {
        this.f179968a = iVar;
        this.f179969b = cVar;
    }

    public static a0 a(i iVar, ij.c<l0> cVar) {
        return new a0(iVar, cVar);
    }

    public static le.n c(i iVar, l0 l0Var) {
        return (le.n) dagger.internal.p.f(iVar.r(l0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.n get() {
        return c(this.f179968a, this.f179969b.get());
    }
}
