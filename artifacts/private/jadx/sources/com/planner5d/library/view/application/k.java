package com.planner5d.library.view.application;

import com.planner5d.library.model.manager.y1;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class k implements dagger.internal.h<y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244845a;

    public k(d dVar) {
        this.f244845a = dVar;
    }

    public static k a(d dVar) {
        return new k(dVar);
    }

    public static y1 c(d dVar) {
        return (y1) p.f(dVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y1 get() {
        return c(this.f244845a);
    }
}
