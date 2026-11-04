package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import com.planner5d.library.model.manager.b2;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f135774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<pa.d> f135775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f135776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f135777d;

    public j(ij.c<com.planner5d.library.application.b> cVar, ij.c<pa.d> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4) {
        this.f135774a = cVar;
        this.f135775b = cVar2;
        this.f135776c = cVar3;
        this.f135777d = cVar4;
    }

    public static j a(ij.c<com.planner5d.library.application.b> cVar, ij.c<pa.d> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.model.manager.config.d> cVar4) {
        return new j(cVar, cVar2, cVar3, cVar4);
    }

    public static i c(com.planner5d.library.application.b bVar, pa.d dVar, b2 b2Var, com.planner5d.library.model.manager.config.d dVar2) {
        return new i(bVar, dVar, b2Var, dVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f135774a.get(), this.f135775b.get(), this.f135776c.get(), this.f135777d.get());
    }
}
