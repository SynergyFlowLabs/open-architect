package com.planner5d.library.contest.view.dialog.prize;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.model.manager.y2;
import dagger.internal.r;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
public final class i implements fg.g<ContestPrizeDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f153602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x2> f153603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f153604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y2> f153605d;

    public i(ij.c<c2> cVar, ij.c<x2> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3, ij.c<y2> cVar4) {
        this.f153602a = cVar;
        this.f153603b = cVar2;
        this.f153604c = cVar3;
        this.f153605d = cVar4;
    }

    public static fg.g<ContestPrizeDialog> a(ij.c<c2> cVar, ij.c<x2> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3, ij.c<y2> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog.configuration")
    public static void b(ContestPrizeDialog contestPrizeDialog, x2 x2Var) {
        contestPrizeDialog.configuration = x2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog.dialogLauncher")
    public static void c(ContestPrizeDialog contestPrizeDialog, com.planner5d.library.activity.fragment.dialog.k kVar) {
        contestPrizeDialog.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog.messageManager")
    public static void e(ContestPrizeDialog contestPrizeDialog, c2 c2Var) {
        contestPrizeDialog.messageManager = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.dialog.prize.ContestPrizeDialog.rateUsManagerService")
    public static void f(ContestPrizeDialog contestPrizeDialog, y2 y2Var) {
        contestPrizeDialog.rateUsManagerService = y2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestPrizeDialog contestPrizeDialog) {
        e(contestPrizeDialog, this.f153602a.get());
        b(contestPrizeDialog, this.f153603b.get());
        c(contestPrizeDialog, this.f153604c.get());
        f(contestPrizeDialog, this.f153605d.get());
    }
}
