package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<com.planner5d.library.model.manager.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180014a;

    public o(i iVar) {
        this.f180014a = iVar;
    }

    public static o a(i iVar) {
        return new o(iVar);
    }

    public static com.planner5d.library.model.manager.w c(i iVar) {
        return (com.planner5d.library.model.manager.w) dagger.internal.p.f(iVar.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.w get() {
        return c(this.f180014a);
    }
}
