package com.planner5d.library.activity.fragment.dialog.purchase;

import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class h implements fg.g<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f132633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n1> f132634b;

    public h(ij.c<p0> cVar, ij.c<n1> cVar2) {
        this.f132633a = cVar;
        this.f132634b = cVar2;
    }

    public static fg.g<g> a(ij.c<p0> cVar, ij.c<n1> cVar2) {
        return new h(cVar, cVar2);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.ProductView.formatter")
    public static void b(g gVar, p0 p0Var) {
        gVar.f132624a = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.dialog.purchase.ProductView.languageManager")
    public static void c(g gVar, n1 n1Var) {
        gVar.f132625b = n1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(g gVar) {
        b(gVar, this.f132633a.get());
        c(gVar, this.f132634b.get());
    }
}
