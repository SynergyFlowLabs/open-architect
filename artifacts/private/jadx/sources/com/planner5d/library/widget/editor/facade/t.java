package com.planner5d.library.widget.editor.facade;

import com.planner5d.library.model.manager.k1;
import com.planner5d.library.widget.editor.helper.n3;
import com.planner5d.library.widget.editor.helper.q2;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f256150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f256151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f256152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n3> f256153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c0> f256154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.c0> f256155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<q2> f256156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.projectresources.e> f256157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f256158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.userimporteddata.n> f256159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<k1> f256160k;

    public t(ij.c<com.planner5d.library.model.manager.synchronization.i> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<n3> cVar4, ij.c<c0> cVar5, ij.c<com.planner5d.library.activity.fragment.c0> cVar6, ij.c<q2> cVar7, ij.c<com.planner5d.library.widget.editor.projectresources.e> cVar8, ij.c<com.planner5d.library.model.manager.builtin.i> cVar9, ij.c<com.planner5d.library.userimporteddata.n> cVar10, ij.c<k1> cVar11) {
        this.f256150a = cVar;
        this.f256151b = cVar2;
        this.f256152c = cVar3;
        this.f256153d = cVar4;
        this.f256154e = cVar5;
        this.f256155f = cVar6;
        this.f256156g = cVar7;
        this.f256157h = cVar8;
        this.f256158i = cVar9;
        this.f256159j = cVar10;
        this.f256160k = cVar11;
    }

    public static t a(ij.c<com.planner5d.library.model.manager.synchronization.i> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<n3> cVar4, ij.c<c0> cVar5, ij.c<com.planner5d.library.activity.fragment.c0> cVar6, ij.c<q2> cVar7, ij.c<com.planner5d.library.widget.editor.projectresources.e> cVar8, ij.c<com.planner5d.library.model.manager.builtin.i> cVar9, ij.c<com.planner5d.library.userimporteddata.n> cVar10, ij.c<k1> cVar11) {
        return new t(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    public static s c(com.planner5d.library.model.manager.synchronization.i iVar, com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.modules.user.user.t tVar, n3 n3Var, c0 c0Var, com.planner5d.library.activity.fragment.c0 c0Var2, q2 q2Var, com.planner5d.library.widget.editor.projectresources.e eVar, com.planner5d.library.model.manager.builtin.i iVar2, com.planner5d.library.userimporteddata.n nVar, k1 k1Var) {
        return new s(iVar, d0Var, tVar, n3Var, c0Var, c0Var2, q2Var, eVar, iVar2, nVar, k1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f256150a.get(), this.f256151b.get(), this.f256152c.get(), this.f256153d.get(), this.f256154e.get(), this.f256155f.get(), this.f256156g.get(), this.f256157h.get(), this.f256158i.get(), this.f256159j.get(), this.f256160k.get());
    }
}
