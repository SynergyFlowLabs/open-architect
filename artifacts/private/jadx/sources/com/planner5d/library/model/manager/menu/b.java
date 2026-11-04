package com.planner5d.library.model.manager.menu;

import com.planner5d.library.application.d;
import com.planner5d.library.model.manager.config.j;
import com.planner5d.library.modules.user.user.t0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;
import ij.c;

/* JADX INFO: loaded from: classes8.dex */
@r
@e
@s("javax.inject.Singleton")
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<com.planner5d.library.application.b> f192188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<t0> f192189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c<d> f192190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c<ed.a> f192191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c<j> f192192e;

    public b(c<com.planner5d.library.application.b> cVar, c<t0> cVar2, c<d> cVar3, c<ed.a> cVar4, c<j> cVar5) {
        this.f192188a = cVar;
        this.f192189b = cVar2;
        this.f192190c = cVar3;
        this.f192191d = cVar4;
        this.f192192e = cVar5;
    }

    public static b a(c<com.planner5d.library.application.b> cVar, c<t0> cVar2, c<d> cVar3, c<ed.a> cVar4, c<j> cVar5) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(com.planner5d.library.application.b bVar, t0 t0Var, d dVar, ed.a aVar, j jVar) {
        return new a(bVar, t0Var, dVar, aVar, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f192188a.get(), this.f192189b.get(), this.f192190c.get(), this.f192191d.get(), this.f192192e.get());
    }
}
