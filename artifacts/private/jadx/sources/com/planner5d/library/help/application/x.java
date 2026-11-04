package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.i2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<i2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180023a;

    public x(i iVar) {
        this.f180023a = iVar;
    }

    public static x a(i iVar) {
        return new x(iVar);
    }

    public static i2 c(i iVar) {
        return (i2) dagger.internal.p.f(iVar.o());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i2 get() {
        return c(this.f180023a);
    }
}
