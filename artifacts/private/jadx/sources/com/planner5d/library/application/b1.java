package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b1 implements dagger.internal.h<com.planner5d.library.activity.fragment.dialog.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.y> f142467b;

    public b1(i iVar, ij.c<com.planner5d.library.activity.fragment.dialog.y> cVar) {
        this.f142466a = iVar;
        this.f142467b = cVar;
    }

    public static b1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.dialog.y> cVar) {
        return new b1(iVar, cVar);
    }

    public static com.planner5d.library.activity.fragment.dialog.z c(i iVar, com.planner5d.library.activity.fragment.dialog.y yVar) {
        return (com.planner5d.library.activity.fragment.dialog.z) dagger.internal.p.f(iVar.X(yVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.dialog.z get() {
        return c(this.f142466a, this.f142467b.get());
    }
}
