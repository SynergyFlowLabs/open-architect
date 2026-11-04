package com.planner5d.library.aichat.application;

import com.planner5d.library.model.manager.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141920a;

    public j(b bVar) {
        this.f141920a = bVar;
    }

    public static j a(b bVar) {
        return new j(bVar);
    }

    public static c2 c(b bVar) {
        return (c2) dagger.internal.p.f(bVar.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f141920a);
    }
}
