package com.planner5d.library.activity.fragment.dialog.purchase;

import com.planner5d.library.modules.user.user.t0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class u implements dagger.internal.h<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f132816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.n> f132817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t0> f132818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f132819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f132820e;

    public u(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<com.planner5d.library.model.manager.config.n> cVar2, ij.c<t0> cVar3, ij.c<com.planner5d.library.modules.user.user.w> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5) {
        this.f132816a = cVar;
        this.f132817b = cVar2;
        this.f132818c = cVar3;
        this.f132819d = cVar4;
        this.f132820e = cVar5;
    }

    public static u a(ij.c<com.planner5d.library.model.manager.config.j> cVar, ij.c<com.planner5d.library.model.manager.config.n> cVar2, ij.c<t0> cVar3, ij.c<com.planner5d.library.modules.user.user.w> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5) {
        return new u(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static s c(fg.e<com.planner5d.library.model.manager.config.j> eVar, fg.e<com.planner5d.library.model.manager.config.n> eVar2, fg.e<t0> eVar3, fg.e<com.planner5d.library.modules.user.user.w> eVar4, fg.e<com.planner5d.library.activity.fragment.dialog.k> eVar5) {
        return new s(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(dagger.internal.g.a(this.f132816a), dagger.internal.g.a(this.f132817b), dagger.internal.g.a(this.f132818c), dagger.internal.g.a(this.f132819d), dagger.internal.g.a(this.f132820e));
    }
}
