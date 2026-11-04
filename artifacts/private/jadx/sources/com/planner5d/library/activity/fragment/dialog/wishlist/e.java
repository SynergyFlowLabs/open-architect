package com.planner5d.library.activity.fragment.dialog.wishlist;

import com.planner5d.library.activity.helper.b0;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.services.utility.p0;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;
import le.l;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
public final class e implements g<WishList> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f133135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k1> f133136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f133137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b0> f133138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f133139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<b2> f133140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<m2> f133141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<l> f133142h;

    public e(ij.c<i> cVar, ij.c<k1> cVar2, ij.c<p0> cVar3, ij.c<b0> cVar4, ij.c<com.planner5d.library.application.d> cVar5, ij.c<b2> cVar6, ij.c<m2> cVar7, ij.c<l> cVar8) {
        this.f133135a = cVar;
        this.f133136b = cVar2;
        this.f133137c = cVar3;
        this.f133138d = cVar4;
        this.f133139e = cVar5;
        this.f133140f = cVar6;
        this.f133141g = cVar7;
        this.f133142h = cVar8;
    }

    public static g<WishList> a(ij.c<i> cVar, ij.c<k1> cVar2, ij.c<p0> cVar3, ij.c<b0> cVar4, ij.c<com.planner5d.library.application.d> cVar5, ij.c<b2> cVar6, ij.c<m2> cVar7, ij.c<l> cVar8) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.builtInDataManager")
    public static void b(WishList wishList, i iVar) {
        wishList.f133109o3 = iVar;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.configuration")
    public static void c(WishList wishList, com.planner5d.library.application.d dVar) {
        wishList.f133113s3 = dVar;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.formatter")
    public static void d(WishList wishList, p0 p0Var) {
        wishList.f133111q3 = p0Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.helperExportToFile")
    public static void e(WishList wishList, b0 b0Var) {
        wishList.f133112r3 = b0Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.itemManager")
    public static void f(WishList wishList, k1 k1Var) {
        wishList.f133110p3 = k1Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.messageManager")
    public static void h(WishList wishList, b2 b2Var) {
        wishList.f133114t3 = b2Var;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.savePdfUseCase")
    public static void i(WishList wishList, l lVar) {
        wishList.f133116v3 = lVar;
    }

    @j("com.planner5d.library.activity.fragment.dialog.wishlist.WishList.uriViewer")
    public static void j(WishList wishList, m2 m2Var) {
        wishList.f133115u3 = m2Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(WishList wishList) {
        b(wishList, this.f133135a.get());
        f(wishList, this.f133136b.get());
        d(wishList, this.f133137c.get());
        e(wishList, this.f133138d.get());
        c(wishList, this.f133139e.get());
        h(wishList, this.f133140f.get());
        j(wishList, this.f133141g.get());
        i(wishList, this.f133142h.get());
    }
}
