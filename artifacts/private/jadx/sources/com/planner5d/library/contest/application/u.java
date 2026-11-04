package com.planner5d.library.contest.application;

import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148467a;

    public u(b bVar) {
        this.f148467a = bVar;
    }

    public static u a(b bVar) {
        return new u(bVar);
    }

    public static c2 c(b bVar) {
        return (c2) dagger.internal.p.f(bVar.s());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f148467a);
    }
}
