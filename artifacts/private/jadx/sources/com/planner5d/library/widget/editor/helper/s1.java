package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s1 implements dagger.internal.h<r1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f256722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.a> f256723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f256724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f256725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f256726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f256727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f256728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.b0> f256729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f256730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.r> f256731j;

    public s1(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<com.planner5d.library.model.a> cVar2, ij.c<com.planner5d.library.activity.fragment.x> cVar3, ij.c<com.planner5d.library.model.manager.project.d0> cVar4, ij.c<com.planner5d.library.model.manager.t1> cVar5, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar6, ij.c<StatisticsEventAiDesigner> cVar7, ij.c<com.planner5d.library.model.manager.payments.b0> cVar8, ij.c<com.planner5d.library.services.utility.f1> cVar9, ij.c<com.planner5d.library.activity.helper.r> cVar10) {
        this.f256722a = cVar;
        this.f256723b = cVar2;
        this.f256724c = cVar3;
        this.f256725d = cVar4;
        this.f256726e = cVar5;
        this.f256727f = cVar6;
        this.f256728g = cVar7;
        this.f256729h = cVar8;
        this.f256730i = cVar9;
        this.f256731j = cVar10;
    }

    public static s1 a(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<com.planner5d.library.model.a> cVar2, ij.c<com.planner5d.library.activity.fragment.x> cVar3, ij.c<com.planner5d.library.model.manager.project.d0> cVar4, ij.c<com.planner5d.library.model.manager.t1> cVar5, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar6, ij.c<StatisticsEventAiDesigner> cVar7, ij.c<com.planner5d.library.model.manager.payments.b0> cVar8, ij.c<com.planner5d.library.services.utility.f1> cVar9, ij.c<com.planner5d.library.activity.helper.r> cVar10) {
        return new s1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static r1 c(com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.a aVar, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.model.manager.t1 t1Var, com.planner5d.library.activity.fragment.dialog.k kVar, StatisticsEventAiDesigner statisticsEventAiDesigner, com.planner5d.library.model.manager.payments.b0 b0Var, com.planner5d.library.services.utility.f1 f1Var, com.planner5d.library.activity.helper.r rVar) {
        return new r1(pVar, aVar, xVar, d0Var, t1Var, kVar, statisticsEventAiDesigner, b0Var, f1Var, rVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r1 get() {
        return c(this.f256722a.get(), this.f256723b.get(), this.f256724c.get(), this.f256725d.get(), this.f256726e.get(), this.f256727f.get(), this.f256728g.get(), this.f256729h.get(), this.f256730i.get(), this.f256731j.get());
    }
}
