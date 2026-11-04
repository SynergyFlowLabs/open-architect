package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m2 implements dagger.internal.h<com.planner5d.library.widget.q1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142615a;

    public m2(i iVar) {
        this.f142615a = iVar;
    }

    public static m2 a(i iVar) {
        return new m2(iVar);
    }

    public static com.planner5d.library.widget.q1 c(i iVar) {
        return (com.planner5d.library.widget.q1) dagger.internal.p.f(iVar.J0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.widget.q1 get() {
        return c(this.f142615a);
    }
}
