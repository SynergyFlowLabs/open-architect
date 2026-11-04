package com.planner5d.library.dgenerator.fragment.list;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class p implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f160396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f160397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<nb.g> f160398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<nb.h> f160399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<nb.f> f160400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f160402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<j3> f160403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<c2> f160404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f160405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<f1> f160406k;

    public p(ij.c<com.planner5d.library.application.b> cVar, ij.c<b2> cVar2, ij.c<nb.g> cVar3, ij.c<nb.h> cVar4, ij.c<nb.f> cVar5, ij.c<com.planner5d.library.database.manager.a> cVar6, ij.c<com.planner5d.library.model.manager.builtin.i> cVar7, ij.c<j3> cVar8, ij.c<c2> cVar9, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar10, ij.c<f1> cVar11) {
        this.f160396a = cVar;
        this.f160397b = cVar2;
        this.f160398c = cVar3;
        this.f160399d = cVar4;
        this.f160400e = cVar5;
        this.f160401f = cVar6;
        this.f160402g = cVar7;
        this.f160403h = cVar8;
        this.f160404i = cVar9;
        this.f160405j = cVar10;
        this.f160406k = cVar11;
    }

    public static p a(ij.c<com.planner5d.library.application.b> cVar, ij.c<b2> cVar2, ij.c<nb.g> cVar3, ij.c<nb.h> cVar4, ij.c<nb.f> cVar5, ij.c<com.planner5d.library.database.manager.a> cVar6, ij.c<com.planner5d.library.model.manager.builtin.i> cVar7, ij.c<j3> cVar8, ij.c<c2> cVar9, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar10, ij.c<f1> cVar11) {
        return new p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    public static n c(com.planner5d.library.application.b bVar, b2 b2Var, nb.g gVar, nb.h hVar, nb.f fVar, com.planner5d.library.database.manager.a aVar, com.planner5d.library.model.manager.builtin.i iVar, j3 j3Var, c2 c2Var, com.planner5d.library.activity.fragment.dialog.k kVar, f1 f1Var) {
        return new n(bVar, b2Var, gVar, hVar, fVar, aVar, iVar, j3Var, c2Var, kVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f160396a.get(), this.f160397b.get(), this.f160398c.get(), this.f160399d.get(), this.f160400e.get(), this.f160401f.get(), this.f160402g.get(), this.f160403h.get(), this.f160404i.get(), this.f160405j.get(), this.f160406k.get());
    }
}
