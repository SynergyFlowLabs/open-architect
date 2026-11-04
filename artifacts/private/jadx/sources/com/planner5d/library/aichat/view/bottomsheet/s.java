package com.planner5d.library.aichat.view.bottomsheet;

import com.planner5d.library.model.manager.statistics.events.i3;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class s implements fg.g<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f142070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.y> f142071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<i3> f142072c;

    public s(ij.c<t> cVar, ij.c<com.planner5d.library.services.y> cVar2, ij.c<i3> cVar3) {
        this.f142070a = cVar;
        this.f142071b = cVar2;
        this.f142072c = cVar3;
    }

    public static fg.g<q> a(ij.c<t> cVar, ij.c<com.planner5d.library.services.y> cVar2, ij.c<i3> cVar3) {
        return new s(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.aichat.view.bottomsheet.AiChatBottomSheet.events")
    public static void b(q qVar, i3 i3Var) {
        qVar.f142043c = i3Var;
    }

    @dagger.internal.j("com.planner5d.library.aichat.view.bottomsheet.AiChatBottomSheet.paywallService")
    public static void d(q qVar, com.planner5d.library.services.y yVar) {
        qVar.f142042b = yVar;
    }

    @dagger.internal.j("com.planner5d.library.aichat.view.bottomsheet.AiChatBottomSheet.viewModel")
    public static void e(q qVar, t tVar) {
        qVar.f142041a = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(q qVar) {
        e(qVar, this.f142070a.get());
        d(qVar, this.f142071b.get());
        b(qVar, this.f142072c.get());
    }
}
