package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p0 implements dagger.internal.h<com.planner5d.library.database.migration.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142892a;

    public p0(i iVar) {
        this.f142892a = iVar;
    }

    public static p0 a(i iVar) {
        return new p0(iVar);
    }

    public static com.planner5d.library.database.migration.h c(i iVar) {
        return (com.planner5d.library.database.migration.h) dagger.internal.p.f(iVar.K());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.migration.h get() {
        return c(this.f142892a);
    }
}
