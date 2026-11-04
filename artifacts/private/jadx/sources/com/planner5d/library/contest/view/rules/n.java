package com.planner5d.library.contest.view.rules;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153793a;

    public n(ij.c<com.planner5d.library.contest.data.i> cVar) {
        this.f153793a = cVar;
    }

    public static n a(ij.c<com.planner5d.library.contest.data.i> cVar) {
        return new n(cVar);
    }

    public static m c(com.planner5d.library.contest.data.i iVar) {
        return new m(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f153793a.get());
    }
}
