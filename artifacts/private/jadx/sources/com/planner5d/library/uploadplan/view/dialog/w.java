package com.planner5d.library.uploadplan.view.dialog;

import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f231015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<le.a> f231016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f231017c;

    public w(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<le.a> cVar2, ij.c<StatisticsEventAiDesigner> cVar3) {
        this.f231015a = cVar;
        this.f231016b = cVar2;
        this.f231017c = cVar3;
    }

    public static w a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<le.a> cVar2, ij.c<StatisticsEventAiDesigner> cVar3) {
        return new w(cVar, cVar2, cVar3);
    }

    public static v c(fg.e<com.planner5d.library.modules.user.user.t> eVar, le.a aVar, StatisticsEventAiDesigner statisticsEventAiDesigner) {
        return new v(eVar, aVar, statisticsEventAiDesigner);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(dagger.internal.g.a(this.f231015a), this.f231016b.get(), this.f231017c.get());
    }
}
