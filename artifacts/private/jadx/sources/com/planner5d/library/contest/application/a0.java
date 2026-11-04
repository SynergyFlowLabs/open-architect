package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.statistics.events.l3;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a0 implements dagger.internal.h<l3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148396a;

    public a0(b bVar) {
        this.f148396a = bVar;
    }

    public static a0 a(b bVar) {
        return new a0(bVar);
    }

    public static l3 c(b bVar) {
        return (l3) dagger.internal.p.f(bVar.y());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l3 get() {
        return c(this.f148396a);
    }
}
