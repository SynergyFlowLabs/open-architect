package com.planner5d.library.activity.fragment.dialog.purchase.recognitions;

import com.planner5d.library.activity.fragment.projects.z0;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class c implements g<PurchasePagePlanRecognitions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z0> f132751a;

    public c(ij.c<z0> cVar) {
        this.f132751a = cVar;
    }

    public static g<PurchasePagePlanRecognitions> a(ij.c<z0> cVar) {
        return new c(cVar);
    }

    @j("com.planner5d.library.activity.fragment.dialog.purchase.recognitions.PurchasePagePlanRecognitions.uploadPlanViewProvider")
    public static void c(PurchasePagePlanRecognitions purchasePagePlanRecognitions, z0 z0Var) {
        purchasePagePlanRecognitions.uploadPlanViewProvider = z0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PurchasePagePlanRecognitions purchasePagePlanRecognitions) {
        c(purchasePagePlanRecognitions, this.f132751a.get());
    }
}
