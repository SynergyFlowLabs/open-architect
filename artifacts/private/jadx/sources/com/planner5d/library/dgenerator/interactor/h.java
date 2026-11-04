package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f160433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f160434b;

    public h(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<t> cVar2) {
        this.f160433a = cVar;
        this.f160434b = cVar2;
    }

    public static h a(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<t> cVar2) {
        return new h(cVar, cVar2);
    }

    public static g c(com.planner5d.library.model.manager.payments.j jVar, t tVar) {
        return new g(jVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f160433a.get(), this.f160434b.get());
    }
}
