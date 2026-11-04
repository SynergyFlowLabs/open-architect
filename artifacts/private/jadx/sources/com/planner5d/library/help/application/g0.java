package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.p5;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g0 implements dagger.internal.h<p5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f179981a;

    public g0(i iVar) {
        this.f179981a = iVar;
    }

    public static g0 a(i iVar) {
        return new g0(iVar);
    }

    public static p5 c(i iVar) {
        return (p5) dagger.internal.p.f(iVar.x());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p5 get() {
        return c(this.f179981a);
    }
}
