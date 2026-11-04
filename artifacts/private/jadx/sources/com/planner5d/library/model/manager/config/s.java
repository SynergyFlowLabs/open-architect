package com.planner5d.library.model.manager.config;

import android.app.Application;
import com.planner5d.library.model.manager.n1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f181651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.l> f181652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<n1> f181653c;

    public s(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.source.l> cVar2, ij.c<n1> cVar3) {
        this.f181651a = cVar;
        this.f181652b = cVar2;
        this.f181653c = cVar3;
    }

    public static s a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.source.l> cVar2, ij.c<n1> cVar3) {
        return new s(cVar, cVar2, cVar3);
    }

    public static r c(Application application, com.planner5d.library.model.manager.config.source.l lVar, fg.e<n1> eVar) {
        return new r(application, lVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f181651a.get(), this.f181652b.get(), dagger.internal.g.a(this.f181653c));
    }
}
