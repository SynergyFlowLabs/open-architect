package com.planner5d.library.model.manager.config.attributes;

import android.app.Application;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.region.f;
import com.planner5d.library.model.region.j;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@r
@e
@s("javax.inject.Singleton")
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f181448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f181449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c1> f181450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<i> f181451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<o1> f181452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.i> f181453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.region.h> f181454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<f> f181455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.region.b> f181456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<j> f181457j;

    public b(ij.c<Application> cVar, ij.c<t> cVar2, ij.c<c1> cVar3, ij.c<i> cVar4, ij.c<o1> cVar5, ij.c<com.planner5d.library.services.i> cVar6, ij.c<com.planner5d.library.model.region.h> cVar7, ij.c<f> cVar8, ij.c<com.planner5d.library.model.region.b> cVar9, ij.c<j> cVar10) {
        this.f181448a = cVar;
        this.f181449b = cVar2;
        this.f181450c = cVar3;
        this.f181451d = cVar4;
        this.f181452e = cVar5;
        this.f181453f = cVar6;
        this.f181454g = cVar7;
        this.f181455h = cVar8;
        this.f181456i = cVar9;
        this.f181457j = cVar10;
    }

    public static b a(ij.c<Application> cVar, ij.c<t> cVar2, ij.c<c1> cVar3, ij.c<i> cVar4, ij.c<o1> cVar5, ij.c<com.planner5d.library.services.i> cVar6, ij.c<com.planner5d.library.model.region.h> cVar7, ij.c<f> cVar8, ij.c<com.planner5d.library.model.region.b> cVar9, ij.c<j> cVar10) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static a c(Application application, fg.e<t> eVar, c1 c1Var, i iVar, o1 o1Var, com.planner5d.library.services.i iVar2, com.planner5d.library.model.region.h hVar, f fVar, com.planner5d.library.model.region.b bVar, j jVar) {
        return new a(application, eVar, c1Var, iVar, o1Var, iVar2, hVar, fVar, bVar, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f181448a.get(), g.a(this.f181449b), this.f181450c.get(), this.f181451d.get(), this.f181452e.get(), this.f181453f.get(), this.f181454g.get(), this.f181455h.get(), this.f181456i.get(), this.f181457j.get());
    }
}
