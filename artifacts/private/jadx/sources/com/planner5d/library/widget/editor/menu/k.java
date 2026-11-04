package com.planner5d.library.widget.editor.menu;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f257121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f257122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f257123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y1> f257124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f257125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f257126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f257127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<f1> f257128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f257129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f257130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<pa.b> f257131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<y0> f257132l;

    public k(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<b2> cVar3, ij.c<y1> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar6, ij.c<com.planner5d.library.application.d> cVar7, ij.c<f1> cVar8, ij.c<com.planner5d.library.model.manager.config.j> cVar9, ij.c<com.planner5d.library.services.utility.p0> cVar10, ij.c<pa.b> cVar11, ij.c<y0> cVar12) {
        this.f257121a = cVar;
        this.f257122b = cVar2;
        this.f257123c = cVar3;
        this.f257124d = cVar4;
        this.f257125e = cVar5;
        this.f257126f = cVar6;
        this.f257127g = cVar7;
        this.f257128h = cVar8;
        this.f257129i = cVar9;
        this.f257130j = cVar10;
        this.f257131k = cVar11;
        this.f257132l = cVar12;
    }

    public static k a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<b2> cVar3, ij.c<y1> cVar4, ij.c<com.planner5d.library.activity.fragment.x> cVar5, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar6, ij.c<com.planner5d.library.application.d> cVar7, ij.c<f1> cVar8, ij.c<com.planner5d.library.model.manager.config.j> cVar9, ij.c<com.planner5d.library.services.utility.p0> cVar10, ij.c<pa.b> cVar11, ij.c<y0> cVar12) {
        return new k(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12);
    }

    public static j c(com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.model.manager.project.d0 d0Var, b2 b2Var, y1 y1Var, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.application.d dVar, f1 f1Var, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.services.utility.p0 p0Var, pa.b bVar, y0 y0Var) {
        return new j(tVar, d0Var, b2Var, y1Var, xVar, kVar, dVar, f1Var, jVar, p0Var, bVar, y0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f257121a.get(), this.f257122b.get(), this.f257123c.get(), this.f257124d.get(), this.f257125e.get(), this.f257126f.get(), this.f257127g.get(), this.f257128h.get(), this.f257129i.get(), this.f257130j.get(), this.f257131k.get(), this.f257132l.get());
    }
}
