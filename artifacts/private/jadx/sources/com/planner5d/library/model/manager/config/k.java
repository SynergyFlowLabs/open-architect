package com.planner5d.library.model.manager.config;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class k implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f181594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.source.j> f181595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f181596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f181597d;

    public k(ij.c<com.planner5d.library.application.d> cVar, ij.c<com.planner5d.library.model.manager.config.source.j> cVar2, ij.c<f1> cVar3, ij.c<com.planner5d.library.services.utility.t> cVar4) {
        this.f181594a = cVar;
        this.f181595b = cVar2;
        this.f181596c = cVar3;
        this.f181597d = cVar4;
    }

    public static k a(ij.c<com.planner5d.library.application.d> cVar, ij.c<com.planner5d.library.model.manager.config.source.j> cVar2, ij.c<f1> cVar3, ij.c<com.planner5d.library.services.utility.t> cVar4) {
        return new k(cVar, cVar2, cVar3, cVar4);
    }

    public static j c(com.planner5d.library.application.d dVar, fg.e<com.planner5d.library.model.manager.config.source.j> eVar, f1 f1Var, com.planner5d.library.services.utility.t tVar) {
        return new j(dVar, eVar, f1Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f181594a.get(), dagger.internal.g.a(this.f181595b), this.f181596c.get(), this.f181597d.get());
    }
}
