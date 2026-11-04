package com.planner5d.library.activity.fragment.settings.orders;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class k implements fg.g<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f135349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f> f135350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<a> f135351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f135352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<s0> f135353e;

    public k(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<f> cVar2, ij.c<a> cVar3, ij.c<t> cVar4, ij.c<s0> cVar5) {
        this.f135349a = cVar;
        this.f135350b = cVar2;
        this.f135351c = cVar3;
        this.f135352d = cVar4;
        this.f135353e = cVar5;
    }

    public static fg.g<i> a(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<f> cVar2, ij.c<a> cVar3, ij.c<t> cVar4, ij.c<s0> cVar5) {
        return new k(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory.coroutineScope")
    public static void b(i iVar, s0 s0Var) {
        iVar.f135329e = s0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory.ordersAdapter")
    public static void d(i iVar, ij.c<a> cVar) {
        iVar.f135327c = cVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory.ordersSummary")
    public static void e(i iVar, f fVar) {
        iVar.f135326b = fVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory.paymentManager")
    public static void f(i iVar, com.planner5d.library.model.manager.payments.j jVar) {
        iVar.f135325a = jVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory.userAuthorization")
    public static void g(i iVar, t tVar) {
        iVar.f135328d = tVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(i iVar) {
        f(iVar, this.f135349a.get());
        e(iVar, this.f135350b.get());
        d(iVar, this.f135351c);
        g(iVar, this.f135352d.get());
        b(iVar, this.f135353e.get());
    }
}
