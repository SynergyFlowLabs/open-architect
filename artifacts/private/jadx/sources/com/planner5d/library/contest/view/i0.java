package com.planner5d.library.contest.view;

import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.r3;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
public final class i0 implements fg.g<MainContestPage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<l3> f153709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<r3> f153710b;

    public i0(ij.c<l3> cVar, ij.c<r3> cVar2) {
        this.f153709a = cVar;
        this.f153710b = cVar2;
    }

    public static fg.g<MainContestPage> a(ij.c<l3> cVar, ij.c<r3> cVar2) {
        return new i0(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.MainContestPage.statisticsEventContests")
    public static void c(MainContestPage mainContestPage, l3 l3Var) {
        mainContestPage.statisticsEventContests = l3Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.MainContestPage.statisticsEventGeneric")
    public static void d(MainContestPage mainContestPage, r3 r3Var) {
        mainContestPage.statisticsEventGeneric = r3Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(MainContestPage mainContestPage) {
        c(mainContestPage, this.f153709a.get());
        d(mainContestPage, this.f153710b.get());
    }
}
