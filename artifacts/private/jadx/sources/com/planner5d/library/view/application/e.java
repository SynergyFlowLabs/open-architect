package com.planner5d.library.view.application;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244839a;

    public e(d dVar) {
        this.f244839a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar);
    }

    public static int c(d dVar) {
        return dVar.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c(this.f244839a));
    }
}
