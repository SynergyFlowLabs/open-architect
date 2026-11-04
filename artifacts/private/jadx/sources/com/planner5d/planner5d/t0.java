package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t0 implements dagger.internal.h<com.planner5d.library.model.manager.payments.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f264815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.y> f264816b;

    public t0(r0 r0Var, ij.c<com.planner5d.library.model.manager.payments.y> cVar) {
        this.f264815a = r0Var;
        this.f264816b = cVar;
    }

    public static t0 a(r0 r0Var, ij.c<com.planner5d.library.model.manager.payments.y> cVar) {
        return new t0(r0Var, cVar);
    }

    public static com.planner5d.library.model.manager.payments.b0 c(r0 r0Var, com.planner5d.library.model.manager.payments.y yVar) {
        return (com.planner5d.library.model.manager.payments.b0) dagger.internal.p.f(r0Var.b(yVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.payments.b0 get() {
        return c(this.f264815a, this.f264816b.get());
    }
}
