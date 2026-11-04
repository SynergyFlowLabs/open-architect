package com.planner5d.library.model.payments.paymentmethod;

import com.planner5d.library.modules.user.user.u0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<u0> f222748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.k> f222749b;

    public j(ij.c<u0> cVar, ij.c<com.planner5d.library.model.manager.payments.k> cVar2) {
        this.f222748a = cVar;
        this.f222749b = cVar2;
    }

    public static j a(ij.c<u0> cVar, ij.c<com.planner5d.library.model.manager.payments.k> cVar2) {
        return new j(cVar, cVar2);
    }

    public static i c(u0 u0Var, com.planner5d.library.model.manager.payments.k kVar) {
        return new i(u0Var, kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f222748a.get(), this.f222749b.get());
    }
}
