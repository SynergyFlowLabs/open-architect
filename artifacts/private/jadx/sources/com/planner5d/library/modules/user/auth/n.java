package com.planner5d.library.modules.user.auth;

import android.app.Application;
import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f222929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<g1> f222930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f222931d;

    public n(ij.c<Application> cVar, ij.c<c2> cVar2, ij.c<g1> cVar3, ij.c<t> cVar4) {
        this.f222928a = cVar;
        this.f222929b = cVar2;
        this.f222930c = cVar3;
        this.f222931d = cVar4;
    }

    public static n a(ij.c<Application> cVar, ij.c<c2> cVar2, ij.c<g1> cVar3, ij.c<t> cVar4) {
        return new n(cVar, cVar2, cVar3, cVar4);
    }

    public static m c(Application application, c2 c2Var, g1 g1Var, t tVar) {
        return new m(application, c2Var, g1Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f222928a.get(), this.f222929b.get(), this.f222930c.get(), this.f222931d.get());
    }
}
