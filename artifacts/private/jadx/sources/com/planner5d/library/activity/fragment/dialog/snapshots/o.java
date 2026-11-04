package com.planner5d.library.activity.fragment.dialog.snapshots;

import com.planner5d.library.activity.helper.f1;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class o implements dagger.internal.h<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b4> f132994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<w> f132995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f132996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f132997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t0> f132998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<c2> f132999f;

    public o(ij.c<b4> cVar, ij.c<w> cVar2, ij.c<com.planner5d.library.model.manager.w> cVar3, ij.c<f1> cVar4, ij.c<t0> cVar5, ij.c<c2> cVar6) {
        this.f132994a = cVar;
        this.f132995b = cVar2;
        this.f132996c = cVar3;
        this.f132997d = cVar4;
        this.f132998e = cVar5;
        this.f132999f = cVar6;
    }

    public static o a(ij.c<b4> cVar, ij.c<w> cVar2, ij.c<com.planner5d.library.model.manager.w> cVar3, ij.c<f1> cVar4, ij.c<t0> cVar5, ij.c<c2> cVar6) {
        return new o(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static n c(b4 b4Var, w wVar, com.planner5d.library.model.manager.w wVar2, f1 f1Var, t0 t0Var, c2 c2Var) {
        return new n(b4Var, wVar, wVar2, f1Var, t0Var, c2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.f132994a.get(), this.f132995b.get(), this.f132996c.get(), this.f132997d.get(), this.f132998e.get(), this.f132999f.get());
    }
}
