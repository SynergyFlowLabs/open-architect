package com.planner5d.library.modules.user.auth;

import android.app.Application;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f222951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f222952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f222953d;

    public s(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2, ij.c<f1> cVar3, ij.c<c2> cVar4) {
        this.f222950a = cVar;
        this.f222951b = cVar2;
        this.f222952c = cVar3;
        this.f222953d = cVar4;
    }

    public static s a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2, ij.c<f1> cVar3, ij.c<c2> cVar4) {
        return new s(cVar, cVar2, cVar3, cVar4);
    }

    public static r c(Application application, fg.e<com.planner5d.library.model.manager.config.j> eVar, f1 f1Var, fg.e<c2> eVar2) {
        return new r(application, eVar, f1Var, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f222950a.get(), dagger.internal.g.a(this.f222951b), this.f222952c.get(), dagger.internal.g.a(this.f222953d));
    }
}
