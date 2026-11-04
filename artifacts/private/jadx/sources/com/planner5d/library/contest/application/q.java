package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.o1;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148463a;

    public q(b bVar) {
        this.f148463a = bVar;
    }

    public static q a(b bVar) {
        return new q(bVar);
    }

    public static o1 c(b bVar) {
        return (o1) dagger.internal.p.f(bVar.o());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o1 get() {
        return c(this.f148463a);
    }
}
