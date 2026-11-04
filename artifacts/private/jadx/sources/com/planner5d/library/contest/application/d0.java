package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.p5;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d0 implements dagger.internal.h<p5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148427a;

    public d0(b bVar) {
        this.f148427a = bVar;
    }

    public static d0 a(b bVar) {
        return new d0(bVar);
    }

    public static p5 c(b bVar) {
        return (p5) dagger.internal.p.f(bVar.B());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p5 get() {
        return c(this.f148427a);
    }
}
