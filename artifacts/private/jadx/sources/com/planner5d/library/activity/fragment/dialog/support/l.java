package com.planner5d.library.activity.fragment.dialog.support;

import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.q4;
import dagger.internal.r;
import dagger.internal.s;
import le.n;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<o4> f133044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<q4> f133045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<n> f133046c;

    public l(ij.c<o4> cVar, ij.c<q4> cVar2, ij.c<n> cVar3) {
        this.f133044a = cVar;
        this.f133045b = cVar2;
        this.f133046c = cVar3;
    }

    public static l a(ij.c<o4> cVar, ij.c<q4> cVar2, ij.c<n> cVar3) {
        return new l(cVar, cVar2, cVar3);
    }

    public static k c(o4 o4Var, q4 q4Var, n nVar) {
        return new k(o4Var, q4Var, nVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f133044a.get(), this.f133045b.get(), this.f133046c.get());
    }
}
