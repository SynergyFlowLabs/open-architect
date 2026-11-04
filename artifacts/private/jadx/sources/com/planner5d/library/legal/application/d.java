package com.planner5d.library.legal.application;

import com.planner5d.library.services.t;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f180319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.legal.view.dialog.a> f180320b;

    public d(c cVar, ij.c<com.planner5d.library.legal.view.dialog.a> cVar2) {
        this.f180319a = cVar;
        this.f180320b = cVar2;
    }

    public static d a(c cVar, ij.c<com.planner5d.library.legal.view.dialog.a> cVar2) {
        return new d(cVar, cVar2);
    }

    public static t c(c cVar, com.planner5d.library.legal.view.dialog.a aVar) {
        return (t) dagger.internal.p.f(cVar.a(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f180319a, this.f180320b.get());
    }
}
