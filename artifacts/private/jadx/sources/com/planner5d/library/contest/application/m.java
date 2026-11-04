package com.planner5d.library.contest.application;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148459a;

    public m(b bVar) {
        this.f148459a = bVar;
    }

    public static m a(b bVar) {
        return new m(bVar);
    }

    public static p0 c(b bVar) {
        return (p0) dagger.internal.p.f(bVar.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f148459a);
    }
}
