package com.planner5d.library.activity.fragment.compareplans;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import dagger.internal.j;
import dagger.internal.r;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
public final class f implements fg.g<ComparePlansFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ia.b> f131576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k> f131577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t0> f131578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f131579d;

    public f(ij.c<ia.b> cVar, ij.c<k> cVar2, ij.c<t0> cVar3, ij.c<t> cVar4) {
        this.f131576a = cVar;
        this.f131577b = cVar2;
        this.f131578c = cVar3;
        this.f131579d = cVar4;
    }

    public static fg.g<ComparePlansFragment> a(ij.c<ia.b> cVar, ij.c<k> cVar2, ij.c<t0> cVar3, ij.c<t> cVar4) {
        return new f(cVar, cVar2, cVar3, cVar4);
    }

    @j("com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment.dialogLauncher")
    public static void b(ComparePlansFragment comparePlansFragment, k kVar) {
        comparePlansFragment.dialogLauncher = kVar;
    }

    @j("com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment.paywallStrategy")
    public static void d(ComparePlansFragment comparePlansFragment, ia.b bVar) {
        comparePlansFragment.paywallStrategy = bVar;
    }

    @j("com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment.userAuthorization")
    public static void e(ComparePlansFragment comparePlansFragment, t tVar) {
        comparePlansFragment.userAuthorization = tVar;
    }

    @j("com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment.userPurchases")
    public static void f(ComparePlansFragment comparePlansFragment, t0 t0Var) {
        comparePlansFragment.userPurchases = t0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ComparePlansFragment comparePlansFragment) {
        d(comparePlansFragment, this.f131576a.get());
        b(comparePlansFragment, this.f131577b.get());
        f(comparePlansFragment, this.f131578c.get());
        e(comparePlansFragment, this.f131579d.get());
    }
}
