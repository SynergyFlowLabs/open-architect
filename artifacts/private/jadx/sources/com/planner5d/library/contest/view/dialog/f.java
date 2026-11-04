package com.planner5d.library.contest.view.dialog;

import com.planner5d.library.model.manager.statistics.events.l3;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<l3> f153568a;

    public f(ij.c<l3> cVar) {
        this.f153568a = cVar;
    }

    public static f a(ij.c<l3> cVar) {
        return new f(cVar);
    }

    public static e c(l3 l3Var) {
        return new e(l3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f153568a.get());
    }
}
