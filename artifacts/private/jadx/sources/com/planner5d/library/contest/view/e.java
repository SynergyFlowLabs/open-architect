package com.planner5d.library.contest.view;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
public final class e implements fg.g<ContestDetailFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f153694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o1> f153695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.q> f153696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f153697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<x2> f153698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f153699f;

    public e(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<c2> cVar4, ij.c<x2> cVar5, ij.c<com.planner5d.library.model.manager.w> cVar6) {
        this.f153694a = cVar;
        this.f153695b = cVar2;
        this.f153696c = cVar3;
        this.f153697d = cVar4;
        this.f153698e = cVar5;
        this.f153699f = cVar6;
    }

    public static fg.g<ContestDetailFragment> a(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<c2> cVar4, ij.c<x2> cVar5, ij.c<com.planner5d.library.model.manager.w> cVar6) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestDetailFragment.configuration")
    public static void b(ContestDetailFragment contestDetailFragment, x2 x2Var) {
        contestDetailFragment.configuration = x2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestDetailFragment.featureConfigManager")
    public static void c(ContestDetailFragment contestDetailFragment, com.planner5d.library.model.manager.w wVar) {
        contestDetailFragment.featureConfigManager = wVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestDetailFragment.formatter")
    public static void d(ContestDetailFragment contestDetailFragment, p0 p0Var) {
        contestDetailFragment.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestDetailFragment.imageManager")
    public static void e(ContestDetailFragment contestDetailFragment, com.planner5d.library.services.q qVar) {
        contestDetailFragment.imageManager = qVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestDetailFragment.languageManager")
    public static void f(ContestDetailFragment contestDetailFragment, o1 o1Var) {
        contestDetailFragment.languageManager = o1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestDetailFragment.messageManager")
    public static void h(ContestDetailFragment contestDetailFragment, c2 c2Var) {
        contestDetailFragment.messageManager = c2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestDetailFragment contestDetailFragment) {
        d(contestDetailFragment, this.f153694a.get());
        f(contestDetailFragment, this.f153695b.get());
        e(contestDetailFragment, this.f153696c.get());
        h(contestDetailFragment, this.f153697d.get());
        b(contestDetailFragment, this.f153698e.get());
        c(contestDetailFragment, this.f153699f.get());
    }
}
