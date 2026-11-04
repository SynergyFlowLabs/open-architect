package com.planner5d.library.contest.application;

import com.planner5d.library.model.manager.c2;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148466a;

    public t(b bVar) {
        this.f148466a = bVar;
    }

    public static t a(b bVar) {
        return new t(bVar);
    }

    public static c2 c(b bVar) {
        return (c2) dagger.internal.p.f(bVar.r());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f148466a);
    }
}
