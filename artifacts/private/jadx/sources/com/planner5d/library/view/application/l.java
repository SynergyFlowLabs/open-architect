package com.planner5d.library.view.application;

import com.planner5d.library.model.manager.i2;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<i2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244846a;

    public l(d dVar) {
        this.f244846a = dVar;
    }

    public static l a(d dVar) {
        return new l(dVar);
    }

    public static i2 c(d dVar) {
        return (i2) p.f(dVar.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i2 get() {
        return c(this.f244846a);
    }
}
