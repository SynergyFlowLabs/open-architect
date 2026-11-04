package com.planner5d.library.contest.view.archive;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
public final class k implements fg.g<ContestArchiveList> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f153452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f153453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<o1> f153454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.q> f153455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<w> f153456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<c2> f153457f;

    public k(ij.c<p0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<o1> cVar3, ij.c<com.planner5d.library.services.q> cVar4, ij.c<w> cVar5, ij.c<c2> cVar6) {
        this.f153452a = cVar;
        this.f153453b = cVar2;
        this.f153454c = cVar3;
        this.f153455d = cVar4;
        this.f153456e = cVar5;
        this.f153457f = cVar6;
    }

    public static fg.g<ContestArchiveList> a(ij.c<p0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<o1> cVar3, ij.c<com.planner5d.library.services.q> cVar4, ij.c<w> cVar5, ij.c<c2> cVar6) {
        return new k(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchiveList.dialogLauncher")
    public static void b(ContestArchiveList contestArchiveList, com.planner5d.library.activity.fragment.dialog.k kVar) {
        contestArchiveList.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchiveList.formatter")
    public static void c(ContestArchiveList contestArchiveList, p0 p0Var) {
        contestArchiveList.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchiveList.imageManager")
    public static void d(ContestArchiveList contestArchiveList, com.planner5d.library.services.q qVar) {
        contestArchiveList.imageManager = qVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchiveList.languageManager")
    public static void e(ContestArchiveList contestArchiveList, o1 o1Var) {
        contestArchiveList.languageManager = o1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchiveList.messageManager")
    public static void g(ContestArchiveList contestArchiveList, c2 c2Var) {
        contestArchiveList.messageManager = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchiveList.userAuthorization")
    public static void h(ContestArchiveList contestArchiveList, w wVar) {
        contestArchiveList.userAuthorization = wVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestArchiveList contestArchiveList) {
        c(contestArchiveList, this.f153452a.get());
        b(contestArchiveList, this.f153453b.get());
        e(contestArchiveList, this.f153454c.get());
        d(contestArchiveList, this.f153455d.get());
        h(contestArchiveList, this.f153456e.get());
        g(contestArchiveList, this.f153457f.get());
    }
}
