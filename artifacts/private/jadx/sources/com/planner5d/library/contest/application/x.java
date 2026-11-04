package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.x2;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<x2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148470a;

    public x(b bVar) {
        this.f148470a = bVar;
    }

    public static x a(b bVar) {
        return new x(bVar);
    }

    public static x2 c(b bVar) {
        return (x2) dagger.internal.p.f(bVar.v());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x2 get() {
        return c(this.f148470a);
    }
}
