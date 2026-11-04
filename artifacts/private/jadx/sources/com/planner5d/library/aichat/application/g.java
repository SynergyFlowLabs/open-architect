package com.planner5d.library.aichat.application;

import com.planner5d.library.model.manager.w;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141916a;

    public g(b bVar) {
        this.f141916a = bVar;
    }

    public static g a(b bVar) {
        return new g(bVar);
    }

    public static w c(b bVar) {
        return (w) dagger.internal.p.f(bVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f141916a);
    }
}
