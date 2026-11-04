package com.planner5d.library.activity.fragment.profile.orders;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class g implements fg.g<OrdersHistoryFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f134759a;

    public g(ij.c<t> cVar) {
        this.f134759a = cVar;
    }

    public static fg.g<OrdersHistoryFragment> a(ij.c<t> cVar) {
        return new g(cVar);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.profile.orders.OrdersHistoryFragment.userAuthorization")
    public static void c(OrdersHistoryFragment ordersHistoryFragment, fg.e<t> eVar) {
        ordersHistoryFragment.userAuthorization = eVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(OrdersHistoryFragment ordersHistoryFragment) {
        c(ordersHistoryFragment, dagger.internal.g.a(this.f134759a));
    }
}
