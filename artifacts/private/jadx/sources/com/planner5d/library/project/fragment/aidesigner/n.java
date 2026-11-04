package com.planner5d.library.project.fragment.aidesigner;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.utility.c2;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f223717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f223718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f223719c;

    public n(ij.c<StatisticsEventAiDesigner> cVar, ij.c<c2> cVar2, ij.c<b2> cVar3) {
        this.f223717a = cVar;
        this.f223718b = cVar2;
        this.f223719c = cVar3;
    }

    public static n a(ij.c<StatisticsEventAiDesigner> cVar, ij.c<c2> cVar2, ij.c<b2> cVar3) {
        return new n(cVar, cVar2, cVar3);
    }

    public static m c(StatisticsEventAiDesigner statisticsEventAiDesigner, c2 c2Var, b2 b2Var) {
        return new m(statisticsEventAiDesigner, c2Var, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f223717a.get(), this.f223718b.get(), this.f223719c.get());
    }
}
