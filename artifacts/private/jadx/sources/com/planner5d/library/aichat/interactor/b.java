package com.planner5d.library.aichat.interactor;

import android.app.Application;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f141985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<w> f141986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<Application> f141987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.h> f141988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f141989e;

    public b(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<w> cVar2, ij.c<Application> cVar3, ij.c<com.planner5d.library.model.manager.h> cVar4, ij.c<com.planner5d.library.model.manager.w> cVar5) {
        this.f141985a = cVar;
        this.f141986b = cVar2;
        this.f141987c = cVar3;
        this.f141988d = cVar4;
        this.f141989e = cVar5;
    }

    public static b a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<w> cVar2, ij.c<Application> cVar3, ij.c<com.planner5d.library.model.manager.h> cVar4, ij.c<com.planner5d.library.model.manager.w> cVar5) {
        return new b(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static a c(com.planner5d.library.api.requests.c cVar, w wVar, Application application, com.planner5d.library.model.manager.h hVar, com.planner5d.library.model.manager.w wVar2) {
        return new a(cVar, wVar, application, hVar, wVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f141985a.get(), this.f141986b.get(), this.f141987c.get(), this.f141988d.get(), this.f141989e.get());
    }
}
