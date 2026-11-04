package com.planner5d.library.contest.view;

import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d0 implements dagger.internal.h<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f153504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o1> f153505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.q> f153506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.target.h> f153507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<Boolean> f153508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<c0.b> f153509f;

    public d0(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<com.planner5d.library.services.bitmaploader.target.h> cVar4, ij.c<Boolean> cVar5, ij.c<c0.b> cVar6) {
        this.f153504a = cVar;
        this.f153505b = cVar2;
        this.f153506c = cVar3;
        this.f153507d = cVar4;
        this.f153508e = cVar5;
        this.f153509f = cVar6;
    }

    public static d0 a(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<com.planner5d.library.services.bitmaploader.target.h> cVar4, ij.c<Boolean> cVar5, ij.c<c0.b> cVar6) {
        return new d0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static c0 c(p0 p0Var, o1 o1Var, com.planner5d.library.services.q qVar, com.planner5d.library.services.bitmaploader.target.h hVar, boolean z10, c0.b bVar) {
        return new c0(p0Var, o1Var, qVar, hVar, z10, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f153504a.get(), this.f153505b.get(), this.f153506c.get(), this.f153507d.get(), this.f153508e.get().booleanValue(), this.f153509f.get());
    }
}
