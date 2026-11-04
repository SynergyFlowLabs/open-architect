package com.planner5d.library.smartwizard.data;

import android.app.Application;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f229916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f229917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f229918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<w> f229919d;

    public d(ij.c<Application> cVar, ij.c<com.planner5d.library.database.manager.a> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<w> cVar4) {
        this.f229916a = cVar;
        this.f229917b = cVar2;
        this.f229918c = cVar3;
        this.f229919d = cVar4;
    }

    public static d a(ij.c<Application> cVar, ij.c<com.planner5d.library.database.manager.a> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<w> cVar4) {
        return new d(cVar, cVar2, cVar3, cVar4);
    }

    public static c c(Application application, com.planner5d.library.database.manager.a aVar, com.planner5d.library.api.requests.c cVar, w wVar) {
        return new c(application, aVar, cVar, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f229916a.get(), this.f229917b.get(), this.f229918c.get(), this.f229919d.get());
    }
}
