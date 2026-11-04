package com.planner5d.library.contest.view.vote;

import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.contest.view.b0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@e
@s
public final class b implements h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<k> f153824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f153825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b0> f153826c;

    public b(ij.c<k> cVar, ij.c<x> cVar2, ij.c<b0> cVar3) {
        this.f153824a = cVar;
        this.f153825b = cVar2;
        this.f153826c = cVar3;
    }

    public static b a(ij.c<k> cVar, ij.c<x> cVar2, ij.c<b0> cVar3) {
        return new b(cVar, cVar2, cVar3);
    }

    public static a c(k kVar, x xVar, b0 b0Var) {
        return new a(kVar, xVar, b0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f153824a.get(), this.f153825b.get(), this.f153826c.get());
    }
}
