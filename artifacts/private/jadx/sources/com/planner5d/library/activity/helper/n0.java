package com.planner5d.library.activity.helper;

import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.widget.editor.helper.o3;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class n0 implements fg.g<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q2> f137058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x2> f137059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f137060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t3> f137061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.k> f137062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f137063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y1> f137064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f137065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.z> f137066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<o3> f137067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f137068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> f137069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f137070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f137071n;

    public n0(ij.c<q2> cVar, ij.c<x2> cVar2, ij.c<com.planner5d.library.model.manager.w> cVar3, ij.c<t3> cVar4, ij.c<com.planner5d.library.model.manager.statistics.k> cVar5, ij.c<com.planner5d.library.model.manager.payments.j> cVar6, ij.c<com.planner5d.library.model.manager.y1> cVar7, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar8, ij.c<com.planner5d.library.activity.fragment.dialog.z> cVar9, ij.c<o3> cVar10, ij.c<com.planner5d.library.activity.fragment.x> cVar11, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> cVar12, ij.c<com.planner5d.library.modules.user.user.w> cVar13, ij.c<com.planner5d.library.services.utility.f1> cVar14) {
        this.f137058a = cVar;
        this.f137059b = cVar2;
        this.f137060c = cVar3;
        this.f137061d = cVar4;
        this.f137062e = cVar5;
        this.f137063f = cVar6;
        this.f137064g = cVar7;
        this.f137065h = cVar8;
        this.f137066i = cVar9;
        this.f137067j = cVar10;
        this.f137068k = cVar11;
        this.f137069l = cVar12;
        this.f137070m = cVar13;
        this.f137071n = cVar14;
    }

    public static fg.g<l0> a(ij.c<q2> cVar, ij.c<x2> cVar2, ij.c<com.planner5d.library.model.manager.w> cVar3, ij.c<t3> cVar4, ij.c<com.planner5d.library.model.manager.statistics.k> cVar5, ij.c<com.planner5d.library.model.manager.payments.j> cVar6, ij.c<com.planner5d.library.model.manager.y1> cVar7, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar8, ij.c<com.planner5d.library.activity.fragment.dialog.z> cVar9, ij.c<o3> cVar10, ij.c<com.planner5d.library.activity.fragment.x> cVar11, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> cVar12, ij.c<com.planner5d.library.modules.user.user.w> cVar13, ij.c<com.planner5d.library.services.utility.f1> cVar14) {
        return new n0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.coroutineScope")
    public static void b(l0 l0Var, com.planner5d.library.services.utility.f1 f1Var) {
        l0Var.f137003n = f1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.dialogLauncher")
    public static void c(l0 l0Var, com.planner5d.library.activity.fragment.dialog.k kVar) {
        l0Var.f136997h = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.featureConfigManager")
    public static void d(l0 l0Var, com.planner5d.library.model.manager.w wVar) {
        l0Var.f136992c = wVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.helperProjectPersistence")
    public static void e(l0 l0Var, o3 o3Var) {
        l0Var.f136999j = o3Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.menuManager")
    public static void g(l0 l0Var, com.planner5d.library.model.manager.y1 y1Var) {
        l0Var.f136996g = y1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.navigator")
    public static void h(l0 l0Var, com.planner5d.library.activity.fragment.x xVar) {
        l0Var.f137000k = xVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.paymentManager")
    public static void i(l0 l0Var, com.planner5d.library.model.manager.payments.j jVar) {
        l0Var.f136995f = jVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.paymentMethodIdProvider")
    public static void j(l0 l0Var, q2 q2Var) {
        l0Var.f136990a = q2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.premiumFeaturesDialogLauncher")
    public static void k(l0 l0Var, com.planner5d.library.activity.fragment.dialog.z zVar) {
        l0Var.f136998i = zVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.purchaseDialogFactoryService")
    public static void l(l0 l0Var, com.planner5d.library.activity.fragment.dialog.purchase.t tVar) {
        l0Var.f137001l = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.purchaseUnlocksItemsConfiguration")
    public static void m(l0 l0Var, x2 x2Var) {
        l0Var.f136991b = x2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.statisticsEventModalForm")
    public static void n(l0 l0Var, t3 t3Var) {
        l0Var.f136993d = t3Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.statisticsManager")
    public static void o(l0 l0Var, com.planner5d.library.model.manager.statistics.k kVar) {
        l0Var.f136994e = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.HelperPayment.userAuthorization")
    public static void p(l0 l0Var, com.planner5d.library.modules.user.user.w wVar) {
        l0Var.f137002m = wVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void injectMembers(l0 l0Var) {
        j(l0Var, this.f137058a.get());
        m(l0Var, this.f137059b.get());
        d(l0Var, this.f137060c.get());
        n(l0Var, this.f137061d.get());
        o(l0Var, this.f137062e.get());
        i(l0Var, this.f137063f.get());
        g(l0Var, this.f137064g.get());
        c(l0Var, this.f137065h.get());
        k(l0Var, this.f137066i.get());
        e(l0Var, this.f137067j.get());
        h(l0Var, this.f137068k.get());
        l(l0Var, this.f137069l.get());
        p(l0Var, this.f137070m.get());
        b(l0Var, this.f137071n.get());
    }
}
