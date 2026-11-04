package com.planner5d.library.model.manager.spaces;

import com.planner5d.library.database.model.spaces.d;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.p0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@e
@s("javax.inject.Singleton")
public final class c implements h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f197801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p> f197802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d> f197803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f197804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<w> f197805e;

    public c(ij.c<p0> cVar, ij.c<p> cVar2, ij.c<d> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<w> cVar5) {
        this.f197801a = cVar;
        this.f197802b = cVar2;
        this.f197803c = cVar3;
        this.f197804d = cVar4;
        this.f197805e = cVar5;
    }

    public static c a(ij.c<p0> cVar, ij.c<p> cVar2, ij.c<d> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<w> cVar5) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static b c(p0 p0Var, p pVar, fg.e<d> eVar, com.planner5d.library.api.requests.c cVar, w wVar) {
        return new b(p0Var, pVar, eVar, cVar, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f197801a.get(), this.f197802b.get(), g.a(this.f197803c), this.f197804d.get(), this.f197805e.get());
    }
}
