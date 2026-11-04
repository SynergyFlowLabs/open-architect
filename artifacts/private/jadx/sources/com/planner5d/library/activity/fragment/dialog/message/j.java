package com.planner5d.library.activity.fragment.dialog.message;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.y1;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class j implements fg.g<PurchaseRequiredMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y1> f132164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f132165b;

    public j(ij.c<y1> cVar, ij.c<x> cVar2) {
        this.f132164a = cVar;
        this.f132165b = cVar2;
    }

    public static fg.g<PurchaseRequiredMessage> a(ij.c<y1> cVar, ij.c<x> cVar2) {
        return new j(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.PurchaseRequiredMessage.menuManager")
    public static void c(PurchaseRequiredMessage purchaseRequiredMessage, y1 y1Var) {
        purchaseRequiredMessage.f132143o3 = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.message.PurchaseRequiredMessage.navigator")
    public static void d(PurchaseRequiredMessage purchaseRequiredMessage, x xVar) {
        purchaseRequiredMessage.f132144p3 = xVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(PurchaseRequiredMessage purchaseRequiredMessage) {
        c(purchaseRequiredMessage, this.f132164a.get());
        d(purchaseRequiredMessage, this.f132165b.get());
    }
}
