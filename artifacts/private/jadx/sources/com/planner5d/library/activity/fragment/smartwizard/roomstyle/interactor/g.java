package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t1> f135746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f135747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f135748c;

    public g(ij.c<t1> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<t> cVar3) {
        this.f135746a = cVar;
        this.f135747b = cVar2;
        this.f135748c = cVar3;
    }

    public static g a(ij.c<t1> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<t> cVar3) {
        return new g(cVar, cVar2, cVar3);
    }

    public static f c(t1 t1Var, com.planner5d.library.api.requests.c cVar, t tVar) {
        return new f(t1Var, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f135746a.get(), this.f135747b.get(), this.f135748c.get());
    }
}
