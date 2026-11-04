package com.planner5d.library.aichat.view.bottomsheet;

import android.app.Application;
import com.planner5d.library.model.manager.statistics.events.i3;
import com.planner5d.library.modules.user.user.u0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<ya.a> f142143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f142144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<va.b> f142145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.h> f142146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<i3> f142147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<va.c> f142148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f142149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<u0> f142150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<ua.a> f142151i;

    public u(ij.c<ya.a> cVar, ij.c<Application> cVar2, ij.c<va.b> cVar3, ij.c<com.planner5d.library.model.manager.h> cVar4, ij.c<i3> cVar5, ij.c<va.c> cVar6, ij.c<com.planner5d.library.modules.user.user.w> cVar7, ij.c<u0> cVar8, ij.c<ua.a> cVar9) {
        this.f142143a = cVar;
        this.f142144b = cVar2;
        this.f142145c = cVar3;
        this.f142146d = cVar4;
        this.f142147e = cVar5;
        this.f142148f = cVar6;
        this.f142149g = cVar7;
        this.f142150h = cVar8;
        this.f142151i = cVar9;
    }

    public static u a(ij.c<ya.a> cVar, ij.c<Application> cVar2, ij.c<va.b> cVar3, ij.c<com.planner5d.library.model.manager.h> cVar4, ij.c<i3> cVar5, ij.c<va.c> cVar6, ij.c<com.planner5d.library.modules.user.user.w> cVar7, ij.c<u0> cVar8, ij.c<ua.a> cVar9) {
        return new u(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static t c(ya.a aVar, Application application, va.b bVar, com.planner5d.library.model.manager.h hVar, i3 i3Var, va.c cVar, com.planner5d.library.modules.user.user.w wVar, u0 u0Var, ua.a aVar2) {
        return new t(aVar, application, bVar, hVar, i3Var, cVar, wVar, u0Var, aVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f142143a.get(), this.f142144b.get(), this.f142145c.get(), this.f142146d.get(), this.f142147e.get(), this.f142148f.get(), this.f142149g.get(), this.f142150h.get(), this.f142151i.get());
    }
}
