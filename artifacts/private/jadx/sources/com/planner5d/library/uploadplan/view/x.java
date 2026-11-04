package com.planner5d.library.uploadplan.view;

import com.planner5d.library.model.manager.statistics.events.e4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<e4> f231226a;

    public x(ij.c<e4> cVar) {
        this.f231226a = cVar;
    }

    public static x a(ij.c<e4> cVar) {
        return new x(cVar);
    }

    public static w c(e4 e4Var) {
        return new w(e4Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f231226a.get());
    }
}
