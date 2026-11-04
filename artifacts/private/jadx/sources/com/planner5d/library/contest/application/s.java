package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148465a;

    public s(b bVar) {
        this.f148465a = bVar;
    }

    public static s a(b bVar) {
        return new s(bVar);
    }

    public static y1 c(b bVar) {
        return (y1) dagger.internal.p.f(bVar.q());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y1 get() {
        return c(this.f148465a);
    }
}
