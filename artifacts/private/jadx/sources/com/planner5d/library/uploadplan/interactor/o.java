package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f230809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c2> f230810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f230811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t> f230812e;

    public o(ij.c<com.planner5d.library.application.b> cVar, ij.c<p0> cVar2, ij.c<c2> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<t> cVar5) {
        this.f230808a = cVar;
        this.f230809b = cVar2;
        this.f230810c = cVar3;
        this.f230811d = cVar4;
        this.f230812e = cVar5;
    }

    public static o a(ij.c<com.planner5d.library.application.b> cVar, ij.c<p0> cVar2, ij.c<c2> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<t> cVar5) {
        return new o(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static n c(com.planner5d.library.application.b bVar, p0 p0Var, c2 c2Var, com.planner5d.library.api.requests.c cVar, t tVar) {
        return new n(bVar, p0Var, c2Var, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f230808a.get(), this.f230809b.get(), this.f230810c.get(), this.f230811d.get(), this.f230812e.get());
    }
}
