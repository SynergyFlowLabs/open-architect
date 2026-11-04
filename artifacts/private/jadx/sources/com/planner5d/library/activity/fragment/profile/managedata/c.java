package com.planner5d.library.activity.fragment.profile.managedata;

import com.planner5d.library.application.d;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;

/* JADX INFO: loaded from: classes6.dex */
@r
@e
public final class c implements g<ManageDataFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.profile.a> f134714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f134715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<m0> f134716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f134717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<d> f134718e;

    public c(ij.c<com.planner5d.library.activity.fragment.profile.a> cVar, ij.c<t> cVar2, ij.c<m0> cVar3, ij.c<b2> cVar4, ij.c<d> cVar5) {
        this.f134714a = cVar;
        this.f134715b = cVar2;
        this.f134716c = cVar3;
        this.f134717d = cVar4;
        this.f134718e = cVar5;
    }

    public static g<ManageDataFragment> a(ij.c<com.planner5d.library.activity.fragment.profile.a> cVar, ij.c<t> cVar2, ij.c<m0> cVar3, ij.c<b2> cVar4, ij.c<d> cVar5) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @j("com.planner5d.library.activity.fragment.profile.managedata.ManageDataFragment.configuration")
    public static void b(ManageDataFragment manageDataFragment, d dVar) {
        manageDataFragment.configuration = dVar;
    }

    @j("com.planner5d.library.activity.fragment.profile.managedata.ManageDataFragment.messageManager")
    public static void d(ManageDataFragment manageDataFragment, b2 b2Var) {
        manageDataFragment.messageManager = b2Var;
    }

    @j("com.planner5d.library.activity.fragment.profile.managedata.ManageDataFragment.userAuthorization")
    public static void e(ManageDataFragment manageDataFragment, t tVar) {
        manageDataFragment.userAuthorization = tVar;
    }

    @j("com.planner5d.library.activity.fragment.profile.managedata.ManageDataFragment.userPrivateData")
    public static void f(ManageDataFragment manageDataFragment, m0 m0Var) {
        manageDataFragment.userPrivateData = m0Var;
    }

    @j("com.planner5d.library.activity.fragment.profile.managedata.ManageDataFragment.viewModel")
    public static void g(ManageDataFragment manageDataFragment, com.planner5d.library.activity.fragment.profile.a aVar) {
        manageDataFragment.viewModel = aVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ManageDataFragment manageDataFragment) {
        g(manageDataFragment, this.f134714a.get());
        e(manageDataFragment, this.f134715b.get());
        f(manageDataFragment, this.f134716c.get());
        d(manageDataFragment, this.f134717d.get());
        b(manageDataFragment, this.f134718e.get());
    }
}
