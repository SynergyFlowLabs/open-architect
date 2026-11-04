package com.planner5d.library.model.region;

import android.app.Application;
import com.planner5d.library.services.utility.f1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f222785b;

    public e(ij.c<Application> cVar, ij.c<f1> cVar2) {
        this.f222784a = cVar;
        this.f222785b = cVar2;
    }

    public static e a(ij.c<Application> cVar, ij.c<f1> cVar2) {
        return new e(cVar, cVar2);
    }

    public static d c(Application application, f1 f1Var) {
        return new d(application, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f222784a.get(), this.f222785b.get());
    }
}
