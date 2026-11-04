package com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview;

import com.planner5d.library.engine.p;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.popup.itemproperties.b> f257837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f257838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<k5> f257839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t0> f257840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b2> f257841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.engine.i> f257842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<vb.f> f257843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<p> f257844h;

    public o(ij.c<com.planner5d.library.widget.editor.popup.itemproperties.b> cVar, ij.c<t> cVar2, ij.c<k5> cVar3, ij.c<t0> cVar4, ij.c<b2> cVar5, ij.c<com.planner5d.library.engine.i> cVar6, ij.c<vb.f> cVar7, ij.c<p> cVar8) {
        this.f257837a = cVar;
        this.f257838b = cVar2;
        this.f257839c = cVar3;
        this.f257840d = cVar4;
        this.f257841e = cVar5;
        this.f257842f = cVar6;
        this.f257843g = cVar7;
        this.f257844h = cVar8;
    }

    public static o a(ij.c<com.planner5d.library.widget.editor.popup.itemproperties.b> cVar, ij.c<t> cVar2, ij.c<k5> cVar3, ij.c<t0> cVar4, ij.c<b2> cVar5, ij.c<com.planner5d.library.engine.i> cVar6, ij.c<vb.f> cVar7, ij.c<p> cVar8) {
        return new o(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static n c(com.planner5d.library.widget.editor.popup.itemproperties.b bVar, t tVar, k5 k5Var, t0 t0Var, b2 b2Var, com.planner5d.library.engine.i iVar, vb.f fVar, p pVar) {
        return new n(bVar, tVar, k5Var, t0Var, b2Var, iVar, fVar, pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f257837a.get(), this.f257838b.get(), this.f257839c.get(), this.f257840d.get(), this.f257841e.get(), this.f257842f.get(), this.f257843g.get(), this.f257844h.get());
    }
}
