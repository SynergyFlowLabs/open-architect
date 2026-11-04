package com.planner5d.library.contest.view.archive;

import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
public final class p implements fg.g<ContestArchive> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f153479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o1> f153480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.q> f153481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f153482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<w> f153483e;

    public p(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<c2> cVar4, ij.c<w> cVar5) {
        this.f153479a = cVar;
        this.f153480b = cVar2;
        this.f153481c = cVar3;
        this.f153482d = cVar4;
        this.f153483e = cVar5;
    }

    public static fg.g<ContestArchive> a(ij.c<p0> cVar, ij.c<o1> cVar2, ij.c<com.planner5d.library.services.q> cVar3, ij.c<c2> cVar4, ij.c<w> cVar5) {
        return new p(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchive.formatter")
    public static void b(ContestArchive contestArchive, p0 p0Var) {
        contestArchive.formatter = p0Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchive.imageManager")
    public static void c(ContestArchive contestArchive, com.planner5d.library.services.q qVar) {
        contestArchive.imageManager = qVar;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchive.languageManager")
    public static void d(ContestArchive contestArchive, o1 o1Var) {
        contestArchive.languageManager = o1Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchive.messageManager")
    public static void f(ContestArchive contestArchive, c2 c2Var) {
        contestArchive.messageManager = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.contest.view.archive.ContestArchive.userAuthorization")
    public static void g(ContestArchive contestArchive, w wVar) {
        contestArchive.userAuthorization = wVar;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ContestArchive contestArchive) {
        b(contestArchive, this.f153479a.get());
        d(contestArchive, this.f153480b.get());
        c(contestArchive, this.f153481c.get());
        f(contestArchive, this.f153482d.get());
        g(contestArchive, this.f153483e.get());
    }
}
