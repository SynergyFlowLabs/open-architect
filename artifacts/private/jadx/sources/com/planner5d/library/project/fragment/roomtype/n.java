package com.planner5d.library.project.fragment.roomtype;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.j3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n1> f223887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<pd.a> f223888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<pd.e> f223889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<pd.b> f223890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<j3> f223891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<b2> f223892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<StatisticsEventAiDesigner> f223893g;

    public n(ij.c<n1> cVar, ij.c<pd.a> cVar2, ij.c<pd.e> cVar3, ij.c<pd.b> cVar4, ij.c<j3> cVar5, ij.c<b2> cVar6, ij.c<StatisticsEventAiDesigner> cVar7) {
        this.f223887a = cVar;
        this.f223888b = cVar2;
        this.f223889c = cVar3;
        this.f223890d = cVar4;
        this.f223891e = cVar5;
        this.f223892f = cVar6;
        this.f223893g = cVar7;
    }

    public static n a(ij.c<n1> cVar, ij.c<pd.a> cVar2, ij.c<pd.e> cVar3, ij.c<pd.b> cVar4, ij.c<j3> cVar5, ij.c<b2> cVar6, ij.c<StatisticsEventAiDesigner> cVar7) {
        return new n(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static m c(n1 n1Var, pd.a aVar, pd.e eVar, pd.b bVar, j3 j3Var, b2 b2Var, StatisticsEventAiDesigner statisticsEventAiDesigner) {
        return new m(n1Var, aVar, eVar, bVar, j3Var, b2Var, statisticsEventAiDesigner);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f223887a.get(), this.f223888b.get(), this.f223889c.get(), this.f223890d.get(), this.f223891e.get(), this.f223892f.get(), this.f223893g.get());
    }
}
