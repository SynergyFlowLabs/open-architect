package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x1 implements dagger.internal.h<w1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<le.a> f256856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f256857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.z0> f256858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f256859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f256860e;

    public x1(ij.c<le.a> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.activity.fragment.projects.z0> cVar3, ij.c<com.planner5d.library.model.manager.t1> cVar4, ij.c<StatisticsEventAiDesigner> cVar5) {
        this.f256856a = cVar;
        this.f256857b = cVar2;
        this.f256858c = cVar3;
        this.f256859d = cVar4;
        this.f256860e = cVar5;
    }

    public static x1 a(ij.c<le.a> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.activity.fragment.projects.z0> cVar3, ij.c<com.planner5d.library.model.manager.t1> cVar4, ij.c<StatisticsEventAiDesigner> cVar5) {
        return new x1(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static w1 c(le.a aVar, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.activity.fragment.projects.z0 z0Var, com.planner5d.library.model.manager.t1 t1Var, StatisticsEventAiDesigner statisticsEventAiDesigner) {
        return new w1(aVar, kVar, z0Var, t1Var, statisticsEventAiDesigner);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w1 get() {
        return c(this.f256856a.get(), this.f256857b.get(), this.f256858c.get(), this.f256859d.get(), this.f256860e.get());
    }
}
