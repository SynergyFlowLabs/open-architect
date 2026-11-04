package com.planner5d.library.model;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f222803a;

    public s(ij.c<p0> cVar) {
        this.f222803a = cVar;
    }

    public static s a(ij.c<p0> cVar) {
        return new s(cVar);
    }

    public static r c(p0 p0Var) {
        return new r(p0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f222803a.get());
    }
}
