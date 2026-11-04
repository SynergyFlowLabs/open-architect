package com.planner5d.library.model.region;

import android.app.Application;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222791a;

    public i(ij.c<Application> cVar) {
        this.f222791a = cVar;
    }

    public static i a(ij.c<Application> cVar) {
        return new i(cVar);
    }

    public static h c(Application application) {
        return new h(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f222791a.get());
    }
}
