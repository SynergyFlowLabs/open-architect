package com.planner5d.library.contest.view.detail;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.services.q;
import com.planner5d.library.services.utility.p0;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
public final class e implements g<ContestDetailsFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f153533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o1> f153534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<q> f153535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f153536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<x2> f153537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f153538f;

    public e(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<q> cVar3, ij.c<c2> cVar4, ij.c<x2> cVar5, ij.c<w> cVar6) {
        this.f153533a = cVar;
        this.f153534b = cVar2;
        this.f153535c = cVar3;
        this.f153536d = cVar4;
        this.f153537e = cVar5;
        this.f153538f = cVar6;
    }

    public static g<ContestDetailsFragment> a(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<q> cVar3, ij.c<c2> cVar4, ij.c<x2> cVar5, ij.c<w> cVar6) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @j("com.planner5d.library.contest.view.detail.ContestDetailsFragment.configuration")
    public static void b(ContestDetailsFragment contestDetailsFragment, x2 x2Var) {
        contestDetailsFragment.configuration = x2Var;
    }

    @j("com.planner5d.library.contest.view.detail.ContestDetailsFragment.featureConfigManager")
    public static void c(ContestDetailsFragment contestDetailsFragment, w wVar) {
        contestDetailsFragment.featureConfigManager = wVar;
    }

    @j("com.planner5d.library.contest.view.detail.ContestDetailsFragment.formatter")
    public static void d(ContestDetailsFragment contestDetailsFragment, p0 p0Var) {
        contestDetailsFragment.formatter = p0Var;
    }

    @j("com.planner5d.library.contest.view.detail.ContestDetailsFragment.imageManager")
    public static void e(ContestDetailsFragment contestDetailsFragment, q qVar) {
        contestDetailsFragment.imageManager = qVar;
    }

    @j("com.planner5d.library.contest.view.detail.ContestDetailsFragment.languageManager")
    public static void f(ContestDetailsFragment contestDetailsFragment, o1 o1Var) {
        contestDetailsFragment.languageManager = o1Var;
    }

    @j("com.planner5d.library.contest.view.detail.ContestDetailsFragment.messageManager")
    public static void h(ContestDetailsFragment contestDetailsFragment, c2 c2Var) {
        contestDetailsFragment.messageManager = c2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestDetailsFragment contestDetailsFragment) {
        d(contestDetailsFragment, this.f153533a.get());
        f(contestDetailsFragment, this.f153534b.get());
        e(contestDetailsFragment, this.f153535c.get());
        h(contestDetailsFragment, this.f153536d.get());
        b(contestDetailsFragment, this.f153537e.get());
        c(contestDetailsFragment, this.f153538f.get());
    }
}
