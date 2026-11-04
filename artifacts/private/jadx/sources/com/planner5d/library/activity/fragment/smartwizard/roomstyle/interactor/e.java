package com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d0> f135712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f135713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f135714c;

    public e(ij.c<d0> cVar, ij.c<t> cVar2, ij.c<b2> cVar3) {
        this.f135712a = cVar;
        this.f135713b = cVar2;
        this.f135714c = cVar3;
    }

    public static e a(ij.c<d0> cVar, ij.c<t> cVar2, ij.c<b2> cVar3) {
        return new e(cVar, cVar2, cVar3);
    }

    public static d c(d0 d0Var, t tVar, b2 b2Var) {
        return new d(d0Var, tVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f135712a.get(), this.f135713b.get(), this.f135714c.get());
    }
}
