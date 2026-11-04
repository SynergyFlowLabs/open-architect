package com.planner5d.library.help.application;

import com.planner5d.library.model.manager.c2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f180021a;

    public v(i iVar) {
        this.f180021a = iVar;
    }

    public static v a(i iVar) {
        return new v(iVar);
    }

    public static c2 c(i iVar) {
        return (c2) dagger.internal.p.f(iVar.m());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f180021a);
    }
}
