package com.planner5d.library.contest.view.voting;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.statistics.events.l3;
import dagger.internal.r;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
public final class l implements fg.g<ContestVotingFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f153874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f153875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<o1> f153876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<l3> f153877d;

    public l(ij.c<c2> cVar, ij.c<com.planner5d.library.services.utility.c2> cVar2, ij.c<o1> cVar3, ij.c<l3> cVar4) {
        this.f153874a = cVar;
        this.f153875b = cVar2;
        this.f153876c = cVar3;
        this.f153877d = cVar4;
    }

    public static fg.g<ContestVotingFragment> a(ij.c<c2> cVar, ij.c<com.planner5d.library.services.utility.c2> cVar2, ij.c<o1> cVar3, ij.c<l3> cVar4) {
        return new l(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.voting.ContestVotingFragment.languageManager")
    public static void b(ContestVotingFragment contestVotingFragment, o1 o1Var) {
        contestVotingFragment.languageManager = o1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.voting.ContestVotingFragment.messageManager")
    public static void d(ContestVotingFragment contestVotingFragment, c2 c2Var) {
        contestVotingFragment.messageManager = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.voting.ContestVotingFragment.networkStateUtility")
    public static void e(ContestVotingFragment contestVotingFragment, com.planner5d.library.services.utility.c2 c2Var) {
        contestVotingFragment.networkStateUtility = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.voting.ContestVotingFragment.statisticsEventContests")
    public static void f(ContestVotingFragment contestVotingFragment, l3 l3Var) {
        contestVotingFragment.statisticsEventContests = l3Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestVotingFragment contestVotingFragment) {
        d(contestVotingFragment, this.f153874a.get());
        e(contestVotingFragment, this.f153875b.get());
        b(contestVotingFragment, this.f153876c.get());
        f(contestVotingFragment, this.f153877d.get());
    }
}
