package com.planner5d.library.activity.fragment.smartwizard.decorator;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.widget.editor.helper.n3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ma.a> f135482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<pa.c> f135483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<ce.a> f135484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f135485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.r> f135486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<x> f135487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f135488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<b2> f135489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<n3> f135490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<sd.e> f135491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f135492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f135493l;

    public m(ij.c<ma.a> cVar, ij.c<pa.c> cVar2, ij.c<ce.a> cVar3, ij.c<c2> cVar4, ij.c<com.planner5d.library.activity.helper.r> cVar5, ij.c<x> cVar6, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar7, ij.c<b2> cVar8, ij.c<n3> cVar9, ij.c<sd.e> cVar10, ij.c<StatisticsEventAiDesigner> cVar11, ij.c<com.planner5d.library.application.b> cVar12) {
        this.f135482a = cVar;
        this.f135483b = cVar2;
        this.f135484c = cVar3;
        this.f135485d = cVar4;
        this.f135486e = cVar5;
        this.f135487f = cVar6;
        this.f135488g = cVar7;
        this.f135489h = cVar8;
        this.f135490i = cVar9;
        this.f135491j = cVar10;
        this.f135492k = cVar11;
        this.f135493l = cVar12;
    }

    public static m a(ij.c<ma.a> cVar, ij.c<pa.c> cVar2, ij.c<ce.a> cVar3, ij.c<c2> cVar4, ij.c<com.planner5d.library.activity.helper.r> cVar5, ij.c<x> cVar6, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar7, ij.c<b2> cVar8, ij.c<n3> cVar9, ij.c<sd.e> cVar10, ij.c<StatisticsEventAiDesigner> cVar11, ij.c<com.planner5d.library.application.b> cVar12) {
        return new m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12);
    }

    public static l c(ma.a aVar, pa.c cVar, ce.a aVar2, c2 c2Var, com.planner5d.library.activity.helper.r rVar, x xVar, com.planner5d.library.activity.fragment.dialog.k kVar, b2 b2Var, n3 n3Var, sd.e eVar, StatisticsEventAiDesigner statisticsEventAiDesigner, com.planner5d.library.application.b bVar) {
        return new l(aVar, cVar, aVar2, c2Var, rVar, xVar, kVar, b2Var, n3Var, eVar, statisticsEventAiDesigner, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f135482a.get(), this.f135483b.get(), this.f135484c.get(), this.f135485d.get(), this.f135486e.get(), this.f135487f.get(), this.f135488g.get(), this.f135489h.get(), this.f135490i.get(), this.f135491j.get(), this.f135492k.get(), this.f135493l.get());
    }
}
