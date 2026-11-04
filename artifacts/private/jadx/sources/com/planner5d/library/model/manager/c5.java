package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c5 implements dagger.internal.h<a5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<h> f181416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f181417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<q4> f181418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f181419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f181420e;

    public c5(ij.c<h> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<q4> cVar3, ij.c<com.planner5d.library.services.utility.c2> cVar4, ij.c<com.planner5d.library.services.utility.f1> cVar5) {
        this.f181416a = cVar;
        this.f181417b = cVar2;
        this.f181418c = cVar3;
        this.f181419d = cVar4;
        this.f181420e = cVar5;
    }

    public static c5 a(ij.c<h> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<q4> cVar3, ij.c<com.planner5d.library.services.utility.c2> cVar4, ij.c<com.planner5d.library.services.utility.f1> cVar5) {
        return new c5(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a5 c(h hVar, com.planner5d.library.model.manager.config.p pVar, q4 q4Var, com.planner5d.library.services.utility.c2 c2Var, com.planner5d.library.services.utility.f1 f1Var) {
        return new a5(hVar, pVar, q4Var, c2Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a5 get() {
        return c(this.f181416a.get(), this.f181417b.get(), this.f181418c.get(), this.f181419d.get(), this.f181420e.get());
    }
}
