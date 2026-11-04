package com.planner5d.library.services.download;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.model.manager.managedfiles.a0;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f224267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<a0> f224268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<j2> f224269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<x> f224270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<d> f224271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f1> f224272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.i> f224273g;

    public b(ij.c<com.planner5d.library.application.b> cVar, ij.c<a0> cVar2, ij.c<j2> cVar3, ij.c<x> cVar4, ij.c<d> cVar5, ij.c<f1> cVar6, ij.c<com.planner5d.library.model.manager.i> cVar7) {
        this.f224267a = cVar;
        this.f224268b = cVar2;
        this.f224269c = cVar3;
        this.f224270d = cVar4;
        this.f224271e = cVar5;
        this.f224272f = cVar6;
        this.f224273g = cVar7;
    }

    public static b a(ij.c<com.planner5d.library.application.b> cVar, ij.c<a0> cVar2, ij.c<j2> cVar3, ij.c<x> cVar4, ij.c<d> cVar5, ij.c<f1> cVar6, ij.c<com.planner5d.library.model.manager.i> cVar7) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static a c(com.planner5d.library.application.b bVar, fg.e<a0> eVar, j2 j2Var, x xVar, d dVar, f1 f1Var, fg.e<com.planner5d.library.model.manager.i> eVar2) {
        return new a(bVar, eVar, j2Var, xVar, dVar, f1Var, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f224267a.get(), dagger.internal.g.a(this.f224268b), this.f224269c.get(), this.f224270d.get(), this.f224271e.get(), this.f224272f.get(), dagger.internal.g.a(this.f224273g));
    }
}
