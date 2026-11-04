package com.planner5d.library.aichat.application;

import com.planner5d.library.model.manager.statistics.events.i3;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<i3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141923a;

    public m(b bVar) {
        this.f141923a = bVar;
    }

    public static m a(b bVar) {
        return new m(bVar);
    }

    public static i3 c(b bVar) {
        return (i3) dagger.internal.p.f(bVar.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i3 get() {
        return c(this.f141923a);
    }
}
