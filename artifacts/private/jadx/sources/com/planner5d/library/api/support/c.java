package com.planner5d.library.api.support;

import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f142354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p> f142355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ad.b> f142356c;

    public c(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<p> cVar2, ij.c<ad.b> cVar3) {
        this.f142354a = cVar;
        this.f142355b = cVar2;
        this.f142356c = cVar3;
    }

    public static c a(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<p> cVar2, ij.c<ad.b> cVar3) {
        return new c(cVar, cVar2, cVar3);
    }

    public static b c(com.planner5d.library.model.manager.config.p pVar, ij.c<p> cVar, ad.b bVar) {
        return new b(pVar, cVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f142354a.get(), this.f142355b, this.f142356c.get());
    }
}
