package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.statistics.events.r3;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b0 implements dagger.internal.h<r3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148423a;

    public b0(b bVar) {
        this.f148423a = bVar;
    }

    public static b0 a(b bVar) {
        return new b0(bVar);
    }

    public static r3 c(b bVar) {
        return (r3) dagger.internal.p.f(bVar.z());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r3 get() {
        return c(this.f148423a);
    }
}
