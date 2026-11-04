package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class o implements fg.g<PurchasePagePremiumReview> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f132700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f132701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f132702c;

    public o(ij.c<p0> cVar, ij.c<c2> cVar2, ij.c<t1> cVar3) {
        this.f132700a = cVar;
        this.f132701b = cVar2;
        this.f132702c = cVar3;
    }

    public static fg.g<PurchasePagePremiumReview> a(ij.c<p0> cVar, ij.c<c2> cVar2, ij.c<t1> cVar3) {
        return new o(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview.formatter")
    public static void b(PurchasePagePremiumReview purchasePagePremiumReview, p0 p0Var) {
        purchasePagePremiumReview.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview.logRecordManager")
    public static void c(PurchasePagePremiumReview purchasePagePremiumReview, t1 t1Var) {
        purchasePagePremiumReview.logRecordManager = t1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview.networkStateUtility")
    public static void e(PurchasePagePremiumReview purchasePagePremiumReview, c2 c2Var) {
        purchasePagePremiumReview.networkStateUtility = c2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PurchasePagePremiumReview purchasePagePremiumReview) {
        b(purchasePagePremiumReview, this.f132700a.get());
        e(purchasePagePremiumReview, this.f132701b.get());
        c(purchasePagePremiumReview, this.f132702c.get());
    }
}
