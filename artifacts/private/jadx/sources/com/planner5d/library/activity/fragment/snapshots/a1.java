package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.b4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a1 implements dagger.internal.h<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b4> f135918a;

    public a1(ij.c<b4> cVar) {
        this.f135918a = cVar;
    }

    public static a1 a(ij.c<b4> cVar) {
        return new a1(cVar);
    }

    public static y0 c(b4 b4Var) {
        return new y0(b4Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y0 get() {
        return c(this.f135918a.get());
    }
}
