package com.planner5d.library.services.utility;

import android.app.Application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class j1 implements dagger.internal.h<i1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f225286a;

    public j1(ij.c<Application> cVar) {
        this.f225286a = cVar;
    }

    public static j1 a(ij.c<Application> cVar) {
        return new j1(cVar);
    }

    public static i1 c(Application application) {
        return new i1(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i1 get() {
        return c(this.f225286a.get());
    }
}
