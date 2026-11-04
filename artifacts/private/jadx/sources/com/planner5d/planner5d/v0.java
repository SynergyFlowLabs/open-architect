package com.planner5d.planner5d;

import com.planner5d.library.services.utility.z0;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v0 implements dagger.internal.h<z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f264819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f264820b;

    public v0(u0 u0Var, ij.c<com.planner5d.library.services.utility.p0> cVar) {
        this.f264819a = u0Var;
        this.f264820b = cVar;
    }

    public static v0 a(u0 u0Var, ij.c<com.planner5d.library.services.utility.p0> cVar) {
        return new v0(u0Var, cVar);
    }

    public static z0 b(u0 u0Var, com.planner5d.library.services.utility.p0 p0Var) {
        return (z0) dagger.internal.p.f(u0Var.a(p0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public z0 get() {
        return b(this.f264819a, this.f264820b.get());
    }
}
