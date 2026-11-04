package com.planner5d.library.model.region;

import android.app.Application;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222788a;

    public g(ij.c<Application> cVar) {
        this.f222788a = cVar;
    }

    public static g a(ij.c<Application> cVar) {
        return new g(cVar);
    }

    public static f c(Application application) {
        return new f(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f222788a.get());
    }
}
