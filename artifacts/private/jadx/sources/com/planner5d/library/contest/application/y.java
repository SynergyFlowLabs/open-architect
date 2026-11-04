package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.y2;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y implements dagger.internal.h<y2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148471a;

    public y(b bVar) {
        this.f148471a = bVar;
    }

    public static y a(b bVar) {
        return new y(bVar);
    }

    public static y2 c(b bVar) {
        return (y2) dagger.internal.p.f(bVar.w());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y2 get() {
        return c(this.f148471a);
    }
}
