package com.planner5d.library.help.application;

import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180024a;

    public y(i iVar) {
        this.f180024a = iVar;
    }

    public static y a(i iVar) {
        return new y(iVar);
    }

    public static c2 c(i iVar) {
        return (c2) dagger.internal.p.f(iVar.p());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f180024a);
    }
}
