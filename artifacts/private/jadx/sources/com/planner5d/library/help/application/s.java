package com.planner5d.library.help.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<com.planner5d.library.services.u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180018a;

    public s(i iVar) {
        this.f180018a = iVar;
    }

    public static s a(i iVar) {
        return new s(iVar);
    }

    public static com.planner5d.library.services.u c(i iVar) {
        return (com.planner5d.library.services.u) dagger.internal.p.f(iVar.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.u get() {
        return c(this.f180018a);
    }
}
