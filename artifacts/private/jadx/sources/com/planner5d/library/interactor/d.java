package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.t1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f180086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f180087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<s0> f180088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t1> f180089d;

    public d(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<s0> cVar3, ij.c<t1> cVar4) {
        this.f180086a = cVar;
        this.f180087b = cVar2;
        this.f180088c = cVar3;
        this.f180089d = cVar4;
    }

    public static d a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<s0> cVar3, ij.c<t1> cVar4) {
        return new d(cVar, cVar2, cVar3, cVar4);
    }

    public static c c(fg.e<com.planner5d.library.api.requests.c> eVar, com.planner5d.library.modules.user.user.t tVar, s0 s0Var, fg.e<t1> eVar2) {
        return new c(eVar, tVar, s0Var, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(dagger.internal.g.a(this.f180086a), this.f180087b.get(), this.f180088c.get(), dagger.internal.g.a(this.f180089d));
    }
}
