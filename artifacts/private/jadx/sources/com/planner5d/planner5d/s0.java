package com.planner5d.planner5d;

import com.planner5d.library.model.manager.m4;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s0 implements dagger.internal.h<com.planner5d.library.model.manager.payments.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f264813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<m4> f264814b;

    public s0(r0 r0Var, ij.c<m4> cVar) {
        this.f264813a = r0Var;
        this.f264814b = cVar;
    }

    public static s0 a(r0 r0Var, ij.c<m4> cVar) {
        return new s0(r0Var, cVar);
    }

    public static com.planner5d.library.model.manager.payments.a0 c(r0 r0Var, m4 m4Var) {
        return (com.planner5d.library.model.manager.payments.a0) dagger.internal.p.f(r0Var.a(m4Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.payments.a0 get() {
        return c(this.f264813a, this.f264814b.get());
    }
}
