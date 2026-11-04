package com.planner5d.library.activity.fragment.feed.interactor;

import com.planner5d.library.model.manager.u1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<u1> f133496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.data.g> f133497b;

    public h(ij.c<u1> cVar, ij.c<com.planner5d.library.feed.data.g> cVar2) {
        this.f133496a = cVar;
        this.f133497b = cVar2;
    }

    public static h a(ij.c<u1> cVar, ij.c<com.planner5d.library.feed.data.g> cVar2) {
        return new h(cVar, cVar2);
    }

    public static g c(u1 u1Var, com.planner5d.library.feed.data.g gVar) {
        return new g(u1Var, gVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f133496a.get(), this.f133497b.get());
    }
}
