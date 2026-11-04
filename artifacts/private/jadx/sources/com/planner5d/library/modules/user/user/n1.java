package com.planner5d.library.modules.user.user;

import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n1 implements dagger.internal.h<m1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f223229b;

    public n1(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<t1> cVar2) {
        this.f223228a = cVar;
        this.f223229b = cVar2;
    }

    public static n1 a(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<t1> cVar2) {
        return new n1(cVar, cVar2);
    }

    public static m1 c(com.planner5d.library.model.manager.config.p pVar, fg.e<t1> eVar) {
        return new m1(pVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m1 get() {
        return c(this.f223228a.get(), dagger.internal.g.a(this.f223229b));
    }
}
