package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.statistics.events.r3;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c0 implements dagger.internal.h<r3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179971a;

    public c0(i iVar) {
        this.f179971a = iVar;
    }

    public static c0 a(i iVar) {
        return new c0(iVar);
    }

    public static r3 c(i iVar) {
        return (r3) dagger.internal.p.f(iVar.t());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r3 get() {
        return c(this.f179971a);
    }
}
