package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import android.app.Application;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class c implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f135699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f135700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f135701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f135702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t> f135703e;

    public c(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<Application> cVar2, ij.c<com.planner5d.library.model.manager.config.d> cVar3, ij.c<b2> cVar4, ij.c<t> cVar5) {
        this.f135699a = cVar;
        this.f135700b = cVar2;
        this.f135701c = cVar3;
        this.f135702d = cVar4;
        this.f135703e = cVar5;
    }

    public static c a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<Application> cVar2, ij.c<com.planner5d.library.model.manager.config.d> cVar3, ij.c<b2> cVar4, ij.c<t> cVar5) {
        return new c(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(com.planner5d.library.api.requests.c cVar, Application application, com.planner5d.library.model.manager.config.d dVar, b2 b2Var, t tVar) {
        return new a(cVar, application, dVar, b2Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f135699a.get(), this.f135700b.get(), this.f135701c.get(), this.f135702d.get(), this.f135703e.get());
    }
}
