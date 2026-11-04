package com.planner5d.library.aichat.application;

import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141919a;

    public i(b bVar) {
        this.f141919a = bVar;
    }

    public static i a(b bVar) {
        return new i(bVar);
    }

    public static u1 c(b bVar) {
        return (u1) dagger.internal.p.f(bVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u1 get() {
        return c(this.f141919a);
    }
}
