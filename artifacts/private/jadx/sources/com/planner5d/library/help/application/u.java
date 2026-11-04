package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180020a;

    public u(i iVar) {
        this.f180020a = iVar;
    }

    public static u a(i iVar) {
        return new u(iVar);
    }

    public static y1 c(i iVar) {
        return (y1) dagger.internal.p.f(iVar.l());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y1 get() {
        return c(this.f180020a);
    }
}
