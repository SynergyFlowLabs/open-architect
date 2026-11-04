package com.planner5d.library.contest.view.dialog;

import com.planner5d.library.model.manager.p5;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
public final class g implements fg.g<ContestRulesAgreement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p5> f153569a;

    public g(ij.c<p5> cVar) {
        this.f153569a = cVar;
    }

    public static fg.g<ContestRulesAgreement> a(ij.c<p5> cVar) {
        return new g(cVar);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.dialog.ContestRulesAgreement.uriViewer")
    public static void c(ContestRulesAgreement contestRulesAgreement, p5 p5Var) {
        contestRulesAgreement.uriViewer = p5Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestRulesAgreement contestRulesAgreement) {
        c(contestRulesAgreement, this.f153569a.get());
    }
}
