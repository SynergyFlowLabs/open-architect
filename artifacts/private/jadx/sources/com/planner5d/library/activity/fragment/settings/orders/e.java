package com.planner5d.library.activity.fragment.settings.orders;

import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f135295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f135296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f135297c;

    public e(ij.c<p0> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<t> cVar3) {
        this.f135295a = cVar;
        this.f135296b = cVar2;
        this.f135297c = cVar3;
    }

    public static e a(ij.c<p0> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<t> cVar3) {
        return new e(cVar, cVar2, cVar3);
    }

    public static a c(p0 p0Var, com.planner5d.library.application.d dVar, t tVar) {
        return new a(p0Var, dVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f135295a.get(), this.f135296b.get(), this.f135297c.get());
    }
}
