package com.planner5d.library.model.manager.config.source;

import android.app.Application;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f190628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f190629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p> f190630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t1> f190631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<w> f190632e;

    public m(ij.c<Application> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<p> cVar3, ij.c<t1> cVar4, ij.c<w> cVar5) {
        this.f190628a = cVar;
        this.f190629b = cVar2;
        this.f190630c = cVar3;
        this.f190631d = cVar4;
        this.f190632e = cVar5;
    }

    public static m a(ij.c<Application> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<p> cVar3, ij.c<t1> cVar4, ij.c<w> cVar5) {
        return new m(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static l c(Application application, com.planner5d.library.api.requests.c cVar, p pVar, t1 t1Var, fg.e<w> eVar) {
        return new l(application, cVar, pVar, t1Var, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f190628a.get(), this.f190629b.get(), this.f190630c.get(), this.f190631d.get(), dagger.internal.g.a(this.f190632e));
    }
}
