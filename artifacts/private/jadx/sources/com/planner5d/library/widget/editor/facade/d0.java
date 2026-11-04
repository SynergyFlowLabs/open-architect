package com.planner5d.library.widget.editor.facade;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.u0;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d0 implements dagger.internal.h<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.projectresources.e> f256088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f256089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<s0> f256090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f256091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f256092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<u0> f256093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.catalog.g> f256094g;

    public d0(ij.c<com.planner5d.library.widget.editor.projectresources.e> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<s0> cVar3, ij.c<b2> cVar4, ij.c<t1> cVar5, ij.c<u0> cVar6, ij.c<com.planner5d.library.widget.editor.catalog.g> cVar7) {
        this.f256088a = cVar;
        this.f256089b = cVar2;
        this.f256090c = cVar3;
        this.f256091d = cVar4;
        this.f256092e = cVar5;
        this.f256093f = cVar6;
        this.f256094g = cVar7;
    }

    public static d0 a(ij.c<com.planner5d.library.widget.editor.projectresources.e> cVar, ij.c<com.planner5d.library.model.manager.builtin.i> cVar2, ij.c<s0> cVar3, ij.c<b2> cVar4, ij.c<t1> cVar5, ij.c<u0> cVar6, ij.c<com.planner5d.library.widget.editor.catalog.g> cVar7) {
        return new d0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static c0 c(com.planner5d.library.widget.editor.projectresources.e eVar, com.planner5d.library.model.manager.builtin.i iVar, s0 s0Var, b2 b2Var, t1 t1Var, u0 u0Var, com.planner5d.library.widget.editor.catalog.g gVar) {
        return new c0(eVar, iVar, s0Var, b2Var, t1Var, u0Var, gVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f256088a.get(), this.f256089b.get(), this.f256090c.get(), this.f256091d.get(), this.f256092e.get(), this.f256093f.get(), this.f256094g.get());
    }
}
