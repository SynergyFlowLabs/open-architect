package com.planner5d.library.services.utility;

import android.app.Application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class x1 implements dagger.internal.h<w1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f229836a;

    public x1(ij.c<Application> cVar) {
        this.f229836a = cVar;
    }

    public static x1 a(ij.c<Application> cVar) {
        return new x1(cVar);
    }

    public static w1 c(Application application) {
        return new w1(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w1 get() {
        return c(this.f229836a.get());
    }
}
