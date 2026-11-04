package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f181234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f181235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<i> f181236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n1> f181237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<r> f181239f;

    public v(ij.c<i> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<i> cVar3, ij.c<n1> cVar4, ij.c<com.planner5d.library.application.b> cVar5, ij.c<r> cVar6) {
        this.f181234a = cVar;
        this.f181235b = cVar2;
        this.f181236c = cVar3;
        this.f181237d = cVar4;
        this.f181238e = cVar5;
        this.f181239f = cVar6;
    }

    public static v a(ij.c<i> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<i> cVar3, ij.c<n1> cVar4, ij.c<com.planner5d.library.application.b> cVar5, ij.c<r> cVar6) {
        return new v(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static u c(fg.e<i> eVar, com.planner5d.library.application.d dVar) {
        return new u(eVar, dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        u uVarC = c(dagger.internal.g.a(this.f181234a), this.f181235b.get());
        w.c(uVarC, dagger.internal.g.a(this.f181236c));
        w.e(uVarC, dagger.internal.g.a(this.f181237d));
        w.b(uVarC, dagger.internal.g.a(this.f181238e));
        w.d(uVarC, this.f181239f.get());
        return uVarC;
    }
}
