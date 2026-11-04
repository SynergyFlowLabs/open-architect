package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.d4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l0 implements dagger.internal.h<k0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d4> f136048a;

    public l0(ij.c<d4> cVar) {
        this.f136048a = cVar;
    }

    public static l0 a(ij.c<d4> cVar) {
        return new l0(cVar);
    }

    public static k0 c(d4 d4Var) {
        return new k0(d4Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0 get() {
        return c(this.f136048a.get());
    }
}
