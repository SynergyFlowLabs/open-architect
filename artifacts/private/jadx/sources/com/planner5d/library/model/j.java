package com.planner5d.library.model;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f180762a;

    public j(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        this.f180762a = cVar;
    }

    public static j a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        return new j(cVar);
    }

    public static i c(com.planner5d.library.model.manager.builtin.i iVar) {
        return new i(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f180762a.get());
    }
}
