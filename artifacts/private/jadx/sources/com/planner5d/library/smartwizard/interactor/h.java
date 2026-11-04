package com.planner5d.library.smartwizard.interactor;

import android.app.Application;
import com.planner5d.library.model.manager.o1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f229955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o1> f229956b;

    public h(ij.c<Application> cVar, ij.c<o1> cVar2) {
        this.f229955a = cVar;
        this.f229956b = cVar2;
    }

    public static h a(ij.c<Application> cVar, ij.c<o1> cVar2) {
        return new h(cVar, cVar2);
    }

    public static g c(Application application, o1 o1Var) {
        return new g(application, o1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f229955a.get(), this.f229956b.get());
    }
}
