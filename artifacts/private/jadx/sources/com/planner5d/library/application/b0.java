package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b0 implements dagger.internal.h<com.planner5d.library.services.utility.f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142465a;

    public b0(i iVar) {
        this.f142465a = iVar;
    }

    public static b0 a(i iVar) {
        return new b0(iVar);
    }

    public static com.planner5d.library.services.utility.f1 c(i iVar) {
        return (com.planner5d.library.services.utility.f1) dagger.internal.p.f(iVar.w());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.f1 get() {
        return c(this.f142465a);
    }
}
