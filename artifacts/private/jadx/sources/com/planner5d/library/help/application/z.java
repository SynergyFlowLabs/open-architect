package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.t2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<t2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180025a;

    public z(i iVar) {
        this.f180025a = iVar;
    }

    public static z a(i iVar) {
        return new z(iVar);
    }

    public static t2 c(i iVar) {
        return (t2) dagger.internal.p.f(iVar.q());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t2 get() {
        return c(this.f180025a);
    }
}
