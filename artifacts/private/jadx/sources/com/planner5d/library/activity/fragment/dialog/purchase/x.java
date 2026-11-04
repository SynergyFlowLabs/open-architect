package com.planner5d.library.activity.fragment.dialog.purchase;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class x implements fg.g<PurchaseDialog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<v> f132828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.n> f132829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.p> f132830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f132831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f132832e;

    public x(ij.c<v> cVar, ij.c<com.planner5d.library.model.manager.config.n> cVar2, ij.c<com.planner5d.library.services.p> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar5) {
        this.f132828a = cVar;
        this.f132829b = cVar2;
        this.f132830c = cVar3;
        this.f132831d = cVar4;
        this.f132832e = cVar5;
    }

    public static fg.g<PurchaseDialog> a(ij.c<v> cVar, ij.c<com.planner5d.library.model.manager.config.n> cVar2, ij.c<com.planner5d.library.services.p> cVar3, ij.c<ErrorMessageParser> cVar4, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar5) {
        return new x(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog.errorMessageParser")
    public static void b(PurchaseDialog purchaseDialog, ErrorMessageParser errorMessageParser) {
        purchaseDialog.errorMessageParser = errorMessageParser;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog.helpDialogFactory")
    public static void c(PurchaseDialog purchaseDialog, com.planner5d.library.services.p pVar) {
        purchaseDialog.helpDialogFactory = pVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog.purchasePlacementManager")
    public static void e(PurchaseDialog purchaseDialog, fg.e<com.planner5d.library.model.manager.config.n> eVar) {
        purchaseDialog.purchasePlacementManager = eVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog.statistics")
    public static void f(PurchaseDialog purchaseDialog, v vVar) {
        purchaseDialog.statistics = vVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog.statisticsManager")
    public static void g(PurchaseDialog purchaseDialog, com.planner5d.library.model.manager.statistics.b0 b0Var) {
        purchaseDialog.statisticsManager = b0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PurchaseDialog purchaseDialog) {
        f(purchaseDialog, this.f132828a.get());
        e(purchaseDialog, dagger.internal.g.a(this.f132829b));
        c(purchaseDialog, this.f132830c.get());
        b(purchaseDialog, this.f132831d.get());
        g(purchaseDialog, this.f132832e.get());
    }
}
