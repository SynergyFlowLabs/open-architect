package com.planner5d.library.activity.fragment.dialog.purchase;

import androidx.lifecycle.l1;
import com.planner5d.library.activity.helper.l0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f132627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f132628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<l0> f132629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f132630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b2> f132631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f1> f132632f;

    public g0(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<l0> cVar3, ij.c<com.planner5d.library.model.manager.payments.j> cVar4, ij.c<b2> cVar5, ij.c<f1> cVar6) {
        this.f132627a = cVar;
        this.f132628b = cVar2;
        this.f132629c = cVar3;
        this.f132630d = cVar4;
        this.f132631e = cVar5;
        this.f132632f = cVar6;
    }

    public static g0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<l0> cVar3, ij.c<com.planner5d.library.model.manager.payments.j> cVar4, ij.c<b2> cVar5, ij.c<f1> cVar6) {
        return new g0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static f0 c(com.planner5d.library.application.b bVar, l1 l1Var, com.planner5d.library.modules.user.user.t tVar, l0 l0Var, com.planner5d.library.model.manager.payments.j jVar, b2 b2Var, f1 f1Var) {
        return new f0(bVar, l1Var, tVar, l0Var, jVar, b2Var, f1Var);
    }

    public f0 b(l1 l1Var) {
        return c(this.f132627a.get(), l1Var, this.f132628b.get(), this.f132629c.get(), this.f132630d.get(), this.f132631e.get(), this.f132632f.get());
    }
}
