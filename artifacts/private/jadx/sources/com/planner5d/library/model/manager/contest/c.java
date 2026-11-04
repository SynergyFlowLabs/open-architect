package com.planner5d.library.model.manager.contest;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f190974a;

    public c(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        this.f190974a = cVar;
    }

    public static c a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar) {
        return new c(cVar);
    }

    public static b c(com.planner5d.library.model.manager.builtin.i iVar) {
        return new b(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f190974a.get());
    }
}
