package com.planner5d.library.services;

import android.app.Application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class a0 implements dagger.internal.h<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f223957a;

    public a0(ij.c<Application> cVar) {
        this.f223957a = cVar;
    }

    public static a0 a(ij.c<Application> cVar) {
        return new a0(cVar);
    }

    public static z c(Application application) {
        return new z(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f223957a.get());
    }
}
