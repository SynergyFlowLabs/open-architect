package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180019a;

    public t(i iVar) {
        this.f180019a = iVar;
    }

    public static t a(i iVar) {
        return new t(iVar);
    }

    public static u1 c(i iVar) {
        return (u1) dagger.internal.p.f(iVar.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u1 get() {
        return c(this.f180019a);
    }
}
