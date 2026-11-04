package com.planner5d.library.model.manager;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class r0 implements dagger.internal.h<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f197699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.a> f197700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f197701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f197702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b4> f197703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f197704f;

    public r0(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.model.manager.favorite.a> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<b4> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6) {
        this.f197699a = cVar;
        this.f197700b = cVar2;
        this.f197701c = cVar3;
        this.f197702d = cVar4;
        this.f197703e = cVar5;
        this.f197704f = cVar6;
    }

    public static r0 a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.model.manager.favorite.a> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<b4> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6) {
        return new r0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static q0 c(com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.model.manager.favorite.a aVar, com.planner5d.library.api.requests.c cVar, ErrorMessageParser errorMessageParser, b4 b4Var, com.planner5d.library.modules.user.user.t tVar) {
        return new q0(iVar, aVar, cVar, errorMessageParser, b4Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        return c(this.f197699a.get(), this.f197700b.get(), this.f197701c.get(), this.f197702d.get(), this.f197703e.get(), this.f197704f.get());
    }
}
