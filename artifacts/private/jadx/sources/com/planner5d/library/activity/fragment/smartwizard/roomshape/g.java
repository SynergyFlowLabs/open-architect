package com.planner5d.library.activity.fragment.smartwizard.roomshape;

import com.planner5d.library.activity.fragment.smartwizard.v;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.converter.json.to.o;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.helper.n3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<v> f135620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f135621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f135622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f135623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<n3> f135624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<sd.e> f135625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<c2> f135626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f135627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<oa.f> f135628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<o> f135629j;

    public g(ij.c<v> cVar, ij.c<x> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<n3> cVar5, ij.c<sd.e> cVar6, ij.c<c2> cVar7, ij.c<com.planner5d.library.application.b> cVar8, ij.c<oa.f> cVar9, ij.c<o> cVar10) {
        this.f135620a = cVar;
        this.f135621b = cVar2;
        this.f135622c = cVar3;
        this.f135623d = cVar4;
        this.f135624e = cVar5;
        this.f135625f = cVar6;
        this.f135626g = cVar7;
        this.f135627h = cVar8;
        this.f135628i = cVar9;
        this.f135629j = cVar10;
    }

    public static g a(ij.c<v> cVar, ij.c<x> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<n3> cVar5, ij.c<sd.e> cVar6, ij.c<c2> cVar7, ij.c<com.planner5d.library.application.b> cVar8, ij.c<oa.f> cVar9, ij.c<o> cVar10) {
        return new g(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static f c(v vVar, x xVar, b2 b2Var, com.planner5d.library.activity.fragment.dialog.k kVar, n3 n3Var, sd.e eVar, c2 c2Var, com.planner5d.library.application.b bVar, oa.f fVar, o oVar) {
        return new f(vVar, xVar, b2Var, kVar, n3Var, eVar, c2Var, bVar, fVar, oVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f135620a.get(), this.f135621b.get(), this.f135622c.get(), this.f135623d.get(), this.f135624e.get(), this.f135625f.get(), this.f135626g.get(), this.f135627h.get(), this.f135628i.get(), this.f135629j.get());
    }
}
