package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<com.planner5d.library.model.manager.builtin.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f142610b;

    public m(i iVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        this.f142609a = iVar;
        this.f142610b = cVar;
    }

    public static m a(i iVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        return new m(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.builtin.l c(i iVar, com.planner5d.library.model.manager.builtin.i iVar2) {
        return (com.planner5d.library.model.manager.builtin.l) dagger.internal.p.f(iVar.h(iVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.builtin.l get() {
        return c(this.f142609a, this.f142610b.get());
    }
}
