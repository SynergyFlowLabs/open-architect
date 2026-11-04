package com.planner5d.library.activity.fragment.dialog.purchase.designgenerator;

import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.t1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f132571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n1> f132572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f132573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> f132574d;

    public h(ij.c<com.planner5d.library.application.b> cVar, ij.c<n1> cVar2, ij.c<t1> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar4) {
        this.f132571a = cVar;
        this.f132572b = cVar2;
        this.f132573c = cVar3;
        this.f132574d = cVar4;
    }

    public static h a(ij.c<com.planner5d.library.application.b> cVar, ij.c<n1> cVar2, ij.c<t1> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar4) {
        return new h(cVar, cVar2, cVar3, cVar4);
    }

    public static g c(com.planner5d.library.application.b bVar, n1 n1Var, t1 t1Var, com.planner5d.library.activity.fragment.dialog.purchase.c.a aVar) {
        return new g(bVar, n1Var, t1Var, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f132571a.get(), this.f132572b.get(), this.f132573c.get(), this.f132574d.get());
    }
}
