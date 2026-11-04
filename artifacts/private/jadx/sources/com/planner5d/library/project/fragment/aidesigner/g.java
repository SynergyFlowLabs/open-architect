package com.planner5d.library.project.fragment.aidesigner;

import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f223696a;

    public g(ij.c<StatisticsEventAiDesigner> cVar) {
        this.f223696a = cVar;
    }

    public static g a(ij.c<StatisticsEventAiDesigner> cVar) {
        return new g(cVar);
    }

    public static f c(StatisticsEventAiDesigner statisticsEventAiDesigner) {
        return new f(statisticsEventAiDesigner);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f223696a.get());
    }
}
