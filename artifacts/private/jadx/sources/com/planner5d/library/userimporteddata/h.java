package com.planner5d.library.userimporteddata;

import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.g3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f235806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<g3> f235807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<w> f235808c;

    public h(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<g3> cVar2, ij.c<w> cVar3) {
        this.f235806a = cVar;
        this.f235807b = cVar2;
        this.f235808c = cVar3;
    }

    public static h a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<g3> cVar2, ij.c<w> cVar3) {
        return new h(cVar, cVar2, cVar3);
    }

    public static g c(com.planner5d.library.api.requests.c cVar, g3 g3Var, w wVar) {
        return new g(cVar, g3Var, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f235806a.get(), this.f235807b.get(), this.f235808c.get());
    }
}
