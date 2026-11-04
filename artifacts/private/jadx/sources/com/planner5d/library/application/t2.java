package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t2 implements dagger.internal.h<com.planner5d.library.h[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148275a;

    public t2(i iVar) {
        this.f148275a = iVar;
    }

    public static t2 a(i iVar) {
        return new t2(iVar);
    }

    public static com.planner5d.library.h[] c(i iVar) {
        return (com.planner5d.library.h[]) dagger.internal.p.f(iVar.S0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.h[] get() {
        return c(this.f148275a);
    }
}
