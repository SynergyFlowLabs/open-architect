package com.planner5d.library.activity.fragment.profile;

import com.planner5d.library.model.manager.managedfiles.a0;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<a0> f134555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f134556b;

    public b(ij.c<a0> cVar, ij.c<f1> cVar2) {
        this.f134555a = cVar;
        this.f134556b = cVar2;
    }

    public static b a(ij.c<a0> cVar, ij.c<f1> cVar2) {
        return new b(cVar, cVar2);
    }

    public static a c(a0 a0Var, f1 f1Var) {
        return new a(a0Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f134555a.get(), this.f134556b.get());
    }
}
