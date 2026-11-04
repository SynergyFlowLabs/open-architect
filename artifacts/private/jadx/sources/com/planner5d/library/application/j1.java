package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j1 implements dagger.internal.h<com.planner5d.library.activity.fragment.dialog.purchase.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ia.b> f142581b;

    public j1(i iVar, ij.c<ia.b> cVar) {
        this.f142580a = iVar;
        this.f142581b = cVar;
    }

    public static j1 a(i iVar, ij.c<ia.b> cVar) {
        return new j1(iVar, cVar);
    }

    public static com.planner5d.library.activity.fragment.dialog.purchase.t c(i iVar, ia.b bVar) {
        return (com.planner5d.library.activity.fragment.dialog.purchase.t) dagger.internal.p.f(iVar.f0(bVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.dialog.purchase.t get() {
        return c(this.f142580a, this.f142581b.get());
    }
}
