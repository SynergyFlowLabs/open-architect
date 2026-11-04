package com.planner5d.library.userimporteddata;

import android.app.Application;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.g3;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f235818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<n> f235819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c2> f235820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<g> f235821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b> f235822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<g3> f235823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<u1> f235824g;

    public j(ij.c<Application> cVar, ij.c<n> cVar2, ij.c<c2> cVar3, ij.c<g> cVar4, ij.c<b> cVar5, ij.c<g3> cVar6, ij.c<u1> cVar7) {
        this.f235818a = cVar;
        this.f235819b = cVar2;
        this.f235820c = cVar3;
        this.f235821d = cVar4;
        this.f235822e = cVar5;
        this.f235823f = cVar6;
        this.f235824g = cVar7;
    }

    public static j a(ij.c<Application> cVar, ij.c<n> cVar2, ij.c<c2> cVar3, ij.c<g> cVar4, ij.c<b> cVar5, ij.c<g3> cVar6, ij.c<u1> cVar7) {
        return new j(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static i c(Application application, n nVar, c2 c2Var, g gVar, b bVar, g3 g3Var, u1 u1Var) {
        return new i(application, nVar, c2Var, gVar, bVar, g3Var, u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f235818a.get(), this.f235819b.get(), this.f235820c.get(), this.f235821d.get(), this.f235822e.get(), this.f235823f.get(), this.f235824g.get());
    }
}
