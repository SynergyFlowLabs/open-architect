package com.planner5d.library.model.manager.project;

import com.planner5d.library.model.manager.y0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f193139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f193140b;

    public d(ij.c<y0> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        this.f193139a = cVar;
        this.f193140b = cVar2;
    }

    public static d a(ij.c<y0> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2) {
        return new d(cVar, cVar2);
    }

    public static c c(y0 y0Var, com.planner5d.library.model.manager.builtin.i iVar) {
        return new c(y0Var, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f193139a.get(), this.f193140b.get());
    }
}
