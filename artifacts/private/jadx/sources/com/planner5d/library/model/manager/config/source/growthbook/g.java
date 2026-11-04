package com.planner5d.library.model.manager.config.source.growthbook;

import android.app.Application;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f181769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b> f181770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<r3> f181771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.attributes.c> f181772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<j> f181773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<u1> f181774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<f1> f181775g;

    public g(ij.c<Application> cVar, ij.c<b> cVar2, ij.c<r3> cVar3, ij.c<com.planner5d.library.model.manager.config.attributes.c> cVar4, ij.c<j> cVar5, ij.c<u1> cVar6, ij.c<f1> cVar7) {
        this.f181769a = cVar;
        this.f181770b = cVar2;
        this.f181771c = cVar3;
        this.f181772d = cVar4;
        this.f181773e = cVar5;
        this.f181774f = cVar6;
        this.f181775g = cVar7;
    }

    public static g a(ij.c<Application> cVar, ij.c<b> cVar2, ij.c<r3> cVar3, ij.c<com.planner5d.library.model.manager.config.attributes.c> cVar4, ij.c<j> cVar5, ij.c<u1> cVar6, ij.c<f1> cVar7) {
        return new g(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static d c(Application application, b bVar, r3 r3Var, com.planner5d.library.model.manager.config.attributes.c cVar, j jVar, u1 u1Var, f1 f1Var) {
        return new d(application, bVar, r3Var, cVar, jVar, u1Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f181769a.get(), this.f181770b.get(), this.f181771c.get(), this.f181772d.get(), this.f181773e.get(), this.f181774f.get(), this.f181775g.get());
    }
}
