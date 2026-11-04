package com.planner5d.library.model.manager.managedfiles;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class b0 implements dagger.internal.h<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y> f191972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.p> f191973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p.a> f191974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.r> f191975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<f1> f191976e;

    public b0(ij.c<y> cVar, ij.c<com.planner5d.library.model.manager.builtin.p> cVar2, ij.c<p.a> cVar3, ij.c<com.planner5d.library.model.manager.initialization.r> cVar4, ij.c<f1> cVar5) {
        this.f191972a = cVar;
        this.f191973b = cVar2;
        this.f191974c = cVar3;
        this.f191975d = cVar4;
        this.f191976e = cVar5;
    }

    public static b0 a(ij.c<y> cVar, ij.c<com.planner5d.library.model.manager.builtin.p> cVar2, ij.c<p.a> cVar3, ij.c<com.planner5d.library.model.manager.initialization.r> cVar4, ij.c<f1> cVar5) {
        return new b0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a0 c(fg.e<y> eVar, com.planner5d.library.model.manager.builtin.p pVar, fg.e<p.a> eVar2, com.planner5d.library.model.manager.initialization.r rVar, f1 f1Var) {
        return new a0(eVar, pVar, eVar2, rVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c(dagger.internal.g.a(this.f191972a), this.f191973b.get(), dagger.internal.g.a(this.f191974c), this.f191975d.get(), this.f191976e.get());
    }
}
