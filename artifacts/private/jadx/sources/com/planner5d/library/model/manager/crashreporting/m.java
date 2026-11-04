package com.planner5d.library.model.manager.crashreporting;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f191209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f191210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f191211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<v> f191212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<d0> f191213e;

    public m(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<t1> cVar2, ij.c<f1> cVar3, ij.c<v> cVar4, ij.c<d0> cVar5) {
        this.f191209a = cVar;
        this.f191210b = cVar2;
        this.f191211c = cVar3;
        this.f191212d = cVar4;
        this.f191213e = cVar5;
    }

    public static m a(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<t1> cVar2, ij.c<f1> cVar3, ij.c<v> cVar4, ij.c<d0> cVar5) {
        return new m(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static l c(fg.e<com.planner5d.library.model.manager.config.j> eVar, fg.e<t1> eVar2, f1 f1Var, fg.e<v> eVar3, fg.e<d0> eVar4) {
        return new l(eVar, eVar2, f1Var, eVar3, eVar4);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(dagger.internal.g.a(this.f191209a), dagger.internal.g.a(this.f191210b), this.f191211c.get(), dagger.internal.g.a(this.f191212d), dagger.internal.g.a(this.f191213e));
    }
}
