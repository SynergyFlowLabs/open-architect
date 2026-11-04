package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class h0 implements dagger.internal.h<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f180991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.filedownloader.c> f180992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f180993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<p> f180994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<i> f180995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<v0> f180996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f180997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<c2> f180998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f180999i;

    public h0(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.filedownloader.c> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<p> cVar4, ij.c<i> cVar5, ij.c<v0> cVar6, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar7, ij.c<c2> cVar8, ij.c<com.planner5d.library.modules.user.user.t> cVar9) {
        this.f180991a = cVar;
        this.f180992b = cVar2;
        this.f180993c = cVar3;
        this.f180994d = cVar4;
        this.f180995e = cVar5;
        this.f180996f = cVar6;
        this.f180997g = cVar7;
        this.f180998h = cVar8;
        this.f180999i = cVar9;
    }

    public static h0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.filedownloader.c> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<p> cVar4, ij.c<i> cVar5, ij.c<v0> cVar6, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar7, ij.c<c2> cVar8, ij.c<com.planner5d.library.modules.user.user.t> cVar9) {
        return new h0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static g0 c(com.planner5d.library.application.b bVar, com.planner5d.library.services.filedownloader.c cVar, com.planner5d.library.api.requests.c cVar2, fg.e<p> eVar, fg.e<i> eVar2, v0 v0Var, fg.e<com.planner5d.library.model.manager.managedfiles.a0> eVar3, c2 c2Var, fg.e<com.planner5d.library.modules.user.user.t> eVar4) {
        return new g0(bVar, cVar, cVar2, eVar, eVar2, v0Var, eVar3, c2Var, eVar4);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return c(this.f180991a.get(), this.f180992b.get(), this.f180993c.get(), dagger.internal.g.a(this.f180994d), dagger.internal.g.a(this.f180995e), this.f180996f.get(), dagger.internal.g.a(this.f180997g), this.f180998h.get(), dagger.internal.g.a(this.f180999i));
    }
}
