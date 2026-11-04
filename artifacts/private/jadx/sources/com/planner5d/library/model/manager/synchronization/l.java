package com.planner5d.library.model.manager.synchronization;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class l implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f222209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f222210b;

    public l(ij.c<t> cVar, ij.c<d> cVar2) {
        this.f222209a = cVar;
        this.f222210b = cVar2;
    }

    public static l a(ij.c<t> cVar, ij.c<d> cVar2) {
        return new l(cVar, cVar2);
    }

    public static i c(fg.e<t> eVar, d dVar) {
        return new i(eVar, dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(dagger.internal.g.a(this.f222209a), this.f222210b.get());
    }
}
