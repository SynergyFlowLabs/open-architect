package com.planner5d.library.activity.fragment.feed.holders;

import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.u0;
import com.planner5d.library.model.manager.y0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d0> f133378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y0> f133379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<n1> f133380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<u0> f133381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.view.holders.b> f133382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.g> f133383f;

    public b(ij.c<d0> cVar, ij.c<y0> cVar2, ij.c<n1> cVar3, ij.c<u0> cVar4, ij.c<com.planner5d.library.feed.view.holders.b> cVar5, ij.c<com.planner5d.library.model.manager.contest.g> cVar6) {
        this.f133378a = cVar;
        this.f133379b = cVar2;
        this.f133380c = cVar3;
        this.f133381d = cVar4;
        this.f133382e = cVar5;
        this.f133383f = cVar6;
    }

    public static b a(ij.c<d0> cVar, ij.c<y0> cVar2, ij.c<n1> cVar3, ij.c<u0> cVar4, ij.c<com.planner5d.library.feed.view.holders.b> cVar5, ij.c<com.planner5d.library.model.manager.contest.g> cVar6) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static a c(d0 d0Var, y0 y0Var, n1 n1Var, u0 u0Var, com.planner5d.library.feed.view.holders.b bVar, com.planner5d.library.model.manager.contest.g gVar) {
        return new a(d0Var, y0Var, n1Var, u0Var, bVar, gVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f133378a.get(), this.f133379b.get(), this.f133380c.get(), this.f133381d.get(), this.f133382e.get(), this.f133383f.get());
    }
}
