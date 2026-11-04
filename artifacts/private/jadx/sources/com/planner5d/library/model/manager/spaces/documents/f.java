package com.planner5d.library.model.manager.spaces.documents;

import android.app.Application;
import com.planner5d.library.model.manager.i;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.upload.g;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.p0;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class f implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f198128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<i> f198129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.upload.a> f198130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<g> f198131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.model.spaces.documents.d> f198132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.r> f198133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<f1> f198134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<y0> f198135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.b> f198136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f198137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<t> f198138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<p0> f198139l;

    public f(ij.c<Application> cVar, ij.c<i> cVar2, ij.c<com.planner5d.library.services.upload.a> cVar3, ij.c<g> cVar4, ij.c<com.planner5d.library.database.model.spaces.documents.d> cVar5, ij.c<com.planner5d.library.activity.helper.r> cVar6, ij.c<f1> cVar7, ij.c<y0> cVar8, ij.c<com.planner5d.library.model.manager.spaces.b> cVar9, ij.c<com.planner5d.library.api.requests.c> cVar10, ij.c<t> cVar11, ij.c<p0> cVar12) {
        this.f198128a = cVar;
        this.f198129b = cVar2;
        this.f198130c = cVar3;
        this.f198131d = cVar4;
        this.f198132e = cVar5;
        this.f198133f = cVar6;
        this.f198134g = cVar7;
        this.f198135h = cVar8;
        this.f198136i = cVar9;
        this.f198137j = cVar10;
        this.f198138k = cVar11;
        this.f198139l = cVar12;
    }

    public static f a(ij.c<Application> cVar, ij.c<i> cVar2, ij.c<com.planner5d.library.services.upload.a> cVar3, ij.c<g> cVar4, ij.c<com.planner5d.library.database.model.spaces.documents.d> cVar5, ij.c<com.planner5d.library.activity.helper.r> cVar6, ij.c<f1> cVar7, ij.c<y0> cVar8, ij.c<com.planner5d.library.model.manager.spaces.b> cVar9, ij.c<com.planner5d.library.api.requests.c> cVar10, ij.c<t> cVar11, ij.c<p0> cVar12) {
        return new f(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12);
    }

    public static c c(Application application, fg.e<i> eVar, com.planner5d.library.services.upload.a aVar, g gVar, com.planner5d.library.database.model.spaces.documents.d dVar, com.planner5d.library.activity.helper.r rVar, f1 f1Var, y0 y0Var, com.planner5d.library.model.manager.spaces.b bVar, com.planner5d.library.api.requests.c cVar, t tVar, p0 p0Var) {
        return new c(application, eVar, aVar, gVar, dVar, rVar, f1Var, y0Var, bVar, cVar, tVar, p0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f198128a.get(), dagger.internal.g.a(this.f198129b), this.f198130c.get(), this.f198131d.get(), this.f198132e.get(), this.f198133f.get(), this.f198134g.get(), this.f198135h.get(), this.f198136i.get(), this.f198137j.get(), this.f198138k.get(), this.f198139l.get());
    }
}
