package com.planner5d.library.model.payments.paymentmethod;

import android.app.Application;
import com.planner5d.library.model.manager.v2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<v2> f222729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f222730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f222731d;

    public h(ij.c<Application> cVar, ij.c<v2> cVar2, ij.c<f1> cVar3, ij.c<t> cVar4) {
        this.f222728a = cVar;
        this.f222729b = cVar2;
        this.f222730c = cVar3;
        this.f222731d = cVar4;
    }

    public static h a(ij.c<Application> cVar, ij.c<v2> cVar2, ij.c<f1> cVar3, ij.c<t> cVar4) {
        return new h(cVar, cVar2, cVar3, cVar4);
    }

    public static g c(Application application, v2 v2Var, f1 f1Var, t tVar) {
        return new g(application, v2Var, f1Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f222728a.get(), this.f222729b.get(), this.f222730c.get(), this.f222731d.get());
    }
}
