package com.planner5d.library.contest.view;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
public final class m implements fg.g<ContestFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f153714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o1> f153715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.q> f153716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f153717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f153718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.list.o1> f153719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f153720g;

    public m(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<c2> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5, ij.c<com.planner5d.library.activity.fragment.list.o1> cVar6, ij.c<com.planner5d.library.model.manager.w> cVar7) {
        this.f153714a = cVar;
        this.f153715b = cVar2;
        this.f153716c = cVar3;
        this.f153717d = cVar4;
        this.f153718e = cVar5;
        this.f153719f = cVar6;
        this.f153720g = cVar7;
    }

    public static fg.g<ContestFragment> a(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<c2> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5, ij.c<com.planner5d.library.activity.fragment.list.o1> cVar6, ij.c<com.planner5d.library.model.manager.w> cVar7) {
        return new m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.actionsObserve")
    public static void b(ContestFragment contestFragment, com.planner5d.library.activity.fragment.list.o1 o1Var) {
        contestFragment.actionsObserve = o1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.dialogLauncher")
    public static void c(ContestFragment contestFragment, com.planner5d.library.activity.fragment.dialog.k kVar) {
        contestFragment.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.featureConfigManager")
    public static void d(ContestFragment contestFragment, com.planner5d.library.model.manager.w wVar) {
        contestFragment.featureConfigManager = wVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.formatter")
    public static void e(ContestFragment contestFragment, p0 p0Var) {
        contestFragment.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.imageManager")
    public static void f(ContestFragment contestFragment, com.planner5d.library.services.q qVar) {
        contestFragment.imageManager = qVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.languageManager")
    public static void g(ContestFragment contestFragment, o1 o1Var) {
        contestFragment.languageManager = o1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.ContestFragment.messageManager")
    public static void i(ContestFragment contestFragment, c2 c2Var) {
        contestFragment.messageManager = c2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestFragment contestFragment) {
        e(contestFragment, this.f153714a.get());
        g(contestFragment, this.f153715b.get());
        f(contestFragment, this.f153716c.get());
        i(contestFragment, this.f153717d.get());
        c(contestFragment, this.f153718e.get());
        b(contestFragment, this.f153719f.get());
        d(contestFragment, this.f153720g.get());
    }
}
