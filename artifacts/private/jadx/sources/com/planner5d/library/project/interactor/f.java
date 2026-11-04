package com.planner5d.library.project.interactor;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.model.manager.payments.j;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> f223923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<k> f223924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<j> f223925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f223926d;

    public f(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVar, ij.c<k> cVar2, ij.c<j> cVar3, ij.c<t> cVar4) {
        this.f223923a = cVar;
        this.f223924b = cVar2;
        this.f223925c = cVar3;
        this.f223926d = cVar4;
    }

    public static f a(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVar, ij.c<k> cVar2, ij.c<j> cVar3, ij.c<t> cVar4) {
        return new f(cVar, cVar2, cVar3, cVar4);
    }

    public static e c(com.planner5d.library.activity.fragment.dialog.purchase.s sVar, k kVar, j jVar, t tVar) {
        return new e(sVar, kVar, jVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f223923a.get(), this.f223924b.get(), this.f223925c.get(), this.f223926d.get());
    }
}
