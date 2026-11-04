package com.planner5d.library.legal.model.manager;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.modules.user.user.r0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.c2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes7.dex */
@r
@e
@s("com.planner5d.library.legal.application.LegalScope")
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<p> f180419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<r0> f180420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c<w> f180421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c<c2> f180422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c<u1> f180423e;

    public b(c<p> cVar, c<r0> cVar2, c<w> cVar3, c<c2> cVar4, c<u1> cVar5) {
        this.f180419a = cVar;
        this.f180420b = cVar2;
        this.f180421c = cVar3;
        this.f180422d = cVar4;
        this.f180423e = cVar5;
    }

    public static b a(c<p> cVar, c<r0> cVar2, c<w> cVar3, c<c2> cVar4, c<u1> cVar5) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(p pVar, r0 r0Var, w wVar, c2 c2Var, u1 u1Var) {
        return new a(pVar, r0Var, wVar, c2Var, u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f180419a.get(), this.f180420b.get(), this.f180421c.get(), this.f180422d.get(), this.f180423e.get());
    }
}
