package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t1> f180196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f180197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f180198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f180199d;

    public l(ij.c<t1> cVar, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar2, ij.c<com.planner5d.library.services.z> cVar3, ij.c<f1> cVar4) {
        this.f180196a = cVar;
        this.f180197b = cVar2;
        this.f180198c = cVar3;
        this.f180199d = cVar4;
    }

    public static l a(ij.c<t1> cVar, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar2, ij.c<com.planner5d.library.services.z> cVar3, ij.c<f1> cVar4) {
        return new l(cVar, cVar2, cVar3, cVar4);
    }

    public static k c(fg.e<t1> eVar, fg.e<com.planner5d.library.model.manager.managedfiles.a0> eVar2, com.planner5d.library.services.z zVar, f1 f1Var) {
        return new k(eVar, eVar2, zVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(dagger.internal.g.a(this.f180196a), dagger.internal.g.a(this.f180197b), this.f180198c.get(), this.f180199d.get());
    }
}
