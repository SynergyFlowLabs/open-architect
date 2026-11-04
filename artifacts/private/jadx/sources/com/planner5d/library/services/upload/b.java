package com.planner5d.library.services.upload;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.i;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f225026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f225027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<j2> f225028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<x> f225029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<g> f225030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f1> f225031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<i> f225032g;

    public b(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar2, ij.c<j2> cVar3, ij.c<x> cVar4, ij.c<g> cVar5, ij.c<f1> cVar6, ij.c<i> cVar7) {
        this.f225026a = cVar;
        this.f225027b = cVar2;
        this.f225028c = cVar3;
        this.f225029d = cVar4;
        this.f225030e = cVar5;
        this.f225031f = cVar6;
        this.f225032g = cVar7;
    }

    public static b a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar2, ij.c<j2> cVar3, ij.c<x> cVar4, ij.c<g> cVar5, ij.c<f1> cVar6, ij.c<i> cVar7) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static a c(com.planner5d.library.application.b bVar, fg.e<com.planner5d.library.model.manager.spaces.documents.c> eVar, j2 j2Var, x xVar, g gVar, f1 f1Var, fg.e<i> eVar2) {
        return new a(bVar, eVar, j2Var, xVar, gVar, f1Var, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f225026a.get(), dagger.internal.g.a(this.f225027b), this.f225028c.get(), this.f225029d.get(), this.f225030e.get(), this.f225031f.get(), dagger.internal.g.a(this.f225032g));
    }
}
