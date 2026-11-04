package com.planner5d.library.activity.fragment.feed;

import com.planner5d.library.model.manager.p5;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class q implements fg.g<FeedArticleFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c2> f133579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f133580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p5> f133581c;

    public q(ij.c<c2> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<p5> cVar3) {
        this.f133579a = cVar;
        this.f133580b = cVar2;
        this.f133581c = cVar3;
    }

    public static fg.g<FeedArticleFragment> a(ij.c<c2> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<p5> cVar3) {
        return new q(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedArticleFragment.application")
    public static void b(FeedArticleFragment feedArticleFragment, com.planner5d.library.application.b bVar) {
        feedArticleFragment.application = bVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedArticleFragment.networkStateUtility")
    public static void d(FeedArticleFragment feedArticleFragment, c2 c2Var) {
        feedArticleFragment.networkStateUtility = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedArticleFragment.uriViewer")
    public static void e(FeedArticleFragment feedArticleFragment, p5 p5Var) {
        feedArticleFragment.uriViewer = p5Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(FeedArticleFragment feedArticleFragment) {
        d(feedArticleFragment, this.f133579a.get());
        b(feedArticleFragment, this.f133580b.get());
        e(feedArticleFragment, this.f133581c.get());
    }
}
