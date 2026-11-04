package com.planner5d.library.application;

import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f3 implements dagger.internal.h<StatisticsEventAiDesigner> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142539a;

    public f3(i iVar) {
        this.f142539a = iVar;
    }

    public static f3 a(i iVar) {
        return new f3(iVar);
    }

    public static StatisticsEventAiDesigner c(i iVar) {
        return (StatisticsEventAiDesigner) dagger.internal.p.f(iVar.e1());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public StatisticsEventAiDesigner get() {
        return c(this.f142539a);
    }
}
