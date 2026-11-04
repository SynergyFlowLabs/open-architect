package com.planner5d.library.activity.fragment.dialog.authentication;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d1 implements dagger.internal.h<c1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f131760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.q0> f131761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.legal.model.manager.a> f131762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f131763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.b> f131764e;

    public d1(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.modules.user.user.q0> cVar2, ij.c<com.planner5d.library.legal.model.manager.a> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<com.planner5d.library.modules.user.user.b> cVar5) {
        this.f131760a = cVar;
        this.f131761b = cVar2;
        this.f131762c = cVar3;
        this.f131763d = cVar4;
        this.f131764e = cVar5;
    }

    public static d1 a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.modules.user.user.q0> cVar2, ij.c<com.planner5d.library.legal.model.manager.a> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<com.planner5d.library.modules.user.user.b> cVar5) {
        return new d1(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static c1 c(com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.modules.user.user.q0 q0Var, com.planner5d.library.legal.model.manager.a aVar, ErrorMessageParser errorMessageParser, com.planner5d.library.modules.user.user.b bVar) {
        return new c1(tVar, q0Var, aVar, errorMessageParser, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c1 get() {
        return c(this.f131760a.get(), this.f131761b.get(), this.f131762c.get(), this.f131763d.get(), this.f131764e.get());
    }
}
