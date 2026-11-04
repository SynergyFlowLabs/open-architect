package com.planner5d.library.contest.helper;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.t;
import dagger.internal.r;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
public final class d implements fg.g<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f153301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<k> f153302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<g> f153303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t> f153304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f1> f153305f;

    public d(ij.c<com.planner5d.library.contest.data.i> cVar, ij.c<x> cVar2, ij.c<k> cVar3, ij.c<g> cVar4, ij.c<t> cVar5, ij.c<f1> cVar6) {
        this.f153300a = cVar;
        this.f153301b = cVar2;
        this.f153302c = cVar3;
        this.f153303d = cVar4;
        this.f153304e = cVar5;
        this.f153305f = cVar6;
    }

    public static fg.g<c> a(ij.c<com.planner5d.library.contest.data.i> cVar, ij.c<x> cVar2, ij.c<k> cVar3, ij.c<g> cVar4, ij.c<t> cVar5, ij.c<f1> cVar6) {
        return new d(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @dagger.internal.j("com.planner5d.library.contest.helper.ContestUriProcessor.contestManager")
    public static void b(c cVar, com.planner5d.library.contest.data.i iVar) {
        cVar.f153277a = iVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.helper.ContestUriProcessor.coroutineDispatchersProvider")
    public static void c(c cVar, t tVar) {
        cVar.f153281e = tVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.helper.ContestUriProcessor.dialogLauncher")
    public static void d(c cVar, k kVar) {
        cVar.f153279c = kVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.helper.ContestUriProcessor.fragmentControllerNavigator")
    public static void e(c cVar, x xVar) {
        cVar.f153278b = xVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.helper.ContestUriProcessor.globalCoroutineScope")
    public static void f(c cVar, f1 f1Var) {
        cVar.f153282f = f1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.helper.ContestUriProcessor.projectDestinationFactory")
    public static void h(c cVar, g gVar) {
        cVar.f153280d = gVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(c cVar) {
        b(cVar, this.f153300a.get());
        e(cVar, this.f153301b.get());
        d(cVar, this.f153302c.get());
        h(cVar, this.f153303d.get());
        c(cVar, this.f153304e.get());
        f(cVar, this.f153305f.get());
    }
}
