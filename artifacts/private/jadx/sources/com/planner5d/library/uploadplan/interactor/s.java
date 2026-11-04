package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f230834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f230835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f230836d;

    public s(ij.c<com.planner5d.library.application.b> cVar, ij.c<c2> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<t> cVar4) {
        this.f230833a = cVar;
        this.f230834b = cVar2;
        this.f230835c = cVar3;
        this.f230836d = cVar4;
    }

    public static s a(ij.c<com.planner5d.library.application.b> cVar, ij.c<c2> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<t> cVar4) {
        return new s(cVar, cVar2, cVar3, cVar4);
    }

    public static r c(com.planner5d.library.application.b bVar, c2 c2Var, com.planner5d.library.api.requests.c cVar, t tVar) {
        return new r(bVar, c2Var, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f230833a.get(), this.f230834b.get(), this.f230835c.get(), this.f230836d.get());
    }
}
