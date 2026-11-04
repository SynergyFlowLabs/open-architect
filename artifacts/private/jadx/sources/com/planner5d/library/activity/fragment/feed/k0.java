package com.planner5d.library.activity.fragment.feed;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class k0 implements fg.g<FeedFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.list.d0> f133511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f133512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f133513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f133514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.feed.holders.a> f133515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.z0> f133516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f133517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f133518h;

    public k0(ij.c<com.planner5d.library.activity.fragment.list.d0> cVar, ij.c<c2> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<com.planner5d.library.activity.fragment.feed.holders.a> cVar5, ij.c<com.planner5d.library.activity.fragment.projects.z0> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<com.planner5d.library.services.utility.t> cVar8) {
        this.f133511a = cVar;
        this.f133512b = cVar2;
        this.f133513c = cVar3;
        this.f133514d = cVar4;
        this.f133515e = cVar5;
        this.f133516f = cVar6;
        this.f133517g = cVar7;
        this.f133518h = cVar8;
    }

    public static fg.g<FeedFragment> a(ij.c<com.planner5d.library.activity.fragment.list.d0> cVar, ij.c<c2> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<com.planner5d.library.activity.fragment.feed.holders.a> cVar5, ij.c<com.planner5d.library.activity.fragment.projects.z0> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<com.planner5d.library.services.utility.t> cVar8) {
        return new k0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.actionsObserve")
    public static void b(FeedFragment feedFragment, com.planner5d.library.activity.fragment.list.d0 d0Var) {
        feedFragment.actionsObserve = d0Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.coroutineDispatchers")
    public static void c(FeedFragment feedFragment, com.planner5d.library.services.utility.t tVar) {
        feedFragment.coroutineDispatchers = tVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.dialogLauncher")
    public static void d(FeedFragment feedFragment, com.planner5d.library.activity.fragment.dialog.k kVar) {
        feedFragment.dialogLauncher = kVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.factory")
    public static void e(FeedFragment feedFragment, com.planner5d.library.activity.fragment.feed.holders.a aVar) {
        feedFragment.factory = aVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.featureConfigManager")
    public static void f(FeedFragment feedFragment, com.planner5d.library.model.manager.config.j jVar) {
        feedFragment.featureConfigManager = jVar;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.messageManager")
    public static void h(FeedFragment feedFragment, b2 b2Var) {
        feedFragment.messageManager = b2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.networkStateUtility")
    public static void i(FeedFragment feedFragment, c2 c2Var) {
        feedFragment.networkStateUtility = c2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.fragment.feed.FeedFragment.uploadPlanViewProvider")
    public static void j(FeedFragment feedFragment, com.planner5d.library.activity.fragment.projects.z0 z0Var) {
        feedFragment.uploadPlanViewProvider = z0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void injectMembers(FeedFragment feedFragment) {
        b(feedFragment, this.f133511a.get());
        i(feedFragment, this.f133512b.get());
        h(feedFragment, this.f133513c.get());
        d(feedFragment, this.f133514d.get());
        e(feedFragment, this.f133515e.get());
        j(feedFragment, this.f133516f.get());
        f(feedFragment, this.f133517g.get());
        c(feedFragment, this.f133518h.get());
    }
}
