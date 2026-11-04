package com.planner5d.library.activity.fragment.dialog.send_to_gallery;

import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b4> f132916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f132917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d0> f132918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f132919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<q0> f132920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f132921f;

    public m(ij.c<b4> cVar, ij.c<t> cVar2, ij.c<d0> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<q0> cVar5, ij.c<com.planner5d.library.application.b> cVar6) {
        this.f132916a = cVar;
        this.f132917b = cVar2;
        this.f132918c = cVar3;
        this.f132919d = cVar4;
        this.f132920e = cVar5;
        this.f132921f = cVar6;
    }

    public static m a(ij.c<b4> cVar, ij.c<t> cVar2, ij.c<d0> cVar3, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar4, ij.c<q0> cVar5, ij.c<com.planner5d.library.application.b> cVar6) {
        return new m(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static l c(b4 b4Var, t tVar, d0 d0Var, com.planner5d.library.activity.fragment.dialog.k kVar, q0 q0Var, com.planner5d.library.application.b bVar) {
        return new l(b4Var, tVar, d0Var, kVar, q0Var, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f132916a.get(), this.f132917b.get(), this.f132918c.get(), this.f132919d.get(), this.f132920e.get(), this.f132921f.get());
    }
}
