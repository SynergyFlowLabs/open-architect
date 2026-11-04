package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.q4;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e0 implements dagger.internal.h<q4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179976a;

    public e0(i iVar) {
        this.f179976a = iVar;
    }

    public static e0 a(i iVar) {
        return new e0(iVar);
    }

    public static q4 c(i iVar) {
        return (q4) dagger.internal.p.f(iVar.v());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q4 get() {
        return c(this.f179976a);
    }
}
