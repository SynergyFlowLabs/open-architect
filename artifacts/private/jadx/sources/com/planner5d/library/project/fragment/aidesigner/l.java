package com.planner5d.library.project.fragment.aidesigner;

import com.planner5d.library.model.manager.payments.b0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
public final class l implements fg.g<AiFlowFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b0> f223700a;

    public l(ij.c<b0> cVar) {
        this.f223700a = cVar;
    }

    public static fg.g<AiFlowFragment> a(ij.c<b0> cVar) {
        return new l(cVar);
    }

    @dagger.internal.j("com.planner5d.library.project.fragment.aidesigner.AiFlowFragment.superwallUseCase")
    public static void c(AiFlowFragment aiFlowFragment, b0 b0Var) {
        aiFlowFragment.superwallUseCase = b0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(AiFlowFragment aiFlowFragment) {
        c(aiFlowFragment, this.f223700a.get());
    }
}
