package com.planner5d.library.activity.fragment.feed;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class k implements fg.g<FeedAllArticlesFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<e1> f133508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y0> f133509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f133510c;

    public k(ij.c<e1> cVar, ij.c<com.planner5d.library.model.manager.y0> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3) {
        this.f133508a = cVar;
        this.f133509b = cVar2;
        this.f133510c = cVar3;
    }

    public static fg.g<FeedAllArticlesFragment> a(ij.c<e1> cVar, ij.c<com.planner5d.library.model.manager.y0> cVar2, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedAllArticlesFragment.dialogLauncher")
    public static void b(FeedAllArticlesFragment feedAllArticlesFragment, com.planner5d.library.activity.fragment.dialog.k kVar) {
        feedAllArticlesFragment.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedAllArticlesFragment.feedViewModel")
    public static void c(FeedAllArticlesFragment feedAllArticlesFragment, e1 e1Var) {
        feedAllArticlesFragment.feedViewModel = e1Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedAllArticlesFragment.imageManager")
    public static void d(FeedAllArticlesFragment feedAllArticlesFragment, com.planner5d.library.model.manager.y0 y0Var) {
        feedAllArticlesFragment.imageManager = y0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void injectMembers(FeedAllArticlesFragment feedAllArticlesFragment) {
        c(feedAllArticlesFragment, this.f133508a.get());
        d(feedAllArticlesFragment, this.f133509b.get());
        b(feedAllArticlesFragment, this.f133510c.get());
    }
}
