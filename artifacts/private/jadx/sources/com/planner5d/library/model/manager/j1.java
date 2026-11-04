package com.planner5d.library.model.manager;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("com.planner5d.library.help.application.HelpScope")
public final class j1 implements dagger.internal.h<h1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f191770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f191771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<e1> f191772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f191773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<u1> f191774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f191775f;

    public j1(ij.c<w> cVar, ij.c<Application> cVar2, ij.c<e1> cVar3, ij.c<com.planner5d.library.modules.user.user.w> cVar4, ij.c<u1> cVar5, ij.c<com.planner5d.library.services.utility.f1> cVar6) {
        this.f191770a = cVar;
        this.f191771b = cVar2;
        this.f191772c = cVar3;
        this.f191773d = cVar4;
        this.f191774e = cVar5;
        this.f191775f = cVar6;
    }

    public static j1 a(ij.c<w> cVar, ij.c<Application> cVar2, ij.c<e1> cVar3, ij.c<com.planner5d.library.modules.user.user.w> cVar4, ij.c<u1> cVar5, ij.c<com.planner5d.library.services.utility.f1> cVar6) {
        return new j1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static h1 c(fg.e<w> eVar, Application application, fg.e<e1> eVar2, fg.e<com.planner5d.library.modules.user.user.w> eVar3, fg.e<u1> eVar4, com.planner5d.library.services.utility.f1 f1Var) {
        return new h1(eVar, application, eVar2, eVar3, eVar4, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h1 get() {
        return c(dagger.internal.g.a(this.f191770a), this.f191771b.get(), dagger.internal.g.a(this.f191772c), dagger.internal.g.a(this.f191773d), dagger.internal.g.a(this.f191774e), this.f191775f.get());
    }
}
