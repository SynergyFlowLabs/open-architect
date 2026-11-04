package com.planner5d.library.project.interactor;

import android.app.Application;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f223909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f223910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f223911c;

    public d(ij.c<Application> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<t> cVar3) {
        this.f223909a = cVar;
        this.f223910b = cVar2;
        this.f223911c = cVar3;
    }

    public static d a(ij.c<Application> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<t> cVar3) {
        return new d(cVar, cVar2, cVar3);
    }

    public static c c(Application application, com.planner5d.library.api.requests.c cVar, t tVar) {
        return new c(application, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f223909a.get(), this.f223910b.get(), this.f223911c.get());
    }
}
